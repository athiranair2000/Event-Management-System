import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConfirmPg extends JFrame 
{
	ConfirmPg()
	{
		setLayout(null);
		JPanel p1=new JPanel();
		
		p1.setLayout(new GridLayout(2,1,5,5));
		p1.add(new JLabel("Successfully Registered!!"),SwingConstants.CENTER);
		p1.add(new JLabel("Thank You and Have a nice time!!"));
		
				
		JPanel p2=new JPanel();
		JButton b1=new JButton("Back");
		
		p2.add(b1);
		p1.setBounds(10,10,250,200);
		p2.setBounds(10,260,95,30);
		
		
		
		
		b1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae) {
             dispose();
            StudentProfile sp1=new StudentProfile();
             sp1.setSize(400, 300);
             
             
             sp1.setVisible(true);
             
         }
         });
		add(p1);
		add(p2);
	
}
	public static void main(String []args) {
		ConfirmPg frame=new ConfirmPg();
		
		 frame.setSize(400, 250);

		    frame.setLocationRelativeTo(null); // Center the frame
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    frame.setVisible(true);
		
	}
}
