/**
 * Tests the dog and cat classes. 
 * <p>
 * @author Diana Vermilya
  */

class Dog {
	int size;
	String breed;
	String name;
	
	void bark() {
		System.out.println ("Ruff! Ruff!");
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
		Dog d = new Dog();
		d.size = 40;
		d.bark();

		Cat c = new Cat();
		c.breed = "Maine Coon";
		c.bark();
	}
}




