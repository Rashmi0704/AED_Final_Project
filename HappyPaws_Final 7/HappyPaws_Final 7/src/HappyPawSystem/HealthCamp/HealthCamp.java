/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.HealthCamp;
import HappyPawSystem.PetVolunteer.PetVolunteer;
import java.util.ArrayList;

/**
 *
 * @author jsher
 */
public class HealthCamp {
    private String name;
    private String username;
    private String address;
    private String number;
    private String healthCampName;
    private ArrayList<PetVolunteer> petVolunteerList;

    public ArrayList<PetVolunteer> getPetVolunteerList() {
        return petVolunteerList;
    }

    public void setPetVolunteerList(ArrayList<PetVolunteer> petVolunteerList) {
        this.petVolunteerList = petVolunteerList;
    }

    public String getHealthCampName() {
        return healthCampName;
    }

    public void setHealthCampName(String healthCampName) {
        this.healthCampName = healthCampName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public HealthCamp(String username) {
        this.username = username;
        System.out.println("Health camp username : Health camp constructor : " + this.username);
    }
    
    public void addPetVolunteer(String petVolName) {
        PetVolunteer petVolunteer = new PetVolunteer(petVolName);
        petVolunteer.setHealthCamp(healthCampName);
    }
    
    
    
    @Override
    public String toString() {
        return name;
    }
    
}

