package com.codersarecreators.factory;

import com.codersarecreators.myreminder.ReminderObject;
import com.codersarecreators.myreminder.SmsObject;

public class ReminderConcreteFactory extends ReminderFactory {

	
	
	@Override
	public SmsObject CreateSmsObject(String id, String text, String date,
			String time, String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReminderObject CreateReminderObject(
			String id, String date, String time, String note, int occurrence, int occurrenceCode) {
		// TODO Auto-generated method stub
		ReminderObject reminderObj = new ReminderObject(id,date,time,note,occurrence,occurrenceCode);
		if(null == reminderObj)
			return null;
		return reminderObj;
	}


}
