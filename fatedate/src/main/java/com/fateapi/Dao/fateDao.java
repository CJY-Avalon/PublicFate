package com.fateapi.Dao;

import java.util.List;

import com.fateapi.domain.Servent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface fateDao extends JpaRepository<Servent, String> {
	//List<fate> findAll();
}
