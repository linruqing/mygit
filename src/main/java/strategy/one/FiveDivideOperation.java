package main.java.strategy.one;

public class FiveDivideOperation implements Operation {

	@Override
	public boolean isSatisfy(int num) {
		return num % 5 == 0;
	}

}
