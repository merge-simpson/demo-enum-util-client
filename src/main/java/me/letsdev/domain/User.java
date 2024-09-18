package me.letsdev.domain;

import java.time.Instant;

public class User {
    public String id;

    public String username;
    public String password;
    public String nickname;

    public UserStatus status;
    public Instant createdAt;
    public Instant updatedAt;
}
