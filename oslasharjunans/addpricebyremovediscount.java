package oslasharjunans;

public class addpricebyremovediscount {

	public static double addpricebyremovedis(String item, double[] totaldiscount) {
		String p[] = item.split(" ");
		String itemname = p[0];
		int itemquantity = Integer.valueOf(p[1]);
		pair pp = Geektrust.allproducts.get(itemname);
		int itemprice = pp.price;
		double discountitem = (double) pp.discount;
		double cost = (double) itemquantity * (double) itemprice;

	

		double discountprice = (double) (discountitem / 100) * cost;

		totaldiscount[0] += discountprice;
		cost -= discountprice;
		return cost;
			
		
		

//		double discountprice = (double) (discountitem / 100) * cost;
//		discountprice += 5 * (double) cost / (double) 100;
//		totaldiscount[0] += discountprice;
//		cost -= discountprice;
//		return cost;

	}

}
