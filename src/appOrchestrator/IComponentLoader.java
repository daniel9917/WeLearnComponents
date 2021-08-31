package appOrchestrator;

import java.util.List;

public interface IComponentLoader {
	
	/**
	 * This Interface defines the methods in order to connect a subproject for pulling up the entire 
	 * project itself.
	 * 
	 */
	 
	public boolean connect();
	
	public void disconnect();


}
