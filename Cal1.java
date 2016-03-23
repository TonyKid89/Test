import javax.swing.*;
import java.awt.*;

public class Cal1  {
	public static void main(String[] args) {
		
		// Add pannel
		JPanel windContent= new JPanel();
		windContent.setLayout(new BoxLayout(windContent, BoxLayout.X_AXIS));
		
		//instane of things
		JLabel lb1 = new JLabel("Button namba one");
		JTextField tf1 = new JTextField(10);
		JLabel lb2 = new JLabel("Button namba 2");
		JTextField tf2 = new JTextField(10);
		JLabel lb3 = new JLabel("Result");
		JTextField tf3 = new JTextField(10);
		JButton go = new JButton("Lets Fucking go!");
		
		//adding content to panel (windConteny)
		windContent.add(lb1);
		windContent.add(tf1);
		windContent.add(lb2);
		windContent.add(tf2);
		windContent.add(lb3);
		windContent.add(tf3);
		windContent.add(go);
		
		JFrame myFrame = new JFrame();
		myFrame.setVisible(true);
		myFrame.setTitle("MyCalc #1");
		myFrame.setSize(300,300);
		myFrame.setContentPane(windContent);
	
	
	
	
	}

}
