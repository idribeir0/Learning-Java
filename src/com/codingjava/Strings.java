package com.codingjava;

public class Strings {

    public static void main(String[] args) {
        String message = "Hello world" + "!!";

        //the length method return the length of the string
        System.out.println(message.length());
        //the indexof method return how much caracteres that you input do you have
        System.out.println(message.indexOf("sky"));
        //the replace method return a new string object with the caractere replaced
        System.out.println(message.replace("!" , "*"));
    }
}


//in java we have methods that are blocks of code that perform a specific task
//they are used to define behavior, reuse code and organize logic

//the syntax to use methods:
//
// returnType methodName(parameters) {
//    // method body (code to be executed)
//}