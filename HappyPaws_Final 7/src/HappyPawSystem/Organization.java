/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem;


import HappyPawSystem.HealthCamp.HealthCampDirectory;
import HappyPawSystem.Hospital.HospitalDirectory;
import HappyPawSystem.Person.PersonDirectory;
import HappyPawSystem.Role.Role;
import HappyPawSystem.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author rashmisingh
 */
public abstract class Organization {
    
    private String name;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private HospitalDirectory hospitalDirectory;
    private HealthCampDirectory healthCampDirectory;
    private int organizationID;
    private static int counter = 0;

    public enum Type {
        SysAdmin("SysAdmin"),
        HospitalAdmin("HospitalAdmin"),
        HealthCampOrganizer("HealthCampOrganizer"),
        HealthCampVolunteer("HealthCampVolunteer"),
        FundRaisingAgency("FundRaisingAgency"),
        Vet("Vet"),
        LabAssistant("LabAssistant"),
        PetVolunteer("PetVolunteer"),
        Driver("Driver"),
        Pharmacy("Pharmacy"),
        Sponsor("Sponsor");
        

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        hospitalDirectory = new HospitalDirectory();
        healthCampDirectory = new HealthCampDirectory();
        organizationID = counter;
        ++counter;
    }

    public Organization() {

    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
    
    
    public HealthCampDirectory getHealthCampDirectory() {
        return healthCampDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}   
    
