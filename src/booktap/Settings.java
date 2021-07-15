/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktap;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author sravy
 */
public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    String username;
    public Settings(String u) {
        this.username = u;
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

        firstnametextfield1 = new javax.swing.JTextField();
        outerlayeredpane = new javax.swing.JLayeredPane();
        outerpanel = new javax.swing.JPanel();
        innerlayeredpane = new javax.swing.JLayeredPane();
        ineerpanel = new javax.swing.JPanel();
        Homebutton = new javax.swing.JButton();
        Booksbutton = new javax.swing.JButton();
        Postsbutton = new javax.swing.JButton();
        Trendingbutton = new javax.swing.JButton();
        Settingslabel = new javax.swing.JLabel();
        captionlabel = new javax.swing.JLabel();
        Gobackbutton = new javax.swing.JButton();
        firstnamelabel = new javax.swing.JLabel();
        lastnamelabel = new javax.swing.JLabel();
        firstnametextfield = new javax.swing.JTextField();
        lastnametextfield = new javax.swing.JTextField();
        passwordlabel = new javax.swing.JLabel();
        emaillabel = new javax.swing.JLabel();
        emailtextfield = new javax.swing.JTextField();
        savechangesbutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Logout = new javax.swing.JButton();
        jLabel_Password = new javax.swing.JTextField();

        firstnametextfield1.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        firstnametextfield1.setForeground(new java.awt.Color(43, 37, 56));
        firstnametextfield1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SETTINGS");
        setSize(new java.awt.Dimension(1000, 600));

        outerpanel.setBackground(new java.awt.Color(43, 37, 56));

        ineerpanel.setBackground(new java.awt.Color(17, 94, 111));
        ineerpanel.setPreferredSize(new java.awt.Dimension(884, 496));

        Homebutton.setBackground(new java.awt.Color(255, 182, 28));
        Homebutton.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        Homebutton.setForeground(new java.awt.Color(43, 37, 56));
        Homebutton.setText("Home");
        Homebutton.setBorder(null);
        Homebutton.setBorderPainted(false);
        Homebutton.setFocusPainted(false);
        Homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomebuttonActionPerformed(evt);
            }
        });

        Booksbutton.setBackground(new java.awt.Color(255, 182, 28));
        Booksbutton.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        Booksbutton.setForeground(new java.awt.Color(43, 37, 56));
        Booksbutton.setText("Books");
        Booksbutton.setBorder(null);
        Booksbutton.setBorderPainted(false);
        Booksbutton.setFocusPainted(false);
        Booksbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksbuttonActionPerformed(evt);
            }
        });

        Postsbutton.setBackground(new java.awt.Color(255, 182, 28));
        Postsbutton.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        Postsbutton.setForeground(new java.awt.Color(43, 37, 56));
        Postsbutton.setText("Posts");
        Postsbutton.setBorder(null);
        Postsbutton.setBorderPainted(false);
        Postsbutton.setFocusPainted(false);
        Postsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostsbuttonActionPerformed(evt);
            }
        });

        Trendingbutton.setBackground(new java.awt.Color(255, 182, 28));
        Trendingbutton.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        Trendingbutton.setForeground(new java.awt.Color(43, 37, 56));
        Trendingbutton.setText("Trending");
        Trendingbutton.setBorder(null);
        Trendingbutton.setBorderPainted(false);
        Trendingbutton.setFocusPainted(false);
        Trendingbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrendingbuttonActionPerformed(evt);
            }
        });

        Settingslabel.setFont(new java.awt.Font("Malgun Gothic", 0, 58)); // NOI18N
        Settingslabel.setForeground(new java.awt.Color(255, 255, 255));
        Settingslabel.setText("Settings");

        captionlabel.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        captionlabel.setForeground(new java.awt.Color(255, 255, 255));
        captionlabel.setText("Here you can edit your profile");

        Gobackbutton.setBackground(new java.awt.Color(255, 182, 28));
        Gobackbutton.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        Gobackbutton.setForeground(new java.awt.Color(43, 37, 56));
        Gobackbutton.setText("Go Back");
        Gobackbutton.setBorder(null);
        Gobackbutton.setBorderPainted(false);
        Gobackbutton.setFocusPainted(false);
        Gobackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GobackbuttonActionPerformed(evt);
            }
        });

        firstnamelabel.setBackground(new java.awt.Color(255, 255, 255));
        firstnamelabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        firstnamelabel.setForeground(new java.awt.Color(255, 255, 255));
        firstnamelabel.setText("First Name");

        lastnamelabel.setBackground(new java.awt.Color(255, 255, 255));
        lastnamelabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        lastnamelabel.setForeground(new java.awt.Color(255, 255, 255));
        lastnamelabel.setText("Last Name");

        firstnametextfield.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        firstnametextfield.setForeground(new java.awt.Color(43, 37, 56));
        firstnametextfield.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        lastnametextfield.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        lastnametextfield.setForeground(new java.awt.Color(43, 37, 56));
        lastnametextfield.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        passwordlabel.setBackground(new java.awt.Color(255, 255, 255));
        passwordlabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        passwordlabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordlabel.setText("Password");

        emaillabel.setBackground(new java.awt.Color(255, 255, 255));
        emaillabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        emaillabel.setForeground(new java.awt.Color(255, 255, 255));
        emaillabel.setText("E-Mail");

        emailtextfield.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        emailtextfield.setForeground(new java.awt.Color(43, 37, 56));
        emailtextfield.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        emailtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextfieldActionPerformed(evt);
            }
        });

        savechangesbutton.setBackground(new java.awt.Color(255, 182, 28));
        savechangesbutton.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        savechangesbutton.setForeground(new java.awt.Color(43, 37, 56));
        savechangesbutton.setText("Save Changes");
        savechangesbutton.setBorder(null);
        savechangesbutton.setBorderPainted(false);
        savechangesbutton.setFocusPainted(false);
        savechangesbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savechangesbuttonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(43, 37, 56));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton_Logout.setBackground(new java.awt.Color(255, 182, 28));
        jButton_Logout.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        jButton_Logout.setForeground(new java.awt.Color(43, 37, 56));
        jButton_Logout.setText("Logout");
        jButton_Logout.setBorder(null);
        jButton_Logout.setFocusPainted(false);
        jButton_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogoutActionPerformed(evt);
            }
        });

        jLabel_Password.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(43, 37, 56));
        jLabel_Password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        javax.swing.GroupLayout ineerpanelLayout = new javax.swing.GroupLayout(ineerpanel);
        ineerpanel.setLayout(ineerpanelLayout);
        ineerpanelLayout.setHorizontalGroup(
            ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ineerpanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ineerpanelLayout.createSequentialGroup()
                        .addGroup(ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstnametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstnamelabel)
                            .addComponent(passwordlabel)
                            .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ineerpanelLayout.createSequentialGroup()
                                .addGroup(ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emaillabel)
                                    .addComponent(lastnametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastnamelabel))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ineerpanelLayout.createSequentialGroup()
                                .addComponent(emailtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addComponent(savechangesbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))
                    .addGroup(ineerpanelLayout.createSequentialGroup()
                        .addGroup(ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(captionlabel)
                            .addComponent(Settingslabel)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ineerpanelLayout.createSequentialGroup()
                                .addComponent(Homebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Booksbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Postsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Trendingbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addComponent(Gobackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );
        ineerpanelLayout.setVerticalGroup(
            ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ineerpanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Homebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Booksbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Postsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Trendingbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gobackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(Settingslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(captionlabel)
                .addGap(27, 27, 27)
                .addGroup(ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnamelabel)
                    .addComponent(firstnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaillabel)
                    .addComponent(passwordlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(savechangesbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ineerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );

        innerlayeredpane.setLayer(ineerpanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout innerlayeredpaneLayout = new javax.swing.GroupLayout(innerlayeredpane);
        innerlayeredpane.setLayout(innerlayeredpaneLayout);
        innerlayeredpaneLayout.setHorizontalGroup(
            innerlayeredpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerlayeredpaneLayout.createSequentialGroup()
                .addComponent(ineerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        innerlayeredpaneLayout.setVerticalGroup(
            innerlayeredpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerlayeredpaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ineerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout outerpanelLayout = new javax.swing.GroupLayout(outerpanel);
        outerpanel.setLayout(outerpanelLayout);
        outerpanelLayout.setHorizontalGroup(
            outerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerpanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(innerlayeredpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        outerpanelLayout.setVerticalGroup(
            outerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(innerlayeredpane, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        outerlayeredpane.setLayer(outerpanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout outerlayeredpaneLayout = new javax.swing.GroupLayout(outerlayeredpane);
        outerlayeredpane.setLayout(outerlayeredpaneLayout);
        outerlayeredpaneLayout.setHorizontalGroup(
            outerlayeredpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        outerlayeredpaneLayout.setVerticalGroup(
            outerlayeredpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outerlayeredpane, javax.swing.GroupLayout.PREFERRED_SIZE, 992, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outerlayeredpane)
        );

        displayDetails();
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomebuttonActionPerformed
        // TODO add your handling code here:
        HomePage h = new HomePage(this.username);
        h.show();
        dispose();
    }//GEN-LAST:event_HomebuttonActionPerformed

    private void BooksbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksbuttonActionPerformed
        // TODO add your handling code here:
        BooksPage b = new BooksPage(this.username);
        b.show();
        dispose();
    }//GEN-LAST:event_BooksbuttonActionPerformed

    private void PostsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostsbuttonActionPerformed
        // TODO add your handling code here:
        Posts p = new Posts(this.username);
        p.show();
        dispose();
    }//GEN-LAST:event_PostsbuttonActionPerformed

    private void TrendingbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrendingbuttonActionPerformed
        // TODO add your handling code here:
        Trending t = new Trending(this.username);
        t.show();
        dispose();
    }//GEN-LAST:event_TrendingbuttonActionPerformed

    private void GobackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GobackbuttonActionPerformed
        // TODO add your handling code here:
        HomePage h = new HomePage(this.username);
        h.show();
        dispose();
    }//GEN-LAST:event_GobackbuttonActionPerformed

    private void emailtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtextfieldActionPerformed

    private void savechangesbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savechangesbuttonActionPerformed
        // TODO add your handling code here:
        String firstname = firstnametextfield.getText();
    	String lastname = lastnametextfield.getText();
    	String email = emailtextfield.getText();
    	String password = String.valueOf(jLabel_Password.getText());
    	
    	System.out.println(firstname + " " + lastname + " " + password + " ");
    	
    	int flag = 0;
    	
    	if (firstname.trim().equals("") || lastname.trim().equals("") || password.trim().equals("") || email.trim().equals("")) {
    		JOptionPane.showMessageDialog(this, "Please don't leave any field blank.");
    		firstnametextfield.setText(firstname);
    		lastnametextfield.setText(lastname);
    		jLabel_Password.setText(password);
                emailtextfield.setText(email);
    		
    		displayDetails();
    		
    		pack();
    		
    		flag = 1;
    	}
    	
    	
    	if (flag == 0) {
    		try {
    			Class.forName("oracle.jdbc.driver.OracleDriver"); 
           	 
    			Connection con = DriverManager.getConnection(  
    		    "jdbc:oracle:thin:@localhost:1521:xe","it175","sravya");  
    			
    			if (firstname != "") {
    				PreparedStatement preparedStatement = con.prepareStatement("UPDATE USERS SET FIRSTNAME=? WHERE USERNAME='" + username + "'");
    				preparedStatement.setString(1, firstname);
    				preparedStatement.execute();
    			}
    			
    			if (lastname != "") {
    				PreparedStatement preparedStatement = con.prepareStatement("UPDATE USERS SET LASTNAME=? WHERE USERNAME='" + username + "'");
    				preparedStatement.setString(1, lastname);
    				preparedStatement.execute();
    			}
    			
    			if (password != "") {
    				PreparedStatement preparedStatement = con.prepareStatement("UPDATE USERS SET PASSWORD=? WHERE USERNAME='" + username + "'");
    				preparedStatement.setString(1, password);
    				preparedStatement.execute();
    			}
                        
                        if (email != "") {
    				PreparedStatement preparedStatement = con.prepareStatement("UPDATE USERS SET EMAIL=? WHERE USERNAME='" + username + "'");
    				preparedStatement.setString(1, email);
    				preparedStatement.execute();
    			}

    			con.close();
    			
    			JOptionPane.showMessageDialog(this, "Update Successful");
                        
    		} catch (Exception exc) {
    			System.out.println(exc);
    		}
    	}
    }//GEN-LAST:event_savechangesbuttonActionPerformed

    private void jButton_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogoutActionPerformed
        // TODO add your handling code here:
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon("src/cutiee.png"); 
        int a = JOptionPane.showConfirmDialog(this,"Are you sure you want to logout?","This will redirect to main screen.",JOptionPane.YES_NO_OPTION , JOptionPane.PLAIN_MESSAGE,icon);
        if(a == JOptionPane.YES_OPTION){
            MainOptionsScreen m = new MainOptionsScreen();
            m.show();
            dispose();
        }
        else{
            ;
        }

    }//GEN-LAST:event_jButton_LogoutActionPerformed

    public void displayDetails() {
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
       	 
			Connection con = DriverManager.getConnection(  
		    "jdbc:oracle:thin:@localhost:1521:xe","it175","sravya");  
			
			Statement stmt=con.createStatement(); 	
            ResultSet rs = stmt.executeQuery("SELECT * FROM USERS WHERE Username='" + username + "'");
            
		    while(rs.next())  {
		    	String firstname = rs.getString(2);
		    	String lastname = rs.getString(3);
		    	String password = rs.getString(5);
		    	String email = rs.getString(4);
		    	firstnametextfield.setText(firstname);
		    	lastnametextfield.setText(lastname);
		    	jLabel_Password.setText(password);
		    	emailtextfield.setText(email);
		    	
		    }

			con.close();
		} catch (Exception exc) {
			System.out.println(exc);
		}
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Metal".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Settings().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Booksbutton;
    private javax.swing.JButton Gobackbutton;
    private javax.swing.JButton Homebutton;
    private javax.swing.JButton Postsbutton;
    private javax.swing.JLabel Settingslabel;
    private javax.swing.JButton Trendingbutton;
    private javax.swing.JLabel captionlabel;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JTextField emailtextfield;
    private javax.swing.JLabel firstnamelabel;
    private javax.swing.JTextField firstnametextfield;
    private javax.swing.JTextField firstnametextfield1;
    private javax.swing.JPanel ineerpanel;
    private javax.swing.JLayeredPane innerlayeredpane;
    private javax.swing.JButton jButton_Logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jLabel_Password;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastnamelabel;
    private javax.swing.JTextField lastnametextfield;
    private javax.swing.JLayeredPane outerlayeredpane;
    private javax.swing.JPanel outerpanel;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JButton savechangesbutton;
    // End of variables declaration//GEN-END:variables
}
