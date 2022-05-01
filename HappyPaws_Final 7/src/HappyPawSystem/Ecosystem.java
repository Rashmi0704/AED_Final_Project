/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyPawSystem;


import HappyPawSystem.Driver.DriverDirectory;
import HappyPawSystem.FundRaising.FundRaisingDirectory;
import HappyPawSystem.HealthCamp.HealthCampDirectory;
import HappyPawSystem.Hospital.HospitalDirectory;
import HappyPawSystem.LabAssistant.LabAssistantDirectory;
import HappyPawSystem.PetVolunteer.PetVolunteerDirectory;
import HappyPawSystem.Role.Role;
import HappyPawSystem.Role.SystemAdminRole;
import HappyPawSystem.Sponsor.SponsorDirectory;
import HappyPawSystem.Vet.VetDirectory;
import java.util.ArrayList;

/**
 *
 * @author rashmisingh
 */
    
    public class Ecosystem extends Organization{

    private static Ecosystem HappyPawSystem;
    private HospitalDirectory hospitalDirectory;
    private VetDirectory vetDirectory;
    private PetVolunteerDirectory petVolunteerDirectory;
    private HealthCampDirectory healthCampDirectory;
    private FundRaisingDirectory fundRaisingDirectory;
    private LabAssistantDirectory labAssistantDirectory;
    private SponsorDirectory sponsorDirectory;
    private DriverDirectory driverDirectory;

    public Ecosystem(HospitalDirectory hospitalDirectory, VetDirectory vetDirectory, PetVolunteerDirectory petVolunteerDirectory, HealthCampDirectory healthCampDirectory, FundRaisingDirectory fundRaisingDirectory, LabAssistantDirectory labAssistantDirectory,SponsorDirectory sponsorDirectory,DriverDirectory driverDirectory) {
        this.hospitalDirectory = hospitalDirectory;
        this.vetDirectory = vetDirectory;
        this.petVolunteerDirectory = petVolunteerDirectory;
        this.healthCampDirectory = healthCampDirectory;
        this.fundRaisingDirectory = fundRaisingDirectory;
        this.labAssistantDirectory = labAssistantDirectory;
        this.sponsorDirectory = sponsorDirectory;
        this.driverDirectory = driverDirectory;
    }

    public static Ecosystem getInstance() {
        if (HappyPawSystem == null) {
            HappyPawSystem = new Ecosystem();
        }
        return HappyPawSystem;
    }

    public static void setInstance(Ecosystem system) {
        HappyPawSystem = system;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private Ecosystem() {
        super(null);
    }

    public boolean checkIfUserIsUnique(String userName) {
        
        return false;
    }

    public HospitalDirectory getHospitalDirectory() {
        if (hospitalDirectory == null) {
            hospitalDirectory = new HospitalDirectory();
        }
        return hospitalDirectory;
    }

    public VetDirectory getVetDirectory() {
        if (vetDirectory == null) {
            vetDirectory = new VetDirectory();
        }
        return vetDirectory;
    }

    public PetVolunteerDirectory getPetVolunteerDirectory() {
        if (petVolunteerDirectory == null) {
            petVolunteerDirectory = new PetVolunteerDirectory();
            System.out.println("This should not show up");
        }
        return petVolunteerDirectory;
    }

    public HealthCampDirectory getHealthCampDirectory() {
        if (healthCampDirectory == null) {
            healthCampDirectory = new HealthCampDirectory();
        }
        return healthCampDirectory;
    }
    
    public LabAssistantDirectory getLabAssistantDirectory() {
        if (labAssistantDirectory == null) {
            labAssistantDirectory = new LabAssistantDirectory();
        }
        return labAssistantDirectory;
    }
    
    
    public FundRaisingDirectory getFundRaisingDirectory() {
        if (fundRaisingDirectory == null) {
            fundRaisingDirectory = new FundRaisingDirectory();
        }
        return fundRaisingDirectory;
    }
    
    public SponsorDirectory getSponsorDirectory() {
        if (sponsorDirectory == null) {
            sponsorDirectory = new SponsorDirectory();
        }
        return sponsorDirectory;
    }
    
     public DriverDirectory getDriverDirectory() {
        if (driverDirectory == null) {
            driverDirectory = new DriverDirectory();
        }
        return driverDirectory;
    }
}
