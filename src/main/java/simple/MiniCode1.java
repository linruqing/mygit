package main.java.simple;

/**
 * 题目1,最简单实现,不考虑后续算法扩展的实现
 * 
 * @author linruqing
 *
 */
public class MiniCode1 {

	public static void pintFizzOrBuzzOrFizzBuzz(int number) {
		if (number <= 0 || number > Integer.MAX_VALUE) {
			System.out.println("number passed must be bigger then 0 or less than Integer.MAX_VALUE !");
			return;
		}
		for (int i = 1; i <= number; i++) {
			boolean dividendIsThree = i % 3 == 0;
			boolean dividendIsFive = i % 5 == 0;
			if ((dividendIsThree && dividendIsFive)) {// 能同时被3,5整除打印FizzBuzz
				System.out.println("FizzBuzz");
				continue;
			} else if (dividendIsThree) {// 能被3整除,打印Fizz
				System.out.println("Fizz");
				continue;
			} else if (dividendIsFive) {// 能被5整除,打印Fizz
				System.out.println("Buzz");
				continue;
			} else {
				System.out.println(i);
			}

		}
	}
}
