package com.form;

import java.util.ArrayList;

public class DentistBuilder {



    private PersonData personalData;
    private ArrayList<EducationSection> educationSectionList=new ArrayList<>();
    private ArrayList<AddressSection> addressSectionList=new ArrayList<>();
    private ArrayList<AreasOfSpecializationSection> areaList=new ArrayList<>();


    private DentistBuilder (DentistFinderBuilder builder){

        this.personalData=builder.personalData;
        this.educationSectionList=builder.educationSectionList;
        this.addressSectionList=builder.addressSectionList;
        this.areaList=builder.areaList;
    }

    public PersonData getPersonalData() {
        return personalData;
    }

    public ArrayList<EducationSection> getEducationSectionList() {
        return educationSectionList;
    }

    public ArrayList<AddressSection> getAddressSectionList() {
        return addressSectionList;
    }

    public ArrayList<AreasOfSpecializationSection> getAreaList() {
        return areaList;
    }

    public static class DentistFinderBuilder{

        private PersonData personalData;
        private ArrayList<EducationSection> educationSectionList=new ArrayList<>();
        private ArrayList<AddressSection> addressSectionList=new ArrayList<>();
        private ArrayList<AreasOfSpecializationSection> areaList=new ArrayList<>();

        //the fist three details are mandatory ,but the areas Of Specialization Section are optional


        public DentistFinderBuilder personalData(PersonData personalData) {
            this.personalData = personalData;
            return this;
        }

        public DentistFinderBuilder educationSectionList(ArrayList<EducationSection> educationSectionList) {
            this.educationSectionList = educationSectionList;
            return this;
        }

        public DentistFinderBuilder addressSectionList(ArrayList<AddressSection> addressSectionList) {
            this.addressSectionList = addressSectionList;
            return this;
        }

        public DentistFinderBuilder areaList(ArrayList<AreasOfSpecializationSection> areaList) {
            this.areaList = areaList;
            return this;
        }
        public DentistBuilder build(){
            DentistBuilder builder =new DentistBuilder(this);
            return builder;
        }
    }
}
