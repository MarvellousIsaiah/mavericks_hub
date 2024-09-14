package com.maverickstube.maverickshub.services;


import com.maverickstube.maverickshub.dtos.requests.SendMailRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MailServiceTest {

    @Autowired
    private MailService mailService;


    @Test
    public void testSendEmail(){
        String email = "becexi6393@cnurbano.com";
        SendMailRequest sendMailRequest = new SendMailRequest();
        String response = mailService.sendMail(sendMailRequest);


                assertThat(response).isNotNull();
        assertThat(response).containsIgnoringCase("success");
    }
}
