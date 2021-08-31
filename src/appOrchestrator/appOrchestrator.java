package appOrchestrator;

import java.util.List;

import appAPI.APILoaderService;

public class appOrchestrator {
	
	private List<String> connections;
	private static APILoaderService API_Loader;
		
	public static void main (String args []) {
		
		String api_path = "/any/path/to/bin.jar";
		//Conectando el API / Backend
		try {
			API_Loader = new APILoaderService(api_path);									
		}catch(Exception e){
			System.err.print("There was an error when trying to connect to the "
					+ "jar file at: "+api_path+".  \n Exception: "+e.getMessage());
		}
		
		
		
		
		
	}
	
	

}
