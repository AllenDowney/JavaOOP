/**
 *Hold many Dogs in a pack
 *
 *@author Rachel Boy
 */

public class DogPack {

    private java.util.ArrayList<Dog> dogs;

    /**
     *Initializes dog array at the given size
     *
     *@param size the number of Dogs in the array
     */
    public void makeArray(int size) {
	dogs = new java.util.ArrayList<Dog>();    
    }


    /**
     *Puts a dog at the specified position in the pack
     *
     *@param dog The dog to insert
     *@param index The index to insert the dog at
     */
    public void addDog(Dog dog, int index) {
	dogs.add(index,dog);
    }


    /**
     *Prints the size of every dog in the pack,
     *in the order stored.
     */
    public void print() {
	for(Dog dog : dogs) {
	    System.out.printf("Size: %d\n",dog.getSize());
	}
    }


    /**
     *Finds the largest dog in the pack
     *
     *@return largest dog in the pack
     */
    public Dog biggestDog() {
	Dog biggest = dogs.get(0);
	for(Dog dog : dogs) {
	    if(dog.isBigger(biggest))
		biggest = dog;
	}
	return biggest;
    }
}