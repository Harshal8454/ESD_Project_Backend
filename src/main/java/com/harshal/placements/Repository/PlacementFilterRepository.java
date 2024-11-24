package com.harshal.placements.Repository;

import com.harshal.placements.Model.Domain;
import com.harshal.placements.Model.Placement;
import com.harshal.placements.Model.PlacementFilter;
import com.harshal.placements.Model.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlacementFilterRepository extends JpaRepository<PlacementFilter, Integer> {

}