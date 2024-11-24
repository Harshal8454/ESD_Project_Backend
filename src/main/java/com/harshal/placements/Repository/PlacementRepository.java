package com.harshal.placements.Repository;

import com.harshal.placements.Model.Placement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacementRepository extends JpaRepository<Placement, Integer> {
}
