package com.revature.service;

import java.util.List;
import java.util.Optional;

import com.revature.beans.Skills;
import com.revature.repos.SkillRepo;

public class SkillServiceImpl implements CurriculumService<Skills> {

	private SkillRepo skillRepo;
	
	@Override
	public List<Skills> getAll() {
		
		return skillRepo.findAll();
	}

	@Override
	public Optional<Skills> findById(int id) {
	
		return skillRepo.findById(id);
	}

	@Override
	public Skills create(Skills obj) {
		
		return skillRepo.save(obj);
	}

	@Override
	public Skills update(Skills obj) {
		
		return skillRepo.save(obj);
	}

}
