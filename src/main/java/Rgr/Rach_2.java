package Rgr;

public class Rach_2 {
float StYch,KolYch,StBil,KolPos, Dohod;
float nalog= 0.2f;
float Arenda,Reklama,Personal,Prochie,Rashod;
// StArenda - Стоимость аренды помещения
//Reklama - Расход на рекламу
//Personal - Расход на персонал
//Prochie - Прочие расходы 


	public Rach_2(String Arenda_str,String StYch_str,String KolYch_str,String StBil_str,String KolPos_str,String Reklama_str,String Personal_str,String Prochie_str) {
		Arenda = Float.parseFloat(Arenda_str);
		StYch = Float.parseFloat(StYch_str);
		KolYch = Float.parseFloat(KolYch_str);
		StBil = Float.parseFloat(StBil_str);
		KolPos = Float.parseFloat(KolPos_str);
		Reklama = Float.parseFloat(Reklama_str);
		Personal = Float.parseFloat(Personal_str);
		Prochie = Float.parseFloat(Prochie_str);
		Rashod = Arenda + Reklama + Personal + Prochie;
		Dohod =(StYch*KolYch+StBil*StBil)*(1-nalog)-Rashod;
		
		
	}
	
	public float getFinal_2() {
		return Dohod; //возвращает итоговое значение вклада
		
	
}}
