package NSUfirstone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class AdminTeacher extends javax.swing.JFrame {

    private static String getAbsoluteFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public AdminTeacher() {
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

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Initial = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Times = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/remove.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 130, 50));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/add.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 130, 50));

        Initial.setBackground(new java.awt.Color(255, 255, 255));
        Initial.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Initial, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 280, 40));

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 280, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Initial :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 230, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 230, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add / Remove Teacher");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1000, 70));

        Times.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Times.setForeground(new java.awt.Color(0, 0, 0));
        Times.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Times.setText("jLabel5");
        getContentPane().add(Times, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 140, 30));

        Date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(0, 0, 0));
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date.setText("jLabel5");
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 140, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 94, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/white.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(Name.getText().trim().isEmpty() || Initial.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Fill Up all the Information Carefully!!!!!!");
        }
        
        else
        {
            int c=0;
            File fr = new File("AdminTeacher.text");
            try {
                FileReader reader = new FileReader(fr.getAbsolutePath());
                BufferedReader br = new BufferedReader(reader);
                String line;
                while((line=br.readLine())!=null)
                {
                    if(line.split(" ; ")[1].equals(Initial.getText().trim()))
                    {
                        c++;
                        JOptionPane.showMessageDialog(null,"Initial is Already Taken!!");
                        break;
                    }
                }
                if(c==0)
                {
                    File f = new File("AdminTeacher.text");
                try {
                    FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
                    fw.write(Name.getText().trim()+" ; "+Initial.getText().trim());
                    fw.write(System.lineSeparator());
                    fw.close();
                    JOptionPane.showMessageDialog(null,"Add Successfully");
                    dispose();
                    new Admin().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(AdinStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdinStudent.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AdinStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new Admin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(Name.getText().trim().isEmpty() || Initial.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Fill Up all the Information Carefully!!!!!!");
        }
        
        else
        {
            File fr = new File("AdminTeacher.text");
            File temp = new File("Temp.text");
            try {
                FileReader reader = new FileReader(fr.getAbsolutePath());
                BufferedReader br = new BufferedReader(reader);
                FileReader reader1 = new FileReader(temp.getAbsolutePath());
                BufferedReader br1 = new BufferedReader(reader1);
                String line;
                while((line=br.readLine())!=null)
                {
                    if(line.split(" ; ")[1].equals(Initial.getText().trim()) && line.split(" ; ")[0].equals(Name.getText().trim()))
                    {
                        
                    }
                    else
                    {
                        File f = new File("TeacherInformation.text");
                        FileWriter f1 = new FileWriter (temp.getAbsoluteFile(),true);
                        f1.write(line.split(" ; ")[0].trim()+" ; "+line.split(" ; ")[1].trim());
                        f1.write(System.lineSeparator());
                        f1.close();
                    }
                }
                
                FileWriter f2 = new FileWriter (fr.getAbsoluteFile(),false);
                
                while((line=br1.readLine())!=null)
                {
                    try{
                    f2.write(line.split(" ; ")[0].trim()+" ; "+line.split(" ; ")[1].trim());
                    f2.write(System.lineSeparator());
                    f2.close();
                    }catch(Exception e){
                        
                    }
                    
                }
                
                FileWriter f3 = new FileWriter (temp.getAbsoluteFile(),false);
                JOptionPane.showMessageDialog(null,"Remove Successfully");
                dispose();
                new Admin().setVisible(true);
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdinStudent.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AdinStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed
 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JTextField Initial;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Times;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
