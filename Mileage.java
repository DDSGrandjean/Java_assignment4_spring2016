/**
DYLAN GRANDJEAN
Assignment Java-4
This program is designed to calculate the miles per gallon from user inputs.
March 2nd, 2016
*/

import java.util.Scanner;

public class Mileage
{
	//Scanner instantiation outside of the methods to allow its use in
	//all methods that need it.
	private static Scanner keyboard = new Scanner(System.in);

	public static void main (String[] args)
	{
		//Constant and variables declaration.
		final String NAME = "DYLAN GRANDJEAN";

		int miles,
			gallons,
			totalMiles = 0,
			totalGallons = 0,
			totalTank = 0;
		double mpg,
			   totalMpg = 0;

		//Display the programmer's name and prompts the user for miles
		System.out.println(NAME + "\n");
		System.out.printf("TANK #%d\n", (totalTank + 1));
		miles = readMiles();

		//Runs the program until the user decides to end it by entering 0.
		while (miles != 0)
		{
			gallons = readGallons();
			mpg = computeMpg(miles, gallons);
			displayMpg(mpg);

			totalMiles += miles;
			totalGallons += gallons;
			totalMpg += mpg;
			totalTank++;

			System.out.printf("TANK #%d\n", (totalTank + 1));
			miles = readMiles();
		}

		//Calculate the value of miles per gallon prior to using it as an attribute.
		totalMpg = computeOverallMpg(totalMiles, totalGallons);
		//Runs the final method to display the results to the user.
		displayResults(totalMiles, totalGallons, totalTank, totalMpg);
	}

	/**
		The readMiles method accepts a String input from the user and, while
		that input is invalid, prompts the user to re-enter a new value.
		@return A valid input for mile driven.
	*/
	public static int readMiles()
	{
		int miles;

		System.out.printf("%-36s", "Enter number of miles or 0 to end:");
		miles = keyboard.nextInt();

		while (miles < 0)
		{
			System.out.printf("Invalid value: %d\n", miles);
			System.out.printf("%-36s", "Enter number of miles or 0 to end:");
			miles = keyboard.nextInt();
		}
		return miles;
	}

	/**
		The readGallons method accepts a String input from the user and, while
		that input is invalid, prompts the user to re-enter a new value.
		@return A valid input for gallons of gas.
	*/
	public static int readGallons()
	{
		int gallons;

		System.out.printf("%-36s", "Enter number of gallons:");
		gallons = keyboard.nextInt();

		while (gallons <= 0)
		{
			System.out.printf("Invalid value: %d\n", gallons);
			System.out.printf("%-36s", "Enter number of gallons:");
			gallons = keyboard.nextInt();
		}
		return gallons;
	}

	/**
		The computeMpg method accepts two integer arguments: miles and gallons.
		The miles per gallon is calculated from the arguments given.
		@param miles Amount of miles driven since the tank was last filled.
		@param gallons Amount of gallons of gas burned since the tank was last filled.
		@return If the value of gallons is zero, the method will return 0. Otherwise,
		the value of miles divided by gallons is returned.
	*/
	public static double computeMpg(int miles, int gallons)
	{
		return (double) miles / gallons;
	}

	/**
		The displayMpg method accepts one double argument and displays it to the
		screen. The method being void, no value is returned.
	*/
	public static void displayMpg(double mpg)
	{
		System.out.printf("%-36s%.2f\n\n", "MPG this tankful:", mpg);
	}

	/**
		The computOverallMpg accepts two integer arguments: totalMiles and totalGallons.
		The method calculates the overall miles per gallon from its attributes.
		@param totalMiles Total amount of miles driven.
		@param totalGallons Total amount of gallon of gas used to fill the tank.
		@return If the value of totalGallons is 0, the method returns 0. Otherwise,
		the method returns the value of totalMiles divided by totalGallons.
	*/
	public static double computeOverallMpg(int totalMiles, int totalGallons)
	{
		return (totalGallons == 0 ? 0 : ((double) totalMiles / totalGallons));
	}

	/**
		The displayResults method accepts four arguments, three integers and one double.
		The arguments, or results, are formatted and displayed to the screen to for the user to see.
		@param totalMiles Total amount of miles driven.
		@param totalGallons Total amount of gallon of gas to fill the tank.
		@param totalTank Total amount of tanks entered by the user.
		@param totalMpg Overall miles per hour.
	*/
	public static void displayResults(int totalMiles, int totalGallons, int totalTank, double totalMpg)
	{
		System.out.printf("\nTotal Miles Driven:%10d\n" +
						  "Total Gallons Used:%10d\n" +
						  "Number of Tankfuls:%10d\n" +
						  "Overall MPG:%17.2f\n\n",
						  totalMiles, totalGallons, totalTank, totalMpg);
	}
}
TANK #6
Enter number of miles or 0 to end:  0

Total Miles Driven:      1193
Total Gallons Used:        40
Number of Tankfuls:         5
Overall MPG:            29.83
*/
