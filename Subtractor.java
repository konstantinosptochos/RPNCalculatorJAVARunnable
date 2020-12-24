import java.util.EmptyStackException;
import java.util.Stack;
public class Subtractor extends Operator {
	public Subtractor (Stack<Double> myStack) {
		super (myStack);
	}
	public  void operate() {
		try {
			Double d3 = myStack.pop();
			Double d4 = myStack.pop();
			myStack.push(d4-d3);
			CalculatorGuiAct5.display.setText(String.valueOf(d4-d3));
			System.out.println("THE STACK IS :"+myStack);
		}catch(EmptyStackException e){
	        System.out.println("Empty or with one element list");
	        CalculatorGuiAct5.display.setText("Empty or with one element list");
	     }
	}
}
