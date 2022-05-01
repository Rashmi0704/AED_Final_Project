/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.Role;

import javax.swing.JPanel;

import HappyPawSystem.Ecosystem;
import HappyPawSystem.UserAccount.UserAccount;
import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaPanel;


/**
 *
 * @author jsher
 */
public class SystemAdminRole extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new SystemAdminWorkAreaPanel(userProcessContainer, system);
    }
}
