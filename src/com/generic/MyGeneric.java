package com.generic;

import java.sql.SQLOutput;

public class MyGeneric {

//        public static < E > void printArray(E[] elements) {
//            for ( E element : elements){
//                System.out.println(element );
//            }
//            System.out.println();
//        }

        @Override
        public String toString() {
                return super.toString();
        }

        public static void main(String args[] ) {
                Employee emp01 = new Developer(1,"Qasim","Contour Admin");
                Employee emp02 = new Accounts(2,"Asad","Contour Accounts");
                Employee emp03 = new Engineer(3,"Ali","Any Division");

                //comparing department
                emp01.setT(emp01);
                System.out.println(emp01.getT());
















//            Integer[] intArray = { 10, 20, 30, 40, 50 };
//            Character[] charArray = { 'C', 'O', 'N', 'T', 'O','U','R' };
//
//            System.out.println( "Printing Integer Array" );
//            printArray( intArray  );
//
//            System.out.println( "Printing Character Array" );
//            printArray( charArray );
        }
}

