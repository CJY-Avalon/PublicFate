package com.fateapi.Dao;

import java.util.List;

import com.fateapi.domain.Rtiuial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface RtiuialDao extends JpaRepository<Rtiuial, String> {
	//@Query(value="select * from rtiuial where star=:star",nativeQuery=true)
	// List<Rtiuial> findBystar(@Param("star") int Star);
	// Rtiuial findBystar();
	/*@Query("select * from rtiuial where start=:start")
	Rtiuial findByStart(@Param("start") int start);*/
}
