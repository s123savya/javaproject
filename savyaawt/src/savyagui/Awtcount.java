package savyagui;
import java.awt.*;
import java.awt.event.*;

	
	public class Awtcount extends Frame implements ActionListener {
		private Label l;
		private Button b;
		private TextField t;
		private int c=0;
		
		public Awtcount() {
			setLayout(new FlowLayout());
			l=new Label("counter:");
			add(l);
			t=new TextField("0",10);
			t.setEditable(true);
			add(t);
			b=new Button("count");
			add(b);
			
			b.addActionListener(this);
			
			setTitle("counter");
			setSize(150,350);
			setVisible(true);
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
		}
		public static void main(String args[])
		{
			Awtcount a = new Awtcount();
		}
	   @Override
	   public void actionPerformed(ActionEvent ae) {
		   ++c;
		   t.setText(c+"");
	   }
}
