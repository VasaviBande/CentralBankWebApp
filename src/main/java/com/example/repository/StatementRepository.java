package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Statement;


@Repository("statementRepository")
public interface StatementRepository extends JpaRepository<Statement, Long> {

}
