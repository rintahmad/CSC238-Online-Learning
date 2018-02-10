/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marina ahmad
 */
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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
        jpassword = new javax.swing.JPasswordField();
        jtxtusername = new javax.swing.JTextField();
        jbtnreset = new javax.swing.JButton();
        jbtnexit2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnlogin2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("  LOG IN");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 169, 63));

        jpassword.setBackground(new java.awt.Color(153, 204, 255));
        jpassword.setText("jPasswordField1");
        jpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 160, 40));

        jtxtusername.setBackground(new java.awt.Color(153, 204, 255));
        jtxtusername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jtxtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 160, 40));

        jbtnreset.setBackground(new java.awt.Color(153, 153, 255));
        jbtnreset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnreset.setText("RESET");
        jbtnreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 130, 40));

        jbtnexit2.setBackground(new java.awt.Color(153, 153, 255));
        jbtnexit2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnexit2.setText("EXIT");
        jbtnexit2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnexit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnexit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 289, 130, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText(" PASSWORD");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 117, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText(" USERNAME");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 117, 40));

        jbtnlogin2.setBackground(new java.awt.Color(204, 153, 255));
        jbtnlogin2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnlogin2.setText("LOG IN");
        jbtnlogin2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnlogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlogin2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnlogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 289, 150, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/kindergarten.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-430, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnexit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexit2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnexit2ActionPerformed

    private void jbtnlogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlogin2ActionPerformed
    
	    	FileReader fr = null;
                PrintWriter output = null;
                File out;
        try {
            fr = new FileReader("UserRecords.txt");
            out = new File("PasswData.txt");
            output = new PrintWriter(out);
                      
        } catch (FileNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
         BufferedReader br = new BufferedReader(fr);
       	
			Scanner k=new Scanner (System.in);

       	String data=null;
       	int i=1;
		   int lev=0;
		 	//System.out.print("Enter Name:");
		 	//String username1=k.nextLine();
			boolean found=false;
		 	//System.out.print("Enter Password:");
		 	//String passw1=k.nextLine();
        String name = jtxtusername.getText();
        String pass = jpassword.getText();
      
        try {
            // Read records from the file
            while((data = br.readLine()) != null)
            {
                StringTokenizer st=new StringTokenizer (data,",");
                String passw=st.nextToken();
                String username=st.nextToken();
                String ad=st.nextToken();
                int age=Integer.parseInt(ad);
                String l1=st.nextToken();
                int L1=Integer.parseInt(l1);
                String l2=st.nextToken();
                int L2=Integer.parseInt(l2);
                String l3=st.nextToken();
                int L3=Integer.parseInt(l3);
                
                if ((username.equals(name)) && (passw.equals(pass)))
                {
                    found=true;
                    output.println(pass);
                    break;
                }
                else
                {
                    found=false;
                }
            }
            
            br.close();
            output.close();
            
            if (found==true)
            {
              JOptionPane.showMessageDialog (null, " ACCESS GRANTED! ");
                choose c= new choose();
                c.setVisible(true);
            }
            else
            {
                // Show alert
                JOptionPane.showMessageDialog (null, "Login error! Invalid username or password!");
            }
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        hide();
    }//GEN-LAST:event_jbtnlogin2ActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
         jtxtusername.setText(null);
        jpassword.setText(null);
    }//GEN-LAST:event_jbtnresetActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnexit2;
    private javax.swing.JButton jbtnlogin2;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtxtusername;
    // End of variables declaration//GEN-END:variables
}