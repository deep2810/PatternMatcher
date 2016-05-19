package com.assignment4;

/**
 * 
 * @author Deep
 *
 */
public class Match {

	private String pattern;
	private PatternProcessor processor; 
	private int index=0;
	
	public Match(String pattern) {
		this.pattern=pattern;
		createPattern();
	}
	
	public void createPattern(){
		processor=new PatternProcessor();

			while(index!=pattern.length()){
				if(pattern.charAt(index)=='.'){
					processor.addHandler(new DotCharacter(pattern.charAt(index)));
					index++;
				}
				else if(pattern.charAt(index)=='*'){
					processor.addHandler(new StarCharacter(pattern.charAt(index)));
					index++;
				}
				else{
					processor.addHandler(new NormalCharacter(pattern.charAt(index)));
					index++;
				}
			}
		index=0;
	}
	
	public int findFirstIndex(String data){
		while(index!=data.length()){
			if(processor.handleRequest(data, index)==true){
				return index;
			}
			else{
				index++;
			}
		}
		return -1;
	}


}
