package com.onuroztas.expensetracker.service;

import com.onuroztas.expensetracker.dto.UserDTO;
import com.onuroztas.expensetracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDTO register(UserDTO userDTO) {
        // Registration logic
        return userDTO;
    }

    public String login(UserDTO userDTO) {
        // Login logic
        return "";
    }
}