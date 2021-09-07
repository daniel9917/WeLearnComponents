package appAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import appOrchestrator.IComponentLoader;

public class APILoaderService implements IComponentLoader  {

	private String path;
	private String command;
	
	private boolean isConnected;
	
	public APILoaderService(String path) {
		// TODO Auto-generated constructor stub
		this.path = path;
		this.isConnected = false;
		
		//Se ejecuta la conexión
				this.connect();
		
	}
	
	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		System.out.println(this.path);
		
		
		try {
			 ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd executables/API && java -jar "+path);			
			 builder.redirectErrorStream(true);
			 Process p = builder.start();
			 BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
			 String line;
			 while (true) {
		            line = r.readLine();
		            if (line == null) { break; }
		            System.out.println(line);
		        }
		}catch(Exception e) {
			System.err.println("Unable to run jar file");
			this.isConnected = false;
			return isConnected;
		}
		
		this.isConnected = true;
		return isConnected;
		
		
		
		
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	public boolean isConnected() {
		return isConnected;
	}

	public void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}
	
	

}
