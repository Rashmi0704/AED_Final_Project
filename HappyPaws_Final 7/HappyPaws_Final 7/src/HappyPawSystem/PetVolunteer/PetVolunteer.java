/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.PetVolunteer;

/**
 *
 * @author rashmisingh
 */
public class PetVolunteer {

    private String name;
    private String username;
    private String petType;
    private String healthCamp;
    private String hospitalName;
    private String driver;
    private String vetName;
    private String petStatus;
    private String labResultStatus;

    public String getLabResultStatus() {
        return labResultStatus;
    }

    public void setLabResultStatus(String labResultStatus) {
        this.labResultStatus = labResultStatus;
    }

    public String getPetStatus() {
        return petStatus;
    }

    public void setPetStatus(String petStatus) {
        this.petStatus = petStatus;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getHealthCamp() {
        return healthCamp;
    }

    public void setHealthCamp(String healthCamp) {
        this.healthCamp = healthCamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public PetVolunteer(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return name;
    }
}
