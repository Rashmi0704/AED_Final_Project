/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReliefSystem.Role;

import ReliefSystem.Ecosystem;
import ReliefSystem.Organization;
import ReliefSystem.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author jsher
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
