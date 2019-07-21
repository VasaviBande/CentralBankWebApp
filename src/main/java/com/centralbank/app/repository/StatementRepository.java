package com.centralbank.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centralbank.app.model.Statement;


@Repository("statementRepository")
public interface StatementRepository extends JpaRepository<Statement, Long> {

}
