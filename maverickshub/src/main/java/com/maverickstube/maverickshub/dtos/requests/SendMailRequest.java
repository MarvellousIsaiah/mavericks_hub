package com.maverickstube.maverickshub.dtos.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SendMailRequest {
    private String email;
    private String subject;
    private String recipientName;
    private String content;
}
