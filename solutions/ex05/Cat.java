/**
 * Cat class, subclass of Animal.
 */
public class Cat extends Animal {
    private int size;
    private String name;

    /**
     * Makes the cat noise.
     */
    public void makeNoise() {
        System.out.println("Meow");
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
