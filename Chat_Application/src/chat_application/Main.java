
package chat_application;

import com.abdi.swing.ComponentResizer;
import com.abdi.event.EventMain;
import com.abdi.event.PublicEvent;
import com.abdi.service.Service;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Main extends javax.swing.JFrame {

 
    public Main() {
        initComponents();
        init();
    }

    private void init(){
       setIconImage(new ImageIcon(getClass().getResource("/com/abdi/icon/icon.png")).getImage());
       ComponentResizer com = new ComponentResizer();
       com.registerComponent(this);
       com.setMinimumSize(new Dimension(730,485));
       com.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
       com.setSnapSize(new Dimension(10,10));
       login.setVisible(true);
       loading.setVisible(false);
       home.setVisible(false);
       initEvent();
       Service.getInstance().startServer();
    }
     private void initEvent() {
        PublicEvent.getInstance().addEventMain(new EventMain() {
            @Override
            public void showLoading(boolean show) {
                loading.setVisible(show);
            }

            @Override
            public void initChat() {
                home.setVisible(true);
                login.setVisible(false);
                Service.getInstance().getClient().emit("list_user", Service.getInstance().getUser().getUserID());
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

        border = new javax.swing.JPanel();
        backgroud = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        black_minimize = new javax.swing.JButton();
        black_close = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        loading = new com.abdi.frame.Loading();
        login = new com.abdi.frame.login();
        home = new com.abdi.frame.Home();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        border.setBackground(new java.awt.Color(229, 229, 229));

        backgroud.setBackground(new java.awt.Color(255, 255, 255));
        backgroud.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        title.setBackground(new java.awt.Color(229, 229, 229));
        title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleMouseDragged(evt);
            }
        });
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleMousePressed(evt);
            }
        });

        black_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abdi/icon/black_minimize.png"))); // NOI18N
        black_minimize.setBorder(null);
        black_minimize.setContentAreaFilled(false);
        black_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        black_minimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abdi/icon/gray minimize.png"))); // NOI18N
        black_minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                black_minimizeActionPerformed(evt);
            }
        });

        black_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abdi/icon/black_close.png"))); // NOI18N
        black_close.setBorder(null);
        black_close.setContentAreaFilled(false);
        black_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        black_close.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abdi/icon/red__close.png"))); // NOI18N
        black_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                black_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(black_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(black_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(black_close, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
            .addComponent(black_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(758, 477));
        jLayeredPane1.setLayout(new java.awt.CardLayout());
        jLayeredPane1.add(loading, "card4");
        jLayeredPane1.add(login, "card3");
        jLayeredPane1.add(home, "card2");

        javax.swing.GroupLayout backgroudLayout = new javax.swing.GroupLayout(backgroud);
        backgroud.setLayout(backgroudLayout);
        backgroudLayout.setHorizontalGroup(
            backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );
        backgroudLayout.setVerticalGroup(
            backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroudLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int pY;
    private int pX;
    private void titleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - pX,
            this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_titleMouseDragged
    private void titleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMousePressed
        pX = evt.getX();
        pY = evt.getY();
    }//GEN-LAST:event_titleMousePressed

    private void black_minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_black_minimizeActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_black_minimizeActionPerformed

    private void black_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_black_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_black_closeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroud;
    private javax.swing.JButton black_close;
    private javax.swing.JButton black_minimize;
    private javax.swing.JPanel border;
    private com.abdi.frame.Home home;
    private javax.swing.JLayeredPane jLayeredPane1;
    private com.abdi.frame.Loading loading;
    private com.abdi.frame.login login;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
