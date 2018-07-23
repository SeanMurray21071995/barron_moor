package game;

public class Location {
	private String Description;
	private int Id;
	private Event AssignedEvent;
	private static int incrementId=0;
	
	public Location(String description) 
	{
		this.Description = description;
		this.Id = this.incrementId;
	//	System.out.println(this.incrementId);
		this.incrementId = this.incrementId+1;	
		
	} 
	public String getDescription() 
	{
		return this.Description;
	}
	public int getId() 
	{
		return this.Id;
	}
	
	public Event getEvent() 
	{
		return this.AssignedEvent;
	}
	public void setEvent(Event event) 
	{
		this.AssignedEvent=event;
	}
}
