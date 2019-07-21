package com.example.service;

import java.util.List;
import com.example.model.Beneficiary;



public interface BeneficiaryService {
	
	public void createBeneficiary(Beneficiary ben);
	
	public List<Beneficiary> getBeneficiary();
	
	public List<Beneficiary> getBenById(long id);
	
	public Beneficiary updateBen(Beneficiary ben, long l);
	
	public void delBenById(long id);
	

}
