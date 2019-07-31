package com.oocl.web.sampleWebApp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailServiceTest {

    private EmailService emailService;

    @Before
    public void setUp(){
        emailService = new EmailService();
    }

    @Test
    public void should_return_0_as_generated_id_when_create_first_an_email_succeed() {
        int generatedId = emailService.add(new Email());

        assertEquals(0, generatedId);
    }

    @Test
    public void should_return_1_as_generated_id_when_create_second_email_succeed() {
        emailService.add(new Email());
        int generatedId = emailService.add(new Email());

        assertEquals(1, generatedId);
    }
}
