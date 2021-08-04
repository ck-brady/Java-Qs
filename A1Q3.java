//Student name: Charie Brady

import java.util.Scanner;

public class A1Q3 {
	
	public static void main(String[] args) 
	{
		String input = "";
		String[] items;
		String[] tmp;
		Item[] items_list;
		
		// This program takes a list of String items and int item quantities from the user. 
		// It then creates an Item object to store the data for each data entered.
		// If items != quantities, then items will be entered "unknown" or quantities entered as 0.
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Please enter the items names separated by commas :");
		input = scanner.nextLine();
		items = input.split(",");	
		
		System.out.println("Please enter the items quantities separated by commas :");
		input = scanner.nextLine();
		tmp = input.split(",");	

		int[] quantities = new int[tmp.length];
		for(int i = 0; i < tmp.length; i++){
			quantities[i] = Integer.parseInt(tmp[i]);
		}		
		
		// Two cases to consider. If items entered equal or exceed quantities, or quantities entered exceed items. 
		// These two cases are handled by setting the loop to the larger list, and entering unknown values when 
		// the index is larger than length of smaller array. 
		
		if ( items.length >= quantities.length ){
			items_list = new Item[items.length];
			for ( int i = 0; i < items.length; i++ ) {
				if ( i >= quantities.length ) {
					items_list[i] = new Item(items[i], 0);
				} else {
					items_list[i] = new Item(items[i], quantities[i]);
				}
			}
		} else {
			items_list = new Item[quantities.length];
			for ( int i = 0; i < quantities.length; i++ ) {
				if ( i >= items.length ) {
					items_list[i] = new Item("Unknown", quantities[i]);
				} else {
					items_list[i] = new Item(items[i], quantities[i]);
				}
			}	
		}
		
		// Loop to display individual Item objects.
		
		for ( int i = 0; i < items_list.length; i++ ) {
			items_list[i].display();
		}

	}
}

class Item {
  
    private String name;
    private int quantity;
  
    // Item class constructor
    Item(String name, int quantity)
    {
        this.name = name;
		this.quantity = quantity;
	}
    // display() method to display Item information
    public void display()
    {
        System.out.print(this.name + " : " + this.quantity+" - ");
    }  
}