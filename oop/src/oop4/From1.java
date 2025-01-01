package oop4;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class From1 extends JFrame{
	
	public From1() {
		
		setSize(300,200);
		JButton button = new JButton();
		
		Button button2 = new Button();
		button.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent ae) {
					
				System.out.println("Hello world");
			}
		});
		add.button();
		setVisible(true);
		
		
	}

}
