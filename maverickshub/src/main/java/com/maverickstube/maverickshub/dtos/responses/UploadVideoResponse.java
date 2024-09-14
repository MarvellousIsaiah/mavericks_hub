package com.maverickstube.maverickshub.dtos.responses;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class UploadVideoResponse {
    String url;
    Long videoId;
    String description;
}
