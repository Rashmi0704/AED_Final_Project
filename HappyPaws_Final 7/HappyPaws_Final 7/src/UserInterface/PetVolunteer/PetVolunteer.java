/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.PetVolunteer;
import HappyPawSystem.Ecosystem;
import HappyPawSystem.HealthCamp.HealthCamp;
import HappyPawSystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author haarikakatlaparthi
 */
public class PetVolunteer extends javax.swing.JPanel {

    /**
     * Creates new form PetVolunteer
     */
    
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;
    private PetVolunteer petVolunteer;
    
    public PetVolunteer(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        txtpetowner.setText(account.getUsername());
        populateHealthCamptable();
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
        txtpetowner = new javax.swing.JTextField();
        txtpettype = new javax.swing.JTextField();
        txtHealthCamp = new javax.swing.JTextField();
        lblpetowner = new javax.swing.JLabel();
        lblpettype = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSavePetVolunteer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHealthCamps = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblManageInfo1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(214, 209, 222));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 40, 101));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME PET VOLUNTEER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 148, 340, 50));

        txtpetowner.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtpetowner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpetownerActionPerformed(evt);
            }
        });
        add(txtpetowner, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 218, 130, 30));

        txtpettype.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtpettype, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 288, 130, 30));

        txtHealthCamp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtHealthCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 358, 130, 30));

        lblpetowner.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpetowner.setForeground(new java.awt.Color(63, 40, 101));
        lblpetowner.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpetowner.setText("PET OWNER");
        add(lblpetowner, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, 40));

        lblpettype.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpettype.setForeground(new java.awt.Color(63, 40, 101));
        lblpettype.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpettype.setText("PET TYPE");
        add(lblpettype, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 80, 40));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 40, 101));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("HEALTH CAMP");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 358, 140, 30));

        btnSavePetVolunteer.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnSavePetVolunteer.setForeground(new java.awt.Color(63, 40, 101));
        btnSavePetVolunteer.setText("SAVE");
        btnSavePetVolunteer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSavePetVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePetVolunteerActionPerformed(evt);
            }
        });
        add(btnSavePetVolunteer, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 418, 90, 40));

        tblHealthCamps.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tblHealthCamps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Health Camp Name"
            }
        ));
        jScrollPane1.setViewportView(tblHealthCamps);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 204, 355, 269));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 40, 101));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Choose the health camp");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 148, 340, 50));

        jPanel2.setBackground(new java.awt.Color(63, 40, 101));

        lblManageInfo1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblManageInfo1.setForeground(new java.awt.Color(255, 255, 255));
        lblManageInfo1.setText("PET VOLUNTEER WORK AREA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(lblManageInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lblManageInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 40, 101));
        jLabel4.setText("You are logged in as a pet volunteer...");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void txtpetownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpetownerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpetownerActionPerformed

    private void btnSavePetVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePetVolunteerActionPerformed
        // TODO add your handling code here:
        for (HappyPawSystem.PetVolunteer.PetVolunteer petVolunteer : system.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
            if (petVolunteer.getUsername().equals(account.getUsername())) {
                system.getPetVolunteerDirectory().updatePetVolunteerInfo(petVolunteer, txtpetowner.getText(), txtpettype.getText(), txtHealthCamp.getText());
            }
        }
        JOptionPane.showMessageDialog(this, "Volunteer has been added successfully");
    }//GEN-LAST:event_btnSavePetVolunteerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePetVolunteer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageInfo1;
    private javax.swing.JLabel lblpetowner;
    private javax.swing.JLabel lblpettype;
    private javax.swing.JTable tblHealthCamps;
    private javax.swing.JTextField txtHealthCamp;
    private javax.swing.JTextField txtpetowner;
    private javax.swing.JTextField txtpettype;
    // End of variables declaration//GEN-END:variables

private void populateHealthCamptable() {

        DefaultTableModel tablemodel = (DefaultTableModel) tblHealthCamps.getModel();

        tablemodel.setRowCount(0);
        
        for(HealthCamp healthCamp: system.getHealthCampDirectory().getHealthCampDirectory()) {
        
            Object[] row = new Object[1];
            row[0] = healthCamp.getHealthCampName();
            tablemodel.addRow(row);
            
        } 
}

private boolean validateInputFields() {

        Pattern p = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m = p.matcher(txtpetowner.getText());
        Pattern p7 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m7 = p7.matcher(txtpettype.getText());
        Pattern p1 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m1 = p1.matcher(txtHealthCamp.getText());
        
        if (!m.matches()) 
        
       {

            JOptionPane.showMessageDialog(this, "Please enter correct input format for owner");
            return false;
        } 
        
        else if (!m7.matches()) 
        
        {

            JOptionPane.showMessageDialog(this, "Please enter correct input format for hospitalname ");
            return false;
        }
        else if (!m1.matches()) 
        {

            JOptionPane.showMessageDialog(this, "Please enter correct input format for address ");
            return false;
        }
        else 
        {
            return true;
        }
   
}
}

