package NSUfirstone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
        showDate();
        showTime();
    }

    void showDate()
    {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy"); 
        Date.setText(s.format(d));
    }
    
    void showTime()
    {
         new Timer(0,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh-mm-ss a"); 
                Times.setText(s.format(d));
            }
        }
        ).start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass = new javax.swing.JPasswordField();
        Date = new javax.swing.JLabel();
        Times = new javax.swing.JLabel();
        SignUp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 240, 40));

        Date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date.setText("jLabel5");
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 140, 30));

        Times.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Times.setForeground(new java.awt.Color(255, 255, 255));
        Times.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Times.setText("jLabel5");
        getContentPane().add(Times, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 140, 30));

        SignUp.setBackground(new java.awt.Color(255, 255, 255));
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/SignUp.jpg"))); // NOI18N
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 120, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/forget.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 220, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/log in.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 120, 40));

        ID.setBackground(new java.awt.Color(255, 255, 255));
        ID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 240, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 190, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID Number : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 190, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Log In ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 90));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/Rd.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed

        try {
            dispose();
            new SIgnUp().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SignUpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(ID.getText().trim().isEmpty() || pass.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Fill Up all the Information Carefully!!!!!!");
        }
        
        else
        {
            int c=0;
            
            try {
                File f = new File("StudentInformation.text");
                FileReader reader = new FileReader(f.getAbsolutePath());
                BufferedReader br = new BufferedReader(reader);
                
                
                String line;
                while((line=br.readLine())!=null)
                {
                    try{
                    if(line.split(" ; ")[1].equals(ID.getText().trim()) && line.split(" ; ")[2].equals(pass.getText().trim()))
                    {
                        c++;
                        Mail m = new Mail();
                        try{
                        m.sendMail(line.split(" ; ")[4].trim(),"SECURITY ALERT!!","Dear Student,\nSomeone log in into your RDS.\n\nThank You");
                        reader.close();
                        dispose();
                        new Student(ID.getText()).setVisible(true);
                        break;
                        }catch(IOException e)
                        {
                            
                        }
                        
                    }}catch(Exception e){
                        
                    }
                }
                File teacher = new File("TeacherInformation.text");
                 reader = new FileReader(teacher.getAbsolutePath());
                BufferedReader br1 = new BufferedReader(reader);
                while((line=br1.readLine())!=null)
                {
                    if(line.split(" ; ")[1].equals(ID.getText().trim()) && line.split(" ; ")[2].equals(pass.getText().trim()))
                    {
                        c++;
                        Mail m = new Mail();
                        try{
                        m.sendMail(line.split(" ; ")[4].trim(),"SECURITY ALERT!!","Dear Faculty,\nSomeone log in into your RDS.\n\nThank You");
                        reader.close();
                        dispose();
                        new Faculty(ID.getText()).setVisible(true);
                        break;
                        }catch(IOException e)
                        {
                            
                        } catch (Exception ex) {
                            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                }
                File admin = new File("Admin.text");
                 reader = new FileReader(admin.getAbsolutePath());
                BufferedReader br2 = new BufferedReader(reader);
                while((line=br2.readLine())!=null)
                {
                    if(line.split(" ; ")[0].equals(ID.getText().trim()) && line.split(" ; ")[1].equals(pass.getText().trim()))
                    {
                        
                        c++;
                        reader.close();
                        dispose();
                        new Admin().setVisible(true);
                        break;
                    }
                }
                
                if(c==0)
                {
                    JOptionPane.showMessageDialog(null,"Enter Informations Carefully!!!!!!");
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JTextField ID;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel Times;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
