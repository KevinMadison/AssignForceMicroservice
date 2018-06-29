package com.revature.assignforce.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.assignforce.beans.Batch;

public interface BatchRepo extends JpaRepository<Batch, Integer>{

}
