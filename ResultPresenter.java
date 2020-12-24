import java.util.EmptyStackException;
import java.util.Stack;
public class ResultPresenter extends Operator {
	public ResultPresenter (Stack<Double> myStack) {
		super (myStack);
	}
	public void operate(){
		try {
			Double d1= myStack.pop();
			
			CalculatorGuiAct5.display.setText(String.valueOf(d1));
			
			System.out.println("THE STACK IS :"+myStack);
		}catch(EmptyStackException e){
	        System.out.println("Empty or with one element list");
	        CalculatorGuiAct5.display.setText("Empty or with one element list");
	    }
	}
}
