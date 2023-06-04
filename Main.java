//IDatabase main class

public class Main {
	public static void main(String[] args) {
		 // IDataBase databese = new IDataBase();   // interfaceden obje olu�turmaya izin vermiyor...
		 
		  Customer musteri = new Customer();
		  Student ogrenci = new Student();
		  
		  musteri.log();
		  ogrenci.log();
		  
		  // D���nelim bu Interface ler nerede kullan�yor niye bunu kullan�yoruz d���nelim
		  // ??????????????????????????????????????????????????????????????????????????
		  
		  
		  System.out.println("-------------------------------------------------------------\n");
		  
		  // polymorphisim yani refernas aktarma i�i �ntercelerde de var
		  
		  IDataBase database1 = (IDataBase) new Customer();  //databese1 m��teriye g�re �al�sacak
		  database1.log();
		  
		  IDataBase database2 = (IDataBase) new Student();   // //databese2 ��renciye g�re �al�sacak
		  database2.log();
		 }
}
