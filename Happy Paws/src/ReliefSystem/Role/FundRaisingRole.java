/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReliefSystem.Role;

import ReliefSystem.Ecosystem;
import ReliefSystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.FundRaiser.FundraiserWorkArea;


/**
 *
 * @author jsher
 */
public class FundRaisingRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new FundraiserWorkArea(userProcessContainer, account, system);
    }
    
}
