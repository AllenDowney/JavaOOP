/**
 * First java application from <i>Head First Java</i>, with modifications.
 * <p>
 * Prints two lines then initializes two int variables: a counter, x, 
and an upper bound, limit. 

The program will loop, printing out Fizz if the counter is divisible by 3,
and Buzz if it is divisible by 5. At the end of the loop the counter is 
incremented, continuing until counter is equal to range.

 * @author Evan Simpson
 */

public class MyFirstApp {

	public static void main(String[] args){
		System.out.println("I Rule!");
		System.out.println("The World.");

		int x = 1;
		int limit = 36;

		while ( x < limit){
			System.out.print(x + " ");
			if (x%3 == 0){
				System.out.print("Fizz");
			}
			if (x%5 == 0){
				System.out.print("Buzz");
			}
			System.out.println("");
			x++;
		}
	}
}
