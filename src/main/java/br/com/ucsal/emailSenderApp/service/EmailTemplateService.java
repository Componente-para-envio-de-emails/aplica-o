package br.com.ucsal.emailSenderApp.service;

import br.com.ucsal.emailsender.service.JakartaMailSender;
import br.com.ucsal.emailsender.template.EmailTemplate;
import br.com.ucsal.emailsender.template.EmailTemplateRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailTemplateService {
    private static EmailTemplateRepository emailTemplateRepository;
    private final JakartaMailSender jakartaMailSender;

    public EmailTemplateService(@Value("${spring.mail.host}") String host,
                                @Value("${spring.mail.username}") String username,
                                @Value("${spring.mail.password}") String password) {
        this.jakartaMailSender = new JakartaMailSender(host, username, password);
    }

    public void createTemplate(String subject, String body){
        EmailTemplate emailTemplate = new EmailTemplate(subject,body);
        emailTemplateRepository.addTemplate(subject,emailTemplate);
    }

    public EmailTemplate getTemplate(String subject){
        EmailTemplate emailTemplate= emailTemplateRepository.getTemplate(subject);
        return emailTemplate;
    }

    public void sendEmailWithTemplate(String to, String subject) {
        EmailTemplate template = getTemplate(subject);
        jakartaMailSender.createContent(template.getBody(), null, null);
        jakartaMailSender.sendEmail(to, template.getSubject());
    }

}