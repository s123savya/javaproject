package savyagui;
import java.awt.*;
import java.awt.event.*;
public class Awtinterest extends Frame {
	private Label l1,l2,l3,l4;
	private TextField t1,t2,t3,t4;
	private Button b1;
	private Button b2;
	
	public Awtinterest() {
		setLayout(null);
		l1=new Label("Principal");
	    l1.setBounds(50,50,100,25);
	    add(l1);
	    t1=new TextField();
	    t1.setEditable(true);
	    t1.setBounds(200,50,100,25);
	    add(t1);
	    l2=new Label("Rate");
	    l2.setBounds(50,100,100,25);
	    add(l2);
	    t2=new TextField();
	    t2.setEditable(true);
	    t2.setBounds(200,100,100,25);
	    add(t2);
	    l3=new Label("Time");
	    l3.setBounds(50,150,100,25);
	    add(l3);
	    t3=new TextField();
	    t3.setEditable(true);
	    t3.setBounds(200,150,100,25);
	    add(t3);
	    b1 = new Button("Simple Interest");
	    b1.setBounds(50,200,100,25);
	    add(b1);
	    b2 = new Button("Compound Interest");
	    b2.setBounds(200,200,130,25);
	    add(b2);
	    l4=new Label("Interest");
	    l4.setBounds(50,250,100,25);
	    add(l4);
	    t4=new TextField();
	    t4.setEditable(false);
	    t4.setBounds(200,250,100,25);
	    add(t4);
	    b1.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent ae) {
	    		double a=Double.parseDouble(t1.getText().trim());
	    		double b=Double.parseDouble(t2.getText().trim());
	    		double c=Double.parseDouble(t3.getText().trim());
	    		double si=((a*b*c)/100);
	    		t4.setText(si+"");    		
	    	}
	    });
	    b2.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent ae) {
	    		double a=Double.parseDouble(t1.getText().trim());
	    		double b=Double.parseDouble(t2.getText().trim());
	    		double c=Double.parseDouble(t3.getText().trim());
	    		double ci=a*(Math.pow((1+b),c));
	    		t4.setText(ci+"");    		
	    	}
	    });
	    
	    setTitle("Form-3");
	    setSize(350,400);
	    setVisible(true);
	    
	    addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
         new Awtinterest();
	}

}
