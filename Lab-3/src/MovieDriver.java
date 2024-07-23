import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		char res = 'y';
		
		//calls the method from different class.
	  while(res == 'y') {
			Movie m = new Movie();// takes the movie name.
			System.out.println("Enter the title of a movie");
			String title = key.nextLine();
			m.setTitle(title);
			System.out.println("Enter the movie's rating");
			String rating = key.nextLine();//takes the rating of the movie.
			m.setRating(rating);
			System.out.println("Enter the number of tickets sold for " + title + " movie");
			int st = key.nextInt();//takes the number of sold tickets.
		    m.setSoldTickets(st);
		    System.out.println(m.toString());
		    //asks user if he/she wants to add another movie info.
		    System.out.println("Do you want to enter another? (y / n)");
		    res=key.next().charAt(0);
		    key.nextLine();
		}
		
System.exit(0);
	}

}
