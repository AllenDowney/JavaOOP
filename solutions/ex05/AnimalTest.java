/**
 * Tester for Dog, Cat, and Animal classes.
 */
public class AnimalTest {
    public static void main(String[] args) {
        // create the individual objects default constructor
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Animal a1 = new Animal();

        // call each objects noise method
        d1.makeNoise();
        c1.makeNoise();
        a1.makeNoise();

        // add sizes
        d1.setSize(5);
        c1.setSize(6);
        a1.setSize(7);

        // compare sizes
        System.out.println(d1.isBigger(a1));
        System.out.println(a1.isBigger(c1));
    }
}
