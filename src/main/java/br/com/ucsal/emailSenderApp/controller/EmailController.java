package br.com.ucsal.emailSenderApp.controller;

import br.com.ucsal.emailSenderApp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/emailSender")
public class EmailController {
    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/sendSimple")
    public String sendSimpleEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String body) {
        try {
            emailService.sendSimpleEmail(to, subject, body);
        }catch (Exception e){
            return e.getMessage();
        }
        return "Email enviado com sucesso!";
    }

    @PostMapping("/sendWithFile")
    public String sendEmailWithAttachment(@RequestParam String to, @RequestParam String subject,
                                          @RequestParam String body, @RequestParam String source,
                                          @RequestParam String fileName) {
        try {
            emailService.sendEmailWithFile(to, subject, body, source,fileName);
        }catch (Exception e){
            return e.getMessage();
        }

        return "Email com anexo enviado com sucesso!";
    }

    @PostMapping("/sendWithImage")
    public String sendEmailWithImage(@RequestParam String to, @RequestParam String subject,
                                     @RequestParam String body, @RequestParam String source,
                                     @RequestParam String fileName) {
        try {
            emailService.sendEmailWithImage(to, subject, body, source,fileName);
        }catch (Exception e){
            return e.getMessage();
        }
        return "Email com imagem enviado com sucesso!";
    }

    @PostMapping("/sendMultiples")
    public String sendMultiplesEmails(@RequestParam Set<String> recipients, @RequestParam String subject,
                                      @RequestParam String body, @RequestParam String source,
                                      @RequestParam String fileName) {
        try {
            emailService.sendMultiplesEmails(recipients,subject,body,source,fileName);
        }catch (Exception e){
            return e.getMessage();
        }
        return "Emails enviados com sucesso!";
    }
}
