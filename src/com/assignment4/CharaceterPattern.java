package com.assignment4;

/**
 * 
 * @author Deep
 *
 */

public abstract class CharaceterPattern {

	public abstract void setNext(CharaceterPattern handler);
	
	public abstract boolean handleRequest(String data,int index);

}
