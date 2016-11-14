import java.util.ArrayList;

/**
 * Make a pack of multiple animals, stored in an array.
 */

public class AnimalPack {
    private ArrayList<Animal> animals;

    /**
     * Constructor used to make the array and store it as animals.
     */
    public AnimalPack() {
        animals = new ArrayList<>();
    }

    /**
     * Puts an animal at the specified position in the pack.
     */
    public void addAnimal(Animal animal, int index) {
	    animals.add(index, animal);
    }


    /**
     * Prints the noise of every animal in the pack.
     */
    public void makeNoise() {
	    for (Animal animal : animals) {
            animal.makeNoise();
	    }
    }


    /**
     * Finds the largest animal in the pack.
     */
    public Animal biggestAnimal() {
	    Animal biggest = animals.get(0);
	    for (Animal animal : animals) {
	        if (animal.isBigger(biggest))
		        biggest = animal;
        }
        return biggest;
    }
}