
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marina ahmad
 */
public class choose extends javax.swing.JFrame {

    /**
     * Creates new form choose
     */
    public choose() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnview = new javax.swing.JButton();
        jbtnquiz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnview.setBackground(new java.awt.Color(255, 204, 153));
        jbtnview.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnview.setText("VIEW ACCOUNT");
        jbtnview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnviewActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 158, 55));

        jbtnquiz.setBackground(new java.awt.Color(255, 204, 153));
        jbtnquiz.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnquiz.setText("QUIZZES");
        jbtnquiz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnquiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnquizActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnquiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 158, 59));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("                   \"WELCOME TO TODAK'S ONLINE LEARNING! \"");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 480, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kindergg2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnquizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnquizActionPerformed
  level f = new level();
  f.setVisible(true);
  hide();
          
    }//GEN-LAST:event_jbtnquizActionPerformed

    private void jbtnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnviewActionPerformed
        displayacc dada = null;
        try {
            dada = new displayacc();
        } catch (IOException ex) {
            Logger.getLogger(choose.class.getName()).log(Level.SEVERE, null, ex);
        }
        dada.setVisible(true);
        hide();
          
    }//GEN-LAST:event_jbtnviewActionPerformed

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
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnquiz;
    private javax.swing.JButton jbtnview;
    // End of variables declaration//GEN-END:variables
}
