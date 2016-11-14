/**
 * Dog class, subclass of Animal.
 */
public class Dog extends Animal {
    private int size;
    private String name;

    /**
     * Makes the animal noise.
     */
    public void makeNoise() {
        System.out.println("Woof");
    }

    /**
     * See comments in superclass.
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
