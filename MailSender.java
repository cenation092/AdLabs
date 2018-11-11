/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adlabs;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author mohitrai
 */
public class MailSender implements Runnable {
    
    private String to ,sub, msg;
    
    public MailSender(String to, String msg ){
        this.to = to;
        //this.sub = sub;
        this.msg = msg;
    }
    
    
    @Override
    public void run() {
       
        //String p = null;
        //String 
        //msg = p;
        //String EMail = null;
        //to = EMail;
        sub = "Reset Password Requested";
        //SendEmail SE = new SendEmail(to, sub, msg);
        String user = "cenation092@gmail.com";
        String pass = "password";
        Properties prop = new Properties();
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", true);
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        Session session;
        session = Session.getInstance(prop, new javax.mail.Authenticator()
        {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication()
            {
                return new javax.mail.PasswordAuthentication(user, pass);
            }
        });
        try {
            //JOptionPane.showMessageDialog(null,"You password sent to your email id");
            //this.dispose();
            Message message = new MimeMessage(session);
            message.setFrom( new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(sub);
            message.setText(msg);
            Transport.send(message);
            System.out.println("mail sent :P");
        }
        catch( MessagingException e ){
            System.out.println(e);
        }
        
        /*this.dispose();
        login l = new login();
        l.setVisible(rootPaneCheckingEnabled);*/
    }
}
