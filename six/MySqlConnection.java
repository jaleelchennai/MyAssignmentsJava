package homeassignment.six;

public abstract class MySqlConnection implements DatabaseConnection {
	
	public void executeQuery() {
		System.out.println("Query Executed from abstract class");
	}
	
//	public static void main(String[] args) {
//		MySqlConnection msconnection = new MySql
//	}

}
