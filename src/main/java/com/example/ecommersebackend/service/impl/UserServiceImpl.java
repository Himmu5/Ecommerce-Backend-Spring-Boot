package com.example.ecommersebackend.service.impl;

import com.example.ecommersebackend.Dto.UserDto;
import com.example.ecommersebackend.dbo.User;
import com.example.ecommersebackend.repositorie.UserRepo;
import com.example.ecommersebackend.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public UserDto createUser(UserDto userDto) {
        User u = this.modelMapper.map(userDto , User.class);
        User user = this.userRepo.save(u);
        return this.modelMapper.map(user , UserDto.class);
    }
}
