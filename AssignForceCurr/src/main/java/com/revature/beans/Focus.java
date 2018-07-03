package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Focus")
public class Focus {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="focus")
	@SequenceGenerator(name="focus", sequenceName="focus_seq", allocationSize=1)
	@Column(name="FOCUS_ID")
	private int focusId;
	
	private String name;
	
	@OneToMany
	private int skillID;

	public Focus() {
		super();
	}

	public Focus(int focusId, String name, int skillID) {
		super();
		this.focusId = focusId;
		this.name = name;
		this.skillID = skillID;
	}

	public int getFocusId() {
		return focusId;
	}

	public void setFocusId(int focusId) {
		this.focusId = focusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSkillID() {
		return skillID;
	}

	public void setSkillID(int skillID) {
		this.skillID = skillID;
	}
	
	
	
	
}
