package org.factzoopia.sonarEvents.controllers;

import org.factzoopia.sonarEvents.models.Email;
import org.factzoopia.sonarEvents.services.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${api-endpoint}/events")
public class EmailController{
    
    
    private final EmailService emailService;

   
   public EmailController(EmailService emailService) {
       this.emailService = emailService;
   }
      @PostMapping("/sendConfirmation")
    public ResponseEntity<Email> sendConfirmation(@RequestBody Email email) {
        Email sendConfirmation = emailService.sendConfirmationEmail(email);
        return ResponseEntity.status(HttpStatus.CREATED).body(sendConfirmation);
    }
}
