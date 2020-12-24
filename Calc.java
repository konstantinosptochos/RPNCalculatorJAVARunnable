import java.util.Stack;
public class Calc {
	static Stack <Double> myStack = new Stack <Double>();
	public static void main(String[] args) {
		Operand op = new Operand(myStack);
		Adder add = new Adder(myStack);
		Subtractor sub = new Subtractor(myStack);
		Multiplier mul = new Multiplier(myStack);
		Divider div = new Divider(myStack);
		ResultPresenter rp = new ResultPresenter(myStack);
		@SuppressWarnings("unused")
		CalculatorGuiAct5 cg = new CalculatorGuiAct5 (op,add,sub,mul,div,rp);
	}
}