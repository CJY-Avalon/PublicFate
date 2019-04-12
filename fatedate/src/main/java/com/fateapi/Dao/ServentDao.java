package com.fateapi.Dao;

import java.util.List;

import com.fateapi.domain.Servent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ServentDao extends JpaRepository<Servent, String> {
	//@Query(value="select * from servent where star=:star",nativeQuery=true)
	//List<Servent> findBystar(@Param("star") int Star);
	/*@Query(value="select * from servent where start=:start",nativeQuery=true)
	Servent findByStart(@Param("start") int Start);*/
}
