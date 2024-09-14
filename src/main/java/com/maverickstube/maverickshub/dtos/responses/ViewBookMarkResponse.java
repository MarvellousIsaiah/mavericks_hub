package com.maverickstube.maverickshub.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ViewBookMarkResponse {
    private String message;
    private List<String> medias;

}
