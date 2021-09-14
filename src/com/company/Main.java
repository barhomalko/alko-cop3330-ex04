/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 barhom alko
 */

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter a Noun: ");
        String noun = userinput.nextLine();

        System.out.print("Enter a Verb: ");
        String Verb = userinput.nextLine();

        System.out.print("Enter an Adjective: ");
        String Adjective = userinput.nextLine();

        System.out.print("Enter an Adverb: ");
        String Adverb = userinput.nextLine();

        System.out.println("Do you " +Verb+ " your " +Adjective+" "+ noun +" "+ Adverb+"? That's hilarious!");
    }
    }

