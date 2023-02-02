
package com.abdi.frame;

import com.abdi.component.chat_body;
import com.abdi.component.chat_buttom;
import com.abdi.component.chat_title;
import com.abdi.event.EventChat;
import com.abdi.event.PublicEvent;
import net.miginfocom.swing.MigLayout;

public class Chat extends javax.swing.JPanel {

    public Chat() {
        initComponents();
        init();
    }

    private void init(){
        setLayout(new MigLayout("fillx", "0[fill]0", "0[]0[100%, bottom]0[shrink 0]0"));
        chat_title chatTitle = new chat_title();
        chat_body chatBody = new chat_body();
        chat_buttom chatButtom = new chat_buttom();
        PublicEvent.getInstance().addEventChat(new EventChat(){
            @Override
            public void sendMessage(String text) {
               chatBody.addItemRight(text);
            }
            
        });
        add(chatTitle, "wrap");
        add(chatBody, "wrap");
        add(chatButtom, "h ::50%");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
