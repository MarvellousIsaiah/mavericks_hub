package com.maverickstube.maverickshub.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maverickstube.maverickshub.dtos.requests.LonginRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


    @SpringBootTest
    @AutoConfigureMockMvc
    public class AuthenticationControllerTest{
        @Autowired
        private MockMvc mockMvc;
        @Test
        @Sql(scripts = {"/db/data.sql"})
        public void authenticationUserTest() throws Exception {
            LonginRequest loginRequest = new LonginRequest();
            loginRequest.setUsername("john@email.com");
            loginRequest.setPassword("password");
            ObjectMapper mapper = new ObjectMapper();
            mockMvc.perform(post("/api/v1/auth")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(mapper.writeValueAsBytes(loginRequest)))
                    .andExpect(status().isOk())
                    .andDo(print());
        }
    }

