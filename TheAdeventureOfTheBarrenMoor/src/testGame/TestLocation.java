package testGame;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Location;

public class TestLocation {
 
	@Test
	public void testDescriptionGetSet() 
	{
		Location l = new Location("This is the description");
		assertEquals("Didnt retrive the description",l.getDescription(),"This is the description");
	}
	
	@Test
	public void testIdGetSet() 
	{
		Location l = new Location("test");
		assertEquals("Didn't set or get the id", l.getId(),0);
		//System.out.println(l.getId());
	}
	
	@Test 
	public void incrementId() 
	{
		Location l1 = new Location("test");
		//System.out.println(l1.getId());
		assertEquals("didtn set id to 0", l1.getId(),2);
		Location l2 = new Location("test");
		//System.out.println(l2.getId());
		assertEquals("didnt set id to 1", l2.getId(), 3);
		Location l3 = new Location("test");
		assertEquals("didnt set id to 2", l3.getId(), 4);
	}
	
	
	
}
