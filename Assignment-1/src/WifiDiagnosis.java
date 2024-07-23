/*
 * Class: CMSC203 
 * Instructor: Dr. Ahmed Tarek
 * Description: This is a program which helps user fix their device connection with their Wi-Fi router. And to do it,
 * 			 I used While loop and nested loop. Also used user input so that the program can react based on the individual’s response.
 * Due: 02/08/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sandro Blaise Costa
*/

import java.util.Scanner;
public class WifiDiagnosis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  
		// 1st step
		System.out.println("First step: reboot your computer.");
		System.out.print("Are you able to connect with the internet? (yes / no): \n");
		String choice = sc.nextLine();
		//step-1:Gets user input. If true, program stops, if not program continues.
		while(choice.equals("yes") && choice.equals("no"))
		{
		choice = sc.nextLine();
		}
		if(choice.equals("yes"))
		{
		System.out.println("Rebooting your computer seemed to work");
		System.exit(0);
		}
		  
		//step-2: Gets user input. If true, program stops, if not program continues.
		System.out.println("Second step: reboot your router");
		System.out.print("Now are you able to connect with the internet? (yes / no): \n");
		choice = sc.nextLine();
		while(choice.equals("yes") && choice.equals("no"))
		{
		choice = sc.nextLine();
		}
		if(choice.equals("yes"))
		{
		System.out.println("Rebooting your router seemed to work");
		System.exit(0);
		}
		  
		//step-3: Gets user input. If true, program stops, if not program continues.
		System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.print("Now are you able to connect with the internet? (yes / no): \n");
		choice = sc.nextLine();
		while(choice.equals("yes") && choice.equals("no"))
		{
		choice = sc.nextLine();
		}
		if(choice.equals("yes"))
		{
		System.out.println("Checking the router's cables seemed to work");
		System.exit(0);
		}
		  
		// step-4: Gets user input. If true, program stops, if not program continues.
		System.out.println("Fourth step: move your computer closer to your router");
		System.out.print("Now are you able to connect with the internet? (yes / no): \n");
		choice = sc.nextLine();
		while(choice.equals("yes") && choice.equals("no"))
		{
		choice = sc.nextLine();
		}
		if(choice.equals("yes"))
		{
		System.out.println("Moving your computer closer to the router seemed to work");
		System.exit(0);
		}
		  
		// step-5: If none of above is true, program asks user to contact his/her ISP( Internet Service Provider)
		System.out.println("Fifth step: contact your ISP. \nMake sure your ISP is hooked up to your router.");
	}
}