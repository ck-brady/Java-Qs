import java.util.*;
public class DynamicArrayStack<E> implements Stack<E> {

    // Instance variables

    private E[] elems;  // Used to store the elements of this ArrayStack
    private int top;    // Designates the first free cell
    private static final int DEFAULT_INC = 25;   //Used to store default increment / decrement

    @SuppressWarnings( "unchecked" )

    // Constructor
    public DynamicArrayStack( int capacity ) {
        top = 0;
		if(capacity < DEFAULT_INC){
			elems = (E[]) new Object[ DEFAULT_INC ];
		} else {
			elems = (E[]) new Object[ capacity ];
		}
    }

    // Gets current capacity of the array
    public int getCapacity() {
        return elems.length;
    }

    // Returns true if this DynamicArrayStack is empty
    public boolean isEmpty() {
        return ( top == 0 );
    }

    // Returns the top element of this ArrayStack without removing it
    public E peek() {
        if(isEmpty()){
			throw new EmptyStackException();
		} 
        return elems[ top-1 ];
    }

    @SuppressWarnings( "unchecked" )

    // Removes and returns the top element of this stack
    public E pop() {
		E saved = null;
        if(isEmpty()){
			throw new EmptyStackException();
		} else{
			saved = elems[ --top ];
			elems[ top ] = null;
		}
		if((getCapacity() - top) >= DEFAULT_INC){
			E[] elems_new = (E[]) new Object[ getCapacity() - DEFAULT_INC ];
			for(int i = 0; i < (getCapacity() - DEFAULT_INC); i++){
				elems_new[i] = elems[i];
			}
			elems = elems_new;
		}		
		return saved;
		
	}

    @SuppressWarnings( "unchecked" )

    // Puts the element onto the top of this stack.
    public void push( E element ) {
        if ( getCapacity() == (top+1) ) {
			E[] elems_new = (E[]) new Object[ getCapacity() + DEFAULT_INC ];
			for(int i = 0; i < getCapacity(); i++){
				elems_new[i] = elems[i];
			}
			elems = elems_new;
		}
		elems[ top++ ] = element;
    }

    @SuppressWarnings( "unchecked" )

    public void clear() {
        int cap = getCapacity();
		cap = cap%DEFAULT_INC + DEFAULT_INC;
        E[] elems_new = (E[]) new Object[ cap ];
		elems = elems_new;
        top = 0;		
    }

}
