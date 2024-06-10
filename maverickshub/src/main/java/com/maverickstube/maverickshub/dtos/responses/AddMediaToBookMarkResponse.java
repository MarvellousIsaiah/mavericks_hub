package com.maverickstube.maverickshub.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddMediaToBookMarkResponse {
    private String message;
    private Long mediaId;
    private String url;
}
