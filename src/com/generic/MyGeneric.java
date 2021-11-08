package com.generic;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MyGeneric {

//        public static < E > void printArray(E[] elements) {
//            for ( E element : elements){
//                System.out.println(element );
//            }
//            System.out.println();
//        }


        public static void main(String args[] ) {
                Employee emp01 = new Developer(1,"Qasim","Contour Admin");
                Employee emp02 = new Accounts(2,"Asad","Contour Accounts");
                Employee emp03 = new Engineer(3,"Ali","Any Division");



                MyLinkedList<Employee> ll= new MyLinkedList<>();
                ll.addNode(emp01);
                ll.addNode(emp02);
                ll.addNode(emp03);

                ll.display();










//                //comparing department
//                List<Employee> list = new ArrayList<Employee>();
//
//                list.add(emp01);
//                list.add(emp02);
//                list.add(emp03);
//                System.out.println(list);


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

