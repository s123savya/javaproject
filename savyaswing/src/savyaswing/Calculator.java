package savyaswing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JPanel {
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	String s;
	int n1=0,n2=0;
	public Calculator() {
		
		t=new JTextField(20);
		t.setEditable(true);
		
		b1=new JButton();
		b1.setText("7");
		b2=new JButton();
		b2.setText("8");
		b3=new JButton();
		b3.setText("9");
		b4=new JButton();
		b4.setText("+");
		b5=new JButton();
		b5.setText("4");
		b6=new JButton();
		b6.setText("5");
		b7=new JButton();
		b7.setText("6");
		b8=new JButton();
		b8.setText("-");
		b9=new JButton();
		b9.setText("1");
		b10=new JButton();
		b10.setText("2");
		b11=new JButton();
		b11.setText("3");
		b12=new JButton();
		b12.setText("*");
		b13=new JButton();
		b13.setText("0");
		b14=new JButton();
		b14.setText("c");
		b15=new JButton();
		b15.setText("=");
		b16=new JButton();
		b16.setText("/");
		
		b1.addActionListener(new A());
		b2.addActionListener(new A());
		b3.addActionListener(new A());
		b5.addActionListener(new A());
		b6.addActionListener(new A());
		b7.addActionListener(new A());
		b9.addActionListener(new A());
		b10.addActionListener(new A());
		b11.addActionListener(new A());
		b13.addActionListener(new A());
		
		b4.addActionListener(new B());
		b8.addActionListener(new B());
		b12.addActionListener(new B());
		b14.addActionListener(new B());
		b16.addActionListener(new B());
		
		b15.addActionListener(new C());
		
		JPanel j=new JPanel(new FlowLayout());
		j.add(t);
		JPanel p=new JPanel(new GridLayout(4,4));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);
		
		setLayout(new BorderLayout());
		add(j,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);
			  
	}
	   
	class A implements ActionListener {
		public void actionPerformed(ActionEvent a) {
	    	t.setText(t.getText()+a.getActionCommand());
	    }
	 }
	 class B implements ActionListener {
		 public void actionPerformed(ActionEvent a) {
			s=a.getActionCommand();
			n1=Integer.parseInt(t.getText().trim());
			t.setText("");
		 }
	  }
	  class C implements ActionListener {	
		  public void actionPerformed(ActionEvent a) {
			  n2=Integer.parseInt(t.getText().trim());
			  	switch(s) {
			  		case "+" :t.setText((n1+n2)+"");
						  break;
			  		case "-" :t.setText((n1-n2)+"");
				  		  break;
			  		case "*" :t.setText((n1*n2)+"");
				          break;
			  		case "/" :t.setText((n1/n2)+"");
				          break;
			  		default  :t.setText("");
				          break;
			  	}
	     }
	   }
	  
	public static void main(String args[]) {

		JFrame f=new JFrame("Calculator");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new Calculator());
		f.setBounds(10,10,300,300);
		f.setVisible(true);
	}

}
