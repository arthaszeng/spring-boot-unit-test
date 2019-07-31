package com.oocl.web.sampleWebApp;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public int add(Email email) {
        return email.getId();
    }
}
