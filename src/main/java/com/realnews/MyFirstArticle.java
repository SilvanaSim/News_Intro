package com.realnews;

import java.util.Scanner;

public class MyFirstArticle {
    public static void main(String[] args) {
        //write the text in the console
        System.out.println("Welcome To Other News");

        //Scanner is for reading values from the console
        Scanner scanner = new Scanner(System.in);

        String firsName = scanner.next();

        System.out.println("Your name is: " + firsName);

        System.out.println("Please enter your age:" );

         //Integer varable that will store the age entered from the user
        int userAge = scanner.nextInt();

        //System.out.println("Your name is: " + firsName + "\nYour age is: " + userAge);

        System.out.println("Your name is: " + firsName);
        System.out.println("Your age is: " + userAge);

        if (userAge >=18){
            System.out.println(firsName + "see political news first");
        }
        if (userAge <18) {
            System.out.println(firsName + "see education news first");
        }
        if (userAge >= 65) {
            System.out.println(firsName + "see health and care news first");
        }

        }

    }
