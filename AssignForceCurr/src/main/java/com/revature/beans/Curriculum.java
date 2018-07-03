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
@Table(name="Curriculum")
public class Curriculum {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curr")
	@SequenceGenerator(name="curr", sequenceName="curr_seq", allocationSize=1)
	@Column(name="CURR_ID")
	private int currId;
	
	
	private String name;
	
	@OneToMany
	private int skillId;


	public Curriculum(int currID, String name) {
		super();
		this.currId = currID;
		this.name = name;
	}


	public Curriculum() {
		super();
	}


	public int getCurrId() {
		return currId;
	}


	public void setCurrID(int currID) {
		this.currId = currID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
