package com.example.springboot.thymeleafdemo.model;

import jakarta.validation.constraints.*;

public class Customer {
    private String firstName;
    @NotNull(message = "is required")
    @Size(min=3, message = "min length is 3")
    private String lastName;
    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value=10, message = "must be less than or equal to 10")
    private int freePasses;
    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
