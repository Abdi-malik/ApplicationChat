
package com.abdi.frame;

import com.abdi.event.EventMessage;
import com.abdi.event.PublicEvent;
import com.abdi.model.Model_Message;
import com.abdi.model.Model_Register;

public class P_Register extends javax.swing.JPanel {

    public P_Register() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lgTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        register = new javax.swing.JButton();
        backlogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        lbError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lgTitle.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lgTitle.setForeground(new java.awt.Color(87, 87, 87));
        lgTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lgTitle.setText("Register");

        jLabel1.setText("User Name");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        txtPassword.setText("jPasswordField1");

        register.setText("Register");
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        backlogin.setForeground(new java.awt.Color(25, 87, 198));
        backlogin.setText("Back Login");
        backlogin.setContentAreaFilled(false);
        backlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backloginActionPerformed(evt);
            }
        });

        jLabel3.setText("Confirm Password");

        txtRePassword.setText("jPasswordField1");
        txtRePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRePasswordActionPerformed(evt);
            }
        });

        lbError.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lbError.setForeground(new java.awt.Color(255, 0, 0));
        lbError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lgTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRePassword)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backlogin)
                .addGap(90, 90, 90))
            .addComponent(lbError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lgTitle)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(backlogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbError, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void backloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backloginActionPerformed
        PublicEvent.getInstance().getEventLogin().goLogin();
    }//GEN-LAST:event_backloginActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        String userName = txtUsername.getText().trim();
        String password = String.valueOf(txtPassword.getPassword());
        String comfirmPassword = String.valueOf(txtRePassword.getPassword());
        if(userName.equals("")){
            txtUsername.grabFocus();
        }
        else if(password.equals("")){
            txtPassword.grabFocus();
        }
        else if(!password.equals(comfirmPassword)){
            txtPassword.grabFocus();
        }
        else{
            Model_Register data = new Model_Register(userName, password);
            PublicEvent.getInstance().getEventLogin().register(data, new EventMessage() {
                @Override
                public void callMessage(Model_Message message) {
                    if(!message.isAction()){
                        lbError.setText(message.getMessage());
                    }
                    else{
                        PublicEvent.getInstance().getEventMain().initChat();
                    }
                }
            });
        }
    }//GEN-LAST:event_registerActionPerformed

    private void txtRePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRePasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lgTitle;
    private javax.swing.JButton register;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
