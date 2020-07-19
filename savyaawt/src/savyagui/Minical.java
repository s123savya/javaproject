package savyagui;
import java.awt.*;
import java.awt.event.*;

public class Minical extends Frame {
	private TextField t;
	private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	String s;
	int n1=0,n2=0;
	public Minical() {
		Panel p=new Panel(new FlowLayout());
		t=new TextField("0",20);
		t.setEditable(false);
		p.add(t);
		
		t=new TextField(20);
		t.setEditable(true);
		
		b1=new Button("7");
		b2=new Button("8");
		b3=new Button("9");
		b4=new Button("+");
		b5=new Button("4");
		b6=new Button("5");
		b7=new Button("6");
		b8=new Button("-");
		b9=new Button("1");
		b10=new Button("2");
		b11=new Button("3");
		b12=new Button("*");
		b13=new Button("0");
		b14=new Button("c");
		b15=new Button("=");
		b16=new Button("/");
		
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
		
		Panel j=new Panel(new FlowLayout());
		j.add(t);
		Panel o =new Panel(new GridLayout(4,4));
		o.add(b1);
		o.add(b2);
		o.add(b3);
		o.add(b4);
		o.add(b5);
		o.add(b6);
		o.add(b7);
		o.add(b8);
		o.add(b9);
		o.add(b10);
		o.add(b11);
		o.add(b12);
		o.add(b13);
		o.add(b14);
		o.add(b15);
		o.add(b16);
		
		setLayout(new BorderLayout());
		add(j,BorderLayout.NORTH);
		add(o,BorderLayout.CENTER);
	   
		
		setTitle("Form 5");
		setSize(400,400);
		setVisible(true);
		
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

	public static void main(String[] args) {
		new Minical();
	}

}
