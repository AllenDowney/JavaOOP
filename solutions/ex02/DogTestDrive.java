/**
 * Tests the dog and cat classes, creating an array or dogs and
 * executing the bark method for each dog in the array, as well as
 * finding the largest dog in the array. 
 * <p>
 * The function takes no parameters and returns nothing.
 * @author Diana Vermilya <diana.vermilya@students.olin.edu>
  */

class Dog {
	private int size;
	
	void bark() {
		System.out.println ("Ruff! Ruff!");
	}
	void setSize (int s){
		this.size = s;
	}
	int getSize() {
		return this.size;
	}
	boolean isBigger(Dog that) {
		return (this.getSize() > that.getSize());
	}
}

class Cat {
	int size;
	String breed;
	String name;
	
	void bark() {
		System.out.println ("I'm a cat.");
	}
}
 

public class DogTestDrive {

	public static void main (String[] args) {
		Dog [] dogs = new Dog[5];
		int x = 0;
		while (x < dogs.length) {
			dogs[x] = new Dog();
			dogs[x].setSize(x*10);
			x = x+1;
		}
		x = 0;
		while (x < dogs.length) {
			dogs[x].bark();
			x = x+1;
		}
		x = 0;
		Dog bigdog = dogs[0];
		while (x < dogs.length) {
			if (dogs[x].isBigger(bigdog)) {
				bigdog = dogs[x];
			}
			x = x+1;
		}
		System.out.println (bigdog.getSize());
		System.out.println (dogs[3].isBigger(dogs[2]));
		System.out.println (dogs[2].isBigger(dogs[3]));
		
			
			
		Cat c = new Cat();
		c.breed = "Maine Coon";
		c.bark();
	}
}




