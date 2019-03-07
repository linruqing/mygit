package main.java.strategy.two;

public class PrintFizz implements PrintStrategy {

	@Override
	public boolean isSatisfyAndPrint(int num) {
		boolean f1 = num % 3 == 0;
		boolean f2 = String.valueOf(num).indexOf("3") > -1;
		if (f1 || f2) {// 能被3整除或者包含3的,打印Fizz
			System.out.println("Fizz");
			return true;
		}
		return false;
	}
}
