package Rgr;

public class Rachet_1 {
	float Arenda,Reklama,Personal,Prochie,Rashod;
	// StArenda - ��������� ������ ���������
	//Reklama - ������ �� �������
	//Personal - ������ �� ��������
	//Prochie - ������ ������� 
	
	
public Rachet_1(String Arenda_str,String Reklama_str,String Personal_str,String Prochie_str) {
	Arenda = Float.parseFloat(Arenda_str);
	Reklama = Float.parseFloat(Reklama_str);
	Personal = Float.parseFloat(Personal_str);
	Prochie = Float.parseFloat(Prochie_str);
	Rashod = Arenda + Reklama + Personal + Prochie;
	

}
public float getFinal_1() {
	return Rashod; //���������� �������� �������� ������
}
}