
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
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
        nameBox = new javax.swing.JTextField();
        passBox = new javax.swing.JTextField();
        ageBox = new javax.swing.JTextField();
        jbtnsignup2 = new javax.swing.JButton();
        jbtnshowhome = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 153, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("     NAME");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 91, 136, -1));

        jLabel2.setBackground(new java.awt.Color(255, 153, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("PASSWORD");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 179, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 153, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("      AGE");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 271, 136, -1));

        jLabel4.setBackground(new java.awt.Color(255, 153, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("SIGN UP");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 0, 171, 52));

        nameBox.setBackground(new java.awt.Color(153, 153, 255));
        nameBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(nameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 91, 129, 30));

        passBox.setBackground(new java.awt.Color(153, 153, 255));
        passBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(passBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 179, 129, 30));

        ageBox.setBackground(new java.awt.Color(153, 153, 255));
        ageBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(ageBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 271, 129, -1));

        jbtnsignup2.setBackground(new java.awt.Color(153, 153, 255));
        jbtnsignup2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnsignup2.setText("SIGN UP");
        jbtnsignup2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnsignup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsignup2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnsignup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 140, 60));

        jbtnshowhome.setBackground(new java.awt.Color(153, 153, 255));
        jbtnshowhome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnshowhome.setText("SHOW MENU");
        jbtnshowhome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnshowhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnshowhomeActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnshowhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 180, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/kindergarten.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-340, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnsignup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsignup2ActionPerformed

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new
                FileWriter("UserRecords.txt",true)));
        } catch (IOException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // get input value
   	String name = nameBox.getText();
        int pass = Integer.parseInt(passBox.getText());
        int age = Integer.parseInt(ageBox.getText());
   	
        
        int L1=1;
        int L2=1;
        int L3=1;

        // Print to File
        pw.println(pass+","+name+","+age+","+L1+","+L2+","+L3);
        
        pw.close();
        
        // set all input to blank
   	nameBox.setText("");
        passBox.setText("");
        ageBox.setText("");
        
        // Show alert
        JOptionPane.showMessageDialog (null, "YOUR ACCOUNT HAS BEEN SUCCESSFULLY CREATED !");
    }//GEN-LAST:event_jbtnsignup2ActionPerformed

    private void jbtnshowhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnshowhomeActionPerformed
        MENU m = new MENU();
        m.setVisible(true);
        hide();
    }//GEN-LAST:event_jbtnshowhomeActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnshowhome;
    private javax.swing.JButton jbtnsignup2;
    private javax.swing.JTextField nameBox;
    private javax.swing.JTextField passBox;
    // End of variables declaration//GEN-END:variables
}
