/*******************************/
/*Student full name: Charie Brady
/*******************************/
public class DoublyLinkedList<E>{

    private static class Node<T> {
        private T value;
        private Node<T> previous;
        private Node<T> next;
        private Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size;
	

    public void addLast(E elem) {
        if (elem == null) {
            throw new NullPointerException();
        }
        if (head == null) {
            head = new Node<E>(elem, null, null);
        } else {
			Node<E> p = head;
			while(p.next != null){
				p = p.next;
			}
            p.next = new Node<E>(elem, p, null);
        }
        size++;
    }
	
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
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
//Do Not change anything above this line
//**************************************************************************
// your code after this line

    public void addSpecific( E beforeMe, DoublyLinkedList<E> someList ) {   // method finds the last occurence of beforeMe and places last element of someList directly before it (returns 'not found' if beforeMe doesn't exist). 
	    if(!this.isEmpty() && !someList.isEmpty() && beforeMe != null){     // starting condition: no params can be empty/null 
			
			Node<E> search = this.head;                                     // lines 66-71 searches for an occurence of beforeMe in the main list
			boolean found = (search.value == beforeMe);
			while(search != null && !found){
				found = (search.value == beforeMe);
			    search = search.next;
		    }	
			if (!found){                                                    // if an occurence isn't found, print message and exit method. else continue to find last occurence
				System.out.println("- Specific element not found. -");
			} else {
				Node<E> p;                                                  // lines 75-90 finds/removes the last element of someList and assigns it to 'element'
				E element;
				if(someList.size() == 1){
					element = someList.head.value;
					someList.head = null;
					someList.size--;
				} else {
					p = someList.head;
					while(p.next != null){
						p = p.next;
					}
					element = p.value;
					p.previous.next = null;
					someList.size--;
				}		                                                                    
				p = this.head;                                         // lines 90-107 finds last occurrence to place element infront in main list, starting from back of list and working forward until an occurence is found                            
				while(p.next != null){                                 // traverse to back of list 
					p = p.next;
				}
				while(p.previous != null || p == this.head){           // traverse to front of list, stopping condition when reach the head (and allow through at head)
					if(p.value == beforeMe){                           
						if(p == this.head){                            // special case: beforeMe is at head of list, place element at head
							this.head.previous = new Node<E>(element, null, this.head);     
							this.head = this.head.previous;
							break;
						} else {                                      // else, element will be placed somewhere in middle  
							Node<E> tmp = p.previous;
							p.previous = new Node<E>(element, tmp, p);
							tmp.next = p.previous;
							break;
						}
					} else {
					p = p.previous;	
					}
				}
			}
		}
	}
}
 