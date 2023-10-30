package com.example.ecommersebackend.controller;

import com.example.ecommersebackend.Dto.UserDto;
import com.example.ecommersebackend.dbo.User;
import com.example.ecommersebackend.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    UserService userService;
    @PostMapping("/signup")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        UserDto userDto1 = this.userService.createUser(userDto);
        return ResponseEntity.ok(userDto1);
    }

    @PostMapping("/signin")
    public ResponseEntity<UserDto> signinUser(@RequestBody UserDto signinUser){
        System.out.println(" User Info : "+signinUser.getEmail() + " password " + signinUser.getPassword());
        return ResponseEntity.ok(new UserDto());
    }
}
