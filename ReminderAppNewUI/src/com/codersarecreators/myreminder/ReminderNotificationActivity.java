package com.codersarecreators.myreminder;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class ReminderNotificationActivity extends FragmentActivity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        /** Creating an Alert Dialog Window */
        ReminderNotification alert = new ReminderNotification();
        
        /** Opening the Alert Dialog Window. This will be opened when the alarm goes off */
        alert.show(getFragmentManager(),"tag");
        
    }
}

