package br.com.ucsal.emailSenderApp.service;

import br.com.ucsal.emailsender.service.EmailSender;
import br.com.ucsal.emailsender.service.JakartaMailSender;
import br.com.ucsal.emailsender.service.decorators.FileEmailSender;
import br.com.ucsal.emailsender.service.decorators.ImageEmailSender;
import br.com.ucsal.emailsender.service.decorators.MultiRecipientEmailSender;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EmailService {
    private final JakartaMailSender jakartaMailSender;

    public EmailService(@Value("${spring.mail.host}") String host,
                        @Value("${spring.mail.username}") String username,
                        @Value("${spring.mail.password}") String password) {
        System.out.println(host);
        this.jakartaMailSender = new JakartaMailSender(host, username, password);
    }

    public void sendSimpleEmail(String to, String subject, String body) {
        jakartaMailSender.createContent(body, null, null);
        jakartaMailSender.sendEmail(to, subject);
    }

    public void sendEmailWithFile(String to, String subject, String body, String source, String filename) {
        EmailSender filetEmailSender = new FileEmailSender(jakartaMailSender);
        filetEmailSender.createContent(body, source, filename);
        filetEmailSender.sendEmail(to, subject);
    }

    public void sendEmailWithImage(String to, String subject, String body,String source, String filename) {
        EmailSender imageEmailSender = new ImageEmailSender(jakartaMailSender);
        imageEmailSender.createContent(body, source, filename);
        imageEmailSender.sendEmail(to, subject);
    }

    public void sendMultiplesEmails(Set<String> recipients,String subject, String body, String source, String filename){
        MultiRecipientEmailSender multiRecipientEmailSender = new MultiRecipientEmailSender(jakartaMailSender);
        multiRecipientEmailSender.createContent(body,source,filename);
        multiRecipientEmailSender.sendEmail(recipients,subject);
    }


}
