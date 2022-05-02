/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.LabAssistant;

import java.util.ArrayList;

/**
 *
 * @author jsher
 */
public class LabAssistantDirectory {
    private ArrayList<LabAssistant> labAssistantDirectory;
    private LabAssistant labAssistant;

    public LabAssistantDirectory() {
        labAssistantDirectory = new ArrayList<LabAssistant>();
    }
    
    public ArrayList<LabAssistant> getLabAssistantDirectory() {
        return labAssistantDirectory;
    }

    public void setLabAssistantDirectory(ArrayList<LabAssistant> LabAssistantDirectory) {
        this.labAssistantDirectory = labAssistantDirectory;
    }


    public LabAssistant getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(LabAssistant labAssistant) {
        this.labAssistant = labAssistant;
    }

    public LabAssistant createUserAccount(String username) {
        labAssistant = new LabAssistant(username);
        labAssistantDirectory.add(labAssistant);
        return labAssistant;
    }

    public void updateLabAssistantInfo(LabAssistant labAssistant, String vetName, String petOwner, String petType, String healthCamp) {
//        labAssistant.setName(name);
        labAssistant.setPetOwner(petOwner);
        labAssistant.setVetName(vetName);
        labAssistant.setPetType(petType);
        labAssistant.setHealthCamp(healthCamp);
    }
    
    public void updateLabAssistantHospitalInfo(LabAssistant labAssistant, String hospitalName) {
        labAssistant.setHospitalName(hospitalName);
    }

    public void deleteLabAssistant(String username) {
        for (int i = 0; i < labAssistantDirectory.size(); i++) {
            if (labAssistantDirectory.get(i).getUsername() == username) {
                labAssistantDirectory.remove(i);
            }
        }
    }
    
    public void updateLabAssistantTestResult(LabAssistant labAssistant, String status) {
        labAssistant.setLabResultStatus(status);
    }
}
