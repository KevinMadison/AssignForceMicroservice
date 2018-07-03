package com.revature.service;

import java.util.List;
import java.util.Optional;

import com.revature.beans.Curriculum;
import com.revature.repos.CurrRepo;

public class CurrServiceImpl implements CurriculumService<Curriculum> {

	private CurrRepo currRepo;
	
	@Override
	public List<Curriculum> getAll() {
		
		return currRepo.findAll();
	}

	@Override
	public Optional<Curriculum> findById(int id) {
		
		return currRepo.findById(id);
	}

	@Override
	public Curriculum create(Curriculum obj) {
		
		return currRepo.save(obj);
	}

	@Override
	public Curriculum update(Curriculum obj) {
		
		return currRepo.save(obj);
	}

}
