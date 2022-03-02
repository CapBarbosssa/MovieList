package sait.mms.problemdomain;

public class Movie {
	private int duration;
	private String title;
	private int year;
	
    public Movie() {
	
    }
	public Movie(int duration, String title, int year) {
		this.duration = duration;
		this.title = title;
		this.year = year;
		
	}

	public int getDuration() {
	
		return this.duration;
		
	}

	public String getTitle() {
		
		return this.title;
	}

	public int getYear() {
		
		return this.year;
	}

	public String toString() {
		return duration + ", " + year + ", " + title ;
	}

	
	

}
