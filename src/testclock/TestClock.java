
package testclock;
import jpb.*;

public class TestClock {

    public static void main(String[] args) {

        //instance variables
        int hours;
        int minutes;
        int seconds;

        //creating clock object
    Clock clock = new Clock();

System.out.println("Welcome to the clock testing program");
System.out.println("Commands: ");
System.out.println("a = advance (increase time by one second)");
System.out.println("c = calibrate (set to current time)");
System.out.println("q = quit");
System.out.println("r = reset (set hours, minutes, and second to zero)");
System.out.println("s = set (allow user to set time)");
System.out.println("t = toggle (switch from 24-hour clock to 12-hour clock, or vice-versa)");
System.out.println();
System.out.println("The time is now " + clock);
System.out.println();

   while (true){
       // Asking user to input a command
       SimpleIO.prompt("Enter command (a, c, q, r, s, or t) ");
       String userInput = SimpleIO.readLine();

       //initializing char commands
       char command = userInput.toLowerCase().charAt(0);
       
   // Beginning of my switch statements
   switch (command){

    //if user inputs a to increase time by one second
   case 'a':
       clock.advance();
       System.out.println("The time is now " + clock);
       break;

   
    //if user inputs c to set the current time
   case 'c':
       clock.calibrate();
       System.out.println("The time is now " + clock);
       break;

    //if user inputs q to exit the program
   case 'q':
       System.exit(0);
       break;

    //if user inputs r to reset the time
    case 'r':
       clock.reset();
       System.out.println("The time is now " + clock);
       break;

    //if user inputs s to set the time
    case 's':
       //asking user to enter hours
       while (true){
       SimpleIO.prompt("Enter hours: ");
       String userInput1 = SimpleIO.readLine();
       hours = Integer.parseInt(userInput1);
            if (hours > 0 && hours < 13 ){
                break;
           }
            System.err.println("Input must be between 1 and 12; please try again.");
        }

       //asking user to enter minutes
       while (true){
       SimpleIO.prompt("Enter minutes: ");
       String userInput2 = SimpleIO.readLine();
       minutes = Integer.parseInt(userInput2);
            if (minutes > (-1) && minutes < 60 ){
                break;
            }
            System.err.println("Input must be between 0 and 59; please try again.");
        }
     
       //asking user to enter seconds
        while (true){
            SimpleIO.prompt("Enter seconds: ");
            String userInput3 = SimpleIO.readLine();
            seconds = Integer.parseInt(userInput3);
            if(seconds > (-1) && seconds < 60 ){
                break;
            }
            else
                System.err.println("Input must be between 0 and 59; please try again.");
        }
       clock.set(hours, minutes, seconds);
       System.out.println("The time is now " + clock);
       break;

        //if user inputs t to toggle
     case 't':
       clock.toggleClockMode();
       System.out.println("The time is now " + clock);
       break;

    default:
           System.err.println("Illegal command; please try again");
           break;
       
       
        }
       }
      }
     }
    


   

   
