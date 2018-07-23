package testGame;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import game.Event;
import game.Location;
import game.Swamp;

public class TestSwamp {
	
	@Test 
	public void createEventList() 
	{
		ArrayList<String> testLocation = new ArrayList();
		ArrayList<String> testEvent = new ArrayList();
		testLocation.add("Test1");
		testLocation.add("Test2");
		testEvent.add("test1");
		testEvent.add("test2");
		Swamp sw = new Swamp(testLocation,testEvent);
		assertEquals("event not created",(sw.getEventByPosition(0)).getId(),0 );
		assertEquals("event not created",(sw.getEventByPosition(1)).getId(),1);
	}
	
	@Test
	public void createLocationList() 
	{
	
		ArrayList<String> testEvent = new ArrayList();
		ArrayList<String> testLocation = new ArrayList();
		testLocation.add("Test1");
		testLocation.add("Test2");
		testEvent.add("test1");
		testEvent.add("test2");
		Swamp sw = new Swamp(testLocation,testEvent);
		System.out.println((sw.getLocationByPositio(0)).getId());
		assertEquals("did not create location list", (sw.getLocationByPositio(0)).getId(),3);	
		assertEquals("did not create location list", (sw.getLocationByPositio(1)).getId(),4);	
	}
	
	@Test
	public void testAssignEventToLocation() 
	{
		ArrayList<String> testLocation = new ArrayList();
		ArrayList<String> testEvent = new ArrayList();
		Swamp sw = new Swamp(testLocation,testEvent);
		Location l = new Location("test");
		Event e = new Event("test");
		sw.assignEvent(e,l);
		assertEquals("not assigned",l.getEvent(),e);
	}
	
	@Test
	public void testEventAssignmentDecider() 
	{
		ArrayList<String> testEvent = new ArrayList();
		ArrayList<String> testLocation = new ArrayList();
		testLocation.add("Test1");
		testLocation.add("Test2");
		testEvent.add("test1");
		testEvent.add("test2");
		Swamp sw = new Swamp(testLocation, testEvent);
		sw.randomEventAssign();
		assertEquals("not all of the events have been assigned",sw.checkAllEvents,true);
	}
	
	


}
