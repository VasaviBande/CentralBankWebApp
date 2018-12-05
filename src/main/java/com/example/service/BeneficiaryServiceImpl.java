package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Beneficiary;
import com.example.repository.BeneficiaryRepository;

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
	public Beneficiary getBenById(long id) {
		// TODO Auto-generated method stub
		return benRepo.findOne(id);
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
