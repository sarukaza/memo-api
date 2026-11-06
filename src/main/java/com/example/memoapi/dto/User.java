package com.example.memoapi.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private long UserId;
    private String UserName;
    private String password;
    private LocalDateTime createdAt;
}