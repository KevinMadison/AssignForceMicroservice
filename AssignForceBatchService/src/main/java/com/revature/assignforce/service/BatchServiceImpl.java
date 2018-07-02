package com.revature.assignforce.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.assignforce.beans.Batch;
import com.revature.assignforce.repos.BatchRepo;

@Service
@Transactional
public class BatchServiceImpl implements BatchService {

	@Autowired
	private BatchRepo batchRepo;
	
	@Override
	public List<Batch> getAll() {
		return batchRepo.findAll();
	}

	@Override
	public Optional<Batch> findById(int id) {
		return batchRepo.findById(id);
	}

	@Override
	public Batch update(Batch b) {
		return batchRepo.save(b);
	}

	@Override
	public Batch create(Batch b) {
		return batchRepo.save(b);
	}

	@Override
	public void delete(int id) {
		batchRepo.deleteById(id);
	}

}
