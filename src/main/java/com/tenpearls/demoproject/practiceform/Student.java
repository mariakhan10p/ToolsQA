package com.tenpearls.demoproject.practiceform;

public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String mobileNumber;

    public Student(String firstName, String lastName, String gender, String mobileNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
