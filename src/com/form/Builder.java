package com.form;

import java.util.ArrayList;

public class Builder {


    private   PersonalInformation personalInformation;
    private BiographySection biographySection;
    private ArrayList<EducationSection> educationSectionList=new ArrayList<>();
    private ArrayList<AddressSection> addressSectionList=new ArrayList<>();
    private ArrayList<AreasOfSpecializationSection> areaList=new ArrayList<>();

    private Builder (DentistFinderBuilder builder){
        this.personalInformation=builder.personalInformation;
        this.biographySection=builder.biographySection;
        this.educationSectionList=builder.educationSectionList;
        this.addressSectionList=builder.addressSectionList;
        this.areaList=builder.areaList;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public BiographySection getBiographySection() {
        return biographySection;
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
        private   PersonalInformation personalInformation;
        private BiographySection biographySection;
        private ArrayList<EducationSection> educationSectionList=new ArrayList<>();
        private ArrayList<AddressSection> addressSectionList=new ArrayList<>();
        private ArrayList<AreasOfSpecializationSection> areaList=new ArrayList<>();


        //the first four data section are mandatory, but the Areas Of Specialization Section
        //are optional.

        public DentistFinderBuilder(PersonalInformation personalInformation, BiographySection biographySection,
                                    ArrayList<EducationSection> educationSectionList, ArrayList<AddressSection> addressSectionList) {
            this.personalInformation = personalInformation;
            this.biographySection = biographySection;
            this.educationSectionList = educationSectionList;
            this.addressSectionList = addressSectionList;
        }

        public DentistFinderBuilder personalInformation(PersonalInformation personalInformation) {
            this.personalInformation = personalInformation;
            return this;
        }

        public DentistFinderBuilder biographySection(BiographySection biographySection) {
            this.biographySection = biographySection;
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
        public Builder build(){
            Builder builder =new Builder(this);
            return builder;
        }
    }
}
