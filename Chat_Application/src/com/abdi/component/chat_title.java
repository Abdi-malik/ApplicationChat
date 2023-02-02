
package com.abdi.component;


public class chat_title extends javax.swing.JPanel {

    public chat_title() {
        initComponents();
        init();
    }

    public void init(){
        
    }
    public void setUserName(String username){
        name.setText(username);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layer = new javax.swing.JLayeredPane();
        name = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        layer.setLayout(new java.awt.GridLayout(0, 1));

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(66, 66, 66));
        name.setText("Name");
        layer.add(name);

        status.setForeground(new java.awt.Color(66, 66, 66));
        status.setText("active now");
        layer.add(status);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane layer;
    private javax.swing.JLabel name;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
