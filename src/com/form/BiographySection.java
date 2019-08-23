package com.form;

public class BiographySection {
    private String licenseCountryName;
    private  String licenseNumber;
    private int yearInPractice;
    private String gender;

    public BiographySection(String licenseCountryName, String licenseNumber, int yearInPractice, String gender) {
        this.licenseCountryName = licenseCountryName;
        this.licenseNumber = licenseNumber;
        this.yearInPractice = yearInPractice;
        this.gender = gender;
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
