package com.harshal.placements.Repository;

import com.harshal.placements.Model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository  extends JpaRepository<Organization, Integer> {

}
