/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospiitalAdmin;
import HappyPawSystem.Ecosystem;
import HappyPawSystem.Hospital.Hospital;
import HappyPawSystem.LabAssistant.LabAssistant;
import HappyPawSystem.Role.LabAssistantRole;
import HappyPawSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rashmisingh
 */
public class ManageLabAssistant extends javax.swing.JPanel {

    /**
     * Creates new form ManageLabAssistant
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;

    public ManageLabAssistant(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        populateLabAssistantTable();
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
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLabAssistant = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 11, 75, 50));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE LAB ASSITANT ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 19, 350, 50));

        tblLabAssistant.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblLabAssistant);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 98, 470, 91));

        btnView.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnView.setForeground(new java.awt.Color(0, 102, 102));
        btnView.setText("VIEW");
        btnView.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 210, 70, 30));

        btnUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 100, 30));

        btnDelete.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 102, 102));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 100, 30));

        lblname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblname.setForeground(new java.awt.Color(0, 102, 102));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblname.setText("Name");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 100, 30));

        txtname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 170, 30));

        lblusername.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblusername.setForeground(new java.awt.Color(0, 102, 102));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusername.setText("Username");
        jPanel1.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 110, 30));

        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 170, 30));

        lblpassword.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(0, 102, 102));
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpassword.setText("Password");
        jPanel1.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 120, 30));

        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 170, 30));

        btnadd.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnadd.setForeground(new java.awt.Color(0, 102, 102));
        btnadd.setText("ADD LAB ASSISTANT");
        btnadd.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 200, 40));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:

        int selectRow = tblLabAssistant.getSelectedRow();
        if (selectRow >= 0) {
            String name = (String) tblLabAssistant.getValueAt(selectRow, 0);
            String username = (String) tblLabAssistant.getValueAt(selectRow, 1);
            String password = (String) tblLabAssistant.getValueAt(selectRow, 2);

            txtname.setText(name + "");
            txtusername.setText(username + "");
            txtpass.setText(password + "");
            btnadd.setEnabled(false);
        }
 else  {
            JOptionPane.showMessageDialog(null, "Please select a row to view the Lab Assistant");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int selectRow = tblLabAssistant.getSelectedRow();
        if (selectRow >= 0) {
        String name = (String) tblLabAssistant.getValueAt(selectRow, 0);
        String username = (String) tblLabAssistant.getValueAt(selectRow, 1);
        String password = (String) tblLabAssistant.getValueAt(selectRow, 2);
        account = system.getUserAccountDirectory().authenticateUser(username, password);
        system.getUserAccountDirectory().updateUserAccount(account, txtname.getText(), txtusername.getText(), txtpass.getText());
        populateLabAssistantTable();

        txtname.setText("");
        txtusername.setText("");
        txtpass.setText("");
        btnadd.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to update the Lab Assistant");
             }
    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblLabAssistant.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tblLabAssistant.getValueAt(selectedRow, 1);
                String pwd = (String) tblLabAssistant.getValueAt(selectedRow, 2);
                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);

                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getLabAssistantDirectory().deleteLabAssistant(user.getUsername());
                populateLabAssistantTable();
            }
        } else 
        {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the Lab Assistant");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        
            UserAccount userAccount = system.getUserAccountDirectory().createUserAccount(txtname.getText(),txtusername.getText(), txtpass.getText(), null, new LabAssistantRole());
            LabAssistant labAssistant = system.getLabAssistantDirectory().createUserAccount(txtusername.getText());
            populateLabAssistantTable();
            for (Hospital hospital : system.getHospitalDirectory().getHospitalDirectory()) {
                if (hospital.getUsername().equals(account.getUsername())) {
                    system.getLabAssistantDirectory().updateLabAssistantHospitalInfo(labAssistant, hospital.getName());
                }
            }
            txtname.setText("");
            txtpass.setText("");
            txtusername.setText("");
            
            JOptionPane.showMessageDialog(this, "Lab Assistant details added ");
            
        
    }//GEN-LAST:event_btnaddActionPerformed
private void populateLabAssistantTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblLabAssistant.getModel();
        tablemodel.setRowCount(0);
        
         for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("HappyPawSystem.Role.LabAssistantRole")) {
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
    private javax.swing.JButton btnadd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTable tblLabAssistant;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpass;
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