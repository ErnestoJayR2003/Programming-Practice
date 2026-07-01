
package javaapplication16;

import java.util.Scanner;


public class JavaApplication16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Full Name: ");
        String name = s.nextLine();
        System.out.print("Age: ");
        int  age = s.nextInt();
        
        if (age <=18) {
            System.out.println("You are not yet legal");}
        else {
            System.out.println("You are legal");
        
        System.out.println("Are you Married? Yes or No");
        String crime = s.nextLine();
                switch (crime){
                    case "Yes":System.out.println("Legal");
                    break;
                    case "No":System.out.println("Not Legal");
                    break;
                    default: System.out.println("Invalid"); main(args);
                }
    }
    }
    
}
