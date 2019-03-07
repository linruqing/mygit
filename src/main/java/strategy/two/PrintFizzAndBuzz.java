package main.java.strategy.two;

public class PrintFizzAndBuzz implements PrintStrategy {

	@Override
	public boolean isSatisfyAndPrint(int num) {
		boolean f1 = num % 3 == 0;
		boolean f2 = String.valueOf(num).indexOf("3") > -1;
		boolean f3 = num % 5 == 0;
		boolean f4 = String.valueOf(num).indexOf("5") > -1;
		if (f1&&f3 || f2&&f4) {//能同时被3,5整除或者包含3,5的打印FizzBuzz
			System.out.println("FizzBuzz");
			return true;
		}
		return false;
	}
}
