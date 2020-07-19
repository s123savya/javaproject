package savyagui;
import java.awt.*;
import java.awt.event.*;
public class Awtdetails extends Frame{
	private Label l1,l2,l3,l4;
	private TextField t1,t2,t3,t4;
	private Button b1,b2;
	private TextArea t;
	
	public Awtdetails() {
		setLayout(null);
		l1=new Label("Name");
		l1.setBounds(50,50,100,25);
		add(l1);
		t1=new TextField();
		t1.setEditable(true);
		t1.setBounds(200,50,100,25);
		add(t1);
		l2=new Label("Address");
		l2.setBounds(50,100,100,25);
		add(l2);
		t2=new TextField();
		t2.setEditable(true);
		t2.setBounds(200,100,100,25);
		add(t2);
		l3=new Label("Locality");
		l3.setBounds(50,150,100,25);
		add(l3);
		t3=new TextField();
		t3.setEditable(true);
		t3.setBounds(200,150,100,25);
		add(t3);
		l4=new Label("city");
		l4.setBounds(50,200,100,25);
		add(l4);
		t4=new TextField();
		t4.setEditable(true);
		t4.setBounds(200,200,100,25);
		add(t4);
		b1=new Button("Show Details");
		b1.setBounds(50,250,100,25);
		add(b1);
		b2=new Button("Clear Form");
		b2.setBounds(200,250,100,25);
		add(b2);
		t=new TextArea();
		t.setEditable(false);
		t.setBounds(50,300,400,190);
		add(t);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				t.setText(t1.getText()+t2.getText()+t3.getText()+t4.getText()+"");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				t.setText("");
			}
		});
		
		setTitle("Form 4");
		setSize(500,500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
           new Awtdetails();
	}

}
