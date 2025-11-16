package com.codeSageValidation.testing.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class FileChange {

    @NotBlank(message = "File name cannot be empty")
    private String fileName;

    @NotBlank(message = "File content cannot be empty")
    private String content;

    @Min(value = 1, message = "Line number must be at least 1")
    private int line;

    public FileChange() {}

    public FileChange(String fileName, String content, int line) {
        this.fileName = fileName;
        this.content = content;
        this.line = line;
    }

    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public int getLine() { return line; }
    public void setLine(int line) { this.line = line; }
}

