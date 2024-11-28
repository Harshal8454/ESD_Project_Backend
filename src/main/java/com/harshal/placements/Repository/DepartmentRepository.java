package com.harshal.placements.Repository;

import com.harshal.placements.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
//it's a build in method to interact with the department table in the database.