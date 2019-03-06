package main.java.strategy;

import java.util.ArrayList;
import java.util.List;

public class PrintContext {
	private List<PrintStrategy> strategyList = new ArrayList<>();

	public PrintContext addStrategy2List(PrintStrategy strategy) {
		this.strategyList.add(strategy);
		return this;
	}

	public void excute(int num) {
		boolean f = false;// 标识位
		for (int i = 0, j = strategyList.size(); i < j; i++) {
			PrintStrategy strategy = strategyList.get(i);
			f = strategy.isSatisfyAndPrint(num);
			if (f) {// 条件符合,会使用对应的策略处理
				break;
			}
		}
		if (!f) {// 没有策略处理，直接打印数字
			System.out.println(num);
		}

	}
}
