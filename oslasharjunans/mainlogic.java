package oslasharjunans;

import java.util.ArrayList;

public class mainlogic {

	public static void excutelogic(ArrayList<String> input) {
		double price = 0;
		double[] totaldiscount = new double[1];
		totaldiscount[0] = 0;
		double sum=0;
		for(String item:input) {
            if(isvalid(item)) {
			String p[] = item.split(" ");
			String itemname = p[0];
			
			int itemquantity = Integer.valueOf(p[1]);
		
			if(Geektrust.allproducts.containsKey(itemname)) {
				pair c=Geektrust.allproducts.get(itemname);
				sum+=(double)itemquantity*c.price;
			}
            }
		}
		
		if(sum<1000) {
			double ans = 10 * (double) (sum / 100);
			System.out.print(ans);
		    sum+= ans;
			System.out.println("TOTAL_DISCOUNT" + " " + String.format("%.2f", totaldiscount[0]));
			System.out.println("TOTAL_AMOUNT_TO_PAY" + " " + String.format("%.2f", sum));
			return;
		}
		else {
		for (String item : input) {
			
			if (isvalid(item)) {
				price += addpricebyremovediscount.addpricebyremovedis(item, totaldiscount);
				System.out.println("ITEM_ADDED");
			} else {
				System.out.println("ERROR_QUANTITY_EXCEEDED");
			}

		}
		// System.out.print(price);
	
		double remaindiscount=0;
		if(price>=3000) {
			remaindiscount=(double)5*(double)(price/100);
		}
		totaldiscount[0]+=remaindiscount;
		price-=remaindiscount;
		double ans = 10 * (double) (price / 100);
	    price += ans;
		System.out.println("TOTAL_DISCOUNT" + " " + String.format("%.2f", totaldiscount[0]));
		System.out.println("TOTAL_AMOUNT_TO_PAY" + " " + String.format("%.2f", price));
		}
	}

	public static boolean isvalid(String item) {

		String p[] = item.split(" ");
	
		String itemname = p[0];

		int itemquantity = Integer.valueOf(p[1]);

		if (Geektrust.allproducts.containsKey(itemname)) {
			pair pp = Geektrust.allproducts.get(itemname);
			if (itemquantity <= pp.maxquantity) {
				return true;
			}

		}
		return false;
	}

}
