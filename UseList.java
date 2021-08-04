/*******************************/
/*Student full name: Charie Brady
/*******************************/
public class UseList {

    private static LinkedList<Integer> getList() {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.addLast(8);
        l.addLast(2);
        l.addLast(1);
		l.addLast(6);
		l.addLast(9);
		l.addLast(3);
		l.addLast(7);
		l.addLast(4);
		l.addLast(5);
        return l;
    }
	
    private static void testCase1() {
        System.out.println("testCase1: list with multiple elements    [used l.isComprisedBetween(5,7)]");
        LinkedList<Integer> l = getList();
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(5,7));

        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }



    private static void testCase2() {

		System.out.println("testCase2: empty list    [used l.isComprisedBetween(5,7)]");
		LinkedList<Integer> l = new LinkedList<Integer>();
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(5,7));
        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }

    private static void testCase3() {
		System.out.println("testCase3: one element in list     [used l.isComprisedBetween(5,7)]");
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addLast(6);
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(5,7));
        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }
	
    private static void testCase4() {

		System.out.println("testCase4: v1 and v2 don't exist in list     [used l.isComprisedBetween(-1,100)]");
        LinkedList<Integer> l = getList();
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(-1,100));
        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }

    private static void testCase5() {
		System.out.println("testCase5: already ordered list     [used l.isComprisedBetween(0,50)]");
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addLast(10);
		l.addLast(20);
		l.addLast(35);
		l.addLast(40);
		l.addLast(55);
		l.addLast(70);
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(0,50));		
        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }

    private static void testCase6() {

		System.out.println("testCase6: all elements outside of range     [used l.isComprisedBetween(90,100)]");
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addLast(1);
		l.addLast(22);
		l.addLast(-4);
		l.addLast(88);
		l.addLast(-10);
		l.addLast(72);
		l.addLast(9);
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(90,100));	
        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }

    private static void testCase7() {
		System.out.println("testCase7: all elements inside of range     [used l.isComprisedBetween(-10,100)]");
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addLast(1);
		l.addLast(22);
		l.addLast(-4);
		l.addLast(88);
		l.addLast(-10);
		l.addLast(72);
		l.addLast(9);
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(-10,110));	
        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }
	
    private static void testCase8() {
		System.out.println("testCase8: v1 and v2 are equal     [used l.isComprisedBetween(5,5)]");
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addLast(2);
		l.addLast(8);
		l.addLast(10);
		l.addLast(0);
		l.addLast(5);
		l.addLast(1);
		l.addLast(4);
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(5,5));	
        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }	
	
    private static void testCase9() {
		System.out.println("testCase9: duplicate elements   [used l.isComprisedBetween(5,7)]");
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addLast(6);
		l.addLast(6);
		l.addLast(2);
		l.addLast(5);
		l.addLast(1);
		l.addLast(0);
		l.addLast(6);
		l.addLast(10);		
		l.addLast(5);
		l.addLast(1);
		l.addLast(4);
		l.addLast(0);
		l.addLast(7);
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(5,7));	
        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }	
	
    private static void testCase10() {
		System.out.println("testCase10: all the same   [used l.isComprisedBetween(5,10)]");
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addLast(8);
		l.addLast(8);
		l.addLast(8);
		l.addLast(8);
		l.addLast(8);
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(5,10));	
        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }
	
    private static void testCase11() {
		System.out.println("testCase11: two elements in list   [used l.isComprisedBetween(1,3)]");
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addLast(5);
		l.addLast(3);
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(1,3));	
        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }
	
    private static void testCase12() {
		System.out.println("testCase10: v1 > v2   [used l.isComprisedBetween(5,1)]");
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.addLast(2);
		l.addLast(8);
		l.addLast(10);
		l.addLast(0);
		l.addLast(5);
		l.addLast(1);
		l.addLast(4);
        System.out.println("initial list: " + l);
        System.out.println("new list: "+l.isComprisedBetween(5,1));	
        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }
	
    public static void main(String[] args) {
		
		System.out.println("-------------------------------------");
		System.out.println("* Student name: Charie Brady        *");
		System.out.println("* Student number: 300043672         *");
		System.out.println("-------------------------------------");


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
