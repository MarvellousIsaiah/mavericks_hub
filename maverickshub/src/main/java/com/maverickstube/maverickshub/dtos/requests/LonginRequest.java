package com.maverickstube.maverickshub.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LonginRequest {
    private String username;
    private String password;
}
