/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktap;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
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

        jPanel_Login = new javax.swing.JPanel();
        jLabel_Login = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jButton_GoBack = new javax.swing.JButton();
        jLabel_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Login.setBackground(new java.awt.Color(0,0,0,200));
        jPanel_Login.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_Login.setBackground(new java.awt.Color(255, 200, 90));
        jLabel_Login.setFont(new java.awt.Font("Malgun Gothic", 1, 45)); // NOI18N
        jLabel_Login.setForeground(new java.awt.Color(255, 200, 90));
        jLabel_Login.setText(" LOGIN");

        jLabel_Username.setBackground(new java.awt.Color(255, 200, 90));
        jLabel_Username.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 200, 90));
        jLabel_Username.setText("Username  ");

        jLabel_Password.setBackground(new java.awt.Color(255, 200, 90));
        jLabel_Password.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 200, 90));
        jLabel_Password.setText("Password  ");

        jTextField_Username.setBackground(new java.awt.Color(255, 200, 90));
        jTextField_Username.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jTextField_Username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        jPasswordField_Password.setBackground(new java.awt.Color(255, 200, 90));
        jPasswordField_Password.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jPasswordField_Password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPasswordField_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_PasswordActionPerformed(evt);
            }
        });

        jButton_Login.setBackground(new java.awt.Color(255, 182, 28));
        jButton_Login.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        jButton_Login.setText("Login");
        jButton_Login.setBorder(null);
        jButton_Login.setFocusPainted(false);
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jButton_GoBack.setBackground(new java.awt.Color(255, 182, 28));
        jButton_GoBack.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        jButton_GoBack.setText("Go Back");
        jButton_GoBack.setBorder(null);
        jButton_GoBack.setFocusPainted(false);
        jButton_GoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_LoginLayout = new javax.swing.GroupLayout(jPanel_Login);
        jPanel_Login.setLayout(jPanel_LoginLayout);
        jPanel_LoginLayout.setHorizontalGroup(
            jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Username)
                            .addComponent(jLabel_Password))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jPasswordField_Password)))
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginLayout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginLayout.createSequentialGroup()
                        .addComponent(jLabel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginLayout.createSequentialGroup()
                        .addComponent(jButton_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel_LoginLayout.setVerticalGroup(
            jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel_Login)
                .addGap(48, 48, 48)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Username)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Password)
                    .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 500, 380));

        jLabel_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/LoginCoverImage.jpg"))); // NOI18N
        getContentPane().add(jLabel_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1011, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_PasswordActionPerformed

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","it175","sravya");
            String Username=jTextField_Username.getText();
            String Password=jPasswordField_Password.getText();
            Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT USERNAME,PASSWORD FROM USERS WHERE USERNAME = '" +Username+ "' AND PASSWORD = '" +Password+ "'");
            int flag=0,temp=0;
            if(Username == "" || Password.equals(""))
            {
                temp=1;
            }
            
            while(rs.next())
            {
//                String uname = rs.getString(1);
//                String pass = rs.getString(2);
////                 System.out.println(uname);
////                   System.out.println(pass);
//                if(uname == Username && pass ==Password)
//                {
                   flag=1;
//                   System.out.println(uname);
//                   System.out.println(pass);
                   break;
                //}
                
            }
            System.out.println(temp);
            if(temp==1)
            {
                JOptionPane.showMessageDialog(this,"Please enter all details.");
                jTextField_Username.setText("");
                jPasswordField_Password.setText("");
            }
            else if(flag==0)
            {
                JOptionPane.showMessageDialog(this,"Incorrect username or password!");
                jTextField_Username.setText("");
                jPasswordField_Password.setText("");
            }
            
            else
            {
                HomePage h = new HomePage(Username);
                h.show();
                dispose();
            }
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jButton_GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GoBackActionPerformed
        // TODO add your handling code here:
        MainOptionsScreen var=new MainOptionsScreen();
        var.show();
        dispose();
    }//GEN-LAST:event_jButton_GoBackActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GoBack;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel_Background;
    private javax.swing.JLabel jLabel_Login;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPanel jPanel_Login;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
