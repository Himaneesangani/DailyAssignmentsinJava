public class Innings {
	
	private String teamname;
	private String inningsname;
	private int runs;
	
	public void setTeamName(String Name)
	{
		this.teamname=Name;
	}
	public String getTeamName()
	{
		return this.teamname;
	}
	public void setInningsName(String inningsname)
	{
		this.inningsname=inningsname;
	}
	public String getInningsName()
	{
		return this.inningsname;
	}
	public void setRuns(int runs)
	{
		this.runs=runs;
	}
	public int getRuns()
	{
		return this.runs;
	}
	public void displayInningsDetails()
	{
		System.out.println("Team Name : "+ this.teamname);
		System.out.println("Scored : "+ this.runs);
		if(this.inningsname.equals("First"))
		{
			System.out.println("Need "+ (this.runs+1)+" to won...");
		}
		else
		{
			System.out.println("Match Ended...");
		}
	}

}

