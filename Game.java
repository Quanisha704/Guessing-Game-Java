import java.util.Scanner;
import java.util.Random;


public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Howdy, what's your name?");
    String name = input.nextLine();
    
    Random rand = new Random();

    int number = rand.nextInt(100);
    int tries = 0;

    System.out.println(name + " , I am thinking of a number between 1 and 100.");

    System.out.println("Try to guess my number.");

    System.out.println("Your guess:");

    

    while(true)
    {
      int guess = input.nextInt();
      tries = tries + 1;

      if (guess < number) 
    {
      System.out.println("Your guess is too low, try again.");
      System.out.println("Your guess:");
  
    } 
    else if (guess > number) 
    {
      System.out.println("Your guess is too high, try again.");    
      System.out.println("Your guess:"); 
    } 
    else 
    {
      System.out.println("Well done " + name);
      System.out.println("You found my number in " + tries + " tries!");
      break; 
    }

    }
    
    }
  }
