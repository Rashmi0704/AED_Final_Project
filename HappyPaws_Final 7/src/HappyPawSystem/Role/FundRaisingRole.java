/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.Role;
import HappyPawSystem.Ecosystem;
import HappyPawSystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.Fundraiser.FundraiserWorkArea;

/**
 *
 * @author rashmisingh
 */
public class FundRaisingRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new FundraiserWorkArea(userProcessContainer, account, system);
    }
}
