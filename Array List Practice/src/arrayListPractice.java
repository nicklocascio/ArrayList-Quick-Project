import java.util.ArrayList;
import java.util.Scanner;

public class arrayListPractice
	{
	public static void main(String[] args)
		{
//		ArrayList <String> animals = new ArrayList <String> ();
//		animals.add("cat");
//		animals.add("dog");
//		animals.add("moose");
//		
//		animals.set(1, "gerbil");
//		
//		animals.remove(1);
//		animals.remove("moose");
//		animals.add(0, "chicken");
//		animals.add(2, "cow");
//		
//		for(String hi: animals)
//			{
//			System.out.println(hi);
//			}
//		
//		System.out.println(animals.get(animals.size()-1));
//		
//		System.out.println(animals);
//		
//		System.out.println(animals.size());		
			
			
//		ArrayList <Double> numbers = new ArrayList <Double> ();
//		numbers.add(3.4);
//		numbers.add(7.5);
//		numbers.add(9.7);
//		
//		Scanner userInput = new Scanner(System.in);	
//		for(int i = 0; i < 3; i++)
//			{
//			if(i == 0)
//				{
//				System.out.println("Enter a decimal.");
//				}
//			else if(i == 1)
//				{
//				System.out.println("Enter a second decimal.");
//				}
//			else if(i == 2)
//				{
//				System.out.println("Enter a third decimal.");
//				}
//			double decimal = userInput.nextDouble();
//			numbers.add(decimal);
//			}
//				
//		for(double hello: numbers)
//			{
//			System.out.println(hello);
//			}
		
		ArrayList <String> candy = new ArrayList <String> ();
		
		Scanner userInput2 = new Scanner(System.in);
		Scanner userInput3 = new Scanner(System.in);
		Scanner userInput4 = new Scanner(System.in);
		
		boolean candies = true;
		System.out.println("What is your one of your favorite candies?");
		String userCandy = userInput2.nextLine();
		candy.add(userCandy);
		while(candies)
			{
			System.out.println("Do you have another favorite one?");
			String moreCandy = userInput3.nextLine();
			if(moreCandy.equals("yes"))
				{
				System.out.println("What is it?");
				String evenMore = userInput4.nextLine();
				candy.add(evenMore);
				candies = true;
				}
			else if(moreCandy.equals("no"))
				{
				System.out.println("You have " + candy.size() + " favorite candies, and they are: ");
				if(candy.size() == 1)
					{
					for(String yo : candy)
						{
						System.out.println(yo);
						}
					}
				else
					{
					for(String yoyo : candy)
						{
						System.out.println(yoyo);
						}
					}
				candies = false;
				}
			}
		Scanner userInput5 = new Scanner(System.in);
		System.out.println("Are these candies correct?");
		String yesOrNo = userInput5.nextLine();
		if(yesOrNo.equals("yes"))
			{
			System.out.println("Alright, have a good day!");
			}
		else if(yesOrNo.equals("no"))
			{
			Scanner userInput6 = new Scanner(System.in);
			System.out.println("Which number of candy in the list would you like to remove?");
			int remove = userInput6.nextInt();
			candy.remove(remove-1);
			System.out.println("Here you go: ");
			for(String hiya : candy)
				{
				System.out.println(hiya);
				}
			}
		}
	}




