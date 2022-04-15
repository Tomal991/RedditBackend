package com.example.RedditBackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="redditUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "username")
    @NotBlank(message = "Username is required")
    private String username;

    @Column(name = "password")
    @NotBlank(message = "Password is required")
    private String password;

    @Column(name = "email")
    @Email
    @NotEmpty(message = "Email is required")
    private String email;

    private Instant createdDate;

    private boolean enabled;
}
