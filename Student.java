//Java -- oop object oriented prog
// Student Mgt
//Compile - Syntax checking 
//Whenever we have to access any var and function of a particular class then 
// we have to make object of that class

//Keyword starting with capital letter --> Class/Interface
package com.amity;

import java.util.Scanner; //Single package can contain atleast one class
//package --> class --> function/method

class Student{ //Main Class name should always be the same name as file name
    public static void main(String args[]){ //String args[] - Command line arg
        String name;
        int contact;
        float marks;

        //Input in java 
        Scanner sc = new Scanner(System.in); //To take input from user

        //class ---> object.function()

        //Among the facilities provided by the System class are standard input, standard output
        System.out.println("Enter name of Student :- ");
        name = sc.nextLine(); //nextLine() - Input string type of value

        System.out.println("Enter contact of Student :- ");
        contact = sc.nextInt(); //nextInt() - Input integer type of value

        System.out.println("Enter marks of Student :- ");
        marks = sc.nextFloat(); //nextFloat() - Input float type of value

        System.out.println("-------------------------------------------------");
        System.out.println("Details of student is :- ");
        System.out.println("   Name = "+name);
        System.out.println("   Contact = "+contact);
        System.out.println("   Marks = "+marks);
    }
}
