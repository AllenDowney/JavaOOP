/**
 * 
 */
package net.kmcconnaughay.homework_03;

/**
 * @author Kyle McConnaughay
 *
 */

import java.util.ArrayList;

public class AnimalPack {
	
	/** An array of animals */
    private ArrayList<Animal> animals;

    /** Initializes the private variable animals
     * @param size    length of the dogs array
     */
    public void makeArray (int size) {
    	animals = new ArrayList<Animal>();
    }

    /** Adds a dog object to the dogs array
     * @param index    index at which to add the Dog() object
     * @param animal   Animal() object to be added to dogs array
     */
    public void addAnimal (int index, Animal animal) {
    	this.animals.add(animal);
    }
	
	/** Calls makeNoise() on each animal in the AnimalPack
	 * 
	 */
	public void makeNoise() {
		for (int i = 0; i < this.animals.size(); i++) {
			this.animals.get(i).makeNoise();
		}
	}
	
	
	/** Returns the largest animal in the AnimalPack
	 * @return  Animal() or null if (this.animals.size() == 0)
	 */
	public Animal biggestAnimal() {
		
		// If no animals have been added
		if (this.animals.size() == 0) {
			return null;
		} else {
			Animal largest = this.animals.get(0);
			Animal current;
			
			// Iterate through the array
			for (int i = 1; i < this.animals.size(); i++) {
				current = this.animals.get(i);
				
				// If the current animal is bigger, reset largest
				if (current.isBigger(largest)) {
					largest = current;
				}
			}
			
			return largest;
		}
		
		
	}
}
