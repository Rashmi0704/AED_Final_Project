/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReliefSystem.Role;


import ReliefSystem.Ecosystem;
import ReliefSystem.UserAccount.UserAccount;
import UserInterface.HospiitalAdmin.ManageLabAssistant;
import UserInterface.Hospital.LabAssitantWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author jsher
 */
public class LabAssistantRole extends Role{
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new LabAssitantWorkArea(userProcessContainer,account, system);
    }
    
}
