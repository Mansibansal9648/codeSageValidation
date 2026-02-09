package com.codeSageValidation.testing.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class PRReviewRequest {

    @NotBlank(message = "PR title cannot be empty")
    private String title;

    @NotBlank(message = "PR description is required")
    private String description;

    @NotEmpty(message = "Changed files list cannot be empty")
    private List<FileChange> files;

    public PRReviewRequest() {}

    public PRReviewRequest(String title, String description, List<FileChange> files) {
        this.title = title;
        this.description = description;
        this.files = files;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<FileChange> getFiles() { return files; }
    public void setFiles(List<FileChange> files) { this.files = files; }
}

