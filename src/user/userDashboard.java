/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import auth.login;

import config.dbConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahlde
 */
public class userDashboard extends javax.swing.JFrame {
    dbConnect db = new dbConnect();
    login l = new login();

    /**
     * Creates new form userDashboard
     * @param text
     */
    public userDashboard(String text) {
        initComponents();
        welcomeMessage.setText("Welcome , " + text + "!");
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        kilidpanel = new javax.swing.JPanel();
        profile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        help = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        request = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        babaw = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        welcomeMessage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel2.setBackground(new java.awt.Color(216, 215, 220));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kilidpanel.setBackground(new java.awt.Color(137, 134, 150));
        kilidpanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        kilidpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setBackground(new java.awt.Color(58, 53, 80));
        profile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });
        profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Profile");
        profile.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 60, 30));

        kilidpanel.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 240, 30));

        home.setBackground(new java.awt.Color(58, 53, 80));
        home.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 60, 30));

        kilidpanel.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, 30));

        help.setBackground(new java.awt.Color(58, 53, 80));
        help.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        help.setForeground(new java.awt.Color(255, 255, 255));
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpMouseExited(evt);
            }
        });
        help.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Help");
        help.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 60, 30));

        kilidpanel.add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 240, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ix--user-profile.png"))); // NOI18N
        kilidpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 130));

        request.setBackground(new java.awt.Color(58, 53, 80));
        request.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        request.setForeground(new java.awt.Color(255, 255, 255));
        request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                requestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                requestMouseExited(evt);
            }
        });
        request.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Request");
        request.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 60, 30));

        kilidpanel.add(request, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 240, 30));

        logout.setBackground(new java.awt.Color(58, 53, 80));
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Logout");
        logout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 60, 30));

        kilidpanel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 240, 30));

        jPanel2.add(kilidpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 260, 500));

        babaw.setBackground(new java.awt.Color(137, 134, 150));
        babaw.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        babaw.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/image-80x80.jpg"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(70, 70));
        babaw.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 100));

        jPanel2.add(babaw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 100));

        welcomeMessage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        welcomeMessage.setForeground(new java.awt.Color(51, 51, 51));
        welcomeMessage.setText("Welcome ,");
        jPanel2.add(welcomeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 270, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Date: 2025");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 270, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
    home.setBackground(new java.awt.Color(163, 206, 241));  
    }//GEN-LAST:event_homeMouseEntered

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
       profile.setOpaque(true);
        profile.setBackground(new java.awt.Color(163, 206, 241)); // A3CEF1
    }//GEN-LAST:event_profileMouseEntered

    private void helpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseEntered
    help.setBackground(new java.awt.Color(163, 206, 241));  
    }//GEN-LAST:event_helpMouseEntered

    private void requestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseEntered
    request.setBackground(new java.awt.Color(163, 206, 241));  
    }//GEN-LAST:event_requestMouseEntered

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
    logout.setBackground(new java.awt.Color(163, 206, 241));  
    }//GEN-LAST:event_logoutMouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
    home.setBackground(new java.awt.Color(96, 150, 186));  
    }//GEN-LAST:event_homeMouseExited

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
    profile.setBackground(new java.awt.Color(96, 150, 186));  
    }//GEN-LAST:event_profileMouseExited

    private void requestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseExited
    request.setBackground(new java.awt.Color(96, 150, 186));  
    }//GEN-LAST:event_requestMouseExited

    private void helpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseExited
    help.setBackground(new java.awt.Color(96, 150, 186));  
    }//GEN-LAST:event_helpMouseExited

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
    logout.setBackground(new java.awt.Color(96, 150, 186));  
    }//GEN-LAST:event_logoutMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String text = "test";
                new userDashboard(text).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel babaw;
    private javax.swing.JPanel help;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel kilidpanel;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel profile;
    private javax.swing.JPanel request;
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables
}
