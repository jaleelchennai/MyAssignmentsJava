package homeassignment.six;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("Connect from Subclass");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from Subclass");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute the update from Subclass");
		
	}
	
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
		
	}
	
	

}
