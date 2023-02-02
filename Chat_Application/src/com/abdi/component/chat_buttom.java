
package com.abdi.component;

import com.abdi.swing.JIMSendTextPane;
import com.abdi.swing.ScrollBar;
import com.abdi.event.PublicEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;


public class chat_buttom extends javax.swing.JPanel {


    public chat_buttom() {
        initComponents();
        init();
    }

    private void init(){
        setLayout(new MigLayout("fillx, filly", "0[fill]0[]0[]3", "4[fill]4"));
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        JIMSendTextPane txt = new JIMSendTextPane();
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                revalidate();
            }
            
});
        txt.setBorder(new EmptyBorder(10,10,10,10));
        txt.setHintText("type here ...");
        scroll.setViewportView(txt);
        ScrollBar scrollbar = new ScrollBar();
        scrollbar.setBackground(new Color(229,229,229));
        scrollbar.setPreferredSize(new Dimension(2,10));
        scroll.setVerticalScrollBar(scrollbar);
        add(scrollbar);
        add(scroll, "w 100%");
        JPanel panel = new JPanel();
        panel.setLayout(new MigLayout("filly", "0[]0", "0[bottom]0"));
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(30,30));
        JButton button = new JButton();
        button.setBorder(null);
        button.setContentAreaFilled(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setIcon(new ImageIcon(getClass().getResource("/com/abdi/icon/send_buttom.png")));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String text = txt.getText().trim();
               if(!text.equals("")){
                   PublicEvent.getInstance().getEventChat().sendMessage(text);
                   txt.setText("");
                   txt.grabFocus();
                   revalidate();
               }
                else{
                   txt.grabFocus();
               }
            }
        });
        panel.add(button);
        add(panel);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
