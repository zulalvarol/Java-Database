class DatabaseManager {
	
	public void addDatabase(IDataBase database) {
		database.add();
	}
	
	public void updateDatabase(IDataBase database) {
		database.update();
	}
	
	public void getDatabase(IDataBase database) {
		database.get();
	}
	
	public void deletDatabase(IDataBase database) {
		database.delete();
	}
	
}

public class Main_DataBase {
public static void main(String[] args) {
		
		DatabaseManager manager = new DatabaseManager();
		
		manager.addDatabase(new Mongo());
		manager.getDatabase(new MySqlDatabase());
		manager.deletDatabase(new Oracle());
		
		// �imdi Oracle class�n� olu�tur, patron orcal ile anla�t�....
		
		// Bir aray�z ve bu aray�z�n referans� sayesinde kararl�l���m�z ve s�reklili�imiz sa�lam�� oluyoruz....
		
	}
}
