package main.java.strategy.two;

/**
 * 使用策略模式
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
		PrintContext printContext = new PrintContext();// 构建上下文
		printContext.addStrategy2List(new PrintFizzAndBuzz()).addStrategy2List(new PrintFizz())
				.addStrategy2List(new PrintBuzz());// 增加策略
		for (int i = 1; i <= number; i++) {
			printContext.excute(i);
		}
	}
}
