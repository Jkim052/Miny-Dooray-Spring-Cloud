package com.nhnacademy.taskapi.exception;

public class ProjectNotFoundException extends RuntimeException {
    public ProjectNotFoundException(Long projectId) {
        super("Project with ID " + projectId + " not found.");
    }
}
