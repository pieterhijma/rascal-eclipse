package org.meta_environment.rascal.eclipse.console.internal;

import java.util.ArrayList;

public class CommandHistory{
	private final static int COMMAND_LIMIT = 1000;
	
	private ArrayList<String> history;
	
	private int index;
	
	public CommandHistory(){
		super();
		
		history = new ArrayList<String>();
		
		index = 0;
	}
	
	public void addToHistory(String command){
		if(history.size() == COMMAND_LIMIT) history.remove(0);
		history.add(command);
		resetState();
	}
	
	// Sooner
	public String getPreviousCommand(){
		if(index == -1){
			return "";
		}else if((--index) == -1){
			return "";
		}
		
		return history.get(index);
	}
	
	// Later
	public String getNextCommand(){
		if(index == history.size()){
			return "";
		}else if((++index) == history.size()){
			return "";
		}
		
		return history.get(index);
	}
	
	public void resetState(){
		index = history.size();
	}
}
