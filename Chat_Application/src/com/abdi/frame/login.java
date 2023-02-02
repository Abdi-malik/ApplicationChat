
package com.abdi.frame;

import com.abdi.event.EventLogin;
import com.abdi.event.EventMessage;
import com.abdi.event.PublicEvent;
import com.abdi.model.Model_Login;
import com.abdi.model.Model_Message;
import com.abdi.model.Model_Register;
import com.abdi.model.Model_User_Account;
import com.abdi.service.Service;
import io.socket.client.Ack;


public class login extends javax.swing.JPanel {

    public login() {
        initComponents();
        init();
    }

   private void init(){
       PublicEvent.getInstance().addEventLogin(new EventLogin() {
           public void login(Model_Login data) {
               new Thread(new Runnable() {
                   @Override
                   public void run() {
                        PublicEvent.getInstance().getEventMain().showLoading(true);
                        Service.getInstance().getClient().emit("login", data.toJsonobject(), new Ack(){
                            @Override
                            public void call(Object... os) {
                                if(os.length > 0){
                                    boolean action = (Boolean)os[0];
                                    if (action){
                                        Service.getInstance().setUser(new Model_User_Account(os[1]));
                                        PublicEvent.getInstance().getEventMain().showLoading(false);
                                        PublicEvent.getInstance().getEventMain().initChat();
                                    } else {
                                        //password wrong
                                        PublicEvent.getInstance().getEventMain().showLoading(false);
                                    }
                                } else {
                                    PublicEvent.getInstance().getEventMain().showLoading(false);
                                }
                            }
                        });
                        
                   }
               }).start();
           }

           @Override
           public void register(Model_Register data, EventMessage message) {
               Service.getInstance().getClient().emit("register", data.toJsonObject(),new Ack(){
                   @Override
                   public void call(Object... os) {
                       if(os.length > 0){
                           Model_Message ms = new Model_Message((boolean) os[0], os[1].toString());
                           if(ms.isAction()){
                               Model_User_Account user = new Model_User_Account(os[2]);
                               Service.getInstance().setUser(user);
                           }
                           message.callMessage(ms);
                           // call message back when done register
                       }
                   }
                   
               });
           }

           @Override
           public void goRegister() {
               slide.show(1);
           }

           @Override
           public void goLogin() {
               slide.show(0);
           }

           public void login() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
       P_Login login = new P_Login();
       P_Register register = new P_Register();
       slide.init(login,register);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new com.abdi.swing.PictureBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        slide = new com.abdi.swing.PanelSlide();

        setBackground(new java.awt.Color(255, 255, 255));

        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/abdi/icon/login.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(34, 142, 214));
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(34, 142, 214));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 142, 214)));
        jPanel1.setPreferredSize(new java.awt.Dimension(277, 308));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        slide.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.abdi.swing.PictureBox pic;
    private com.abdi.swing.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
