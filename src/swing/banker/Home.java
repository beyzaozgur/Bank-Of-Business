/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.banker;

/**
 *
 * @author ercan
 */
public class Home extends javax.swing.JPanel {

    final private swing.Home frame;
    
    /**
     * Creates new form Home
     */
    public Home(swing.Home home) {
        initComponents();
        frame = home;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customersbtn = new java.awt.Button();
        addcustomerbtn = new java.awt.Button();
        balancebtn = new java.awt.Button();
        bankersbtn = new java.awt.Button();
        settingsbtn = new java.awt.Button();
        mainlabel = new javax.swing.JLabel();
        customersicon = new javax.swing.JLabel();
        addcustomericon = new javax.swing.JLabel();
        bankersicon = new javax.swing.JLabel();
        balanceicon = new javax.swing.JLabel();
        deletecustomerbtn = new java.awt.Button();
        deletecustomericon = new javax.swing.JLabel();
        logoutbtn = new java.awt.Button();
        logouticon = new javax.swing.JLabel();
        infolabel = new javax.swing.JLabel();
        editcustomerbtn1 = new java.awt.Button();
        settingsicon = new javax.swing.JLabel();
        editcustomericon = new javax.swing.JLabel();
        transactionsbtn = new java.awt.Button();
        transactionsicon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        customersbtn.setBackground(new java.awt.Color(23, 35, 51));
        customersbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        customersbtn.setForeground(new java.awt.Color(255, 255, 255));
        customersbtn.setLabel("Customers");
        customersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersbtnActionPerformed(evt);
            }
        });

        addcustomerbtn.setBackground(new java.awt.Color(23, 35, 51));
        addcustomerbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        addcustomerbtn.setForeground(new java.awt.Color(255, 255, 255));
        addcustomerbtn.setLabel("Add Customer");
        addcustomerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustomerbtnActionPerformed(evt);
            }
        });

        balancebtn.setBackground(new java.awt.Color(23, 35, 51));
        balancebtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        balancebtn.setForeground(new java.awt.Color(255, 255, 255));
        balancebtn.setLabel("Balance");
        balancebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balancebtnActionPerformed(evt);
            }
        });

        bankersbtn.setBackground(new java.awt.Color(23, 35, 51));
        bankersbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        bankersbtn.setForeground(new java.awt.Color(255, 255, 255));
        bankersbtn.setLabel("Bankers");
        bankersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankersbtnActionPerformed(evt);
            }
        });

        settingsbtn.setBackground(new java.awt.Color(23, 35, 51));
        settingsbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        settingsbtn.setForeground(new java.awt.Color(255, 255, 255));
        settingsbtn.setLabel("Settings");
        settingsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsbtnActionPerformed(evt);
            }
        });

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Welcome Banker");

        customersicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_user_male_48px.png"))); // NOI18N

        addcustomericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_add_property_48px.png"))); // NOI18N

        bankersicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_registration_48px.png"))); // NOI18N

        balanceicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_refund_48px.png"))); // NOI18N

        deletecustomerbtn.setBackground(new java.awt.Color(23, 35, 51));
        deletecustomerbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        deletecustomerbtn.setForeground(new java.awt.Color(255, 255, 255));
        deletecustomerbtn.setLabel("Del. Customer");
        deletecustomerbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        deletecustomerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecustomerbtnActionPerformed(evt);
            }
        });

        deletecustomericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_remove_property_48px_1.png"))); // NOI18N

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

        editcustomerbtn1.setBackground(new java.awt.Color(23, 35, 51));
        editcustomerbtn1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        editcustomerbtn1.setForeground(new java.awt.Color(255, 255, 255));
        editcustomerbtn1.setLabel("Edit Customer");
        editcustomerbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editcustomerbtn1ActionPerformed(evt);
            }
        });

        settingsicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_automatic_48px.png"))); // NOI18N

        editcustomericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_edit_property_48px.png"))); // NOI18N

        transactionsbtn.setBackground(new java.awt.Color(23, 35, 51));
        transactionsbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        transactionsbtn.setForeground(new java.awt.Color(255, 255, 255));
        transactionsbtn.setLabel("Transactions");
        transactionsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsbtnActionPerformed(evt);
            }
        });

        transactionsicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_transaction_list_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editcustomerbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editcustomericon)
                                .addGap(245, 245, 245)
                                .addComponent(settingsicon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(transactionsicon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transactionsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(customersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(customersicon))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(addcustomerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addcustomericon)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(538, 538, 538)
                                                .addComponent(bankersicon)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bankersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(balanceicon)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(balancebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deletecustomerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deletecustomericon)
                                        .addGap(170, 170, 170)
                                        .addComponent(settingsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(170, 170, 170)
                                        .addComponent(logouticon)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bankersbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customersicon, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addcustomerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addcustomericon)
                                    .addComponent(balancebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(balanceicon))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editcustomerbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editcustomericon)
                                    .addComponent(transactionsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transactionsicon))
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(settingsicon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(settingsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletecustomerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletecustomericon)
                            .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logouticon)))
                    .addComponent(bankersicon))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersbtnActionPerformed
        frame.ChangeJPanel("CustomersBanker");
    }//GEN-LAST:event_customersbtnActionPerformed

    private void balancebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balancebtnActionPerformed
        frame.ChangeJPanel("BalanceBanker");
    }//GEN-LAST:event_balancebtnActionPerformed

    private void bankersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankersbtnActionPerformed
        frame.ChangeJPanel("BankersBanker");
    }//GEN-LAST:event_bankersbtnActionPerformed

    private void settingsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsbtnActionPerformed
        frame.ChangeJPanel("SettingsBanker");
    }//GEN-LAST:event_settingsbtnActionPerformed

    private void deletecustomerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecustomerbtnActionPerformed
        frame.ChangeJPanel("DeleteCustomerBanker");
    }//GEN-LAST:event_deletecustomerbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        frame.ChangeJPanel("LoginBanker");
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void addcustomerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustomerbtnActionPerformed
        frame.ChangeJPanel("AddCustomerBanker");
    }//GEN-LAST:event_addcustomerbtnActionPerformed

    private void editcustomerbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editcustomerbtn1ActionPerformed
        frame.ChangeJPanel("EditCustomerBanker");
    }//GEN-LAST:event_editcustomerbtn1ActionPerformed

    private void transactionsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsbtnActionPerformed
        frame.ChangeJPanel("TransactionsBanker");
    }//GEN-LAST:event_transactionsbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button addcustomerbtn;
    private javax.swing.JLabel addcustomericon;
    private java.awt.Button balancebtn;
    private javax.swing.JLabel balanceicon;
    private java.awt.Button bankersbtn;
    private javax.swing.JLabel bankersicon;
    private java.awt.Button customersbtn;
    private javax.swing.JLabel customersicon;
    private java.awt.Button deletecustomerbtn;
    private javax.swing.JLabel deletecustomericon;
    private java.awt.Button editcustomerbtn1;
    private javax.swing.JLabel editcustomericon;
    private javax.swing.JLabel infolabel;
    private java.awt.Button logoutbtn;
    private javax.swing.JLabel logouticon;
    private javax.swing.JLabel mainlabel;
    private java.awt.Button settingsbtn;
    private javax.swing.JLabel settingsicon;
    private java.awt.Button transactionsbtn;
    private javax.swing.JLabel transactionsicon;
    // End of variables declaration//GEN-END:variables
}
