import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		Random rand = new Random();
		String comp_choice = new String();
		String user_choice = new String();
		String result = new String();
		Scanner keyboard = new Scanner(System.in);
		result = "tie";
		while(result == "tie") {
			System.out.println("Welcome to Rock, Paper, Scissors!");
			System.out.println("Please enter your choice...");
			user_choice = keyboard.nextLine();
			int choice = rand.nextInt(3);
			choice+=1;
			if(choice == 1)
				comp_choice = "rock";
			else if(choice == 2)
				comp_choice = "paper";
			else if(choice == 3)
				comp_choice = "scissors";
			result = win_check(comp_choice, user_choice);
			System.out.println("Computer: " + comp_choice);
			System.out.println("User: " + user_choice);
			if (!result.equals("tie"))
				print_winning_info(result);
			else
				System.out.println("No ties allowed!");
		}

	}
	// Function to calculate a winning case.
	public static String win_check(String comp, String user) {
		String result = new String();
		if (comp.equals(user))
			result = "tie";
		else if(comp.equals("rock") && user.equals("scissors") || comp.equals("paper") && user.equals("rock") || comp.equals("scissors") && user.equals("paper"))
			result = "computer";
		else if(user.equals("rock") && comp.equals("scissors") || user.equals("paper") && comp.equals("rock") || user.equals("scissors") && comp.equals("paper"))
			result = "user";
		return result;
	}
	 //function to display the winning information
	public static void print_winning_info(String winner) {
		System.out.println("The winner is......");
		System.out.println(winner + "!!!!!");
	}
}
