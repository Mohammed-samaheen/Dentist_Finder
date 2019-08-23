package com.form;

public class AreasOfSpecializationSection {

    private String areasOfSpecialization;
    private int startYear;

    public AreasOfSpecializationSection(String areasOfSpecialization, int startYear) {
        this.areasOfSpecialization = areasOfSpecialization;
        this.startYear = startYear;
    }

    public String getAreasOfSpecialization() {
        return areasOfSpecialization;
    }

    public void setAreasOfSpecialization(String areasOfSpecialization) {
        this.areasOfSpecialization = areasOfSpecialization;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }


}
