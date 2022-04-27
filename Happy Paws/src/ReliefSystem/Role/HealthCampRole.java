/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReliefSystem.Role;


import ReliefSystem.Ecosystem;
import ReliefSystem.UserAccount.UserAccount;
import UserInterface.HealthCamp.MainPageOrganiser;
import javax.swing.JPanel;
import ReliefSystem.PetVolunteer.PetVolunteerDirectory;
/**
 *
 * @author jsher
 */
public class HealthCampRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new MainPageOrganiser(userProcessContainer, account, system);
    }
}
