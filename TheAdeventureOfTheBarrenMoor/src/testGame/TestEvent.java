package testGame;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Event;

public class TestEvent {
	 
	@Test
	public void testIdGetSet() 
	{
		Event e = new Event("sample text");
		assertEquals("Id was not set",e.getId(),0 );
		
	}
	
	@Test
	public void testEventTextGetSet() 
	{
		Event e = new Event("sample text");
		assertEquals("sampleText was not set",e.getEventText(),"sample text");
	}
	
	@Test 
	public void testIncrementid() 
	{
		Event e1 = new Event("sample text");
		assertEquals("didnt set id to 2",e1.getId(),1);
		Event e2 = new Event("sample text");
		assertEquals("didnt set id to 3",e2.getId(),2);
		Event e3 = new Event("sample text");
		assertEquals("didnt set id to 4", e3.getId(),3);
		
	}
	
	

}
