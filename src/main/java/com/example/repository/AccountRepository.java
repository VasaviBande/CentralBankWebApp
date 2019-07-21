package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{


	@Query("SELECT b FROM Account b WHERE b.cust_id = ?1")
    public List<Account> findAcById(long custId);
	
}
