package main.java.simple; 

/**
 * 最简单实现,不考虑后续算法扩展的实现
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
		for (int i = 1; i <= number; i++) {
			boolean dividendIsThree = i % 3 == 0;
			boolean dividendIsFive = i % 5 == 0; 
			boolean idxIsThree = String.valueOf(i).indexOf("3") > -1;
			boolean idxIsFive = String.valueOf(i).indexOf("5") > -1;

			if ((dividendIsThree && dividendIsFive) || (idxIsThree && idxIsFive)) {// 能同时被3,5整除或者包含3,5的打印FizzBuzz
				System.out.println("FizzBuzz");
				continue;
			} else if (dividendIsThree || idxIsThree) {// 能被3整除或者包含3的,打印Fizz
				System.out.println("Fizz");
				continue;
			} else if (dividendIsFive || idxIsFive) {// 能被5整除或者包含5的,打印Fizz
				System.out.println("Buzz");
				continue;
			} else {
				System.out.println(i);
			}

		}
	}
}
