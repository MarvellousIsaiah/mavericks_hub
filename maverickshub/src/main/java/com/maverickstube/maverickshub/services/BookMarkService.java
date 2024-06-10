package com.maverickstube.maverickshub.services;

import com.maverickstube.maverickshub.dtos.requests.AddMediaToBookMarkRequest;
import com.maverickstube.maverickshub.dtos.requests.ViewBookMarkRequest;
import com.maverickstube.maverickshub.dtos.responses.AddMediaToBookMarkResponse;
import com.maverickstube.maverickshub.dtos.responses.ViewBookMarkResponse;
import com.maverickstube.maverickshub.exceptions.UserNotFoundException;

public interface BookMarkService {

    AddMediaToBookMarkResponse addMediaToBookMark(AddMediaToBookMarkRequest request) throws UserNotFoundException;

    ViewBookMarkResponse viewAll(ViewBookMarkRequest request) throws UserNotFoundException;
}
