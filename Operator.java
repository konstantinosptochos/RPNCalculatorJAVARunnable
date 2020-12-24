import java.util.Stack;

public abstract class Operator {
		protected Stack<Double> myStack;
		public Operator (Stack<Double> myStack) {
			this.myStack = myStack;
		}
		public abstract void operate();

	}