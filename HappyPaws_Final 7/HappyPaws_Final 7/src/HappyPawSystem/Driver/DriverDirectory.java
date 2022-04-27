/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem.Driver;

import java.util.ArrayList;

/**
 *
 * @author jsher
 */
public class DriverDirectory {
    private ArrayList<Driver> driverDirectory;
    private Driver driver;

    public DriverDirectory() {
        driverDirectory = new ArrayList<Driver>();
    }

    public ArrayList<Driver> getDriverDirectory() {
        return driverDirectory;
    }

    public void setPetVolunteerDirectory(ArrayList<Driver> driverDirectory) {
        this.driverDirectory = driverDirectory;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setPetVolunteer(Driver petVolunteer) {
        this.driver = petVolunteer;
    }

    public Driver createUserAccount(String username) {
        driver = new Driver(username);
        driverDirectory.add(driver);
        return driver;
    }

    public void updateDriverInfo(Driver driver, String name, String petType, String petOwner, String healthCamp, String hospitalName) {
        driver.setName(name);
        driver.setPetType(petType);
        driver.setPetOwner(petOwner);
        driver.setHealthCamp(healthCamp);
        driver.setHospitalName(hospitalName);
    }
    
    public void updateDriverPersonalInfo(Driver driver, String name, String username) {
        driver.setName(name);
        driver.setUsername(username);
    }
    
    public void updateDriverHealthCampInfo(Driver driver, String petOwner, String petType, String healthCamp, String hospitalName){
        driver.setPetType(petType);
        driver.setPetOwner(petOwner);
        driver.setHealthCamp(healthCamp);
        driver.setHospitalName(hospitalName);
//        driver.setHospitalName(hospitalName);
    }
    
    public void updateDropOffStatus(Driver driver, String status) {
        driver.setDropOffStatus(status);
    }

    public void deleteDriver(String username) {
        for (int i = 0; i < driverDirectory.size(); i++) {
            if (driverDirectory.get(i).getUsername() == username) {
                driverDirectory.remove(i);
            }
        }
    }
}

