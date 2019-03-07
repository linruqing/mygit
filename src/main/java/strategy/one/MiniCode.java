package main.java.strategy.one;

/**
 * 使用适配器模式
 * 
 * @author linruqing
 *
 */
public class MiniCode {

	public static void pintFizzOrBuzzOrFizzBuzz(int number) {
		if (number <= 0 || number > Integer.MAX_VALUE) {
			System.out.println("number passed must be bigger then 0 or less than Integer.MAX_VALUE !");
			return;
		}
		Operation threeDive = new ThreeDivideOperation();
		Operation fiveDive = new FiveDivideOperation();
		Operation both = new BothDivideOperation(threeDive, fiveDive);

		for (int i = 1; i <= number; i++) {
			if (both.isSatisfy(i)) {
				System.out.println("FizzBuzz");
				continue;
			} else if (threeDive.isSatisfy(i)) {
				System.out.println("Fizz");
				continue;
			} else if (fiveDive.isSatisfy(i)) {
				System.out.println("Buzz");
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
