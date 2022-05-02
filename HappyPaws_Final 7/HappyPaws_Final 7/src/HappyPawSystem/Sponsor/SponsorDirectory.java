/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.Sponsor;

import java.util.ArrayList;

/**
 *
 * @author rashmisingh
 */
public class SponsorDirectory {
    private ArrayList<Sponsor> sponsorDirectory;
    private Sponsor sponsor;

    public ArrayList<Sponsor> getSponsorDirectory() {
        return sponsorDirectory;
    }

    public void setSponsorDirectory(ArrayList<Sponsor> sponsorDirectory) {
        this.sponsorDirectory = sponsorDirectory;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }
    
    
    public SponsorDirectory() {
        sponsorDirectory = new ArrayList<Sponsor>();
    }
    
    public Sponsor createUserAccount(String username) {
        sponsor = new Sponsor(username);
        sponsorDirectory.add(sponsor);
        return sponsor;
    }
    
    public void deleteSponsor(String username) {
        for (int i = 0; i < sponsorDirectory.size(); i++) {
            if (sponsorDirectory.get(i).getUsername() == username) {
                sponsorDirectory.remove(i);
            }
        }
    }
    
    public void updateSponsorPetOwnerInfo(Sponsor sponsor, String petOwner, String petType, String healthCamp, String hospitalName) {
        sponsor.setPetOwner(petOwner);
        sponsor.setPetOwner(petOwner);
        sponsor.setPetType(petType);
        sponsor.setHealthCamp(healthCamp);
        sponsor.setHospitalName(hospitalName);
    }
}

