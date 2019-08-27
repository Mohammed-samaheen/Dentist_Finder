package com.form;

public class PersonData {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String website;
    private String phoneNumber;
    private String licenseCountryName;
    private  String licenseNumber;
    private int yearInPractice;
    private String gender;

    public PersonData(String firstName, String lastName, String emailAddress, String website, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.website = website;
        this.phoneNumber = phoneNumber;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLicenseCountryName() {
        return licenseCountryName;
    }

    public void setLicenseCountryName(String licenseCountryName) {
        this.licenseCountryName = licenseCountryName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getYearInPractice() {
        return yearInPractice;
    }

    public void setYearInPractice(int yearInPractice) {
        this.yearInPractice = yearInPractice;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
