/**
 *Parent class for animals, 
 *child classes must implement bark().
 *Modified from Head First Java.
 *
 *@author Rachel Boy
 */

abstract class Animal {

    private int size;
    String breed;
    String name;

    /**
     *Should display the animal's typical noise
     */
    abstract void bark();

    /**
     *Gets the size.
     *
     *@return the size of this
     */
    int getSize () {
        return size;
    }

    /**
     *Sets the size.
     *
     *@param size an integer size
     */
    void setSize (int size) {
        if(size > 0) {
            this.size = size;
        }
    }

    /**
     *Indicates if the parameter animal is bigger than the current animal.
     *
     *@param animal an Animal to compare sizes with
     *@return true if this is bigger, false if otherwise
     */
    boolean isBigger(Animal animal) {
        if (this.getSize() > animal.getSize()) {
            return true;
        }
        return false;
    }
}
