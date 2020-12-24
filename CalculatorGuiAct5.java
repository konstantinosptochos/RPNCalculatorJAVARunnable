import java.awt.*;
import java.awt.event.*;
public  class CalculatorGuiAct5 extends Frame
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static  Operand op;
   public static Adder add;
   public static Subtractor sub;
   public static ResultPresenter rp;
   public static Divider div;
   public static Multiplier mul;
   public Button button0, button1, button2, button3, button4;
   public Button button5, button6, button7, button8, button9;
   public Button buttonPlus, buttonMinus, buttonResultPresenter;
   public Button buttonEnter, buttonBackSpace, buttonClear,buttonClearAll;
   public static Frame window;
   public static TextField display;

 public CalculatorGuiAct5(Operand op2, Adder add2, Subtractor sub2, Multiplier mult, Divider div2, ResultPresenter rp2) 
    {  
	   CalculatorGuiAct5.op = op2; CalculatorGuiAct5.add = add2; CalculatorGuiAct5.sub = sub2; CalculatorGuiAct5.rp = rp2; CalculatorGuiAct5.mul = mult; CalculatorGuiAct5.div = div2;
	   
       window = new Frame("RPN CALCULATOR");
       window.setLayout(null);
       window.setFont(new Font("TimesRoman", Font.PLAIN, 14));
       window.setBackground(Color.blue);
      
       display = new TextField("0");
       display.setEditable(false);  
       display.setBounds(13, 55, 257, 30);

       window.add(display);         
       window.setSize(283,320);
       window.setLocation(40,80);           
       window.setVisible(true);
       window.setResizable(false);  
       window.addWindowListener(new CloseWindowAndExit());    
       
       ButtonCreate button0 = new ButtonCreate("0",64,265,35,28);
       button0.createButtonNum();
       ButtonCreate button1 = new ButtonCreate("1",64,232,35,28);
       button1.createButtonNum();
       ButtonCreate button2 = new ButtonCreate("2",104,232,35,28);
       button2.createButtonNum();
       ButtonCreate button3 = new ButtonCreate("3",144,232,35,28);
       button3.createButtonNum();
       ButtonCreate button4 = new ButtonCreate("4",64,199,35,28);
       button4.createButtonNum();
       ButtonCreate button5 = new ButtonCreate("5",104,199,35,28);
       button5.createButtonNum();
       ButtonCreate button6 = new ButtonCreate("6",144,199,35,28);
       button6.createButtonNum();
       ButtonCreate button7 = new ButtonCreate("7",64,166,35,28);
       button7.createButtonNum();
       ButtonCreate button8 = new ButtonCreate("8",104,166,35,28);
       button8.createButtonNum();
       ButtonCreate button9 = new ButtonCreate("9",144,166,35,28);
       button9.createButtonNum();
       ButtonCreate buttonBackSpace = new ButtonCreate("BackSpace",64,100,75,28);
       buttonBackSpace.createButtonNumSp();
       ButtonCreate buttonClearAll = new ButtonCreate("C",144,133,35,28);
       buttonClearAll.createButtonNumSp();
       ButtonCreate buttonClear = new ButtonCreate("CE",144,100,35,28);
       buttonClear.createButtonNumSp();
       ButtonCreate buttonPlus = new ButtonCreate("+",195,265,35,28);
       buttonPlus.createButtonNum();
       ButtonCreate buttonMinus = new ButtonCreate("-",195,232,35,28);
       buttonMinus.createButtonNum();
       ButtonCreate buttonMul = new ButtonCreate("*",195,166,35,28);
       buttonMul.createButtonNum();
       ButtonCreate buttonDiv = new ButtonCreate("/",195,199,35,28);
       buttonDiv.createButtonNum();
       ButtonCreate buttonResultPresenter = new ButtonCreate("=",235,265,35,28);
       buttonResultPresenter.createButtonNum();
       ButtonCreate buttonDot = new ButtonCreate(".",104,265,35,28);
       buttonDot.createButtonNum();
       
       buttonEnter = new Button("ENTER");  
       buttonEnter.setFont(new Font("TimesRoman", Font.PLAIN, 14));    
       buttonEnter.setBackground(Color.red);
       buttonEnter.setForeground(Color.white);
       buttonEnter.setBounds(204, 100, 56, 28);
       buttonEnter.addActionListener(new ButtonEnterHandler());
       CalculatorGuiAct5.window.add(buttonEnter);        
      }
}
class ButtonEnterHandler implements ActionListener
{     
   public ButtonEnterHandler() { }

   public void actionPerformed(ActionEvent pushingButtonEnter)
     { CalculatorGuiAct5.op.complete(); }
 }
class ButtonCreate{
	String inp;
	int x, y, z, w;
	public ButtonCreate(String inp, int x, int y, int z, int w) {
		this.inp = inp;
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	public void createButtonNum(){
		   Button button = new Button (inp); 
	       button.setBounds(x, y, z, w);
	       button.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	       button.setForeground(Color.blue);
	       button.addActionListener(new ButtonHandler(inp));
	       CalculatorGuiAct5.window.add(button);
	}
	public void createButtonNumSp(){
		   Button button = new Button (inp); 
	       button.setBounds(x, y, z, w);
	       button.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	       button.setForeground(Color.red);
	       button.addActionListener(new ButtonHandler(inp));
	       CalculatorGuiAct5.window.add(button);
	}	
}
class CloseWindowAndExit extends WindowAdapter
{
  public void windowClosing(WindowEvent closeWindowAndExit)
   {
    System.exit(0);
   }
} 