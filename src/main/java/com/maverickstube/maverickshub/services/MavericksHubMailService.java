package com.maverickstube.maverickshub.services;

//import com.maverickstube.maverickshub.config.MailConfig;
import com.maverickstube.maverickshub.dtos.requests.BravoMailRequest;
import com.maverickstube.maverickshub.dtos.requests.Recipient;
import com.maverickstube.maverickshub.dtos.requests.SendMailRequest;
import com.maverickstube.maverickshub.dtos.requests.Sender;
import com.maverickstube.maverickshub.dtos.responses.BravoMailResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Service
@AllArgsConstructor
public class MavericksHubMailService implements MailService{
    @Override
    public String sendMail(SendMailRequest request) {
        return null;
    }
//    private final MailConfig mailConfig;
//    public String sendMail(SendMailRequest mailRequest) {
//
//            RestTemplate restTemplate = new RestTemplate();
////            String url =  mailConfig.getMailApiUrl();
//            BravoMailRequest request = new BravoMailRequest();
//            request.setSubject(mailRequest.getSubject());
//            request.setSender(new Sender());
//            request.setRecipients(List.of(new Recipient(mailRequest.getEmail(), mailRequest.getRecipientName())));
//            request.setContent(mailRequest.getContent());
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            headers.set("api-key", mailConfig.getMailApikey());
//            headers.set("accept", MediaType.APPLICATION_JSON.toString());
//            RequestEntity<?> httpRequest = new RequestEntity<>(request, headers,  HttpMethod.POST, URI.create(url));
//            ResponseEntity<BravoMailResponse> response = restTemplate.postForEntity(url, httpRequest, BravoMailResponse.class);
//            if(response.getBody()!=null && response.getStatusCode()==HttpStatusCode.valueOf(201)) return "mail sent successfully";
//            else throw new RuntimeException("Error sending mail");
//        }
    }

