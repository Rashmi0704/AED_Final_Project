/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.HealthCamp;

import java.util.ArrayList;

/**
 *
 * @author jsher
 */
public class HealthCampDirectory {
    private ArrayList<HealthCamp> healthCampDirectory;
    private HealthCamp healthCamp;

    public HealthCampDirectory() {
        healthCampDirectory = new ArrayList<HealthCamp>();
    }
    
    public ArrayList<HealthCamp> getHealthCampDirectory() {
        return healthCampDirectory;
    }

    public void setHealthCampDirectory(ArrayList<HealthCamp> healthCampDirectory) {
        this.healthCampDirectory = healthCampDirectory;
    }


    public HealthCamp getHealthCamp() {
        return healthCamp;
    }

    public void setHealthCamp(HealthCamp healthCamp) {
        this.healthCamp = healthCamp;
    }

    public HealthCamp createUserAccount(String username) {
        healthCamp = new HealthCamp(username);
        healthCampDirectory.add(healthCamp);
        return healthCamp;
    }

    public void updateHealthCampInfo(HealthCamp healthCamp, String name, String address, String number, String healthCampName) {
        healthCamp.setName(name);
        healthCamp.setAddress(address);
        healthCamp.setHealthCampName(healthCampName);
        healthCamp.setNumber(number);
    }

    public void deleteHealthCamp(String username) {
        for (int i = 0; i < healthCampDirectory.size(); i++) {
            if (healthCampDirectory.get(i).getUsername() == username) {
                healthCampDirectory.remove(i);
            }
        }
    }
    
    
}

