/*******************************/
/*Student full name: Charie Brady
/*******************************/
public class UseDoublyLinkedList {
  
    private static void testCase1() {
		System.out.println("testCase1: someList is empty     ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		mainList.addLast("A");
		mainList.addLast("B");
		mainList.addLast("beforeMe");
		mainList.addLast("C");
		mainList.addLast("D");
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		System.out.println("Some List: " + someList);
		
		String elem = "beforeMe";
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
    }

    private static void testCase2() {
		System.out.println("testCase2: one occurence of 'beforeMe'  (middle position)   ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		mainList.addLast("A");
		mainList.addLast("B");
		mainList.addLast("beforeMe");
		mainList.addLast("C");
		mainList.addLast("D");
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		someList.addLast("Panther");
		someList.addLast("Bear");
		someList.addLast("Orca");
		System.out.println("Some List: " + someList);
		
		String elem = "beforeMe";
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
    }
	
    private static void testCase3() {
		System.out.println("testCase3: one occurence of 'beforeMe'  (head position)   ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		mainList.addLast("beforeMe");
		mainList.addLast("A");
		mainList.addLast("B");
		mainList.addLast("C");
		mainList.addLast("D");
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		someList.addLast("Panther");
		someList.addLast("Bear");
		someList.addLast("Orca");
		System.out.println("Some List: " + someList);
		
		String elem = "beforeMe";
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
    }

    private static void testCase4() {
		System.out.println("testCase4: one occurence of 'beforeMe'  (tail position)   ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		mainList.addLast("A");
		mainList.addLast("B");
		mainList.addLast("C");
		mainList.addLast("D");
		mainList.addLast("beforeMe");
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		someList.addLast("Panther");
		someList.addLast("Bear");
		someList.addLast("Orca");
		System.out.println("Some List: " + someList);
		
		String elem = "beforeMe";
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
    }
	
    private static void testCase5() {
		System.out.println("testCase5: 'beforeMe' doesn't exist     ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		mainList.addLast("A");
		mainList.addLast("B");
		mainList.addLast("C");
		mainList.addLast("D");
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		someList.addLast("Panther");
		someList.addLast("Bear");
		someList.addLast("Orca");
		System.out.println("Some List: " + someList);
		
		String elem = "beforeMe";
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
    }
	
	
    private static void testCase6() {
		
		System.out.println("testCase6: beforeMe param is null      ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		mainList.addLast("A");
		mainList.addLast("B");
		mainList.addLast("beforeMe");		
		mainList.addLast("C");
		mainList.addLast("D");
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		someList.addLast("Panther");
		someList.addLast("Bear");
		someList.addLast("Orca");
		System.out.println("Some List: " + someList);
		
		String elem = null;
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
		
    }
	
    private static void testCase7() {
		System.out.println("testCase7: all 'beforeMe'      ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		mainList.addLast("beforeMe");
		mainList.addLast("beforeMe");
		mainList.addLast("beforeMe");
		mainList.addLast("beforeMe");
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		someList.addLast("Panther");
		someList.addLast("Bear");
		someList.addLast("Orca");
		System.out.println("Some List: " + someList);
		
		String elem = "beforeMe";
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
    }

    private static void testCase8() {
		System.out.println("testCase8: multiple occurences of 'beforeMe'     ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		mainList.addLast("beforeMe");		
		mainList.addLast("A");
		mainList.addLast("B");
		mainList.addLast("beforeMe");		
		mainList.addLast("C");
		mainList.addLast("D");
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		someList.addLast("Panther");
		someList.addLast("Bear");
		someList.addLast("Orca");
		System.out.println("Some List: " + someList);
		
		String elem = "beforeMe";
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
		
    }

    private static void testCase9() {
		System.out.println("testCase9: Main List is empty      ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		someList.addLast("Panther");
		someList.addLast("Bear");
		someList.addLast("Orca");
		System.out.println("Some List: " + someList);
		
		String elem = "beforeMe";
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
    }

    private static void testCase10() {
		System.out.println("testCase10: long lists with different names    ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		mainList.addLast("Canada");
		mainList.addLast("A");
		mainList.addLast("B");	
		mainList.addLast("C");
		mainList.addLast("D");
		mainList.addLast("Canada");
		mainList.addLast("E");
		mainList.addLast("F");
		mainList.addLast("Canada");		
		mainList.addLast("G");
		mainList.addLast("H");		
		mainList.addLast("I");	
		mainList.addLast("J");	
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		someList.addLast("Panther");
		someList.addLast("Bear");
		someList.addLast("Snake");
		someList.addLast("Panda");
		someList.addLast("Dolphin");
		someList.addLast("Orca");
		someList.addLast("Turtle");
		System.out.println("Some List: " + someList);
		
		String elem = "Canada";
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
    }	


    private static void testCase11() {
		System.out.println("testCase11: one element in list (beforeMe)    ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		mainList.addLast("beforeMe");
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		someList.addLast("Panther");
		someList.addLast("Bear");
		someList.addLast("Orca");
		System.out.println("Some List: " + someList);
		
		String elem = "beforeMe";
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
    }	
	
    private static void testCase12() {
		System.out.println("testCase12: one element in list (not beforeMe)    ");
		DoublyLinkedList<String> mainList = new DoublyLinkedList<String>();
		mainList.addLast("A");
		System.out.println("Main List: " + mainList);
		
		DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
		someList.addLast("Panther");
		someList.addLast("Bear");
		someList.addLast("Orca");
		System.out.println("Some List: " + someList);
		
		String elem = "beforeMe";
		System.out.println("Word: " + elem);
		
		mainList.addSpecific(elem, someList);
		System.out.println("Main List AFTER: " + mainList);
		System.out.println("Some List AFTER: " + someList);		
        System.out.println();
    }	

  
  public static void main(String[] args) {

	 System.out.println("-------------------------------------");
	 System.out.println("* Student name: Charie Brady        *");
	 System.out.println("* Student number: 300043672         *");
	 System.out.println("-------------------------------------");
	 System.out.println();
    
	 testCase1();
	 
	 testCase2();

	 testCase3();
	 
	 testCase4();

	 testCase5();

	 testCase6();

	 testCase7();

	 testCase8();

	 testCase9();
	 
	 testCase10();

	 testCase11();
	 
	 testCase12();
 
  }
}
