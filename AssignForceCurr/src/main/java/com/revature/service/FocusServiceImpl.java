package com.revature.service;

import java.util.List;
import java.util.Optional;

import com.revature.beans.Focus;
import com.revature.repos.FocusRepo;

public class FocusServiceImpl implements CurriculumService<Focus> {

	private FocusRepo focusRepo;
	
	@Override
	public List<Focus> getAll() {
		
		return focusRepo.findAll();
	}

	@Override
	public Optional<Focus> findById(int id) {
		
		return focusRepo.findById(id);
	}

	@Override
	public Focus create(Focus obj) {
		
		return focusRepo.save(obj);
	}

	@Override
	public Focus update(Focus obj) {
		
		return focusRepo.save(obj);
	}
	
	public void delete(int id) {
		 focusRepo.deleteById(id);
	}

}
