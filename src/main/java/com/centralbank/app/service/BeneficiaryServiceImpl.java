package com.centralbank.app.service;

import java.util.List;

import com.centralbank.app.repository.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centralbank.app.model.Beneficiary;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService{
	
	@Autowired
    BeneficiaryRepository benRepo;

	@Override
	public void createBeneficiary(Beneficiary ben) {
		// TODO Auto-generated method stub
		benRepo.save(ben);
		
	}

	@Override
	public List<Beneficiary> getBeneficiary() {
		// TODO Auto-generated method stub
		return (List<Beneficiary>) benRepo.findAll();
	}

	@Override
	public List<Beneficiary> getBenById(long id) {
		// TODO Auto-generated method stub
		return (List<Beneficiary>) benRepo.findBenById(id);
	}

	@Override
	public Beneficiary updateBen(Beneficiary ben, long l) {
		// TODO Auto-generated method stub
		return benRepo.save(ben);
	}

	@Override
	public void delBenById(long id) {
		// TODO Auto-generated method stub
		benRepo.delete(id);
	}
	
	

}
