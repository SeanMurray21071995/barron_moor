package game;

import java.util.ArrayList;

public class Swamp {
	
	private ArrayList<Event> EventList = new ArrayList();
	private ArrayList<Location> LocationList = new ArrayList();
	
	public Swamp(ArrayList<String> Event, ArrayList<String> Location)
	{
		this.createTheEventList(Event);
		this.creatTheLocationList(Location);
	}
	
	
	
	private Event createAnEvent(String EventText)  
	{
		Event event = new Event(EventText); 
		return event; 
	}
	public void createTheEventList(ArrayList<String> EventText) {
		for(String event: EventText) 
		{
			EventList.add(this.createAnEvent(event));			
		}
	}  
	
	public Event getEventByPosition(int position) 
	{
		return this.EventList.get(position);
	}
	
	private Location createALocation(String Description) 
	{
		Location location = new Location(Description);
		return location;
	}
	public void creatTheLocationList(ArrayList<String> DescriptionList) 
	{
		for(String description: DescriptionList) 
		{
			LocationList.add(this.createALocation(description));
		}
	}
	public Location getLocationByPositio(int position)
	{
		return this.LocationList.get(position);
	}
	
	public void assignEvent(Event event, Location location) 
	{
		location.setEvent(event);
		event.setAssigned();
	}
	private boolean checkEvents() 
	{
		for(Event event:EventList) 
		{
			if(event.getAssigned()==false) 
			{
				return false;
			}
			else
				continue;
		}
		return true;
	}
}
