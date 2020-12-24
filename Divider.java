import java.util.EmptyStackException;
import java.util.Stack;
public class Divider extends Operator{
	public Divider (Stack<Double> myStack) {
		super (myStack);
	}
	public  void operate() {
		try {
			Double d3 = myStack.pop();
			Double d4 = myStack.pop();
			if (d3!=0) {
				myStack.push(d4/d3);
				CalculatorGuiAct5.display.setText(String.valueOf(d4/d3));
				System.out.println("THE STACK IS :"+myStack);
			}
			else {
				System.out.println("THE STACK IS :"+myStack);
				CalculatorGuiAct5.display.setText(String.valueOf("ZeroDivisionError"));
			}
		}catch(EmptyStackException e){
	         System.out.println("Empty or with one element list");
	         CalculatorGuiAct5.display.setText("Empty or with one element list");
	      }
	}
}