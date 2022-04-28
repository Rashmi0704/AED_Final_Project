/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.Role;

import HappyPawSystem.Ecosystem;
import HappyPawSystem.UserAccount.UserAccount;
import UserInterface.HospiitalAdmin.HospitalAdminWorkArea;
import UserInterface.HospiitalAdmin.ManageVet;
import UserInterface.Hospital.VetWorkarea;
import javax.swing.JPanel;

/**
 *
 * @author jsher
 */
public class VetRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new VetWorkarea(userProcessContainer, system);
    }
}

