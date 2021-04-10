package Rgr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Start_1 {
	protected JFrame main_GUI;
    protected JPanel main_panel;
    protected static Start_1 pusk;
 
    
    public Start_1 (){
    	main_GUI = new JFrame("calc");	// �������� ������������ ����
    	main_GUI.setTitle ("Calculator");
    	main_GUI.setBounds(500,400,500,550);
    	main_GUI.setResizable(false); // ������������� ������ ����
    
    	
    	main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
    	main_panel.setLayout(null);
    	main_GUI.add(main_panel);
    	
    	
    	JLabel tit = new JLabel("����������� ��������� ���������� ��������"); // ����������� ������ ��� �����������
    	tit.setBounds(130,10,300,40);
    	main_panel.add(tit);
    	
    	
    	
    	
    	
    	JLabel n_1 = new JLabel("��������� ������ ���������"); // ����������� ������ ��� �����������
    	n_1.setBounds(20,57,200,30);
    	main_panel.add(n_1);
    	JTextField StAr = new JTextField(10);// ��������� ���� 
    	StAr.setText("");// ������������� ����� (default)
    	StAr.setBounds(250,60,200,30);// �������� �������������� � ������
    	main_panel.add(StAr);// ���������� � ������
        StAr.addKeyListener(new KeyAdapter() {//��������� ��������� ������� �����������
        	public void keyTyped(KeyEvent e) {//��������� ����� ������� ���������� ������ ��� ��� ������� �� ����������
        		char c=e.getKeyChar();// ��������� �������� ������
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// ������������� ����������� �����
        				e.consume();//��������� ����������� �������
        			
        			}
        	}
        });    
    	    
        
        
        
        
    	JLabel n_2 = new JLabel("��������� ������ ��������"); // ����������� ������ ��� �����������
        n_2.setBounds(20,97,200,30);
        main_panel.add(n_2);
        JTextField StYch = new JTextField(10);// ��������� ���� 
        StYch.setText("");// ������������� ����� (default)
        StYch.setBounds(250,100,200,30);// �������� �������������� � ������
        main_panel.add(StYch);// ���������� � ������
        StYch.addKeyListener(new KeyAdapter() {//��������� ��������� ������� �����������
        	public void keyTyped(KeyEvent e) {//��������� ����� ������� ���������� ������ ��� ��� ������� �� ����������
        		char c=e.getKeyChar();// ��������� �������� ������
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// ������������� ����������� �����
        				e.consume();//��������� ����������� �������
        			
        			}
        	}
        });	    
        	    
        	
        
        
        
        JLabel n_3 = new JLabel("���������� ����������"); // ����������� ������ ��� �����������
        n_3.setBounds(20,137,200,30);
        main_panel.add(n_3);         	
        JTextField KolYch = new JTextField(10);// ��������� ���� 
        KolYch.setText("");// ������������� ����� (default)
        KolYch.setBounds(250,140,200,30);// �������� �������������� � ������
        main_panel.add(KolYch);// ���������� � ������
        KolYch.addKeyListener(new KeyAdapter() {//��������� ��������� ������� �����������
        	public void keyTyped(KeyEvent e) {//��������� ����� ������� ���������� ������ ��� ��� ������� �� ����������
        		char c=e.getKeyChar();// ��������� �������� ������
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// ������������� ����������� �����
        				e.consume();//��������� ����������� �������
        			
        			}
        	}
        });
        
        
        
    	
        JLabel n_4 = new JLabel("��������� ������"); // ����������� ������ ��� �����������
        n_4.setBounds(20,177,200,30);
        main_panel.add(n_4);                	
        JTextField StBil = new JTextField(10);// ��������� ���� 
        StBil.setText("");// ������������� ����� (default)
        StBil.setBounds(250,180,200,30);// �������� �������������� � ������
        main_panel.add(StBil);// ���������� � ������
        StBil.addKeyListener(new KeyAdapter() {//��������� ��������� ������� �����������
        	public void keyTyped(KeyEvent e) {//��������� ����� ������� ���������� ������ ��� ��� ������� �� ����������
        		char c=e.getKeyChar();// ��������� �������� ������
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// ������������� ����������� �����
        				e.consume();//��������� ����������� �������
        			
        			}
        	}
        });        	    
           
        
        
        
                	    
        JLabel n_5 = new JLabel("���������� �����������"); // ����������� ������ ��� �����������
        n_5.setBounds(20,217,200,30);
        main_panel.add(n_5);                  	
        JTextField KolPos = new JTextField(10);// ��������� ���� 
        KolPos.setText("");// ������������� ����� (default)
        KolPos.setBounds(250,220,200,30);// �������� �������������� � ������
        main_panel.add(KolPos);// ���������� � ������
        KolPos.addKeyListener(new KeyAdapter() {//��������� ��������� ������� �����������
        	public void keyTyped(KeyEvent e) {//��������� ����� ������� ���������� ������ ��� ��� ������� �� ����������
        		char c=e.getKeyChar();// ��������� �������� ������
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// ������������� ����������� �����
        				e.consume();//��������� ����������� �������
        			
        			}
        	}
        });
        
        
        
        
        JLabel n_6 = new JLabel("������� �� �������"); // ����������� ������ ��� �����������
        n_6.setBounds(20,257,200,30);
        main_panel.add(n_6);            	
        JTextField RasRek = new JTextField(10);// ��������� ���� 
        RasRek.setText("");// ������������� ����� (default)
        RasRek.setBounds(250,260,200,30);// �������� �������������� � ������
        main_panel.add(RasRek);// ���������� � ������
        RasRek.addKeyListener(new KeyAdapter() {//��������� ��������� ������� �����������
        	public void keyTyped(KeyEvent e) {//��������� ����� ������� ���������� ������ ��� ��� ������� �� ����������
        		char c=e.getKeyChar();// ��������� �������� ������
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// ������������� ����������� �����
        				e.consume();//��������� ����������� �������
        			
        			}
        	}
        });
        
    	
        
        
        
        JLabel n_7 = new JLabel("������� �� ��������"); // ����������� ������ ��� �����������
        n_7.setBounds(20,297,200,30);
        main_panel.add(n_7);               	
        JTextField RasPer = new JTextField(10);// ��������� ���� 
        RasPer.setText("");// ������������� ����� (default)
        RasPer.setBounds(250,300,200,30);// �������� �������������� � ������
        main_panel.add(RasPer);// ���������� � ������
        RasPer.addKeyListener(new KeyAdapter() {//��������� ��������� ������� �����������
        	public void keyTyped(KeyEvent e) {//��������� ����� ������� ���������� ������ ��� ��� ������� �� ����������
        		char c=e.getKeyChar();// ��������� �������� ������
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// ������������� ����������� �����
        				e.consume();//��������� ����������� �������
        			
        			}
        	}
        });        	    
             
        
        
        
                	    
        JLabel n_8 = new JLabel("������ �������"); // ����������� ������ ��� �����������
        n_8.setBounds(20,337,200,30);
        main_panel.add(n_8);                  	
        JTextField ProcRas = new JTextField(10);// ��������� ���� 
        ProcRas.setText("");// ������������� ����� (default)
        ProcRas.setBounds(250,340,200,30);// �������� �������������� � ������
        main_panel.add(ProcRas);// ���������� � ������
        ProcRas.addKeyListener(new KeyAdapter() {//��������� ��������� ������� �����������
        	public void keyTyped(KeyEvent e) {//��������� ����� ������� ���������� ������ ��� ��� ������� �� ����������
        		char c=e.getKeyChar();// ��������� �������� ������
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// ������������� ����������� �����
        				e.consume();//��������� ����������� �������
        			
        			}
        	}
        });    	    
            	
        
        
        
        
        JLabel nazv = new JLabel("������"); // ����������� ������ ��� �����������
        nazv.setBounds(20,380,200,30);
        main_panel.add(nazv);
        
        
        
        ButtonGroup groub = new  ButtonGroup();
        JRadioButton Stoim = new JRadioButton ("���������",true);
        Stoim.setBounds(100,380,100,30);
        JRadioButton Dohod = new JRadioButton ("�����",false);
        Dohod.setBounds(250,380,100,30);
        groub.add(Stoim);
        groub.add(Dohod);
        main_panel.add(Stoim);
        main_panel.add(Dohod);
            
        
        JButton button_exit = new JButton("�����"); // ��������� ������
    	button_exit.setBounds(300,430,120,40);
    	ActionListener actionListener = new ListenerButton(); //������� ���������
    	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
    	main_panel.add(button_exit);
        
        
    	JButton  Rachit = new JButton("���������");
    	Rachit.addActionListener(new ActionListener() {

			private Rachet_1 rt;
			private Rach_2 doh;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Stoim.isSelected()) {
					rt = new Rachet_1(StAr.getText(),RasRek.getText(),RasPer.getText(),ProcRas.getText());
					String message ="";
					message+="���������: "+rt.Rashod;
					JOptionPane.showMessageDialog(null, message, "���������",JOptionPane.PLAIN_MESSAGE);
				}
				if (Dohod.isSelected()) {
					doh = new Rach_2(StAr.getText(),StYch.getText(),KolYch.getText(),StBil.getText(),KolPos.getText(),RasRek.getText(),RasPer.getText(),ProcRas.getText());
					String message ="";
					message+="�����: "+doh.Dohod;
					JOptionPane.showMessageDialog(null, message, "���������",JOptionPane.PLAIN_MESSAGE);
				}
			} // ��������� ��������� ������� ������
			
	    });
    	Rachit.setBounds(80, 430, 120, 40);
		main_panel.add(Rachit);
        
		PerOpr_1 InfRaz = new PerOpr_1();
		InfRaz.Odin();
        
        
    	main_GUI.setVisible(true);
    	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
    	

    }
    

public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
	pusk= new Start_1();
	System.out.println("Start");
}

}