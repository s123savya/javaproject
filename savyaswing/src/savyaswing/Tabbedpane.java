package savyaswing;
import java.awt.*;
import javax.swing.*;

public class Tabbedpane extends JPanel {
	JTabbedPane tp;
	
	public Tabbedpane() {
		setLayout(new BorderLayout());
		
		tp=new JTabbedPane();
		tp.setTabPlacement(JTabbedPane.TOP);
		
		tp.addTab("2-numbers", new Number2());
		tp.add("Radius", new Radius());
		tp.add("Interest", new Interest());
		tp.add("Details", new Details());
		tp.add("Calculator", new Calculator());
		tp.add("Twolists", new Twolists());
		tp.add("Form", new Form());
		
		add(tp,BorderLayout.CENTER);
		
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("TabbedPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Tabbedpane());
		frame.setBounds( 10,10,500,600 );
		frame.setVisible(true);
	}

}
