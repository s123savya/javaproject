package savyagui;
import java.awt.*; 
import java.awt.event.*;
public class Awtradius extends Frame {
	private Label l1;
	private TextField t1;
	private Button b1;
	private Label l2;
	private TextField t2;
	private Label l3;
	private TextField t3;
	
	public Awtradius() {
		setLayout(null);
		l1=new Label("Radius");
		l1.setBounds(50,50,100,25);
		add(l1);
		t1= new TextField();
		t1.setEditable(true);
		t1.setBounds(200,50,100,25);
		add(t1);
		
		b1= new Button("calculate");
		b1.setBounds(50,100,100,25);
		add(b1);
		
		l2=new Label("Area");
		l2.setBounds(50,150,100,25);
		add(l2);
		t2= new TextField();
		t2.setEditable(false);
		t2.setBounds(200,150,100,25);
		add(t2);
		l3=new Label("Circumference");
		l3.setBounds(50,200,100,25);
		add(l3);
		t3= new TextField();
		t3.setBounds(200,200,100,25);
		t3.setEditable(false);
		add(t3);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				double a = Double.parseDouble(t1.getText());
				double c=3.14*a*a;
				double d=2*3.14*a;
				t2.setText(c+"");
				t3.setText(d+"");
			}
		});
		
		setTitle("Form-2");
		setSize(350,350);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Awtradius();

	}

}
