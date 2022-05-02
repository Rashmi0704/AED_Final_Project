/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.UserAccount;

import HappyPawSystem.Person.Person;
import HappyPawSystem.Role.Role;

/**
 *
 * @author rashmisingh
 */
public class UserAccount {

    private String name;
    private String username;
    private String password;
    private Person person;
    private Role role;
//    private WorkQueue workQueue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public UserAccount() {
//
//    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return name;
    }
}

