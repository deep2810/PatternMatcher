package com.assignment4;

/**
 * 
 * @author Deep
 *
 */

public class DotCharacter extends CharaceterPattern{

	private CharaceterPattern next;
	//private char dot;

	public DotCharacter(char dot) {
		//this.dot=dot;
	}
	
	@Override
	public void setNext(CharaceterPattern handler) {
		next=handler;
	}

	@Override
	public boolean handleRequest(String data, int index) {
		
		if(index==data.length()){
			return false;
		}

        if(next!=null){
			return next.handleRequest(data, ++index);
		}
		else{
			return false;
		}
   	}
}
