package com.harshal.placements.Controller;

import com.harshal.placements.DTO.DomainResponse;
import com.harshal.placements.DTO.PlacementRequest;
import com.harshal.placements.DTO.SpecializationResponse;
import com.harshal.placements.Model.*;
import com.harshal.placements.Service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class OfferController {

    public final OfferService service; // Make the field final to enforce proper initialization.

    @Autowired
    public OfferController(OfferService service) {
        this.service = service; // Correctly assign the parameter to the field.
    }

    @PostMapping("/submit")
    public String getOffers(@RequestBody PlacementRequest request){
        PlacementFilter savedPlacement = service.savePlacementAndFilter(request);
        return "Placement saved with ID: " + savedPlacement.getId();
    }

    @GetMapping("/api/specialization")
    public List<SpecializationResponse> getSpecializations() {
        // Creating some dummy specialization data
        return service.getspecializations();
    }

    @GetMapping("api/domain")
    public List<DomainResponse> getDomains() {
        // Logic for fetching domains
        return service.getDomains();
    }

//    @PostMapping("/login")
//    public String login(@RequestBody Employee employee){
//        return service.verify(employee);
//    }

    @GetMapping("/")
    public List<Placement> showOffers() {
        return service.getOffers(); // Accessing the properly initialized service.
    }
}