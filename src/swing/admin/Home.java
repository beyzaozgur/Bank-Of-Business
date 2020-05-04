/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.admin;

import java.awt.event.ActionEvent;
import javax.swing.Timer;
import library.*;

/**
 *
 * @author ercan
 */
public class Home extends javax.swing.JPanel {

    final private swing.Home frame;
    Timer timer;

    /**
     * Creates new form Home
     *
     * @param home Dynamic panel.
     */
    public Home(swing.Home home) {
        initComponents();
        frame = home;
        
        timer = new Timer(2000, (ActionEvent e) -> {
            mainlabel.setText("Welcome " + Data.getAdmin().getId().getFullName());
            mainlabel2.setText("Salary: " + Data.currencyFormat(0, Data.getAdmin().getAdminSalary()));
        });
        timer.setInitialDelay(0);
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addadminbtn = new java.awt.Button();
        addbankerbtn = new java.awt.Button();
        editmoneybtn = new java.awt.Button();
        currencyratebtn = new java.awt.Button();
        customersbtn = new java.awt.Button();
        mainlabel = new javax.swing.JLabel();
        mainlabel2 = new javax.swing.JLabel();
        addadminicon = new javax.swing.JLabel();
        addbankericon = new javax.swing.JLabel();
        currencyrateicon = new javax.swing.JLabel();
        editmoneyicon = new javax.swing.JLabel();
        deletebankerbtn = new java.awt.Button();
        deletebankericon = new javax.swing.JLabel();
        logoutbtn = new java.awt.Button();
        logouticon = new javax.swing.JLabel();
        infolabel = new javax.swing.JLabel();
        editbankerbtn = new java.awt.Button();
        customersicon = new javax.swing.JLabel();
        editbankericon = new javax.swing.JLabel();
        settingsbtn = new java.awt.Button();
        settingsicon = new javax.swing.JLabel();
        bankersbtn = new java.awt.Button();
        bankersicon = new javax.swing.JLabel();
        adminsbtn = new java.awt.Button();
        adminsicon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        addadminbtn.setBackground(new java.awt.Color(23, 35, 51));
        addadminbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        addadminbtn.setForeground(new java.awt.Color(255, 255, 255));
        addadminbtn.setLabel("Add Admin");
        addadminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addadminbtnActionPerformed(evt);
            }
        });

        addbankerbtn.setBackground(new java.awt.Color(23, 35, 51));
        addbankerbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        addbankerbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbankerbtn.setLabel("Add Banker");
        addbankerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbankerbtnActionPerformed(evt);
            }
        });

        editmoneybtn.setBackground(new java.awt.Color(23, 35, 51));
        editmoneybtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        editmoneybtn.setForeground(new java.awt.Color(255, 255, 255));
        editmoneybtn.setLabel("Edit Money");
        editmoneybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editmoneybtnActionPerformed(evt);
            }
        });

        currencyratebtn.setBackground(new java.awt.Color(23, 35, 51));
        currencyratebtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        currencyratebtn.setForeground(new java.awt.Color(255, 255, 255));
        currencyratebtn.setLabel("Currency Rate");
        currencyratebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyratebtnActionPerformed(evt);
            }
        });

        customersbtn.setBackground(new java.awt.Color(23, 35, 51));
        customersbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        customersbtn.setForeground(new java.awt.Color(255, 255, 255));
        customersbtn.setLabel("Customers");
        customersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersbtnActionPerformed(evt);
            }
        });

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Welcome Admin");

        mainlabel2.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel2.setForeground(new java.awt.Color(133, 187, 101));
        mainlabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mainlabel2.setText("Salary: $500");
        mainlabel2.setMaximumSize(new java.awt.Dimension(223, 47));
        mainlabel2.setMinimumSize(new java.awt.Dimension(223, 47));
        mainlabel2.setPreferredSize(new java.awt.Dimension(223, 47));

        addadminicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_add_property_48px.png"))); // NOI18N

        addbankericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_add_property_48px.png"))); // NOI18N

        currencyrateicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_cash_48px.png"))); // NOI18N

        editmoneyicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_change_48px_1.png"))); // NOI18N

        deletebankerbtn.setBackground(new java.awt.Color(23, 35, 51));
        deletebankerbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        deletebankerbtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebankerbtn.setLabel("Delete Banker");
        deletebankerbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        deletebankerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebankerbtnActionPerformed(evt);
            }
        });

        deletebankericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_remove_property_48px_1.png"))); // NOI18N

        logoutbtn.setBackground(new java.awt.Color(23, 35, 51));
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setLabel("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        logouticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel.setText("You can select the actions to do from below.");

        editbankerbtn.setBackground(new java.awt.Color(23, 35, 51));
        editbankerbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        editbankerbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbankerbtn.setLabel("Edit Banker");
        editbankerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbankerbtnActionPerformed(evt);
            }
        });

        customersicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_user_male_48px.png"))); // NOI18N

        editbankericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_edit_property_48px.png"))); // NOI18N

        settingsbtn.setBackground(new java.awt.Color(23, 35, 51));
        settingsbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        settingsbtn.setForeground(new java.awt.Color(255, 255, 255));
        settingsbtn.setLabel("Settings");
        settingsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsbtnActionPerformed(evt);
            }
        });

        settingsicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_automatic_48px.png"))); // NOI18N

        bankersbtn.setBackground(new java.awt.Color(23, 35, 51));
        bankersbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        bankersbtn.setForeground(new java.awt.Color(255, 255, 255));
        bankersbtn.setLabel("Bankers");
        bankersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankersbtnActionPerformed(evt);
            }
        });

        bankersicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_registration_48px.png"))); // NOI18N

        adminsbtn.setBackground(new java.awt.Color(23, 35, 51));
        adminsbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        adminsbtn.setForeground(new java.awt.Color(255, 255, 255));
        adminsbtn.setLabel("Admins");
        adminsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsbtnActionPerformed(evt);
            }
        });

        adminsicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_admin_settings_male_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editbankerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(editbankericon)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(245, 245, 245)
                                        .addComponent(customersicon))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adminsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bankersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(170, 170, 170)
                                .addComponent(settingsicon)
                                .addGap(10, 10, 10)
                                .addComponent(settingsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(mainlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addadminbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(addadminicon)
                                        .addGap(245, 245, 245)
                                        .addComponent(adminsicon))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addbankerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(addbankericon)
                                        .addGap(245, 245, 245)
                                        .addComponent(bankersicon)))
                                .addGap(245, 245, 245)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(currencyrateicon)
                                        .addGap(10, 10, 10)
                                        .addComponent(currencyratebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(editmoneyicon)
                                        .addGap(10, 10, 10)
                                        .addComponent(editmoneybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deletebankerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(deletebankericon)
                                .addGap(170, 170, 170)
                                .addComponent(customersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)
                                .addComponent(logouticon)
                                .addGap(10, 10, 10)
                                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainlabel)
                    .addComponent(mainlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(adminsicon)
                        .addGap(10, 10, 10)
                        .addComponent(adminsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bankersicon)
                        .addGap(10, 10, 10)
                        .addComponent(bankersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(customersicon)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(currencyratebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addadminbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addadminicon, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addbankerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addbankericon)
                                    .addComponent(editmoneybtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editmoneyicon))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editbankerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editbankericon)
                                    .addComponent(settingsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(settingsicon)))
                            .addComponent(currencyrateicon))
                        .addGap(50, 50, 50)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebankerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebankericon)
                    .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logouticon))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addadminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addadminbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("AddAdminAdmin");
    }//GEN-LAST:event_addadminbtnActionPerformed

    private void editmoneybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editmoneybtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("EditMoneyAdmin");
    }//GEN-LAST:event_editmoneybtnActionPerformed

    private void currencyratebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyratebtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("CurrencyRateAdmin");
    }//GEN-LAST:event_currencyratebtnActionPerformed

    private void customersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("CustomersAdmin");
    }//GEN-LAST:event_customersbtnActionPerformed

    private void deletebankerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebankerbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("DeleteBankerAdmin");
    }//GEN-LAST:event_deletebankerbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        Data.setAdmin(null);
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("LoginAdmin");
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void addbankerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbankerbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("AddBankerAdmin");
    }//GEN-LAST:event_addbankerbtnActionPerformed

    private void editbankerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbankerbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("EditBankerAdmin");
    }//GEN-LAST:event_editbankerbtnActionPerformed

    private void settingsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("SettingsAdmin");
    }//GEN-LAST:event_settingsbtnActionPerformed

    private void bankersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankersbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("BankersAdmin");
    }//GEN-LAST:event_bankersbtnActionPerformed

    private void adminsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("AdminsAdmin");
    }//GEN-LAST:event_adminsbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button addadminbtn;
    private javax.swing.JLabel addadminicon;
    private java.awt.Button addbankerbtn;
    private javax.swing.JLabel addbankericon;
    private java.awt.Button adminsbtn;
    private javax.swing.JLabel adminsicon;
    private java.awt.Button bankersbtn;
    private javax.swing.JLabel bankersicon;
    private java.awt.Button currencyratebtn;
    private javax.swing.JLabel currencyrateicon;
    private java.awt.Button customersbtn;
    private javax.swing.JLabel customersicon;
    private java.awt.Button deletebankerbtn;
    private javax.swing.JLabel deletebankericon;
    private java.awt.Button editbankerbtn;
    private javax.swing.JLabel editbankericon;
    private java.awt.Button editmoneybtn;
    private javax.swing.JLabel editmoneyicon;
    private javax.swing.JLabel infolabel;
    private java.awt.Button logoutbtn;
    private javax.swing.JLabel logouticon;
    private javax.swing.JLabel mainlabel;
    private javax.swing.JLabel mainlabel2;
    private java.awt.Button settingsbtn;
    private javax.swing.JLabel settingsicon;
    // End of variables declaration//GEN-END:variables
}
