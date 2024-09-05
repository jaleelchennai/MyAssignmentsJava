package homeassignment.five;

public class APIClient {
	
	//Define the sendRequest method
	public void sendRequest(String endPoint) {
		System.out.println("Sending request to endpoint: " + endPoint);
	}
	
	//Another version of sendRequest metho with three arguments
	public void sendRequest(String endPoint, String requestBody, Boolean requestStatus) {
		System.out.println("Sending request to endpoint: " + endPoint + ", Sending request to Body: " + requestBody+ ", Status of the request is: "+ requestStatus);
		
	}
	
	public static void main(String[] args) {
		APIClient apiClient = new APIClient();
		
		//calling the first  method
		apiClient.sendRequest("api path");
		
		//calling the overload method
		apiClient.sendRequest("api path", "body path", true);
		
	}

}
