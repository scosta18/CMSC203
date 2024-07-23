import java.util.Scanner;

public class RandNumGuesser {
		public static void main(String[] args) {
			 Scanner key = new Scanner(System.in);
			 int randNum;
			 int nextGuess;
			 int highGuess = 100;
			 int lowGuess = 1;
			 RNG rng = new RNG();
			 randNum = rng.rand();

			 System.out.println("Enter a your first guess");
			 nextGuess = key.nextInt();
			 
			 while(nextGuess!= randNum) {
				 if((int)RNG.getCount()/2 !=0)
					 System.out.println("Number of guesses is "+ (int)RNG.getCount()/2);
				 while(!rng.inputValidation(nextGuess, lowGuess, highGuess)) {
					 nextGuess = key.nextInt();
				 }
				 if(nextGuess > randNum)
					 highGuess = nextGuess;
				 else if(nextGuess < randNum)
					 lowGuess = nextGuess;				 
			 }

			 if(nextGuess == randNum) {
				 System.out.println("Congratulations, you guessedd currectly");
				 System.out.println("Try again? press 1 for 'yes' and 2 for'no'");
				 
				 if(key.nextInt()==1) {
					 rng.resetCount();
					 main(args);
				 }
				 else;
				 System.out.println("Thanks for playing.");
			 }
		 }
}
