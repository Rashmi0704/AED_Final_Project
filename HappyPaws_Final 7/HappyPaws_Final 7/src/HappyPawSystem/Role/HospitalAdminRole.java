/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.Role;

import javax.swing.JPanel;
import HappyPawSystem.Ecosystem;
import HappyPawSystem.UserAccount.UserAccount;
import UserInterface.HospiitalAdmin.HospitalAdminWorkArea;


/**
 *
 * @author rashmisingh
 */
public class HospitalAdminRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new HospitalAdminWorkArea(userProcessContainer,account, system);
    }
}
