import java.util.Stack;
public class Operand implements OperandIf {
	private double value = 0;
	private String tmp = "";
	private Stack<Double> myStack;
	public Operand(Stack<Double> myStack){
		this.myStack = myStack;
		
	}
	public void addDigit(char c) {
		tmp += c;
		if (tmp.charAt(0) == '.') {
			tmp = "0" + tmp;
		}
		value = Double.valueOf(tmp);
		CalculatorGuiAct5.display.setText(tmp);
		System.out.println(value);
		
		
	}
	public void deleteLastDigit() {
		if (tmp.length() > 1 && tmp.charAt(0)!='.') {
			tmp = tmp.substring(0,tmp.length()-1);
			value = Double.valueOf(tmp);
		}
		else { 
			tmp = "";
			value = 0;
		}
		CalculatorGuiAct5.display.setText(String.valueOf(tmp));
		System.out.println(value);
	}
	public void complete(){
        myStack.push( (double) value);
        System.out.println(value);
        System.out.println("THE STACK IS :"+ myStack);
        value=0;
        tmp = "";
        CalculatorGuiAct5.display.setText(String.valueOf(tmp));
        
	}
	public void reset(){
        myStack.clear();
        value = 0;
        System.out.println(value);
        tmp = "";
        CalculatorGuiAct5.display.setText(String.valueOf(value));

        
    }
}