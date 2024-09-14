package com.maverickstube.maverickshub.services;

import com.maverickstube.maverickshub.dtos.requests.AddMediaToBookMarkRequest;
import com.maverickstube.maverickshub.dtos.requests.CreateUserRequest;
import com.maverickstube.maverickshub.dtos.requests.ViewBookMarkRequest;
import com.maverickstube.maverickshub.dtos.responses.AddMediaToBookMarkResponse;
import com.maverickstube.maverickshub.dtos.responses.CreateUserResponse;
import com.maverickstube.maverickshub.dtos.responses.ViewBookMarkResponse;
import com.maverickstube.maverickshub.exceptions.UserNotFoundException;
import com.maverickstube.maverickshub.models.BookMark;
import com.maverickstube.maverickshub.models.Media;
import com.maverickstube.maverickshub.models.User;
import com.maverickstube.maverickshub.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class MavericksHubUserService implements UserService{
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public MavericksHubUserService(UserRepository userRepository,
                                   ModelMapper modelMapper) {

        this.userRepository = userRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public CreateUserResponse register(CreateUserRequest request) {
        User user = modelMapper.map(request, User.class);
        user = userRepository.save(user);
        var response = modelMapper.map(user, CreateUserResponse.class);
        response.setMessage("user registered successfully");
        return response;
    }


    @Override
    public User getById(Long id) throws UserNotFoundException {
        return userRepository.findById(id)
                .orElseThrow(()-> new UserNotFoundException(
                                String.format("user with id %d not found", id)));
    }

    @Override
    public User getUserByUsername(String username) {
          return userRepository.findUsersByEmailIgnoreCase(username);
    }

}
