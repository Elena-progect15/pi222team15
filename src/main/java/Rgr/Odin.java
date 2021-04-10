package Rgr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public abstract class Odin extends JFrame {


    public Odin () {
    	super(); 
    	
		JButton inf = new JButton("Информация");
		inf.setBounds(8,10,120,90);
		setBounds(100,100,150,150); 
		ActionListener actionListener = new ListenerButtonInfo(); 
		inf.addActionListener(actionListener);        
        setVisible(true);
        setLayout(null);
        super.add(inf);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}