//IDatabase main class

public class Main {
	public static void main(String[] args) {
		 // IDataBase databese = new IDataBase();   // interfaceden obje oluþturmaya izin vermiyor...
		 
		  Customer musteri = new Customer();
		  Student ogrenci = new Student();
		  
		  musteri.log();
		  ogrenci.log();
		  
		  // Düþünelim bu Interface ler nerede kullanýyor niye bunu kullanýyoruz düþünelim
		  // ??????????????????????????????????????????????????????????????????????????
		  
		  
		  System.out.println("-------------------------------------------------------------\n");
		  
		  // polymorphisim yani refernas aktarma iþi ýntercelerde de var
		  
		  IDataBase database1 = (IDataBase) new Customer();  //databese1 müþteriye göre çalýsacak
		  database1.log();
		  
		  IDataBase database2 = (IDataBase) new Student();   // //databese2 öðrenciye göre çalýsacak
		  database2.log();
		 }
}
