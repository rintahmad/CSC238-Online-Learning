
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marina ahmad
 */
public class level3 extends javax.swing.JFrame {

    /**
     * Creates new form level3
     */
    public level3() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtl3q1 = new javax.swing.JTextField();
        jbtntryl3q1 = new javax.swing.JButton();
        jbtnnextl3q1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("LEVEL 3");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 11, 166, 56));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Soalan 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 78, 91, 37));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eight.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 121, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 175, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/one.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 121, -1, 298));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("What is the answer for the question above?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jtxtl3q1.setBackground(new java.awt.Color(153, 204, 255));
        jtxtl3q1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jtxtl3q1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtl3q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtl3q1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtl3q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 130, 65));

        jbtntryl3q1.setBackground(new java.awt.Color(153, 204, 255));
        jbtntryl3q1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtntryl3q1.setText("TRY AGAIN");
        jbtntryl3q1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtntryl3q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntryl3q1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtntryl3q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 160, 60));

        jbtnnextl3q1.setBackground(new java.awt.Color(153, 204, 255));
        jbtnnextl3q1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnnextl3q1.setText("NEXT");
        jbtnnextl3q1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnnextl3q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnextl3q1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnnextl3q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 150, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinergatrhef.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtl3q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtl3q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtl3q1ActionPerformed

    private void jbtntryl3q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntryl3q1ActionPerformed
        level3 ci = new level3();
        ci.setVisible(true);
        hide();         
    }//GEN-LAST:event_jbtntryl3q1ActionPerformed

    private void jbtnnextl3q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnextl3q1ActionPerformed
        String l3q1;
        l3q1 = jtxtl3q1.getText();
        
        if(l3q1.compareTo("9")!=0)
        {
             JOptionPane.showMessageDialog (null, "WRONG ANSWER !");
        }
        
        else
        {
        level33 mzz = new level33();
        mzz.setVisible(true);
        hide();
        }
    }//GEN-LAST:event_jbtnnextl3q1ActionPerformed

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
            java.util.logging.Logger.getLogger(level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new level3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtnnextl3q1;
    private javax.swing.JButton jbtntryl3q1;
    private javax.swing.JTextField jtxtl3q1;
    // End of variables declaration//GEN-END:variables
}
