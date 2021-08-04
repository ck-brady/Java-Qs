/*******************************/
/*Student full name: Charie Brady
/*******************************/
public class LinkedList<E extends Comparable<E>>{

    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size=0;

    public boolean isEmpty() {
        return head == null;
		//or
		//return size == 0;
    }
	
    public void addFirst(E elem) {
        if (elem == null) {
            throw new NullPointerException();
        }
        head = new Node<E>(elem, head);
        size++;
    }

    public void addLast(E elem) {
        if (elem == null) {
            throw new NullPointerException();
        }
        if (head == null) {
            head = new Node<E>(elem, null);
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<E>(elem, null);
        }
        size++;
    }
	
	//adding at a specific index
    public void add(E elem, int index) {
        if (elem == null) {
            throw new NullPointerException();
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            head = new Node<E>(elem, head);
        } else {
            Node<E> p = head;
            for (int i=0; i<(index-1); i++) {
                p = p.next;
            }
            p.next = new Node<E>(elem, p.next);
        }
        size++;
    }

    public E removeFirst() {
        if (head == null) {
            throw new NullPointerException();
        }
        E saved = head.value;
        head = head.next;
        size--;
        return saved;
    }

    public E removeLast() {
        if (head == null) {
            throw new NullPointerException();
        }
        E saved;
        if (head.next == null) {
            saved = head.value;
            head = null;
        } else {
            Node<E> p = head;
            while (p.next.next != null) {
                p = p.next;
            }
            saved = p.next.value;
            p.next = null;
        }
        size--;
        return saved;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String str = "[";
        Node<E> p = head;
        while (p!=null) {
            if (p != head) {
                str += ", ";
            }
            str += p.value;
            p = p.next;
        }
        str += "]";
        return str;
    }
//*****************************************************	
//Do Not change anything above this line
//Add your code below this line
//*****************************************************

	//orderList() returns a list ordered in ascending order(smallest to greatest)
	//called by isComprisedBetween(E v1, E v2)
	
    public LinkedList<E> orderList(){                         // this method returns a new linked list in ascending order 
		LinkedList<E> orderedList = new LinkedList<E>();
		LinkedList<E> copy = new LinkedList<E>();
		for(int i = 0; i < this.size(); i++){                 // first, lines 127-140 copies the original list 
			if (copy.head == null) {
				copy.head = new Node<E>(this.head.value, null);
			} else {
				Node<E> current = copy.head;
				Node<E> p = this.head.next;
				while (current.next != null) {
					current = current.next;
					p = p.next;
				}
				current.next = new Node<E>(p.value, null);
			}
			copy.size++;
		}
		while(!copy.isEmpty()){                              // then, lines 141-171 sorts the copy in ascending order
			Node<E> p = copy.head;
			E min = copy.head.value;
			for(int i = 0; i < copy.size(); i++){            // lines 144-148 loop through and find min value in copy list 
				if(p.value.compareTo(min) < 0){
					min = p.value;
				}
				p = p.next;
			} 
			if (orderedList.head == null) {                  // then, lines 150-157 adds the min value to new ordered list
				orderedList.head = new Node<E>(min, null);
			} else {
				Node<E> current = orderedList.head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = new Node<E>(min, null);
			}
			orderedList.size++;
			p = copy.head;                                  // finally, lines 161-171 removes min value from copy list, then repeats until copy list is empty
			if(copy.head.value.compareTo(min) == 0){        // special case: if min is first in the list 
				copy.head = p.next;
				copy.size--;
			} else {
				for(int i = 0; i < copy.size()-1; i++){
					if(p.next.value.compareTo(min) == 0){
						p.next = p.next.next;
						copy.size--;
						break;
					}
					p = p.next;
				}
			}
		}
		return orderedList;	
	}

    public LinkedList<E> isComprisedBetween(E v1, E v2) {    // this method returns a new list containing the elements between the two values (inclusive) in ascending order
		LinkedList<E> newList = this.orderList();            // sort the list first
		Node<E> p = newList.head;                            // pointer to traverse list 
		int length = newList.size();
		int size = 0;
		for(int i = 0; i < length; i++){                     // traverse through the newList 
			if (p == null) {                                 // a stopping condition
				break;
			} else if (p.value.compareTo(v1) >= 0 && p.value.compareTo(v2) <= 0) {   // if element is inside range
				size++;
				try{
					if (p.next.value.compareTo(v2) > 0) {                            // if next value is outside range (larger), then end
					p.next = null;
					}
				} catch (NullPointerException e){};
			} else if ((p.value.compareTo(v1) < 0 || p.value.compareTo(v2) > 0) && p == newList.head) {  // outside range and top of list  			
				newList.head = p.next;
			}
			p = p.next;			
			newList.size = size;                                                      // update new size after each loop
		}
        return newList;
    }
	
}
