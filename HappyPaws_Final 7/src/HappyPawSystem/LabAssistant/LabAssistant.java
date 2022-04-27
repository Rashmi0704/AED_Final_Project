/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.LabAssistant;

/**
 *
 * @author rashmisingh
 */
public class LabAssistant {
    private String name;
    private String username;
    private String petType;
    private String petOwner;
    private String healthCamp;
    private String hospitalName;
    private String labResultStatus;

    public String getHospitalName() {
        return hospitalName;
    }

    public String getLabResultStatus() {
        return labResultStatus;
    }

    public void setLabResultStatus(String labResultStatus) {
        this.labResultStatus = labResultStatus;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHealthCamp() {
        return healthCamp;
    }

    public void setHealthCamp(String healthCamp) {
        this.healthCamp = healthCamp;
    }

    public String getPetOwner() {
        return petOwner;
    }

    public void setPetOwner(String petOwner) {
        this.petOwner = petOwner;
    }
    private String vetName;

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
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
    
    public LabAssistant(String username) {
        this.username = username;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

