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
main_GUI = new JFrame("subversion");	// �������� ������������ ����
main_GUI.setTitle ("����������");
main_GUI.setBounds(500,400,400,300);
main_GUI.setResizable(false); // ������������� ������ ����
main_GUI.setLayout(null);

String text1 = "�������� ����� ���������, ����� �������� ������: 19130164 ";  // ��������� ��������� �������� ��� ������������� ������
String text2 = "�������� �� ����������, ����� �������� ������: 19130609 ";   
String text3 = "������ ������ ���������, ����� �������� ������: 19131202 ";
	

JLabel Kad = new JLabel();    // ��������� ��������� ��� ������ ������
Kad.setBounds(10,0,500,60);  // �������� ������������ ������ � ����
Kad.setText(text1);          // ��������� ������ � ����

JLabel Satt = new JLabel();
Satt.setBounds(10,0,500,100);
Satt.setText(text2);

JLabel Nab = new JLabel();
Nab.setBounds(10,0,500,140);
Nab.setText(text3);



main_GUI.add(Kad); // ���������� ������ � ����
main_GUI.add(Satt);
main_GUI.add(Nab);


JButton cancelButton = new JButton ("�����"); // �������� ������ �����
cancelButton.setBounds(20,200,100,40); // ������������ ������ �����
cancelButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	main_GUI.dispose(); // ��������� ������� ������ �����

    
    }
    
});

main_GUI.add(cancelButton);
main_GUI.setVisible(true);


}

}
