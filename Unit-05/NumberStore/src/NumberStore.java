public class NumberStore {

	private int num1 = 0;
	private int num2 = 0;
	private int num3 = 0;
	private int sum = 0;
	private int count = 0;
	//public int input;

	public NumberStore() {
		this.num1 = 90;
		this.num2 = 100;
		this.num3 = 210;
		this.sum = this.num1 + this.num2  + this.num3;

	}

	public void add() {
		System.out.println(num3 + " is the third number.");
		System.out.println((num3 - num3) + 1 + " is the count of numbers in numstore1.");
	}

	public int getSum() {
		return num1 + num2 + num3;
	}

	public int getCount() {
		count = (num1 - num1) + 1;
		count += (num2 - num2) + 1;
		count += (num3 - num3) + 1;
		return this.count;
	}

	public int getAvg() {
		// this.avg =
		return sum / 3;
	}

}
