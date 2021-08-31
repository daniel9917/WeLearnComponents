package appFrontEnd;

import java.util.List;

import appOrchestrator.IComponentLoader;

public class FrontEndLoaderService  implements IComponentLoader{
	
	private String path;
	private String command;
	
	private boolean isConnected;
	
	public FrontEndLoaderService(String path) {
		// TODO Auto-generated constructor stub
		this.path = path;
		this.isConnected = false;
	}
	
	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
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
