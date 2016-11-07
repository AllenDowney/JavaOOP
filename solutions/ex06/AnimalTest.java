/**
 * 
 */
package net.kmcconnaughay.homework_03;

/**
 * @author Kyle McConnaughay
 *
 */

class AnimalTestDrive {

    public static void main (String[] args) {
    	//Initialize variables
    	Dog my_dog = new Dog();
    	Cat my_cat = new Cat();
    	AnimalPack my_pack = new AnimalPack();
    	
    	// Set properties
    	my_dog.setSize(20);
    	my_cat.setSize(10); 
    	my_pack.makeArray(10);
    	my_pack.addAnimal(0, my_dog);
    	my_pack.addAnimal(1, my_cat);
    	
    	// Confirm that Cat() and Dog() overrode makeNoise()
    	my_dog.makeNoise();
    	my_cat.makeNoise();
    	
    	// Confirm that Animal.isBigger() works correctly
    	System.out.println(my_dog.isBigger(my_cat));
    	System.out.println(my_cat.isBigger(my_dog));
    	
    	// Confirm that AnimalPack.makeNoise() and AnimalPack.biggestAnimal() 
    	// work correctly
    	my_pack.makeNoise();
    	System.out.println(my_pack.biggestAnimal().toString());
    	
    	// Attempt to instantiate the abstract class Animal()
    	// Animal foo = new Animal();
    	
    	// Check to make sure Dog() implements the Fetcher() interface
    	Fetcher f = new Dog();
    	System.out.println(f.fetch("tennis ball"));

	}	

}
