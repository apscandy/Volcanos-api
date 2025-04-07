package com.andyslabs.volcano.api_server;

public class User {
    private String username;
    private String password;

    private User(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder {
        private String username;
        private String password;

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            if (username == null || password == null) {
                throw new IllegalArgumentException("Username and password are required");
            }
            return new User(this);
        }
    }
}
