package game;

public class Event {
	private int Id;
	private String EventText;
	private static int incrementId=0;
	private boolean assigned= false;
	
	public Event(String EventText) 
	{
		this.EventText = EventText;
		this.Id = this.incrementId;
		this.incrementId=this.incrementId+1;
	}
	 
	public int getId() 
	{
		return this.Id;
	}
	
	public String getEventText() 
	{
		return this.EventText;
	}
	public void setAssigned() 
	{
		this.assigned=true;
	}
	public Boolean getAssigned() 
	{
		return assigned;
	}

}
