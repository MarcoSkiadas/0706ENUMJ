package org.example;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    DIVERSE("Diverse");

    private final String gender;

    Gender(String gender){
        this.gender = gender;
    }
}
