public class NumberStoreMain {

	public static void main(String[] args) {
		
		// NumberStore objects using constructors
		NumberStore numstore1 = new NumberStore(); // NumberStore object number one
		NumberStore numstore2 = new NumberStore(); // NumberStore object number two
		
		numstore1.add(); // Return a single number (num3 or third number)
		System.out.println(); // Blank line
		
		// |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
		
		// Output sum, average and count on three numbers	
		System.out.println(numstore2.getSum() + // Display sum
				" is the sum of the three numbers in numstore2.");
		
		System.out.println(numstore2.getAvg() + // Display average
				" is the average of the three numbers in numstore2.");
		
		System.out.println(numstore2.getCount() + // Display count
				" is the count of the three numbers in numstore2.");			
	}
}