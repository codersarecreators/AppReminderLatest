package com.codersarecreators.myreminder;

import com.example.reminderappnewui.R;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v4.app.NotificationCompat;

public class AlarmReceiver extends BroadcastReceiver{
	public static String notes;
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		notes = intent.getStringExtra("com.codersarecreators.notes");
		Intent notificatnIntent = new Intent(context, ReminderNotificationActivity.class);
		// Flag is set as we want to launch the reminderNotification seperately from the actual app
		notificatnIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(notificatnIntent);
		/*PendingIntent pi = PendingIntent.getActivity(context, 0, intentToOpen, 0);
		android.support.v4.app.NotificationCompat.Builder n = new NotificationCompat.Builder(context).
				setContentTitle("Reminder").setContentText(notes).setSmallIcon(R.drawable.ic_launcher).setContentIntent(pi).setAutoCancel(true);
		NotificationManager notifyManager = (NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);
		notifyManager.notify(0, n.build());*/
		
		
	}

}
