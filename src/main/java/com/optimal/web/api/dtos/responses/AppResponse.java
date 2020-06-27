package com.optimal.web.api.dtos.responses;

import java.util.ArrayList;
import java.util.List;

public class AppResponse {

	private Boolean success;
	private List<String> fullMessage;
	
	
	public AppResponse(Boolean success) {
		this.success = success;
		fullMessage = new ArrayList<>();
	}
	
	public boolean isSuccess() {
		return success;
	}
	
	public List<String> getFullMessage(){
		return fullMessage;
	}
	
	public void setFullMessage(List<String> fullMessage) {
		this.fullMessage = fullMessage;
	}
	
	protected void addFullMessage(String message){
		if(message == null) 
		
		if(fullMessage == null) {
			fullMessage = new ArrayList<String>();
		}
		
		fullMessage.add(message);
	}
}
