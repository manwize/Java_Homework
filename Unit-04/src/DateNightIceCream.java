/**
 * Supply the indicated code.
 */

public class DateNightIceCream {

	public static void main(String[] args) {

		Serving hers = new Serving(Flavor.BITTERSWEET, ConeCup.CONE, 1);
		Serving his = new Serving(Flavor.CHOCOLATE_SWIRL, ConeCup.CUP, 2);
		
		DateNightOrder DateNightOrder = new DateNightOrder();
		DateNightOrder.setHers(hers);
		DateNightOrder.setHis(his);
		 
		System.out.println(DateNightOrder);
		
	}
}
