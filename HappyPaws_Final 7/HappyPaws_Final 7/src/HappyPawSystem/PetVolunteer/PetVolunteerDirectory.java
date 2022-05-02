/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.PetVolunteer;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author rashmisingh
 */
public class PetVolunteerDirectory {

    private ArrayList<PetVolunteer> petVolunteerDirectory;
    private PetVolunteer petVolunteer;

    public PetVolunteerDirectory() {
        petVolunteerDirectory = new ArrayList<PetVolunteer>();
    }

    public ArrayList<PetVolunteer> getPetVolunteerDirectory() {
        return petVolunteerDirectory;
    }

    public void setPetVolunteerDirectory(ArrayList<PetVolunteer> petVolunteerDirectory) {
        this.petVolunteerDirectory = petVolunteerDirectory;
    }

    public PetVolunteer getPetVolunteer() {
        return petVolunteer;
    }

    public void setPetVolunteer(PetVolunteer petVolunteer) {
        this.petVolunteer = petVolunteer;
    }

    public PetVolunteer createUserAccount(String username) {
        petVolunteer = new PetVolunteer(username);
        petVolunteerDirectory.add(petVolunteer);
        return petVolunteer;
    }

    public void updatePetVolunteerInfo(PetVolunteer petVolunteer, String name, String petType, String healthCamp) {
        petVolunteer.setName(name);
        petVolunteer.setPetType(petType);
        petVolunteer.setHealthCamp(healthCamp);
    }

    public void updatePetVolunteerHospitalInfo(PetVolunteer petVolunteer, String hospitalName, String driverName) {
        petVolunteer.setDriver(driverName);
        petVolunteer.setHospitalName(hospitalName);
    }

    public void deletePetVolunteer(String username) {
        for (int i = 0; i < petVolunteerDirectory.size(); i++) {
            if (petVolunteerDirectory.get(i).getUsername() == username) {
                petVolunteerDirectory.remove(i);
            }
        }
    }

    public void updatePetType(String username, String petType) {
        for (int i = 0; i < petVolunteerDirectory.size(); i++) {
            if (petVolunteerDirectory.get(i).getUsername() == username) {
                petVolunteerDirectory.get(i).setPetType(petType);
            }
        }
    }

    public void updatePetVolunteerLabStatus(PetVolunteer petVolunteer, String status) {
        petVolunteer.setLabResultStatus(status);
    }

    public List<PetVolunteer> findPetVolunteerByHealthCampName(String healthCampName) {

        return petVolunteerDirectory.stream().filter(p -> p.getHealthCamp().equals(healthCampName)).collect(toList());

    }
}
