package com.revature.assignforce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.assignforce.beans.Skill;
import com.revature.assignforce.repository.SkillRepository;

@Service
@Transactional
public class SkillSerrviceImpl implements SkillService {

	@Autowired
	SkillRepository skillRepo;
	
	@Override
	public Skill getSkillById(int id) {
		return skillRepo.getOne(id);
	}

	@Override
	public Skill getSkillByTrainerId(int id) {
		
		return skillRepo.findByTrainers(id);
	}

	@Override
	public Skill getSkillByCurriculumId(int id) {
		
		return skillRepo.findByCurricula(id);
	}

}
