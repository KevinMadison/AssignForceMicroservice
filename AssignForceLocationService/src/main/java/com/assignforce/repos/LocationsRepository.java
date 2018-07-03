package com.assignforce.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.assignforce.beans.Locations;

public interface LocationsRepository extends JpaRepository<Locations, Integer>{

}