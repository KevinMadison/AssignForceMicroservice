package com.assignforce.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Rooms {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="rooms")
	@SequenceGenerator(name="room_id")
	private int room_id;
	
	private String room_name;
	private int building_id;
	private int unavailability_id;
	
	
	/**
	 * 	CONSTRUCTOR
	 */
	public Rooms(int room_id, String room_name, int building_id, int unavailability_id) {
		super();
		this.room_id = room_id;
		this.room_name = room_name;
		this.building_id = building_id;
		this.unavailability_id = unavailability_id;
	}
	
	/**
	 * SETTERS/GETTERS
	 */
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public int getBuilding_id() {
		return building_id;
	}
	public void setBuilding_id(int building_id) {
		this.building_id = building_id;
	}
	public int getUnavailability_id() {
		return unavailability_id;
	}
	public void setUnavailability_id(int unavailability_id) {
		this.unavailability_id = unavailability_id;
	}
}
