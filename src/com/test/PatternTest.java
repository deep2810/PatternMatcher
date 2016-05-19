package com.test;

/**
 * @author Deep
 */

import org.junit.*;
import static org.junit.Assert.*;
import com.assignment4.Match;

public class PatternTest {

	@Test
	public void patternTest() {
		Match match=new Match("c.t");
		assertEquals(0, match.findFirstIndex("cat"));
		
		match=new Match("c*t");
		assertEquals(0, match.findFirstIndex("cabdt"));
		
		match=new Match("s.n*i");
		assertEquals(4, match.findFirstIndex("deepsanghvi"));
		
		match=new Match("ca.t*a");
		assertEquals(-1, match.findFirstIndex("catpb"));
		
		match=new Match("*a.b.c*d");
		assertEquals(0, match.findFirstIndex("cacapbqcpeed"));
	}

}
