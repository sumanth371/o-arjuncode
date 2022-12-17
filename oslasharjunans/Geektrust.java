package oslasharjunans;

import java.util.*;

class pair {
	int price;
	int discount;
	int maxquantity;

	pair(int p, int d, int quan) {
		price = p;
		discount = d;
		maxquantity = quan;
	}
}

public class Geektrust {
	static HashMap<String, pair> allproducts = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		allproducts.put("TSHIRT", new pair(1000, 10, 2));
		allproducts.put("JACKET", new pair(2000, 5, 2));
		allproducts.put("CAP", new pair(500, 20, 2));
		allproducts.put("NOTEBOOK", new pair(200, 20, 3));
		allproducts.put("PENS", new pair(300, 10, 3));
		allproducts.put("MARKERS", new pair(500, 5, 3));

		Scanner sc = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<>();

		while (true) {
			
			String item = sc.nextLine();
			if (item.equals("PRINT_BILL")) {

				mainlogic.excutelogic(input);

				break;
			}
			String[]d=item.split(" ");
		
			StringBuilder sb=new StringBuilder();
			sb.append(d[1]);
			sb.append(" ");
			sb.append(d[2]);
			input.add(sb.toString());
			
			

		}
		
		sc.close();
	}

}
