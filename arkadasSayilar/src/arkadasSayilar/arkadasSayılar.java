package arkadasSayilar;

public class arkadasSayılar {

	public static void main(String[] args) {
		//arkadas sayılar kendileri hariç pozitif tam bölenlerinin toplamı 
		//birbirine eşit olan sayılardır.
		//220-284
		
		int sayi1 =220;
		int total1=0;
		int sayi2 =284;
		int total2=0;
		
		//4
		if(sayi1<1) {
			System.out.println("Geçersiz sayı1");
			return;
		}
		//5
		if(sayi2<1) {
			System.out.println("Geçersiz sayı2");
			return;
		}
		//1
		for (int i=1;i<sayi1;i++) {
			if(sayi1 % i==0) {
				total1=total1+i;		
			}	
		}//2
		for(int j=1;j<sayi2;j++) {
			if(sayi2 % j==0) {
				total2=total2+j;
			}
		}//3
		System.out.println(total1);
		System.out.println(total2);
		if(total1==sayi2&&total2==sayi1) {
			System.out.println("Arkadaş sayı");
		}else {
			System.out.println("Arkadaş sayı değildir");
		}
	}

}
