/**
 *Tests Dog and Cat.
 *
 *@author Rachel Boy
 */

public class DogTestDrive {

    /**
     *Finds the biggest dog in an array.
     *
     *@param dogs An array containing Dogs
     *@return The Dog with the largest size
     */
    public static Dog biggestDog(Dog[] dogs) {
        Dog biggest = dogs[0];
        for (int x=0; x<dogs.length; x++) {
            if (dogs[x].getSize() > biggest.getSize()) {
                biggest = dogs[x];
            }
        }
        return biggest;
    }

	public static void main(String[] args) {
	    Dog d = new Dog();
	    d.setSize(10);
	    System.out.printf("Should print 10: %d \n", d.getSize());
	    Dog d2 = new Dog();
	    d2.setSize(12);
	    System.out.printf("Should print false: %b \n", d.isBigger(d2));
	    System.out.printf("Should print true: %b \n", d2.isBigger(d));

	    int[] sizes = {1,2,3,4,5};
	    DogPack dp = new DogPack();
	    Dog d3;
	    dp.makeArray(sizes.length);
	    for(int i=0; i<sizes.length; i++) {
            d3 = new Dog();
            d3.setSize(sizes[i]);
            dp.addDog(d3,i);
	    }
	    dp.print();
	    Dog biggest = dp.biggestDog();
	    System.out.printf("Biggest Dog Size: %d \n", biggest.getSize());
	}	
}
