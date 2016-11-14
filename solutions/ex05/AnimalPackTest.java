/**
 * Tests the different aspects of an AnimalPack.
 */
public class AnimalPackTest {
    public static void main(String[] args) {
        // create a couple different animal objects
        AnimalPack pack = new AnimalPack();
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Cat c1 = new Cat();
        Cat c2 = new Cat();

        // test biggest animal
        d1.setSize(5);
        d2.setSize(10);
        c1.setSize(15);
        c1.setSize(3);

        // add the animals to the pack
        pack.addAnimal(d1, 0);
        pack.addAnimal(c1, 1);
        pack.addAnimal(d2, 2);
        pack.addAnimal(c2, 3);

        // make some noise
        pack.makeNoise();

        // print out biggest animal
        System.out.println(pack.biggestAnimal());
    }
}
