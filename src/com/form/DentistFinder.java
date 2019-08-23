package com.form;

public class DentistFinder {


    private   PersonalInformation personalInformation;
    private BiographySection biographySection;
    private  EducationSection educationSection;
    private AddressSection addressSection;
    private AreasOfSpecializationSection area;


    private DentistFinder(DentistFinderBuilder builder ){
        this.personalInformation=builder.personalInformation;
        this.educationSection=builder.educationSection;
        this.biographySection=builder.biographySection;
        this.addressSection=builder.addressSection;
        this.area=builder.area;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public BiographySection getBiographySection() {
        return biographySection;
    }

    public EducationSection getEducationSection() {
        return educationSection;
    }

    public AddressSection getAddressSection() {
        return addressSection;
    }

    public AreasOfSpecializationSection getArea() {
        return area;
    }

    public static class DentistFinderBuilder{

        private   PersonalInformation personalInformation;
        private BiographySection biographySection;
        private  EducationSection educationSection;
        private AddressSection addressSection;
        private AreasOfSpecializationSection area;

        public DentistFinderBuilder(PersonalInformation personalInformation, BiographySection biographySection, EducationSection educationSection, AddressSection addressSection) {
            this.personalInformation = personalInformation;
            this.biographySection = biographySection;
            this.educationSection = educationSection;
            this.addressSection = addressSection;
        }

        public DentistFinderBuilder personalInformation(PersonalInformation personalInformation) {
            this.personalInformation = personalInformation;
            return this;
        }

        public DentistFinderBuilder biographySection(BiographySection biographySection) {
            this.biographySection = biographySection;
            return this;
        }

        public DentistFinderBuilder educationSection(EducationSection educationSection) {
            this.educationSection = educationSection;
            return this;
        }

        public DentistFinderBuilder addressSection(AddressSection addressSection) {
            this.addressSection = addressSection;
            return this;
        }

        public DentistFinderBuilder areaSpecialization(AreasOfSpecializationSection area) {
            this.area = area;
            return this;
        }
        public DentistFinder build(){
            DentistFinder dentistFinder =new DentistFinder(this);
            return  dentistFinder;
        }
    }
}
