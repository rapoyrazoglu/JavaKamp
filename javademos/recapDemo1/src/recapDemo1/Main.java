package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1;
		sayi1= 20; //değişken tanımlandıktan sonra da atama yapılabilir
		int sayi2 = 26;
		int sayi3 = 2;
		
		int enBuyuk = sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük: "+enBuyuk);
	}

}