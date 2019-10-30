# PublicFate

set serveroutput on
declare
 cursor cur_sal is select deptno,sal from emp;
 v_dept_sal cur_sal%rowtype;
begin
open cur_sal;
loop
fetch cur_sal into v_dept_sal;
exit when cur_sal%notfound;
dbms_output.put_line(v_dept_sal.deptno||v_dept_sal.sal);
end loop;
close cur_sal;
end;

set serveroutput on
declare
 cursor cur_sal is select deptno,avg(sal) as avgsal from emp group by deptno;
 v_dept_sal cur_sal%rowtype;
begin
open cur_sal;
loop
fetch cur_sal into v_dept_sal;
exit when cur_sal%notfound;
dbms_output.put_line(v_dept_sal.deptno||v_dept_sal.avgsal);
end loop;
close cur_sal;
end;
