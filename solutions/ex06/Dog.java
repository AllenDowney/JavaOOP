/**
 * 
 */
package net.kmcconnaughay.homework_03;

/**
 * @author kmcconnaughay
 *
 */
public class Dog extends Animal implements Fetcher{
	
	public void makeNoise() {
		System.out.println("Arf, arf!");
	}
	
	public String fetch (String my_string) {
		return "damp " + my_string;
	}

}
