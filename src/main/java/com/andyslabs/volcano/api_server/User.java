package com.andyslabs.volcano.api_server;

public class User {
    private String username;
    private String password;

    private User(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
    }

    public static UserNameSetter builder(){
        return new Builder();
    }

    public interface UserNameSetter{
        PasswordSetter setUsername(String username);
    }

    public interface PasswordSetter {
        User build();
        PasswordSetter setPassword(String password); // Optional fix: could be User.Builder
    }

    private static class Builder implements UserNameSetter, PasswordSetter{
        private String username;
        private String password;

        @Override
        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        @Override
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        @Override
        public User build() {
            return new User(this);
        }
    }

}
