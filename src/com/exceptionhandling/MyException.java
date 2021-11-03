package com.exceptionhandling;

public class MyException extends Exception{

        public static void main(String[] args) throws UserNotFoundException {

            Integer age=17;
//		try {
            if (age<18) {
                System.out.println("User Found");
                throw new UserNotFoundException("you cannot vote");
            }
//		}catch(UserNotFoundException e) {
//			System.out.println("EXCEPTION HANDLIED");
//		}

            System.out.println("done");


        }

    }




















//	public static void voter(int age) {
//		if(age<18) {
//			throw new ArithmeticException("Person is not eligible to vote");
//        }
//        else {
//            System.out.println("Person is eligible to vote!!");
//        }
//    }
//    //main method
//    public static void main(String args[]){
//        //calling the function
//        voter(13);
//        System.out.println("rest of the code...");
//  }
//}

