package com.fillr.fillr_backend.controller;

import com.fillr.fillr_backend.model.User;
import com.fillr.fillr_backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @GetMapping("/register")
    public ResponseEntity<User> registerGet(
            @RequestParam String username,
            @RequestParam String email,
            @RequestParam String password
    ) {
        User user = userService.registerUser(username, email, password);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerPost(
            @RequestParam String username,
            @RequestParam String email,
            @RequestParam String password
    ) {
        User user = userService.registerUser(username, email, password);
        return ResponseEntity.ok(user);
    }
} 