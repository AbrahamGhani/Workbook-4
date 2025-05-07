package com.pluralsight;

public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String gender;

    // Constructor
    public Person(){}
    public Person(String firstName,String lastName, String email, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters
    public String getFullName() { return firstName +  " " + lastName; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getGender() { return gender; }

    public void setFirstName(String name) { this.firstName = name; }
    public void setLastName(String name) { this.lastName = name; }
    public void setEmail(String email) { this.email = email; }
    public void setGender(String gender) { this.gender = gender; }



}
