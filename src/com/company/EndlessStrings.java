package com.company;
import java.util.Scanner;
/**
 * Assignment
 * The following program should allow the user to input as many things as they want until they stop.
 * Each time it is supposed to repeat with what the user said, can you fix it?
 */

public class EndlessStrings
{
    public static void main(String[] args)
    {
        String userInput = "";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter text to echo.  Press \"Return\" to end.");
        userInput = keyboard.nextLine();

        while ( !userInput.equals(""))
        {
            System.out.println(userInput);
            userInput = keyboard.nextLine();
        }

    }
}