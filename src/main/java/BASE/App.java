package BASE;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Example Output
Is the car silent when you turn the key? y
Are the battery terminals corroded? n
The battery cables may be damaged.
Replace cables and try again.

Constraint
Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once.
Challenge
Investigate rules engines and inference engines. These are powerful ways to solve complex problems that are based on rules and facts.
Identify a rules engine for your programming language and use it to solve this problem
 */

import java.util.Scanner;

public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App prog = new App();
        //Initial input
        String answer;
        System.out.print("Is the car silent when you turn the key?");
        answer = in.nextLine();

        //output and decision tree
        prog.carExpert(answer);
    }

    //answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")
    //answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")

    public void carExpert(String answer)
    {
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            System.out.print("Are the battery terminals corroded? ");
            answer = in.nextLine();
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                System.out.println("Clean terminals and try starting again.");
                return;
            } else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                System.out.println("Replace cables and try again.");
                return;
            }
        } else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
            System.out.print("Does the car make a sickling noise? ");
            answer = in.nextLine();
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                System.out.println("Replace the battery.");
                return;
            } else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                System.out.print("Does the car crank up but fail to start? ");
                answer = in.nextLine();
                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                    System.out.println("Check spark plug connections");
                    return;
                } else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                    System.out.print("Does the engine start and then die? ");
                    answer = in.nextLine();
                    if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                        System.out.print("Does the car fuel injection? ");
                        answer = in.nextLine();
                        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                            System.out.println("Get it in for service");
                            return;
                        }
                        else if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n"))
                        {
                            System.out.println("Check to ensure the choke is opening and closing");
                            return;
                        }
                    }
                    else if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                        System.out.println("This should no be possible");
                        return;
                    }
                }
            }
        }
        System.out.println("Invalid input. Start over.");
    }
}
