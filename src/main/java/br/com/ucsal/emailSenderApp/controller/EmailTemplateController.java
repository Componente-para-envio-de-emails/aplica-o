package br.com.ucsal.emailSenderApp.controller;

import br.com.ucsal.emailSenderApp.service.EmailService;
import br.com.ucsal.emailSenderApp.service.EmailTemplateService;
import br.com.ucsal.emailsender.template.EmailTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/template")
public class EmailTemplateController {

    private final EmailTemplateService emailTemplateService;

    @Autowired
    public EmailTemplateController(EmailTemplateService emailTemplateService) {
        this.emailTemplateService = emailTemplateService;
    }

    @PostMapping("/createTemplate")
    public void createTemplate(@RequestParam String subject, @RequestParam String body){
        try {
            emailTemplateService.createTemplate(subject,body);
        }catch (Exception e){
            e.getMessage();
        }
    }

    @GetMapping("/getTemplate")
    public String getTemplate(@RequestParam String subject){
        try {
            EmailTemplate emailTemplate = emailTemplateService.getTemplate(subject);
            return emailTemplate.getSubject();
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @PostMapping("/sendEmailWithTemplate")
    public String sendEmailWithTemplate(@RequestParam String to, @RequestParam String subject) {
        try {
           emailTemplateService.sendEmailWithTemplate(to,subject);
        }catch (Exception e){
            return e.getMessage();
        }
        return "Email com template " + subject + " enviado com sucesso!";
    }

}
