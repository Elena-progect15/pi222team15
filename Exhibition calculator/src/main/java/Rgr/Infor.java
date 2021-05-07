package Rgr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Infor {
protected JFrame main_GUI;
protected JPanel main_panel;

public void Infor() {
main_GUI = new JFrame("subversion");	// создание графического окна
main_GUI.setTitle ("Информация");
main_GUI.setBounds(500,400,400,300);
main_GUI.setResizable(false); // фиксированный размер окна
main_GUI.setLayout(null);

String text1 = "Кадалова Елена Вадимовна, номер зачетной книжки: 19130164 ";  // создается коллекция символов для представления текста
String text2 = "Саттаров Ян Эдуардович, номер зачетной книжки: 19130609 ";   
String text3 = "Набиев Руслан Ришатович, номер зачетной книжки: 19131202 ";
	

JLabel Kad = new JLabel();    // создается компонент для показа текста
Kad.setBounds(10,0,500,60);  // задается расположение текста в окне
Kad.setText(text1);          // установка текста в поле

JLabel Satt = new JLabel();
Satt.setBounds(10,0,500,100);
Satt.setText(text2);

JLabel Nab = new JLabel();
Nab.setBounds(10,0,500,140);
Nab.setText(text3);



main_GUI.add(Kad); // добавление текста в окно
main_GUI.add(Satt);
main_GUI.add(Nab);


JButton cancelButton = new JButton ("Выход"); // создание кнопки Выход
cancelButton.setBounds(20,200,100,40); // расположение кнопки Выход
cancelButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	main_GUI.dispose(); // результат нажатия кнопки Выход

    
    }
    
});

main_GUI.add(cancelButton);
main_GUI.setVisible(true);


}

}
