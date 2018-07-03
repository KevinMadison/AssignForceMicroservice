package com.revature.assignforce.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="SKILL")
public class Skill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="skill")
	@SequenceGenerator(name="skill", sequenceName="skill_seq", allocationSize=1)
	@Column(name="UNAVAILABLEID")
	private int id;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="TRAINER_SKILLS",
			joinColumns=@JoinColumn(name="SKILL_ID"),
			inverseJoinColumns=@JoinColumn(name="TRAINER_ID"))
	private Set<TrainerIdHolder> trainers;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="CURRICULUM_SKILLS",
			joinColumns=@JoinColumn(name="SKILL_ID"),
			inverseJoinColumns=@JoinColumn(name="CURRICULUM_ID"))
	private Set<CurriculumIdHolder> curricula;
	
	
}
