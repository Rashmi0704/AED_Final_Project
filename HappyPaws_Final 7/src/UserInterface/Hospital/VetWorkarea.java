/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Hospital;

import HappyPawSystem.Ecosystem;
import HappyPawSystem.LabAssistant.LabAssistant;
import HappyPawSystem.PetVolunteer.PetVolunteer;
import HappyPawSystem.Vet.Vet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author haarikakatlaparthi
 */
public class VetWorkarea extends javax.swing.JPanel {

    /**
     * Creates new form VetWorkarea
     */
    
    JPanel userProcessContainer;
    Ecosystem system;
    
    public VetWorkarea(JPanel userProcessContainer, Ecosystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateVetTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVetPetOwners = new javax.swing.JTable();
        btnFurtherExaminationLab = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME VET");

        tblVetPetOwners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vet Name", "Pet Owner", "Pet Type", "Health Camp"
            }
        ));
        jScrollPane1.setViewportView(tblVetPetOwners);

        btnFurtherExaminationLab.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnFurtherExaminationLab.setForeground(new java.awt.Color(0, 102, 102));
        btnFurtherExaminationLab.setText("ASSIGN LAB");
        btnFurtherExaminationLab.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnFurtherExaminationLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFurtherExaminationLabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(289, 289, 289)
                            .addComponent(btnFurtherExaminationLab, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(61, 61, 61)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(60, 60, 60)
                    .addComponent(btnFurtherExaminationLab, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 51, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFurtherExaminationLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFurtherExaminationLabActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVetPetOwners.getSelectedRow();
        Vet vetSelected = (Vet) tblVetPetOwners.getValueAt(selectedRow, 0);
        for(LabAssistant labAssistant: system.getLabAssistantDirectory().getLabAssistantDirectory()) {
            for(Vet vet: system.getVetDirectory().getVetDirectory()) {
                if(vet.getHospitalName().equals(labAssistant.getHospitalName())) {
                    System.out.println("selected vet : " + vetSelected.getUsername() + " " + vetSelected.getHealthCamp());
                    system.getLabAssistantDirectory().updateLabAssistantInfo(labAssistant, vetSelected.getUsername(), vetSelected.getPetOwner(),vetSelected.getPetType(),vetSelected.getHealthCamp());
                    System.out.println("Lab assistant has been assigned");
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Lab assistant has been assigned successfully");
    }//GEN-LAST:event_btnFurtherExaminationLabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFurtherExaminationLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVetPetOwners;
    // End of variables declaration//GEN-END:variables


private void populateVetTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblVetPetOwners.getModel();
        for(PetVolunteer petVolunteer : system.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
            for(Vet vet: system.getVetDirectory().getVetDirectory()) {
                System.out.println("pet volunteer hosp name : " + petVolunteer.getHospitalName() );
                System.out.println("vet hosp name : " + vet.getHospitalName() );
                if(vet.getHospitalName().equals(petVolunteer.getHospitalName())){
                    Object[] row = new Object[4];
                    row[0] = vet;
                    row[1] = vet.getPetOwner();
                    row[2] = vet.getPetType();
                    row[3] = vet.getHealthCamp();
                    tablemodel.addRow(row);
                }
            }
        }
    }


}