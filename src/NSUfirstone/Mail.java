package NSUfirstone;

import java.util.Properties;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;


public class Mail{
    
    public static int code;
    
    public static void sendMail(String recepient,String Subject, String Mess) throws Exception {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.ssl.trust", "*");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        final String myaccount = "northsouthuniversity7@gmail.com";
        final String password = "northsouth rds 123";
        
        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myaccount,password);
            }
        });
        
        Message message = prepareMessage(session,myaccount,recepient,Subject,Mess);
        Transport.send(message);
        
        
    }
    private static Message prepareMessage(Session session,String myaccount,String recepient,String Subject, String mess){
        try{
            
            double a = Math.random()*1000000;
            
            code = (int)a;
            
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myaccount));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient) );
            message.setSubject(Subject);
            message.setText(mess);
            return message;
        }
        catch(Exception e){
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE,null,e);
            
        }
        return null;
    }
    
}
