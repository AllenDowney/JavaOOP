/**
 * Animal superclass, inherited by Cat and Dog.
 */
public class Animal {
    private int size;
    private String name;

    /**
     * Makes the animal noise.
     */
    public void makeNoise() {
        System.out.println("Generic animal noise");
    }

    /**
     * Compares size of this animal to another animal.
     * If this animal is larger, returns true. Otherwise, false.
     */
    public Boolean isBigger(Animal otherAnimal) {
        if (this.size > otherAnimal.getSize()) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Having size and name as private is an important Java style guideline, but we want to be
     * able to set those values. As such, getters and setters are used for those values and can
     * be easily called: AnimalObject.getSize() would return a saved value and AnimalObject.setSize(5)
     * would set that size to a new value, 5.
     */
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
