/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminWorkArea;

import HappyPawSystem.Ecosystem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import HappyPawSystem.Role.SponsorRole;
import HappyPawSystem.Sponsor.Sponsor;
import HappyPawSystem.UserAccount.UserAccount;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author haarikakatlaparthi
 */
public class ManageSponsor extends javax.swing.JPanel {

    /**
     * Creates new form ManageSponsor
     */
    
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount user;

    public ManageSponsor(JPanel userProcessContainer, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateSponsorTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSponsors = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        lblpassword = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(214, 209, 222));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-arrow-64 (2) (1).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 24, 38, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 40, 101));
        jLabel1.setText("MANAGE SPONSORS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        tblSponsors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name ", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSponsors);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 410, 92));

        btnView.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnView.setForeground(new java.awt.Color(63, 40, 101));
        btnView.setText("VIEW");
        btnView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 90, 30));

        btnUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(63, 40, 101));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 70, 30));

        btnDelete.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(63, 40, 101));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 70, 30));
        add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 130, 30));

        lblname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblname.setForeground(new java.awt.Color(63, 40, 101));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblname.setText("NAME");
        add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 90, 30));

        lblusername.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblusername.setForeground(new java.awt.Color(63, 40, 101));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusername.setText("USERNAME");
        add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, 30));
        add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 128, 30));
        add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 130, 30));

        lblpassword.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(63, 40, 101));
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpassword.setText("PASSWORD");
        add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 90, 30));

        btnsave.setBackground(new java.awt.Color(255, 255, 255));
        btnsave.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnsave.setForeground(new java.awt.Color(63, 40, 101));
        btnsave.setText("ADD SPONSOR");
        btnsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 120, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/raining_money-1.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1130, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:

        int selectRow = tblSponsors.getSelectedRow();

        if (selectRow >= 0) {
            String name = (String) tblSponsors.getValueAt(selectRow, 0);
            String username = (String) tblSponsors.getValueAt(selectRow, 1);
            String password = (String) tblSponsors.getValueAt(selectRow, 2);

            txtname.setText(name + "");
            txtusername.setText(username + "");
            txtpass.setText(password + "");
            btnsave.setEnabled(false);
        }
        
        else  
        {
            JOptionPane.showMessageDialog(null, "Please select a row to view the Sponsor details");
        }  
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSponsors.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tblSponsors.getValueAt(selectedRow, 1);
                String pwd = (String) tblSponsors.getValueAt(selectedRow, 2);
                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);

                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getSponsorDirectory().deleteSponsor(user.getUsername());
                populateSponsorTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the Sponsor details");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(txtusername.getText())) {
        UserAccount userAccount = system.getUserAccountDirectory().createUserAccount(txtname.getText(), txtusername.getText(), txtpass.getText(), null, new SponsorRole());
        Sponsor sponsor = system.getSponsorDirectory().createUserAccount(txtusername.getText());
        JOptionPane.showMessageDialog(null, "Sponsor details added successfully");
        populateSponsorTable();
        txtname.setText("");
        txtpass.setText("");
        txtusername.setText("");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        int selectRow = tblSponsors.getSelectedRow();
        if (selectRow >= 0) {
        String name = (String) tblSponsors.getValueAt(selectRow, 0);
        String username = (String) tblSponsors.getValueAt(selectRow, 1);
        String password = (String) tblSponsors.getValueAt(selectRow, 2);
        user = system.getUserAccountDirectory().authenticateUser(username, password);
        system.getUserAccountDirectory().updateUserAccount(user, txtname.getText(), txtusername.getText(), txtpass.getText());
        populateSponsorTable();

        txtname.setText("");
        txtusername.setText("");
        txtpass.setText("");
        }
        else  
        {
            JOptionPane.showMessageDialog(null, "Please select a row to update the the Sponsor details");
        }  
    }//GEN-LAST:event_btnUpdateActionPerformed
      private void populateSponsorTable() {

        DefaultTableModel tablemodel = (DefaultTableModel) tblSponsors.getModel();
        tablemodel.setRowCount(0);

        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("HappyPawSystem.Role.SponsorRole")) {
                Object[] row = new Object[3];
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                tablemodel.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTable tblSponsors;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

private boolean validateInputFields() {

        Pattern p = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m = p.matcher(txtname.getText());
        
        Pattern p7 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m7 = p7.matcher(txtusername.getText());
        
        Pattern p1 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m1 = p1.matcher(txtpass.getText());
        
        
        if (!m.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided name,Please Try agian!");
            return false;
        } else if (!m7.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided username ,Please Try agian!");
            return false;
        }
        else if (!m1.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided password ,Please Try agian!");
            return false;
        }
        else {
            return true;
        }
    }
}