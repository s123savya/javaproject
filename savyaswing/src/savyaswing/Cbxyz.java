package savyaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cbxyz extends JPanel {
	JComboBox<String> c;
	JLabel pic;
	
	public Cbxyz() {
		String[] ct= {"X","Y","Z"};
		c=new JComboBox<String>(ct);
		c.setSelectedIndex(2);
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				JComboBox j=(JComboBox) a.getSource();
				String s=(String)j.getSelectedItem();
				pic.setIcon(new ImageIcon(getClass().getResource("/imagesused/"+s.trim().toLowerCase()+".jpg")));
			}
		});
		
				pic=new JLabel(new ImageIcon(getClass().getResource("/imagesused/x.jpg")));
				pic.setPreferredSize(new Dimension(300,148));
				
				setLayout(new BorderLayout(0,5));
				add(c,BorderLayout.NORTH);
				add(pic,BorderLayout.SOUTH);
				
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Combo-Box XYZ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Cbxyz());
		frame.pack();
		frame.setVisible(true);

	}

}
