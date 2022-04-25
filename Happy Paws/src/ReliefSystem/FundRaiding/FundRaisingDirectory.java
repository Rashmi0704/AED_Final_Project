/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.FundRaiding;

import java.util.ArrayList;

/**
 *
 * @author rashmisingh
 */
public class FundRaisingDirectory {
    
    private ArrayList<FundRaising> fundRaisingDirectory;
    private FundRaising fundRaising;
    
    public ArrayList<FundRaising> getFundRaisingDirectory() {
        return fundRaisingDirectory;
    }

    public void setFundRaisingDirectory(ArrayList<FundRaising> fundRaisingDirectory) {
        this.fundRaisingDirectory = fundRaisingDirectory;
    }
    
    public FundRaisingDirectory() {
        fundRaisingDirectory = new ArrayList<FundRaising>();
    }
    
    public FundRaising createUserAccount(String username) {
        fundRaising = new FundRaising(username);
        fundRaisingDirectory.add(fundRaising);
        return fundRaising;
    }
    
    public void updateFundRaisingInfo(FundRaising fundRaising, String petOwner, String petType, String healthCamp, String hospitalName) {
//        fundRaising.setHealthCamp(healthCamp);
        fundRaising.setPetOwner(petOwner);
        fundRaising.setPetType(petType);
        fundRaising.setHealthCamp(healthCamp);
//        fundRaising.setSponsor(sponsor);
        fundRaising.setHospitalName(hospitalName);
    }
    
    public void deleteFundRaiser(String username) {
        for (int i = 0; i < fundRaisingDirectory.size(); i++) {
            if (fundRaisingDirectory.get(i).getUsername() == username) {
                fundRaisingDirectory.remove(i);
            }
        }
    }
    
    public void updateFundRaisingSponsorStatus(FundRaising fundRaising, String status) {
        fundRaising.setSponsorStatus(status);
    }
}


