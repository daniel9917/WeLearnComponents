package appFrontEnd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import appOrchestrator.IComponentLoader;

public class FrontEndLoaderService implements IComponentLoader{
	
	private String path;
	private String command;
	
	private boolean isConnected;
	
	public FrontEndLoaderService(String path) {
		// TODO Auto-generated constructor stub
		this.path = path;
		this.isConnected = false;
		
		//Se ejecuta la conexión
		this.connect();
	}
	
	
	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		try {
			 ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd executables/WeLearnUI && npm run start");			
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
			System.err.println("Unable to run build src");
			this.isConnected = false;
			return isConnected;
		}
		this.isConnected = false;
		return this.isConnected;
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
