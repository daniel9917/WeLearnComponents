package appAPI;

import java.util.List;

import appOrchestrator.IComponentLoader;

public class APILoaderService implements IComponentLoader  {

	private String path;
	private String command;
	
	public APILoaderService(String path) {
		// TODO Auto-generated constructor stub
		this.path = path;
	}
	
	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

}
