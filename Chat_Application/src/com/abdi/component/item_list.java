
package com.abdi.component;

import java.awt.Color;
import java.awt.event.*;


public class item_list extends javax.swing.JPanel {

   
    public item_list(String name) {
        initComponents();
        li.setText(name);
        init();
    }

   private void init(){
       addMouseListener(new MouseAdapter(){
       public void mouseEntered(MouseEvent me){
           setBackground(new Color(230,230,230));
       }
       public void mouseExited(MouseEvent me){
           setBackground(new Color(242,242,242));
       }
   });
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new com.abdi.swing.ImageAvatar();
        imageAvatar2 = new com.abdi.swing.ImageAvatar();
        li = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        imageAvatar2.setBorderSize(0);
        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/abdi/icon/profile.png"))); // NOI18N

        li.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        li.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(li, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(li, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.abdi.swing.ImageAvatar imageAvatar1;
    private com.abdi.swing.ImageAvatar imageAvatar2;
    private javax.swing.JLabel li;
    // End of variables declaration//GEN-END:variables
}
