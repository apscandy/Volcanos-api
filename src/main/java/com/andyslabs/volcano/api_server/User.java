package com.andyslabs.volcano.api_server;

public class User {
    private String username;
    private String password;
    private int id;

    private User(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.id = builder.id;
    }

    public static UserNameSetter builder(){
        return new Builder();
    }

    public interface UserNameSetter{
        PasswordSetter setUsername(String username);
    }

    public interface PasswordSetter {

        OptionalSetID setPassword(String password); // Optional fix: could be User.Builder
    }

    public interface OptionalSetID{
        OptionalSetID setID(int id);
        User build();
    }

    private static class Builder implements UserNameSetter, PasswordSetter, OptionalSetID{
        private String username;
        private String password;
        private int id;

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
        public Builder setID(int id){
            this.id = id;
            return this;
        }

        @Override
        public User build() {
            return new User(this);
        }
    }

}
