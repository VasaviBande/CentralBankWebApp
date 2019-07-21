package com.centralbank.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centralbank.app.model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Long>{

}

