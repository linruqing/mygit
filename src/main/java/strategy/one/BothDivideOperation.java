package main.java.strategy.one;

public class BothDivideOperation implements Operation {
	private Operation operation1;

	private Operation operation2;

	public BothDivideOperation(Operation operation1, Operation operation2) {
		super();
		this.operation1 = operation1;
		this.operation2 = operation2;
	}

	@Override
	public boolean isSatisfy(int num) {
		if (operation1 == null || operation2 == null) {
			throw new UnsupportedOperationException("operation1 or operation2 is null !");
		}
		return operation1.isSatisfy(num) && operation2.isSatisfy(num);
	}

}
