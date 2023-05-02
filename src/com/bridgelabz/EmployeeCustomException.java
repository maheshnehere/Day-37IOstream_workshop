package com.bridgelabz;

public class EmployeeCustomException extends Exception {
    /creating constructor
    public EmployeeCustomException(String msg) {
        super(msg);          // Passing message to parent class of exception.
    }
}