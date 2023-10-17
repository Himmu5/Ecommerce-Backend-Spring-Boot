package com.example.ecommersebackend.repositorie;

import com.example.ecommersebackend.dbo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User , Integer> {
}
