
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
public class level2 extends javax.swing.JFrame {

    /**
     * Creates new form level2
     */
    public level2() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtl2q1 = new javax.swing.JTextField();
        jbtntryl2q1 = new javax.swing.JButton();
        jbtnnextl2q1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pineapple_word.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, 386, 75));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("  LEVEL 2");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 19, 191, 85));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Question 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 107, 115, 42));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("What is the third letter of the word above?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 338, 56));

        jtxtl2q1.setBackground(new java.awt.Color(255, 255, 153));
        jtxtl2q1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jtxtl2q1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtl2q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtl2q1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtl2q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 297, 235, 58));

        jbtntryl2q1.setBackground(new java.awt.Color(255, 204, 102));
        jbtntryl2q1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtntryl2q1.setText("TRY AGAIN");
        jbtntryl2q1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtntryl2q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntryl2q1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtntryl2q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 374, 132, 32));

        jbtnnextl2q1.setBackground(new java.awt.Color(255, 255, 102));
        jbtnnextl2q1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnnextl2q1.setText("NEXT");
        jbtnnextl2q1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnnextl2q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnextl2q1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnnextl2q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 373, 119, 32));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinergatrhef.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtl2q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtl2q1ActionPerformed
        
    }//GEN-LAST:event_jtxtl2q1ActionPerformed

    private void jbtntryl2q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntryl2q1ActionPerformed
        level2 l2 = new level2();
        l2.setVisible(true);
        hide();
    }//GEN-LAST:event_jbtntryl2q1ActionPerformed

    private void jbtnnextl2q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnextl2q1ActionPerformed
        
        String l2q1;
        l2q1 = jtxtl2q1.getText();
        
        if(l2q1.compareTo("n")!=0)
        {
             JOptionPane.showMessageDialog (null, "WRONG ANSWER !");
        }
        
        else
        {
        level22 bye = new level22();
        bye.setVisible(true);
        hide();
        }
    }//GEN-LAST:event_jbtnnextl2q1ActionPerformed

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
            java.util.logging.Logger.getLogger(level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new level2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnnextl2q1;
    private javax.swing.JButton jbtntryl2q1;
    private javax.swing.JTextField jtxtl2q1;
    // End of variables declaration//GEN-END:variables
}
