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
    	main_GUI = new JFrame("calc");	// создание графического окна
    	main_GUI.setTitle ("Calculator");
    	main_GUI.setBounds(500,400,500,550);
    	main_GUI.setResizable(false); // фиксированный размер окна
    
    	
    	main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
    	main_panel.setLayout(null);
    	main_GUI.add(main_panel);
    	
    	
    	JLabel tit = new JLabel("Калькулятор стоимости проведения выставки"); // Отображение текста или изображения
    	tit.setBounds(130,10,300,40);
    	main_panel.add(tit);
    	
    	
    	
    	
    	
    	JLabel n_1 = new JLabel("Стоимость аренды помещения"); // Отображение текста или изображения
    	n_1.setBounds(20,57,200,30);
    	main_panel.add(n_1);
    	JTextField StAr = new JTextField(10);// Добавляем поле 
    	StAr.setText("");// Устанавливаем текст (default)
    	StAr.setBounds(250,60,200,30);// Указываю местоположение и размер
    	main_panel.add(StAr);// Добавление в панель
        StAr.addKeyListener(new KeyAdapter() {//Добавляем обработку событии клавиватуры
        	public void keyTyped(KeyEvent e) {//Добавляем метод который вызывается каждый раз при нажатии на клавиатуру
        		char c=e.getKeyChar();// Взвращаем введённый символ
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// Устанавливаем ограничения ввода
        				e.consume();//Добавляем потребитель события
        			
        			}
        	}
        });    
    	    
        
        
        
        
    	JLabel n_2 = new JLabel("Стоимость учасия выставке"); // Отображение текста или изображения
        n_2.setBounds(20,97,200,30);
        main_panel.add(n_2);
        JTextField StYch = new JTextField(10);// Добавляем поле 
        StYch.setText("");// Устанавливаем текст (default)
        StYch.setBounds(250,100,200,30);// Указываю местоположение и размер
        main_panel.add(StYch);// Добавление в панель
        StYch.addKeyListener(new KeyAdapter() {//Добавляем обработку событии клавиватуры
        	public void keyTyped(KeyEvent e) {//Добавляем метод который вызывается каждый раз при нажатии на клавиатуру
        		char c=e.getKeyChar();// Взвращаем введённый символ
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// Устанавливаем ограничения ввода
        				e.consume();//Добавляем потребитель события
        			
        			}
        	}
        });	    
        	    
        	
        
        
        
        JLabel n_3 = new JLabel("Количество участников"); // Отображение текста или изображения
        n_3.setBounds(20,137,200,30);
        main_panel.add(n_3);         	
        JTextField KolYch = new JTextField(10);// Добавляем поле 
        KolYch.setText("");// Устанавливаем текст (default)
        KolYch.setBounds(250,140,200,30);// Указываю местоположение и размер
        main_panel.add(KolYch);// Добавление в панель
        KolYch.addKeyListener(new KeyAdapter() {//Добавляем обработку событии клавиватуры
        	public void keyTyped(KeyEvent e) {//Добавляем метод который вызывается каждый раз при нажатии на клавиатуру
        		char c=e.getKeyChar();// Взвращаем введённый символ
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// Устанавливаем ограничения ввода
        				e.consume();//Добавляем потребитель события
        			
        			}
        	}
        });
        
        
        
    	
        JLabel n_4 = new JLabel("Стоимость билета"); // Отображение текста или изображения
        n_4.setBounds(20,177,200,30);
        main_panel.add(n_4);                	
        JTextField StBil = new JTextField(10);// Добавляем поле 
        StBil.setText("");// Устанавливаем текст (default)
        StBil.setBounds(250,180,200,30);// Указываю местоположение и размер
        main_panel.add(StBil);// Добавление в панель
        StBil.addKeyListener(new KeyAdapter() {//Добавляем обработку событии клавиватуры
        	public void keyTyped(KeyEvent e) {//Добавляем метод который вызывается каждый раз при нажатии на клавиатуру
        		char c=e.getKeyChar();// Взвращаем введённый символ
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// Устанавливаем ограничения ввода
        				e.consume();//Добавляем потребитель события
        			
        			}
        	}
        });        	    
           
        
        
        
                	    
        JLabel n_5 = new JLabel("Количество посетителей"); // Отображение текста или изображения
        n_5.setBounds(20,217,200,30);
        main_panel.add(n_5);                  	
        JTextField KolPos = new JTextField(10);// Добавляем поле 
        KolPos.setText("");// Устанавливаем текст (default)
        KolPos.setBounds(250,220,200,30);// Указываю местоположение и размер
        main_panel.add(KolPos);// Добавление в панель
        KolPos.addKeyListener(new KeyAdapter() {//Добавляем обработку событии клавиватуры
        	public void keyTyped(KeyEvent e) {//Добавляем метод который вызывается каждый раз при нажатии на клавиатуру
        		char c=e.getKeyChar();// Взвращаем введённый символ
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// Устанавливаем ограничения ввода
        				e.consume();//Добавляем потребитель события
        			
        			}
        	}
        });
        
        
        
        
        JLabel n_6 = new JLabel("Расходы на рекламу"); // Отображение текста или изображения
        n_6.setBounds(20,257,200,30);
        main_panel.add(n_6);            	
        JTextField RasRek = new JTextField(10);// Добавляем поле 
        RasRek.setText("");// Устанавливаем текст (default)
        RasRek.setBounds(250,260,200,30);// Указываю местоположение и размер
        main_panel.add(RasRek);// Добавление в панель
        RasRek.addKeyListener(new KeyAdapter() {//Добавляем обработку событии клавиватуры
        	public void keyTyped(KeyEvent e) {//Добавляем метод который вызывается каждый раз при нажатии на клавиатуру
        		char c=e.getKeyChar();// Взвращаем введённый символ
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// Устанавливаем ограничения ввода
        				e.consume();//Добавляем потребитель события
        			
        			}
        	}
        });
        
    	
        
        
        
        JLabel n_7 = new JLabel("Расходы на персонал"); // Отображение текста или изображения
        n_7.setBounds(20,297,200,30);
        main_panel.add(n_7);               	
        JTextField RasPer = new JTextField(10);// Добавляем поле 
        RasPer.setText("");// Устанавливаем текст (default)
        RasPer.setBounds(250,300,200,30);// Указываю местоположение и размер
        main_panel.add(RasPer);// Добавление в панель
        RasPer.addKeyListener(new KeyAdapter() {//Добавляем обработку событии клавиватуры
        	public void keyTyped(KeyEvent e) {//Добавляем метод который вызывается каждый раз при нажатии на клавиатуру
        		char c=e.getKeyChar();// Взвращаем введённый символ
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// Устанавливаем ограничения ввода
        				e.consume();//Добавляем потребитель события
        			
        			}
        	}
        });        	    
             
        
        
        
                	    
        JLabel n_8 = new JLabel("Прочие расходы"); // Отображение текста или изображения
        n_8.setBounds(20,337,200,30);
        main_panel.add(n_8);                  	
        JTextField ProcRas = new JTextField(10);// Добавляем поле 
        ProcRas.setText("");// Устанавливаем текст (default)
        ProcRas.setBounds(250,340,200,30);// Указываю местоположение и размер
        main_panel.add(ProcRas);// Добавление в панель
        ProcRas.addKeyListener(new KeyAdapter() {//Добавляем обработку событии клавиватуры
        	public void keyTyped(KeyEvent e) {//Добавляем метод который вызывается каждый раз при нажатии на клавиатуру
        		char c=e.getKeyChar();// Взвращаем введённый символ
        			if( ((c<'0')||(c>'9'))&&(c!='.')&&(c != KeyEvent.VK_BACK_SPACE)) {// Устанавливаем ограничения ввода
        				e.consume();//Добавляем потребитель события
        			
        			}
        	}
        });    	    
            	
        
        
        
        
        JLabel nazv = new JLabel("Расчёт"); // Отображение текста или изображения
        nazv.setBounds(20,380,200,30);
        main_panel.add(nazv);
        
        
        
        ButtonGroup groub = new  ButtonGroup();
        JRadioButton Stoim = new JRadioButton ("Стоимость",true);
        Stoim.setBounds(100,380,100,30);
        JRadioButton Dohod = new JRadioButton ("Доход",false);
        Dohod.setBounds(250,380,100,30);
        groub.add(Stoim);
        groub.add(Dohod);
        main_panel.add(Stoim);
        main_panel.add(Dohod);
            
        
        JButton button_exit = new JButton("Выход"); // добавляем кнопку
    	button_exit.setBounds(300,430,120,40);
    	ActionListener actionListener = new ListenerButton(); //создаем слушатель
    	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
    	main_panel.add(button_exit);
        
        
    	JButton  Rachit = new JButton("Расчитать");
    	Rachit.addActionListener(new ActionListener() {

			private Rachet_1 rt;
			private Rach_2 doh;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Stoim.isSelected()) {
					rt = new Rachet_1(StAr.getText(),RasRek.getText(),RasPer.getText(),ProcRas.getText());
					String message ="";
					message+="Стоимость: "+rt.Rashod;
					JOptionPane.showMessageDialog(null, message, "Результат",JOptionPane.PLAIN_MESSAGE);
				}
				if (Dohod.isSelected()) {
					doh = new Rach_2(StAr.getText(),StYch.getText(),KolYch.getText(),StBil.getText(),KolPos.getText(),RasRek.getText(),RasPer.getText(),ProcRas.getText());
					String message ="";
					message+="Доход: "+doh.Dohod;
					JOptionPane.showMessageDialog(null, message, "Результат",JOptionPane.PLAIN_MESSAGE);
				}
			} // Добавляем слушателя нажатия кнопки
			
	    });
    	Rachit.setBounds(80, 430, 120, 40);
		main_panel.add(Rachit);
        
		PerOpr_1 InfRaz = new PerOpr_1();
		InfRaz.Odin();
        
        
    	main_GUI.setVisible(true);
    	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
    	

    }
    

public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
	pusk= new Start_1();
	System.out.println("Start");
}

}