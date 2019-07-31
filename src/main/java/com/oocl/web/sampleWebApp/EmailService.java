package com.oocl.web.sampleWebApp;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private int nextIndex = 0;

    public int add(Email email) {
        return nextIndex++;
    }
}
