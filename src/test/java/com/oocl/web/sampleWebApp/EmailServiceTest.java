package com.oocl.web.sampleWebApp;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EmailServiceTest {

    private EmailService emailService;

    @Before
    public void setUp() throws Exception {
        emailService = new EmailService();
    }

    @Test
    public void should_return_0_as_generated_id_when_create_first_an_email_succeed() {
        int generatedId = emailService.add(new Email());

        assertThat(generatedId, is(0));
    }
}
