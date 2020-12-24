import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonHandler implements ActionListener{
    String inp;
    public  ButtonHandler(String inp) { this.inp = inp;}
    public void actionPerformed(ActionEvent pushingButton) {
        
        switch (inp){
        case "+": 
            CalculatorGuiAct5.add.operate();
            break;
        case "-":
            CalculatorGuiAct5.sub.operate();
            break;
        case "/":
            CalculatorGuiAct5.div.operate();
            break;
        case "*":
            CalculatorGuiAct5.mul.operate();
            break;
        case "CE":
             CalculatorGuiAct5.op.reset();
             Calc.myStack.removeAllElements();
             break;
        case "C":
            CalculatorGuiAct5.op.reset();
            break;
        case "BackSpace":
            CalculatorGuiAct5.op.deleteLastDigit();
            break;
        case "=":
            CalculatorGuiAct5.rp.operate();
            break;
        default:
            CalculatorGuiAct5.op.addDigit(inp.charAt(0));
            break;
            
        }
    }
}