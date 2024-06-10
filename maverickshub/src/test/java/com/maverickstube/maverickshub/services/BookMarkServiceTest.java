package com.maverickstube.maverickshub.services;

import com.maverickstube.maverickshub.dtos.requests.AddMediaToBookMarkRequest;
import com.maverickstube.maverickshub.dtos.requests.ViewBookMarkRequest;
import com.maverickstube.maverickshub.dtos.responses.AddMediaToBookMarkResponse;
import com.maverickstube.maverickshub.dtos.responses.ViewBookMarkResponse;
import com.maverickstube.maverickshub.exceptions.UserNotFoundException;
import com.maverickstube.maverickshub.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BookMarkServiceTest {
    @Autowired
    private BookMarkService bookMarkService;
    private UserService userService;

    @Test
    public void addBookMarkTest() throws UserNotFoundException {
        AddMediaToBookMarkRequest request = new AddMediaToBookMarkRequest();

        request.setMediaId(101L);
        request.setUserId(201L);
        AddMediaToBookMarkResponse response = bookMarkService.addMediaToBookMark(request);
        assertThat(response).isNotNull();
        assertThat(response.getMediaId()).isEqualTo(101L);
        assertThat(response.getMessage()).contains("success");
        User user = userService.getById(201L);
        System.out.println(user);
    }

    @Test
    public void viewBookMarkTest() throws UserNotFoundException {
        ViewBookMarkRequest request = new ViewBookMarkRequest();
        request.setUserId(200L);
        ViewBookMarkResponse response = bookMarkService.viewAll(request);
        assertThat(response).isNotNull();
        assertEquals(response.getMedias().size(), 1);

    }
}
