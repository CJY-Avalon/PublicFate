package com.fateapi.Dao;

import com.fateapi.domain.Account_Possessions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Account_PossessionsDao extends JpaRepository<Account_Possessions, String> {

}
