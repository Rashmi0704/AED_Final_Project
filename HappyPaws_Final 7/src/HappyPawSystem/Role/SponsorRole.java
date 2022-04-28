/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.Role;

import javax.swing.JPanel;
import HappyPawSystem.Ecosystem;
import HappyPawSystem.UserAccount.UserAccount;
import UserInterface.Sponsor.SponsorWorkArea;

/**
 *
 * @author jsher
 */
public class SponsorRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new SponsorWorkArea(userProcessContainer, account, system);
    }
}

