package com.codersarecreators.myreminder;



public class ReminderObject {

	private String id = null;
	private String note = null;
	private String date = null;
	private String time = null;
	private int occurence;
	private int occurenceCode;
	
	
	public ReminderObject(String id,String date, String time, String note, int occurence, int occurenceCode)
	{
		this.id = id;
		this.note = note;
		this.date = date;
		this.time = time;
		this.occurence = occurence;
		this.occurenceCode = occurenceCode;
	}

	public String getNote() {
		return note;
	}

	public String getTime() {
		return time;
	}

	public String getId() {
		return id;
	}

	public String getDate() {
		return date;
	}
	
	//override the toString method
	public String toString()
	{
		return time + ", " + note;
	}

	public int getOccurence() {
		return occurence;
	}

	public void setOccurence(int occurence) {
		this.occurence = occurence;
	}

	public int getOccurenceCode() {
		return occurenceCode;
	}

	public void setOccurenceCode(int occurenceCode) {
		this.occurenceCode = occurenceCode;
	}
}
