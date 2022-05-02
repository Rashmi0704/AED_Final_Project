/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.FundRaising;

/**
 *
 * @author jsher
 */
public class FundRaising {
    private String username;
    private String name;
    private String petOwner;
    private String petType;
    private String healthCamp;
    private String sponsor;
    private String hospitalName;
    private String sponsorStatus;

    public String getSponsorStatus() {
        return sponsorStatus;
    }

    public void setSponsorStatus(String sponsorStatus) {
        this.sponsorStatus = sponsorStatus;
    }

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

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public FundRaising(String username) {
        this.username = username;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}
