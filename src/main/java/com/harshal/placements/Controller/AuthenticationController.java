package com.harshal.placements.Controller;

import com.harshal.placements.DTO.LoginRequest;
import com.harshal.placements.Service.OfferService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class AuthenticationController {
    private final OfferService offerService;
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Valid LoginRequest request) {
        return ResponseEntity.ok(offerService.loginCustomer(request));
    }
}