package com.maverickstube.maverickshub.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddMediaToBookMarkRequest {
    private Long userId;
    private Long mediaId;

}
