package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Please enter a name.");
        int count = 0;

        while (true)
        {

            if (count >= 1)
            {
                System.out.println("Please enter another name.");
            }

            java.util.Scanner userInput = new java.util.Scanner(System.in);

            String lastName = userInput.nextLine();
            switch (lastName)
            {
                case "Smith":
                case "Jones":
                    System.out.println("Grand Winner!");
                    break;

                case "Lazenby":
                    System.out.println("Hey, he owes me diner.");
                    break;

                default:
                    System.out.println("Sorry, not a winner....");

                    count++;
            }
        }
    }
}
