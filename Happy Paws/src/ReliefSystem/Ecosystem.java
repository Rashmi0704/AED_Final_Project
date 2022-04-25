/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem;
import ReliefSystem.Driver.DriverDirectory;
import ReliefSystem.FundRaising.FundRaisingDirectory;
import ReliefSystem.HealthCamp.HealthCampDirectory;
import ReliefSystem.Hospital.HospitalDirectory;
import ReliefSystem.LabAssistant.LabAssistantDirectory;
import ReliefSystem.PetVolunteer.PetVolunteerDirectory;
import ReliefSystem.Role.Role;
import ReliefSystem.Role.SystemAdminRole;
import ReliefSystem.Sponsor.SponsorDirectory;
import ReliefSystem.Vet.VetDirectory;
import java.util.ArrayList;

/**
 *
 * @author rashmisingh
 */
import java.util.ArrayList;
public class Ecosystem {
    
    public class Ecosystem extends Organization {

    private static Ecosystem ReliefSystem;
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
        if (ReliefSystem == null) {
            ReliefSystem = new Ecosystem();
        }
        return ReliefSystem;
    }

    public static void setInstance(Ecosystem system) {
        ReliefSystem = system;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private Ecosystem() {
        super(null);
//         networkList=new ArrayList<Network>();
    }

    public boolean checkIfUserIsUnique(String userName) {
        //
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

    
}
