package com.assignment4;

/**
 * 
 * @author Deep
 *
 */

public class NormalCharacter extends CharaceterPattern {
	
	private CharaceterPattern next;
	private char normalChar;
	
	public NormalCharacter(char normalChar) {
		this.normalChar=normalChar;
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
       
        if(data.charAt(index)!=normalChar){
        	return false;
        }
		else{
			if(next!=null){
				return next.handleRequest(data, ++index);
			}
			else{
				if(data.charAt(index)!=normalChar)
					return false;
				else 
					return true;
			}
		}
	}
}
