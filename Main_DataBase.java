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
		
		// Şimdi Oracle classını oluştur, patron orcal ile anlaştı....
		
		// Bir arayüz ve bu arayüzün referansı sayesinde kararlılığımız ve sürekliliğimiz sağlamış oluyoruz....
		
	}
}
