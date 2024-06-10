package com.maverickstube.maverickshub.services;

import com.maverickstube.maverickshub.dtos.requests.AddMediaToBookMarkRequest;
import com.maverickstube.maverickshub.dtos.requests.ViewBookMarkRequest;
import com.maverickstube.maverickshub.dtos.responses.AddMediaToBookMarkResponse;
import com.maverickstube.maverickshub.dtos.responses.UpdateMediaResponse;
import com.maverickstube.maverickshub.dtos.responses.ViewBookMarkResponse;
import com.maverickstube.maverickshub.exceptions.UserNotFoundException;
import com.maverickstube.maverickshub.models.BookMark;
import com.maverickstube.maverickshub.models.Media;
import com.maverickstube.maverickshub.models.User;
import com.maverickstube.maverickshub.repositories.BookMarkRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BookMarkServiceImpl implements BookMarkService{
    private final UserService userService;
    private final MediaService mediaService;
    private final ModelMapper modelMapper;
    @Autowired
    private BookMarkRepository bookMarkRepository;
    @Override
    public AddMediaToBookMarkResponse addMediaToBookMark(AddMediaToBookMarkRequest request) throws UserNotFoundException {
        BookMark bookMark = new BookMark();
        User user = userService.getById(request.getUserId());
        Media media = mediaService.getMediaBy(request.getMediaId());
        user.setBookMark(bookMark);
        bookMark.setUserId(user.getId());
        user.getBookMark().getMediaList().add(media);
        bookMarkRepository.save(user.getBookMark());

        var response= modelMapper.map(media, AddMediaToBookMarkResponse.class);
        response.setMessage("media added successfully to bookmark");
        return response;
    }

    @Override
    public ViewBookMarkResponse viewAll(ViewBookMarkRequest request) throws UserNotFoundException {
//        User user = userService.getById(request.getUserId());
//        BookMark bookMark = bookMarkRepository.findBookMarkById(user.getBookMark().getId());
//        List<String> mediaUrls = new ArrayList<>();
//        for (Media media : medias) {
//            mediaUrls.add(media.getUrl());
//        }
        ViewBookMarkResponse response = new ViewBookMarkResponse();
        response.setMessage("bookmark viewed successfully");
        return response;
    }
}
