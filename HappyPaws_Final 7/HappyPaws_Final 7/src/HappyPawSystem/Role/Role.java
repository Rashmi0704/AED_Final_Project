/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.Role;

import javax.swing.JPanel;
import HappyPawSystem.Ecosystem;
import HappyPawSystem.Organization;
import HappyPawSystem.UserAccount.UserAccount;


/**
 *
 * @author rashmisingh
 */
public abstract class Role {

    public enum RoleType {
        SysAdmin("Sysadmin"),
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

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            Ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
