package com.assignforce.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.assignforce.beans.Buildings;

public interface BuildingsRepository extends JpaRepository<Buildings, Integer>{

}