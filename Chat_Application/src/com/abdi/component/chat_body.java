
package com.abdi.component;

import com.abdi.swing.ScrollBar;
import java.awt.Adjustable;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;


public class chat_body extends javax.swing.JPanel {

   
    public chat_body() {
        initComponents();
        init();
//        addItemRight("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemRight("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemLeft("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemLeft("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemRight("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemLeft("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemLeft("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemRight("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemLeft("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemLeft("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemRight("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemLeft("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
//        addItemLeft("hello jhffhxcykujhc hxhgjbrf vjhgdxghvghf gjgdcjbvg hchggbuhj htyfgjvty vcrxfcvuikjv ctyhj kjgyufu hccjb hcfxcyujhv ctfxch");
    }

    public void init(){
        body.setLayout(new MigLayout("fillx", "", "5[]5"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }
    public void addItemLeft(String text){
        chat_left item = new chat_left();
        item.setText(text);
        body.add(item, "wrap, w ::80%");
        body.repaint();
        body.revalidate();
    }
    
    public void addItemRight(String text){
        chat_right item = new chat_right();
        item.setText(text);
        body.add(item, "wrap, al right, w ::80%");
        body.repaint();
        body.revalidate();
        //item.setTime();
        scrollToBottom();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    
     private void scrollToBottom() {
        JScrollBar verticalBar = sp.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
