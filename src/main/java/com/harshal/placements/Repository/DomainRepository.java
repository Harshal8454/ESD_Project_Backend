package com.harshal.placements.Repository;

import com.harshal.placements.Model.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepository extends JpaRepository<Domain, Integer> {
}
//it's a build in method to interact with the domain table in the database.
