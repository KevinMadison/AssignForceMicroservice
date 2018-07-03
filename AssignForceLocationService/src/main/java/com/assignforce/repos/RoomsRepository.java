package com.assignforce.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.assignforce.beans.Rooms;

public interface RoomsRepository extends JpaRepository<Rooms, Integer>{

}