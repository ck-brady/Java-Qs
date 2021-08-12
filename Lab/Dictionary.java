import java.util.*;

public class Dictionary implements Map<String, Integer> {

    private final static int INITIAL_CAPACITY = 10;
    private final static int INCREMENT = 5;
    
	// instance variables
	private int count;
    private Pair[] elems;

    public int getCount() {
      return count;
    }

    public int getCapacity() {
      return elems.length;
    }

    public Dictionary() {
        elems = new Pair[INITIAL_CAPACITY];
		count = 0;
    }

    @Override
    public void put(String key, Integer value) throws NullPointerException{
		if(key == null || value == null){
			throw new NullPointerException("Key or value is null.");
		} else {
			if(getCapacity() == count){
				increaseCapacity();
			}
			elems[count++] = new Pair(key, value);
		}
    }

    private void increaseCapacity() {
        Pair[] new_elems = new Pair[ getCapacity() + INCREMENT ];
		for(int i = 0; i < getCapacity(); i++){
			new_elems[i] = elems[i];
		}
		elems = new_elems;
    }

    @Override
    public boolean contains(String key) throws NullPointerException{
		boolean contains = false;
		if(key == null){
			throw new NullPointerException("Key is null.");
		} else {
			if(count > 0) {
				for(int i = 0; i < count; i++){
					if( elems[i].getKey() == key ) {
						contains = true;
						break;
					}
				}
			}
		}
		return contains;
    }

    @Override
    public Integer get(String key) throws NullPointerException, NoSuchElementException {
		Integer value = null;
		if(key == null){
			throw new NullPointerException("Key is null.");
		} else {
			if(count > 0){		
				for(int i = (count - 1); i >= 0; i--){
					if(elems[i].getKey() == key){
						value= elems[i].getValue();
						break;
					}
				}
			}
		}
		if(value == null){
			throw new NoSuchElementException("No such element exists: " + key);
		}
		return value;
    }

    @Override
    public void replace(String key, Integer value) throws NullPointerException, NoSuchElementException{
		boolean exists = false;
		if(key == null || value == null){
			throw new NullPointerException("Key or value is null.");
		} else {
			if(count > 0){
				for(int i = (count - 1); i >= 0; i--){
					if(elems[i].getKey() == key){
						elems[i].setValue(value);
						exists = true;
						break;
					}
				}
			}
		}
		if(exists == false){
			throw new NoSuchElementException("No such element exists.");
		}
    }

    @Override
    public Integer remove(String key) throws NullPointerException, NoSuchElementException {
		Integer value = null;
		if(key == null){
			throw new NullPointerException("Key is null.");
		} else {
			if(count > 0){		
				for(int i = (count - 1); i >= 0; i--){
					if(elems[i].getKey() == key){
						value= elems[i].getValue();
						elems[i] = null;
						for(int j = i; j < (count - 1); j++){
							elems[j] = elems[j+1];
							elems[j+1] = null;
						}
						count--;
						break;
					}
				}
			}
		}
		if(value == null){
			throw new NoSuchElementException("No such element exists.");
		}
		return value;
    }

    @Override
    public String toString() {
      String res;
      res = "Dictionary: {elems = [";
      for (int i = count-1; i >= 0 ; i--) {
          res += elems[i];
          if(i > 0) {
              res += ", ";
          }
      }
      return res +"]}";
    }

}
