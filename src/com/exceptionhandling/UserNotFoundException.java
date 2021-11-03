package com.exceptionhandling;

public class UserNotFoundException extends Exception {

        public UserNotFoundException() {
            super("USER NOT FOUND");
            // TODO Auto-generated constructor stub
        }
        public UserNotFoundException(String message) {
            super(message);
            // TODO Auto-generated constructor stub
        }

    }

