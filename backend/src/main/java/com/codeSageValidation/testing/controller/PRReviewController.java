package com.codeSageValidation.testing.controller;

import com.codeSageValidation.testing.dto.PRReviewRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pr")
public class PRReviewController {

    @PostMapping("/validate")
    public ResponseEntity<PRReviewRequest> validatePR(@Valid @RequestBody PRReviewRequest request) {

        // Simulate performing validation
        System.out.println("Validating PR for: " + request.getTitle());

        return ResponseEntity.ok(request);
    }
}
