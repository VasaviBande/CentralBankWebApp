package com.centralbank.app.repository;

import com.centralbank.app.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {


    //@Query("SELECT b FROM Account b WHERE b.cust_id = ?1")
    //public Account findAcById(int custId);

}
