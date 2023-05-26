
import java.awt.Insets;
import java.awt.Toolkit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dell
 */
public class FacultyView_10 extends javax.swing.JFrame {

    /**
     * Creates new form full
     */
    public FacultyView_10() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        
        this.setSize(x,y);
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
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        home10 = new javax.swing.JButton();
        view10 = new javax.swing.JButton();
        logout10 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        CAFAD = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        CIT = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        CICS = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        COE = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(59, 52, 139));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GRADCONNECT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(675, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(540, 540, 540))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 50));

        jPanel3.setBackground(new java.awt.Color(182, 188, 210));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1370, 40));

        jPanel4.setBackground(new java.awt.Color(53, 61, 99));

        home10.setBackground(new java.awt.Color(53, 61, 99));
        home10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        home10.setForeground(new java.awt.Color(232, 235, 247));
        home10.setText("HOME");
        home10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home10ActionPerformed(evt);
            }
        });

        view10.setBackground(new java.awt.Color(53, 61, 99));
        view10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        view10.setForeground(new java.awt.Color(182, 188, 210));
        view10.setText("VIEW");
        view10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view10ActionPerformed(evt);
            }
        });

        logout10.setBackground(new java.awt.Color(53, 61, 99));
        logout10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout10.setForeground(new java.awt.Color(182, 188, 210));
        logout10.setText("LOG OUT");
        logout10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout10ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(232, 235, 247));
        jLabel15.setText("Alumna Tracker");

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(232, 235, 247));
        jLabel16.setText("Batangas State University - Alangilan");

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(232, 235, 247));
        jLabel17.setText("est. 2023");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(view10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(69, 69, 69))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel17)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(home10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(view10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 610));

        jPanel2.setBackground(new java.awt.Color(246, 246, 232));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel1.setText("Batangas State University - Alangilan Campus");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(430, 20, 250, 17);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel2.setText("COLLEGES");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(500, 40, 91, 24);

        jPanel5.setBackground(new java.awt.Color(233, 233, 220));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(199, 199, 171)));
        jPanel5.setLayout(null);

        CAFAD.setBackground(new java.awt.Color(58, 75, 161));
        CAFAD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CAFAD.setForeground(new java.awt.Color(255, 255, 255));
        CAFAD.setText("CAFAD");
        CAFAD.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        CAFAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAFADActionPerformed(evt);
            }
        });
        jPanel5.add(CAFAD);
        CAFAD.setBounds(0, 0, 180, 50);

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setText("          Fine Arts and Design");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(0, 70, 180, 20);

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel7.setText("        College of Architecture,");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(0, 50, 180, 20);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(70, 90, 180, 400);

        jPanel7.setBackground(new java.awt.Color(233, 233, 220));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(199, 199, 171)));
        jPanel7.setLayout(null);

        CIT.setBackground(new java.awt.Color(58, 75, 161));
        CIT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CIT.setForeground(new java.awt.Color(255, 255, 255));
        CIT.setText("CIT");
        CIT.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        CIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CITActionPerformed(evt);
            }
        });
        jPanel7.add(CIT);
        CIT.setBounds(1, 1, 180, 50);

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel12.setText("          College of Industrial");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(0, 50, 180, 20);

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel18.setText("                Technologies");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(0, 70, 180, 20);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(820, 90, 180, 400);

        jPanel8.setBackground(new java.awt.Color(233, 233, 220));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(199, 199, 171)));
        jPanel8.setLayout(null);

        CICS.setBackground(new java.awt.Color(58, 75, 161));
        CICS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CICS.setForeground(new java.awt.Color(255, 255, 255));
        CICS.setText("CICS");
        CICS.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        CICS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CICSActionPerformed(evt);
            }
        });
        jPanel8.add(CICS);
        CICS.setBounds(1, 1, 180, 50);

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel6.setText("       and Computer Sciences");
        jPanel8.add(jLabel6);
        jLabel6.setBounds(0, 70, 180, 20);

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel9.setText("        College of Informatics,");
        jPanel8.add(jLabel9);
        jLabel9.setBounds(0, 50, 180, 20);

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel11.setText("       and Computer Sciences");
        jPanel8.add(jLabel11);
        jLabel11.setBounds(0, 70, 180, 20);

        jPanel2.add(jPanel8);
        jPanel8.setBounds(570, 89, 180, 400);

        jPanel9.setBackground(new java.awt.Color(233, 233, 220));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(199, 199, 171)));
        jPanel9.setLayout(null);

        COE.setBackground(new java.awt.Color(58, 75, 161));
        COE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        COE.setForeground(new java.awt.Color(255, 255, 255));
        COE.setText("COE");
        COE.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        COE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COEActionPerformed(evt);
            }
        });
        jPanel9.add(COE);
        COE.setBounds(1, 1, 180, 50);

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel8.setText("        College of Engineering");
        jPanel9.add(jLabel8);
        jLabel8.setBounds(0, 60, 180, 20);

        jPanel2.add(jPanel9);
        jPanel9.setBounds(320, 90, 180, 400);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 1170, 610));

        setSize(new java.awt.Dimension(1386, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void view10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view10ActionPerformed

    private void logout10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout10ActionPerformed
        login_3 form = new login_3 ();
        form.show();
        
        dispose();
    }//GEN-LAST:event_logout10ActionPerformed

    private void CICSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CICSActionPerformed
        // TODO add your handling code here:
        CICS_Course_11 form = new CICS_Course_11();
        form.show();
        
        dispose();
    }//GEN-LAST:event_CICSActionPerformed

    private void CITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CITActionPerformed
        // TODO add your handling code here:
        CIT_Course_11 form = new CIT_Course_11();
        form.show();
        
        dispose();
    }//GEN-LAST:event_CITActionPerformed

    private void COEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COEActionPerformed
        // TODO add your handling code here:
        COE_Course_11 form = new COE_Course_11();
        form.show();
        
        dispose();
    }//GEN-LAST:event_COEActionPerformed

    private void CAFADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAFADActionPerformed
        // TODO add your handling code here:
        CAFAD_Course_11 form = new CAFAD_Course_11();
        form.show();
        
        dispose();
    }//GEN-LAST:event_CAFADActionPerformed

    private void home10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home10ActionPerformed
        Welcome_1 form = new Welcome_1 ();
        form.show();
        
        dispose();
    }//GEN-LAST:event_home10ActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyView_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyView_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyView_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyView_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyView_10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CAFAD;
    private javax.swing.JButton CICS;
    private javax.swing.JButton CIT;
    private javax.swing.JButton COE;
    private javax.swing.JButton home10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton logout10;
    private javax.swing.JButton view10;
    // End of variables declaration//GEN-END:variables
}
