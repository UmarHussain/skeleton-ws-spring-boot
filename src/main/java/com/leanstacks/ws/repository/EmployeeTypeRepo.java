package com.leanstacks.ws.repository;

import com.leanstacks.ws.model.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTypeRepo extends JpaRepository<EmployeeType,Long> {

}
