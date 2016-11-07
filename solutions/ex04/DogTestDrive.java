/**
 * @author Sam Becht
 * The Animal class is the superclass of Dog and Cat
 * Each animal has size, breed, name and can bark
**/

import java.util.ArrayList;

class Animal {
    
    private int size;
    String breed;
    String name;

    void bark() {
    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

    public boolean isBigger(Animal that) {
	return (this.size > that.size);
    }
}

class Dog extends Animal {
    /** Extends Animal and overrides bark **/
    void bark() {
	System.out.println("Ruff! Ruff!");
    }
}

class DogPack {

    // private Dog[] dogs;
    private ArrayList<Dog> dogs;

    public void makeArray(int num) {
        this.setDogs(new ArrayList<Dog>());//Dog[num]);
	}
    
    public ArrayList<Dog> getDogs() {
        return dogs;
    }
   
    public void setDogs(ArrayList<Dog> dogs) {
        this.dogs = dogs;
    }

    public void addDog(int index, Dog d) {
        this.dogs.add(d);
    }

    /**
     * @param dogs
     * @return biggest dog in DogPack
     **/
    public Dog biggestDog(ArrayList<Dog> dogs) {
        Dog largestDog = dogs.get(0);	
        for (Dog doggie : dogs) {
            if (doggie.isBigger(largestDog)) {
                largestDog = doggie;
            }
        }
        return largestDog;
    }
}


class Cat extends Animal {
    /** Extends Animal and overrides bark **/
    void bark() {
        System.out.println("I'm a cat");
    }
}

class DogTestDrive {
    /** Tests the Dog and Cat classes
     **/
    public static void main (String[] args) {
        /** Tests by creating new Cat and Dog objects, 
            assigning instance variables and invoking bark
        **/
        Dog d = new Dog();
        d.setSize(40);
        d.bark();
        Dog fido = new Dog();
        fido.setSize(15);

        System.out.println(fido.isBigger(d));

        DogPack s = new DogPack();
       	s.makeArray(3);
        int[] arr = {15,40,30};
        int index = 0;
        for (int size : arr) {
            Dog newdog = new Dog();
            newdog.setSize(size);
            s.addDog(index, newdog);
            index++;
        }

        for (Dog doggie : s.getDogs()) {
            System.out.println(doggie.getSize());
        }
        System.out.print("The largest dog weighs ");
        System.out.println(s.biggestDog(s.getDogs()).getSize());
    }
}
