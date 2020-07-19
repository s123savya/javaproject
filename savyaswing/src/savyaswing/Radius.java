package savyaswing;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
public class Radius extends JPanel implements ChangeListener {
	JSlider js;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b;
	
	public Radius() {
		setLayout(null);
		l1=new JLabel();
		l1.setText("Radius");
		l1.setDisplayedMnemonic('R');
		l1.setBounds(50,50,100,25);
		add(l1);
		
		js=new JSlider(0,500,0);
		js.setMinorTickSpacing(50);
		js.setMajorTickSpacing(100);
		js.setPaintLabels(true);
		js.setPaintTicks(true);
		js.setSnapToTicks(true);
		js.setFont(new Font("Tahoma", Font.PLAIN, 10));
		js.setBounds(200,50,100,40);
		add(js);
		js.addChangeListener(this);
		l2=new JLabel("Radius Selected:");
		l2.setBounds(50,100,150,30);
		add(l2);
		
		b=new JButton();
		b.setText("Calculate");
		b.setBounds(50,150,150,30);
		add(b);
		
		l3=new JLabel();
		t1=new JTextField(10);
		t1.setEditable(false);
		l3.setText("Area");
		l3.setDisplayedMnemonic('A');
		l3.setLabelFor(t1);
		l3.setBounds(50,200,100,25);
		t1.setBounds(200,200,150,25);
		add(l3);
		add(t1);
		
		l4=new JLabel();
		t2=new JTextField(10);
		t2.setEditable(false);
		l4.setText("Circumference");
		l4.setDisplayedMnemonic('C');
		l4.setLabelFor(t2);
		l4.setBounds(50,250,100,25);
		t2.setBounds(200,250,150,25);
		add(l4);
		add(t2);
		
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double a=Double.parseDouble(l2.getText());
				double area=3.14*a*a;
				double cir=2*3.14*a;
				t1.setText(area+"");
				t2.setText(cir+"");
			}
		});
		
		
	}
	
	@Override
	public void stateChanged(ChangeEvent c) {
		JSlider j= (JSlider)c.getSource();
		l2.setText(""+j.getValue());
	}
	
	public static void main(String[] args) {
		JFrame f=new JFrame("Radius");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new Radius());
		f.setBounds(10,10,400,400);
		f.setVisible(true);
	}

}
