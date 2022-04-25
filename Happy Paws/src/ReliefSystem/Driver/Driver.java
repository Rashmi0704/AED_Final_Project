/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.Driver;

/**
 *
 * @author rashmisingh
 */
public class Driver {
    private String username;
    private String name;
    private String petType;
    private String petOwner;
    private String healthCamp;
    private String hospitalName;
    private String dropOffStatus;

    public String getDropOffStatus() {
        return dropOffStatus;
    }

    public void setDropOffStatus(String dropOffStatus) {
        this.dropOffStatus = dropOffStatus;
    }

    public String getHospitalName() {
        return hospitalName;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetOwner() {
        return petOwner;
    }

    public void setPetOwner(String petOwner) {
        this.petOwner = petOwner;
    }
    
    public Driver(String username){
        this.username = username;
    }
    
    @Override
    public String toString() {
        return username;
    }
}   

