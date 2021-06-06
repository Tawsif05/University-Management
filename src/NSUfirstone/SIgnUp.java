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

public class SIgnUp extends javax.swing.JFrame {

    public SIgnUp() throws IOException {
        File f = new File("StudentInformation.text");
        FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
        
        initComponents();
        showDate();
        showTime();
    }

    void addMember()
    {
        
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

        Cat = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Gender = new javax.swing.JComboBox();
        Email = new javax.swing.JTextField();
        Dept = new javax.swing.JTextField();
        Id = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        SignUp = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Times = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cat.setBackground(new java.awt.Color(255, 255, 255));
        Cat.setForeground(new java.awt.Color(0, 0, 0));
        Cat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--------", "Student", "Teacher" }));
        getContentPane().add(Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 240, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(" Student / Teacher :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 190, 40));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 240, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Password :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 190, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 94, 50));

        Gender.setBackground(new java.awt.Color(255, 255, 255));
        Gender.setForeground(new java.awt.Color(0, 0, 0));
        Gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--------", "Male", "Female" }));
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 240, 30));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 240, 30));

        Dept.setBackground(new java.awt.Color(255, 255, 255));
        Dept.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Dept.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 240, 30));

        Id.setBackground(new java.awt.Color(255, 255, 255));
        Id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Id.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 240, 30));

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 0, 0));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 240, 30));

        SignUp.setBackground(new java.awt.Color(255, 255, 255));
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/SignUp.jpg"))); // NOI18N
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 120, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Id Number / Initial :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 190, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Gender :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 190, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Department :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 190, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 190, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 190, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign Up");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 90));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSUfirstone/Rd.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed

        if(Name.getText().trim().isEmpty() || Id.getText().trim().isEmpty() || Dept.getText().trim().isEmpty() || Email.getText().trim().isEmpty() || Gender.getSelectedIndex()==0 || Cat.getSelectedIndex()==0 || pass.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Fill Up all the Information Carefully!!!!!!");
        }
        
        else
        {
            if(Cat.getSelectedIndex()==1)
            {
                int c=0,c1=0;
                File fr = new File("StudentInformation.text");
                File fr1 = new File("AdminStudent.text");
            try {
                FileReader reader = new FileReader(fr.getAbsolutePath());
                BufferedReader br = new BufferedReader(reader);
                String line;
                while((line=br.readLine())!=null)
                {
                    try{
                    if(line.split(" ; ")[1].equals(Id.getText().trim()))
                    {
                        c++;
                        JOptionPane.showMessageDialog(null,"Id is Already Taken!!");
                        break;
                    }
                    }catch(Exception e){
                        
                    }
                }
                
                FileReader reader1 = new FileReader(fr1.getAbsolutePath());
                BufferedReader br1 = new BufferedReader(reader1);
                String line1;
                while((line1=br1.readLine())!=null)
                {
                    if(line1.split(" ; ")[1].equals(Id.getText().trim()) && line1.split(" ; ")[0].equals(Name.getText().trim()))
                    {
                        c1++;
                    }
                }
                
                if(c==0 && c1==1)
                {
                    File f = new File("StudentInformation.text");
                try {
                    try{
                        Mail m = new Mail();
                        m.sendMail(Email.getText().trim(),"CONFIRMATION","Dear Student,\nYour RDS ID is created successfully.\nNow you can log in into your ID.\n\nThank You");
                        FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
                        fw.write(Name.getText().trim()+" ; "+Id.getText().trim()+" ; "+pass.getText().trim()+" ; "+Dept.getText().trim()+" ; "+Email.getText().trim()+" ; "+Gender.getSelectedIndex());
                        fw.write(System.lineSeparator());
                        fw.close();
                        File student = new File(Id.getText().trim()+".text");
                        FileWriter write = new FileWriter (student.getAbsoluteFile(),true);
                        write.write("Information ; "+Name.getText().trim()+" ; "+Id.getText().trim()+" ; "+pass.getText().trim()+" ; "+Dept.getText().trim()+" ; "+Email.getText().trim()+" ; "+Gender.getSelectedIndex());
                        write.write(System.lineSeparator());
                        
                        write.close();
                        dispose();
                        new LogIn().setVisible(true);
                        
                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,"Check Your Internet Connection or write the email id perfectly");
                    }
            }       catch (Exception ex) {
                        Logger.getLogger(SIgnUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"ID number is not valid\nContact With Nsu IT");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdinStudent.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AdinStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }
            
            else{
                
                int c=0,c1=0;
                File fr = new File("TeacherInformation.text");
                File fr1 = new File("AdminTeacher.text");
            try {
                FileReader reader = new FileReader(fr.getAbsolutePath());
                BufferedReader br = new BufferedReader(reader);
                String line;
                while((line=br.readLine())!=null)
                {
                    if(line.split(" ; ")[1].equals(Id.getText().trim()))
                    {
                        c++;
                        JOptionPane.showMessageDialog(null,"Initial is Already Taken!!");
                        break;
                    }
                }
                
                FileReader reader1 = new FileReader(fr1.getAbsolutePath());
                BufferedReader br1 = new BufferedReader(reader1);
                String line1;
                while((line1=br1.readLine())!=null)
                {
                    if(line1.split(" ; ")[1].equals(Id.getText().trim()) && line1.split(" ; ")[0].equals(Name.getText().trim()))
                    {
                        c1++;
                    }
                }
                
                if(c==0 && c1==1)
                {
                    File f = new File("TeacherInformation.text");
                try {
                    try{
                        Mail m = new Mail();
                        m.sendMail(Email.getText().trim(),"CONFIRMATION","Dear Faculty Member,\nYour RDS ID is created successfully.\nNow you can log in into your ID.\n\nThank You");
                        FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
                        fw.write(Name.getText().trim()+" ; "+Id.getText().trim()+" ; "+pass.getText().trim()+" ; "+Dept.getText().trim()+" ; "+Email.getText().trim()+" ; "+Gender.getSelectedIndex());
                        fw.write(System.lineSeparator());
                        File student = new File(Id.getText().trim()+".text");
                        FileWriter write = new FileWriter (student.getAbsoluteFile(),true);
                        write.write("Information ; "+Name.getText().trim()+" ; "+Id.getText().trim()+" ; "+pass.getText().trim()+" ; "+Dept.getText().trim()+" ; "+Email.getText().trim()+" ; "+Gender.getSelectedIndex());
                        write.write(System.lineSeparator());
                        write.close();
                        fw.close();
                        dispose();
                        new LogIn().setVisible(true);
                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,"Check Your Internet Connection or write the email id perfectly");
                    }
            }       catch (Exception ex) {
                        Logger.getLogger(SIgnUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"ID number is not valid\nContact With Nsu IT");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdinStudent.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AdinStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
        }
        
    }//GEN-LAST:event_SignUpActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new LogIn().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SIgnUp().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(SIgnUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Cat;
    private javax.swing.JLabel Date;
    private javax.swing.JTextField Dept;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox Gender;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Name;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel Times;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
