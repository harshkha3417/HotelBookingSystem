package com.Harsh.projects.airBnbApp.service;

import com.Harsh.projects.airBnbApp.dto.ProfileUpdateRequestDto;
import com.Harsh.projects.airBnbApp.dto.UserDto;
import com.Harsh.projects.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
