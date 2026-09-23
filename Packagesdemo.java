// java.lang is imported automatically (No need to import System or Math)

import java.util.Scanner;   // Importing Scanner for user input
import java.util.ArrayList; // Importing ArrayList to store data
import java.io.File;      

public class Packagesdemo {
    public static void main(String[] args) {
        
       
        System.out.println("--- 1. java.lang Demo ---");
        int maxNumber = Math.max(75, 120); 
        System.out.println("The maximum number is: " + maxNumber);
        
        
        System.out.println("\n--- 2. java.util Demo ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add(color);
        System.out.println("Color List: " + list);
        
        
        System.out.println("\n--- 3. java.io Demo ---");
        File currentDirectory = new File(".");
        System.out.println("Does current directory exist? " + currentDirectory.exists());
        System.out.println("Absolute Path: " + currentDirectory.getAbsolutePath());
        
        scanner.close();
    }
}
