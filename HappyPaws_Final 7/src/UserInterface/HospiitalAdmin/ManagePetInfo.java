/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospiitalAdmin;
import HappyPawSystem.Ecosystem;
import HappyPawSystem.FundRaising.FundRaising;
import HappyPawSystem.PetVolunteer.PetVolunteer;
import HappyPawSystem.UserAccount.UserAccount;
import HappyPawSystem.Vet.Vet;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rashmisingh
 */
public class ManagePetInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManagePetInfo
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;
    
    public ManagePetInfo(JPanel userProcessContainer,UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.system = system;
        this.account = account;
        populatePetInfo();
        populateVetTable();
    }

    public void populatePetInfo() {
        
        DefaultTableModel tablemodel = (DefaultTableModel) tblpetinfo.getModel();
        tablemodel.setRowCount(0);
        for (PetVolunteer petVolunteer : system.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
            if (petVolunteer.getHospitalName().equals(account.getName())) {
                Object[] row = new Object[5];
                row[0] = petVolunteer;
                row[1] = petVolunteer.getName();
//                row[2] = petVolunteer.getUsername();
                row[2] = petVolunteer.getPetType();
                row[3] = petVolunteer.getHealthCamp();
                row[4] = petVolunteer.getLabResultStatus() == null ? "N/A" : petVolunteer.getLabResultStatus();
                tablemodel.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpetinfo = new javax.swing.JTable();
        btnAssignPetOwnerToVet = new javax.swing.JButton();
        btnaddfundraiser = new javax.swing.JButton();
        lblVet = new javax.swing.JLabel();
        txtvet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVets = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 575));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblpetinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "pet username", "pet owner", "pet type", "Health Camp", "Lab result status"
            }
        ));
        jScrollPane1.setViewportView(tblpetinfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 480, 105));

        btnAssignPetOwnerToVet.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAssignPetOwnerToVet.setForeground(new java.awt.Color(0, 102, 102));
        btnAssignPetOwnerToVet.setText("ADD VET");
        btnAssignPetOwnerToVet.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnAssignPetOwnerToVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignPetOwnerToVetActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssignPetOwnerToVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 150, 30));

        btnaddfundraiser.setBackground(new java.awt.Color(255, 255, 255));
        btnaddfundraiser.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnaddfundraiser.setForeground(new java.awt.Color(0, 102, 102));
        btnaddfundraiser.setText("ADD FUNDRAISER");
        btnaddfundraiser.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnaddfundraiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddfundraiserActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddfundraiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 150, 30));

        lblVet.setBackground(new java.awt.Color(255, 255, 255));
        lblVet.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblVet.setForeground(new java.awt.Color(0, 102, 102));
        lblVet.setText("VET NAME");
        jPanel1.add(lblVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 100, 30));

        txtvet.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtvet, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 120, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ASSIGN PET TO VET");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 360, 60));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 40));

        tblVets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Vet username"
            }
        ));
        jScrollPane2.setViewportView(tblVets);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 500, 100));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 890, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignPetOwnerToVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignPetOwnerToVetActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblpetinfo.getSelectedRow();
        PetVolunteer vetSelected = (PetVolunteer) tblpetinfo.getValueAt(selectedRow, 0);
        String vetPetOwner = vetSelected.getName();
        String vetPetType = vetSelected.getPetType();
        String vetHealthCamp = vetSelected.getHealthCamp();
        String vetHospitalName = vetSelected.getHospitalName();
        for(Vet vet: system.getVetDirectory().getVetDirectory()) {
            if(vet.getUsername().equals(txtvet.getText())){
                system.getVetDirectory().updateVetInfo(vet, vetPetOwner, vetPetType, vetHealthCamp, vetHospitalName);
            }
        }
        JOptionPane.showMessageDialog(this, "Vet added Successfuly");
    }//GEN-LAST:event_btnAssignPetOwnerToVetActionPerformed

    private void btnaddfundraiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddfundraiserActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblpetinfo.getSelectedRow();
        PetVolunteer vetSelected = (PetVolunteer) tblpetinfo.getValueAt(selectedRow, 0);
        String vetPetOwner = vetSelected.getName();
        String vetPetType = vetSelected.getPetType();
        String vetHealthCamp = vetSelected.getHealthCamp();
        String vetHospitalName = vetSelected.getHospitalName();
        for(FundRaising fundRaising: system.getFundRaisingDirectory().getFundRaisingDirectory()) {
            system.getFundRaisingDirectory().updateFundRaisingInfo(fundRaising, vetPetOwner, vetPetType, vetHealthCamp, vetHospitalName);
            System.out.println("Fund raising agency has been added sucessfully");
     }
        JOptionPane.showMessageDialog(this, "Request sent to the Fundraising agency successfully");
    }//GEN-LAST:event_btnaddfundraiserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignPetOwnerToVet;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnaddfundraiser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblVet;
    private javax.swing.JTable tblVets;
    private javax.swing.JTable tblpetinfo;
    private javax.swing.JTextField txtvet;
    // End of variables declaration//GEN-END:variables

private void populateVetTable() {
        
        DefaultTableModel tablemodel = (DefaultTableModel) tblVets.getModel();
        tablemodel.setRowCount(0);
        
        for(Vet vet: system.getVetDirectory().getVetDirectory()){
            System.out.println("vet name :" + vet.getHospitalName());
            System.out.println("account name :" + account.getName());
            if(vet.getHospitalName().equals(account.getName())) {
                Object[] row = new Object[1];
                System.out.println("here");
                row[0] = vet;
                tablemodel.addRow(row);
            }
        }
    }
}