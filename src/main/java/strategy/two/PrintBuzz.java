package main.java.strategy.two;

public class PrintBuzz implements PrintStrategy {

	@Override
	public boolean isSatisfyAndPrint(int num) {
		boolean f1 = num % 5 == 0;
		boolean f2 = String.valueOf(num).indexOf("5") > -1;
		if (f1 || f2) {// 能被5整除或者包含5的,打印Buzz
			System.out.println("Buzz");
			return true;
		}
		return false;
	}
}
