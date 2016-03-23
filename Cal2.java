import javax.swing.*;
import java.awt.GridLayout;

public class Cal2 {

	public static void main(String[] args) {
		
		//panel and layout
		GridLayout grL = new GridLayout(4,2,4,4);
		JPanel panel = new JPanel();
		panel.setLayout(grL);
		
		//Instaces
		JLabel l1 = new JLabel("F'n first");
		JTextField t1 = new JTextField(10);
		JLabel l2 = new JLabel("F'n Second");
		JTextField t2 = new JTextField(10);	
		JLabel l3 = new JLabel("F'n Result");
		JTextField t3 = new JTextField(10);
		JButton go = new JButton ("Let's Fucking Start");
		
		//Adds
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(go);
		
		JFrame frame = new JFrame();
		frame.setContentPane(panel);
		frame.setTitle("Calc F'n Coool");
		frame.setVisible(true);
		frame.setSize(300, 200);
		
	
	}

}
