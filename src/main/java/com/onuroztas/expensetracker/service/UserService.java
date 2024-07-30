package com.onuroztas.expensetracker.service;

import com.onuroztas.expensetracker.dto.UserDTO;
import com.onuroztas.expensetracker.entity.User;
import com.onuroztas.expensetracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;



    public UserDTO register(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setRole(userDTO.getRole());


        user = userRepository.save(user);


        userDTO.setId(user.getId());

        return userDTO;
    }

    public String login(UserDTO userDTO) {
        User user = userRepository.findByUsername(userDTO.getUsername());
        if (user != null && passwordEncoder.matches(userDTO.getPassword(), user.getPassword())) {
            // Generate and return JWT token
            return "JWT token";  // Placeholder
        }
        return "Invalid username or password";
    }
}