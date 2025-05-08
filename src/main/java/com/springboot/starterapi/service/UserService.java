package com.springboot.starterapi.service;

import com.springboot.starterapi.model.user.User;
import com.springboot.starterapi.payload.ApiResponse;
import com.springboot.starterapi.payload.InfoRequest;
import com.springboot.starterapi.payload.UserIdentityAvailability;
import com.springboot.starterapi.payload.UserProfile;
import com.springboot.starterapi.payload.UserSummary;
import com.springboot.starterapi.security.UserPrincipal;

public interface UserService {

	UserSummary getCurrentUser(UserPrincipal currentUser);

	UserIdentityAvailability checkUsernameAvailability(String username);

	UserIdentityAvailability checkEmailAvailability(String email);

	UserProfile getUserProfile(String username);

	User addUser(User user);

	User updateUser(User newUser, String username, UserPrincipal currentUser);

	ApiResponse deleteUser(String username, UserPrincipal currentUser);

	ApiResponse giveAdmin(String username);

	ApiResponse removeAdmin(String username);

	UserProfile setOrUpdateInfo(UserPrincipal currentUser, InfoRequest infoRequest);

}