import java.util.Arrays;
import java.util.Scanner;
public class project1 {
	
	private static String[] words;
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("Enter a list of words seperated by spaces: ");
			words = scnr.nextLine().split(" ");
			
			//options for users 
			System.out.println("Please choose one of the choices listed. ");
			System.out.println("1. Display words listed A-Z");
			System.out.println("2. Display the length of each word in the list");
			System.out.println("3. Display word list statistics");
			System.out.println("4. Count the number words with Even/odd Length");
			System.out.println("5. Count the number of words that have a prime length");
			System.out.println("6. Enter a new word list");
			System.out.println("7. Quit Program");
			
			//input
			int choice = scnr.nextInt();
			scnr.nextLine();
			
			switch (choice)
			{
			case 1:
				displayWordsListedAtoZ();
				break;
			
			case 2:
				displayLengthofWords();
				break;
			case 3:
				displayWordListStatistic();
				break;
			case 4:
				countWordsWithEvenOrOddLength();
				break;
			case 5:
				countWordsWithPrimeLength();
				break;
			//restarts loop 
			case 6:
				break;
			case 7:
				System.out.println("Goodbye.");
				System.exit(0);
				default:
					System.out.println("Invalid choice, please try again.");
					
			}//end of choices
			
		}//end of while
	}

	
	//methods
	
	//sorts A-Z
	private static void displayWordsListedAtoZ()
		{
			Arrays.sort(words);
			System.out.println("Words Listed A-Z:");
				for(String word : words) 
				{
					System.out.println(word);
				}//end of for
		}
	//length of words
	private static void displayLengthofWords()
	{
			System.out.println("Length of each word: ");
				for(String word : words) 
				{
					System.out.println(word + ": "+ word.length());
					
				}//end of for 
	}
	//statistics: shortest, longest, total characters(not spaces),average length of words,nowns(uppercase)
	//most occured word
	private static void displayWordListStatistic() {
		int[] lengthCounts = new int[words.length];
			for(int i = 0; i < words.length; i++) 
			{
				lengthCounts[i] = words[i].length();
			}//end of for 
			
			int totalLength = 0;
				for(int length : lengthCounts)
				{
					totalLength += length;
				}//end of #2 for
				double averagLength = (double) totalLength / lengthCounts.length;
				
				System.out.println("Staticstics of word list: ");
				System
	}
}
