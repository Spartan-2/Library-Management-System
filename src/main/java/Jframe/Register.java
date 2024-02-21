/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframe;


import Homejframe.JPanelGradient;
import JDBCConnector.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author karti
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanelGradient();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jpanel444 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        employeeNameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        employeeIdField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        loginReturnButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ADVANCE LIBRARY SYSTEM");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/setting.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel8)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(64, 64, 64)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jpanel444.setBackground(new java.awt.Color(255, 255, 255));
        jpanel444.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Register Admin");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Employee Name");

        employeeNameField.setBackground(new java.awt.Color(255, 255, 255));
        employeeNameField.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        employeeNameField.setForeground(new java.awt.Color(0, 0, 0));
        employeeNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(39, 147, 219)));
        employeeNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNameFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Employee ID");

        employeeIdField.setBackground(new java.awt.Color(255, 255, 255));
        employeeIdField.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        employeeIdField.setForeground(new java.awt.Color(0, 0, 0));
        employeeIdField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(39, 147, 219)));
        employeeIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIdFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("New Username");

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(0, 0, 0));
        usernameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(39, 147, 219)));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("New Password");

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 0, 0));
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(39, 147, 219)));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(39, 147, 219));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        loginReturnButton.setBackground(new java.awt.Color(255, 255, 255));
        loginReturnButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginReturnButton.setForeground(new java.awt.Color(39, 147, 219));
        loginReturnButton.setText("Return to Login?");
        loginReturnButton.setBorderPainted(false);
        loginReturnButton.setContentAreaFilled(false);
        loginReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginReturnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel444Layout = new javax.swing.GroupLayout(jpanel444);
        jpanel444.setLayout(jpanel444Layout);
        jpanel444Layout.setHorizontalGroup(
            jpanel444Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel444Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jpanel444Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loginReturnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeNameField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeIdField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(120, 120, 120))
        );
        jpanel444Layout.setVerticalGroup(
            jpanel444Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel444Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(loginReturnButton)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jpanel444, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(75, 75, 75)
                .addComponent(jpanel444, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void employeeNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNameFieldActionPerformed

    private void employeeIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeIdFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginReturnButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login loginPage = new Login();
        loginPage.setVisible(true);
    }//GEN-LAST:event_loginReturnButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(checkDuplicate() == false){
            registerDetails();
        }
        else{
            JOptionPane.showMessageDialog(null,"Username already exists");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void registerDetails(){
        String password = passwordField.getText();
        String employeeName = employeeNameField.getText();
        String employeeId = employeeIdField.getText();
        String username = usernameField.getText();
       
        int idEmployee = Integer.parseInt(employeeId);
        
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String sql = "insert into signupcredential (employee_name,employee_id,username,password) values('"+employeeName+"','"+idEmployee+"','"+username+"','"+password+"')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Admin Registered");
            setRegisterNull();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in registering");
        }
        
    }
    public void setRegisterNull(){
        employeeNameField.setText("");
        employeeIdField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        
    }
    public boolean checkDuplicate(){
        String password = passwordField.getText();
        String employeeName = employeeNameField.getText();
        String employeeId = employeeIdField.getText();
        String username = usernameField.getText();
        boolean isExists = false;
        
        try{
            Connection con = ConnectionProvider.getCon();
            String sql="select * from signupcredential where username = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,username);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                isExists = true;
            }
            else{
                isExists = false;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return isExists;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    String employeeName;
    String employeeId;
    String username;
    String password;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField employeeIdField;
    private javax.swing.JTextField employeeNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpanel444;
    private javax.swing.JButton loginReturnButton;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}