/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.admin;

import java.awt.event.KeyEvent;
import javax.swing.text.AbstractDocument;
import library.*;

/**
 *
 * @author ercan
 */
public class Login extends javax.swing.JPanel {

    final private swing.Home frame;

    /**
     * Creates new form Login
     *
     * @param home Dynamic panel.
     */
    public Login(swing.Home home) {
        initComponents();
        frame = home;

        ((AbstractDocument) uidtext.getDocument()).setDocumentFilter(new Filter(1, 16));
        ((AbstractDocument) password.getDocument()).setDocumentFilter(new Filter(0, 15));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainlabel = new javax.swing.JLabel();
        loginbtn = new java.awt.Button();
        uidtext = new javax.swing.JTextField();
        infolabel = new javax.swing.JLabel();
        exitbtn = new java.awt.Button();
        infolabel2 = new javax.swing.JLabel();
        infolabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        loginicon = new javax.swing.JLabel();
        exiticon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Admin - Login");
        mainlabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainlabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainlabel.setPreferredSize(new java.awt.Dimension(223, 47));

        loginbtn.setBackground(new java.awt.Color(23, 35, 51));
        loginbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setLabel("Login");
        loginbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        uidtext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        uidtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uidtext.setMaximumSize(new java.awt.Dimension(7, 39));
        uidtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidtextActionPerformed(evt);
            }
        });
        uidtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                uidtextKeyPressed(evt);
            }
        });

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        exitbtn.setBackground(new java.awt.Color(23, 35, 51));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setLabel("Exit");
        exitbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        infolabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel2.setForeground(new java.awt.Color(255, 255, 255));
        infolabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel2.setText("Enter User ID");

        infolabel3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel3.setForeground(new java.awt.Color(255, 255, 255));
        infolabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel3.setText("Password");

        password.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setMaximumSize(new java.awt.Dimension(7, 39));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        loginicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_enter_48px.png"))); // NOI18N

        exiticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(infolabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infolabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(loginicon)
                                .addGap(538, 538, 538)
                                .addComponent(exiticon)
                                .addGap(10, 10, 10)
                                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(uidtext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(uidtext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(infolabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginicon)))
                    .addComponent(exiticon))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void login() {

        /*
        1) ^ - start of the string
        2) (?=.*[0-9]) - Positive look ahead expression for any number
        3) (?=.*[a-z]) - Positive look ahead expression for lower case letter
        4) (?=.*[A-Z]) - Positive look ahead expression for upper case letter
        5) (?=.*[!@#$%^&*]) - Positive look ahead expression for any special character
        6) (?=\\S+$) - Positive look ahead expression for \S (non-space character)
        7) . – any character
        8) {8,} - minimum 8 characters in length
        9) $ - end of the string
         */
        if (!uidtext.getText().isBlank() || !String.valueOf(password.getPassword()).isBlank()) {
            if (Database.exists("Accounts", "ID", uidtext.getText())) {
                if (Database.getInt("Accounts", "ID", uidtext.getText(), "AccountType") == 2) {
                    if (String.valueOf(password.getPassword()).matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{8,15}$")) {
                        if (String.valueOf(password.getPassword()).equals(Database.getString("Accounts", "ID", uidtext.getText(), "Password"))) {
                            String[] load = Database.getArray("Accounts", "ID", uidtext.getText());
                            Admin admin = new Admin();
                            admin.getId().setID(load[0]);
                            admin.getId().setFullName(load[3], 0);
                            admin.getId().setDateOfBirth(load[4], 0);
                            admin.setPhoneNumber(load[6], 0);
                            admin.setHomeAddress(load[11], 0);
                            admin.setPassword(load[12], 0);
                            admin.setAdminSalary(Database.isBigDecimal(load[13]), 0);
                            Data.setAdmin(admin);
                            frame.ChangeJPanel("HomeAdmin");
                        } else {
                            infolabel.setText("The password doesn't match.");
                        }
                    } else {
                        infolabel.setText("The password doesn't follow the rules.");
                    }
                } else {
                    infolabel.setText("The account type is invalid.");
                }
            } else {
                infolabel.setText("The user ID is invalid.");
            }
        } else {
            infolabel.setText("The user ID can't be left blank.");
        }
    }

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        login();
    }//GEN-LAST:event_loginbtnActionPerformed

    private void uidtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidtextActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        frame.ChangeJPanel("MainSelect");
    }//GEN-LAST:event_exitbtnActionPerformed

    private void uidtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uidtextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_uidtextKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_passwordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button exitbtn;
    private javax.swing.JLabel exiticon;
    private javax.swing.JLabel infolabel;
    private javax.swing.JLabel infolabel2;
    private javax.swing.JLabel infolabel3;
    private java.awt.Button loginbtn;
    private javax.swing.JLabel loginicon;
    private javax.swing.JLabel mainlabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField uidtext;
    // End of variables declaration//GEN-END:variables
}
