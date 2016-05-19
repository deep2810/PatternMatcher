package com.assignment4;

/**
 * 
 * @author Deep
 *
 */

public class StarCharacter extends CharaceterPattern {
		
	    private CharaceterPattern next;
		//private char star;
		
		public StarCharacter(char star) {
			//this.star=star;
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
	        	while(index!=data.length()){
	    			if(next.handleRequest(data, index)==true){
	    				return true;
	    			}
	    			else{
	    				index++;
	    			}
	    		}
	    		return false;
	        }
			else{
				return false;
			}
	    }
}
