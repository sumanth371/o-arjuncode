excutelogic() fuction  that takes an ArrayList of Strings as input and calculates and prints the total discount, tax, and amount to be paid for the items in the list.

The method starts by declaring a variable price that will hold the total price of the items in the list, and an array totaldiscount that will hold the total discount applied to the items. The method then iterates over the Strings in the input ArrayList and checks if each String is a valid item by calling the isvalid method. If the String is a valid item, the method splits the String into its item name and quantity, retrieves the price of the item from a Map called allproducts, and adds the total price of the item to the price variable.

If the total price of the items is less than 1000, the method applies a 10% discount to the total price, prints the total discount and the total amount to be paid, and returns. Otherwise, the method iterates over the Strings in the input ArrayList again, calls the "addpricebyremovedis" method on each String, and adds the returned price to the price variable. If the total price after applying the discounts is greater than or equal to 3000, the method applies an additional 5% discount to the total price. Finally, the method adds a 10% sales tax to the total price, prints the total discount and the total amount to be paid, and returns.




addpricebyremovedis() method that takes a String and an array of doubles as input and returns the price of the item after applying a discount.

The method starts by splitting the input String into its item name and quantity, retrieves the price and discount of the item from a Map called allproducts, and calculates the cost of the item. It then calculates the discount price by multiplying the discount percentage by the cost, adds the discount price to the total discount in the input array, and subtracts the discount price from the cost. Finally, the method returns the cost.


