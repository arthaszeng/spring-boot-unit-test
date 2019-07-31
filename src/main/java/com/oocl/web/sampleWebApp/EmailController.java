package com.oocl.web.sampleWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(path = "/emails", produces = "application/json")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> addEmail(@Valid @RequestBody Email email) throws URISyntaxException {
        int generatedId;
        try {
            generatedId = emailService.add(email);
        } catch (Exception ignored) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.created(new URI(String.format("/emails/%s", generatedId))).build();
    }
}
