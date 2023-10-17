package com.example.ecommersebackend.controller;

import com.example.ecommersebackend.Dto.UserDto;
import com.example.ecommersebackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/signup")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        UserDto userDto1 = this.userService.createUser(userDto);
        return ResponseEntity.ok(userDto1);
    }
}
