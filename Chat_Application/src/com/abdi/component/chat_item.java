
package com.abdi.component;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class chat_item extends javax.swing.JLayeredPane {

   
    JLabel label;
    
    public chat_item() {
        initComponents();
        txt.setEditable(false);
        txt.setBackground(new Color(0,0,0,0));
        txt.setOpaque(false);
    }

    public void setText(String text){
        txt.setText(text);
    }
   
    public void setTime(String time){
        JLayeredPane layer =  new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
        layer.setBorder(new EmptyBorder(0, 5, 10,5));
        label = new JLabel(time);
        label.setForeground(new Color(63, 64, 64));
        layer.add(label);
        add(layer);
    }
    
    public void received(){
        if (label != null){
            label.setIcon(new ImageIcon(getClass().getResource("/com/abdi/icon/icons8-tick-20.png")));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new com.abdi.swing.JIMSendTextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(txt);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(g);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.abdi.swing.JIMSendTextPane txt;
    // End of variables declaration//GEN-END:variables
}
