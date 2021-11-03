package com.exceptionhandling;

public class MyArthematicException extends Exception{

        public MyArthematicException() {
            super("ARITHEMETIC EXCEPTION FOUND");
        }

        public MyArthematicException(String s) {
            super(s);
        }

    }

