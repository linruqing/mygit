package main.java.strategy.one;

public class ThreeDivideOperation implements Operation {

	@Override
	public boolean isSatisfy(int num) {
		return num % 3 == 0;
	}

}
