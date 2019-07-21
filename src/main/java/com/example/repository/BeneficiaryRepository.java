package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Beneficiary;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary,Long>{
	
	
	@Query("SELECT b FROM Beneficiary b WHERE b.ben_cust_id = ?1")
    public List<Beneficiary> findBenById(long custId);

}
