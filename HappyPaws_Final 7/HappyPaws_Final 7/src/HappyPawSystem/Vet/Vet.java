/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.Vet;

/**
 *
 * @author rashmisingh
 */
public class Vet {

    private String name;
    private String username;
    private String petOwner;
    private String petType;
    private String healthCamp;
    private String hospitalName;
//    private String number;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getPetOwner() {
        return petOwner;
    }

    public void setPetOwner(String petOwner) {
        this.petOwner = petOwner;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
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

//    public String getNumber() {
//        return number;
//    }
//
//    public void setNumber(String number) {
//        this.number = number;
//    }
    
    public Vet(String username, String hospitalName) {
        this.username = username;
        this.hospitalName = hospitalName;
    }
    
    @Override
    public String toString() {
        return username;
    }
}

