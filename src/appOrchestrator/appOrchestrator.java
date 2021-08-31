package appOrchestrator;

import java.util.List;

import appAPI.APILoaderService;
import appCore.appCore;
import appFrontEnd.FrontEndLoaderService;

public class appOrchestrator {

	private List<String> connections;
	private static APILoaderService API_Loader;
	private static FrontEndLoaderService FRONT_Loader;

	public static void main(String args[]) {
		//Core Welcoming
		System.out.println("Welcome to " + appCore.getName());
		
		//Enabling connections with the API
		apiConnection();
		
		//Enabling connections with the Front
//		frontEndConnection();

	}

	//Method that manages the connections with the API
	public static void apiConnection() {

		String api_path = "WeLearnAPI.jar";

		// Conectando el API / Backend
		try {
			API_Loader = new APILoaderService(api_path);
		} catch (Exception e) {
			System.err.print("There was an error when trying to connect to the " + "jar file at: " + api_path
					+ ".  \n Exception: " + e.getMessage());
		}

		if (API_Loader.isConnected()) {
			System.out.println("The connection with the API was successfully performed.");
		} else {
			System.out.println("Failed to connect with the api JAR at: " + api_path);
		}
	}
	
	public static void frontEndConnection() {
		
		String front_path = "/any/path/to/build";

		// Conectando el API / Backend
		try {
			FRONT_Loader = new FrontEndLoaderService(front_path);
		} catch (Exception e) {
			System.err.print("There was an error when trying to connect to the " + "project file at: " + front_path
					+ ".  \n Exception: " + e.getMessage());
		}

		if (FRONT_Loader.isConnected()) {
			System.out.println("The connection with the front project was successfully performed.");
		} else {
			System.out.println("Failed to connect with the source project at: " + front_path);
		}
		
	}
	
	

}
