/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem;

import ReliefSystem.Person.Person;
import ReliefSystem.Role.SystemAdminRole;
import ReliefSystem.UserAccount.UserAccount;

/**
 *
 * @author rashmisingh
 * 
 */
public class ConfigureSystem {
    
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        
        System.out.println("Test");
         Person person = system.getPersonDirectory().createPerson("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("Sysadmin","sysadmin", "sysadmin", person, new SystemAdminRole());
        
        return system;
        
    }
    
}
    

