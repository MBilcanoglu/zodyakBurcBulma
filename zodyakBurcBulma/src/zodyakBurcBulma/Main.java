package zodyakBurcBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dogumYil,sonuc=0;
		String zodyakBurc="Çin Zodyaðý Burcunuz: ";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Doðum Yýlýnýzý Giriniz: ");
		dogumYil=scan.nextInt();
		
		sonuc=dogumYil%12;
		
		if(sonuc==0) {
			zodyakBurc+="Maymun";
		}
		else if(sonuc==1) {
			zodyakBurc+="Horoz";
		}
		else if(sonuc==2) {
			zodyakBurc+="Köpek";
		}
		else if(sonuc==3) {
			zodyakBurc+="Domuz";
		}
		else if(sonuc==4) {
			zodyakBurc+="Fare";
		}
		else if(sonuc==5) {
			zodyakBurc+="Öküz";
		}
		else if(sonuc==6) {
			zodyakBurc+="Kaplan";
		}
		else if(sonuc==7) {
			zodyakBurc+="Tavþan";
		}
		else if(sonuc==8) {
			zodyakBurc+="Ejderha";
		}
		else if(sonuc==9) {
			zodyakBurc+="Yýlan";
		}
		else if(sonuc==10) {
			zodyakBurc+="At";
		}
		else if(sonuc==11) {
			zodyakBurc+="Koyun";
		}
		else {
			zodyakBurc="Girdiðiniz Deðeri Kontrol Ediniz !";
		}
		
		System.out.println(zodyakBurc);
	}

}
