package savyagui;
import java.awt.*;
import java.awt.event.*;
public class Awtnumbers extends Frame {
	private Label l1;
	private Label l2;
	private TextField t1;
	private TextField t2;
	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Label l3;
	private TextField t3;
	
	public Awtnumbers() {
		setLayout(null);
		l1=new Label("NUMBER 1");
		l1.setBounds(50,50,100,25);
		add(l1);
		t1=new TextField(10);
		t1.setEditable(true);
		t1.setBounds(200,50,100,25);
		add(t1);
		l2=new Label("NUMBER 2");
		l2.setBounds(50,100,100,25);
		add(l2);
		t2=new TextField(10);
		t2.setEditable(true);
		t2.setBounds(200,100,100,25);
		add(t2);
		
		
		b1=new Button("+");
		b1.setBounds(50,150,25,25);
		add(b1);
		b2=new Button("-");
		b2.setBounds(100,150,25,25);
		add(b2);
		b3=new Button("*");
		b3.setBounds(150,150,25,25);
		add(b3);
		b4=new Button("/");
		b4.setBounds(200,150,25,25);
		add(b4);
	
		l3=new Label("Result");
		l3.setBounds(50,200,100,25);
		add(l3);	
		t3=new TextField(10);
		t3.setEditable(false);
		t3.setBounds(200,200,100,25);
		add(t3);
		
		b1.addActionListener(new ActionListener() {
			@Override
		 public void actionPerformed(ActionEvent ae) {
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				t3.setText((a+b)+"");
				
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				int a=Integer.parseInt(t1.getText().trim());
				int b=Integer.parseInt(t2.getText().trim());
				t3.setText((a-b)+"");
				
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				t3.setText((a*b)+"");
				
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				double a=Double.parseDouble(t1.getText());
				double b=Double.parseDouble(t2.getText());
				t3.setText((a/b)+"");
				
			}
		});
		
		 setTitle("Form 1");
		 setSize(350,350);
		 setVisible(true);
		 addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
		 		 
	}

	public static void main(String[] args) {
	new Awtnumbers();

	}
}
