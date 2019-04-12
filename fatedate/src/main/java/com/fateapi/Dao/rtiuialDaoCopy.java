package com.fateapi.Dao;

import java.util.List;

import com.fateapi.domain.Rtiuial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface rtiuialDaoCopy extends JpaRepository<Rtiuial, String> {
	//List<rtiuialclothes> findAll();
}
