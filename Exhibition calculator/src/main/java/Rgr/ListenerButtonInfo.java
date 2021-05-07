package Rgr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerButtonInfo implements ActionListener {

	@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Infor you = new Infor();
		you.Infor();
		 

		
	}
	
	
}