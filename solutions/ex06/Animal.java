/**
 * 
 */
package net.kmcconnaughay.homework_03;

/**
 * @author kmcconnaughay
 *
 */

abstract public class Animal {
    private int size; 
    String breed;
    String name;
    
    public abstract void makeNoise ();
    
    public int getSize() {
    	return size;
    }
    
    public void setSize (int s) {
    	size = s;
    }
    
    /** Determines if this is bigger than other
     * @param other
     * @return true if this is bigger than other, false otherwise
     */
    public boolean isBigger (Animal other) {
    	if (other.getSize() >= this.getSize()) {
    		return false;
    	} else {
    		return true;
    	}
    }
}
