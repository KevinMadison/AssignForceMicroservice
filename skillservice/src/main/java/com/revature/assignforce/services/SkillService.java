package com.revature.assignforce.services;

import com.revature.assignforce.beans.Skill;

public interface SkillService {
	
	public Skill getSkillById(int id);
	public Skill getSkillByTrainerId(int id);
	public Skill getSkillByCurriculumId(int id);
}
