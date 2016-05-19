package com.assignment4;

/**
 * 
 * @author Deep
 *
 */
public class PatternProcessor {
	private CharaceterPattern prevHandler;
	private CharaceterPattern head;
	
	public void addHandler(CharaceterPattern handler){
		if(head==null){
			head=handler;
			prevHandler=head;
		}
		else{
			if(prevHandler != null){
		     prevHandler.setNext(handler);
		  }
		  prevHandler = handler;
		}
	}

	public boolean handleRequest(String data,int index){
		return head.handleRequest(data, index);
	}

}
