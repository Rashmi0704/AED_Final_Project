/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.Role;
import HappyPawSystem.Ecosystem;
import HappyPawSystem.UserAccount.UserAccount;
import UserInterface.HospiitalAdmin.ManageLabAssistant;
import UserInterface.Hospital.LabAssistantWorkArea;
import javax.swing.JPanel;


/**
 *
 * @author rashmisingh
 */ 
public class LabAssistantRole extends Role{
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new LabAssistantWorkArea(userProcessContainer,account, system);
    }
    
}
