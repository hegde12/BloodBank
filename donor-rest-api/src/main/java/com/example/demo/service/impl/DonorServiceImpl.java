package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Donor;
import com.example.demo.repo.DonorRepository;
import com.example.demo.service.DonorService;

@Service
public class DonorServiceImpl implements DonorService{
	@Autowired
	private DonorRepository repo;
	

	public DonorServiceImpl(DonorRepository repo) {
		super();
		this.repo = repo;
	}


	@Override
	public Donor addDonor(Donor d) {
		// TODO Auto-generated method stub
		return repo.save(d);
	}


	@Override
	public List<Donor> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	@Override
	public List<Donor> searchBycode(int n) {
		// TODO Auto-generated method stub
		return repo.findByareacode(n);
	}


	@Override
	public int delete(int n) {
		// TODO Auto-generated method stub
		int rowDeleted=0;
		if(this.repo.existsById(n)) 
		{
			this.repo.deleteById(n);
			rowDeleted = 1;
		}
		return rowDeleted;
		
	}


	@Override
	public Donor update(Donor d,int x) {
		// TODO Auto-generated method stub
		Donor existing=(Donor) repo.findByDonorId(x);
		existing.setDonorId(d.getDonorId());
		existing.setDonorName(d.getDonorName());
		existing.setBloodgroup(d.getBloodgroup());
		existing.setAreacode(d.getAreacode());
		existing.setDonorAge(d.getDonorAge());
		repo.save(existing);
		return existing;

	}


	@Override
	public List<Donor> searchBygroup(String s) {
		// TODO Auto-generated method stub
		return repo.findBybloodgroup(s);
	}

}
