package com.codersarecreators.myreminder;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.WindowManager.LayoutParams;



public class ReminderNotification extends DialogFragment{
	Ringtone ringtone;
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		 
        /** Turn Screen On and Unlock the keypad when this alert dialog is displayed */
        getActivity().getWindow().addFlags(LayoutParams.FLAG_TURN_SCREEN_ON | LayoutParams.FLAG_DISMISS_KEYGUARD);
 
        Vibrator vibrator = (Vibrator)
				getActivity().getSystemService(Context.VIBRATOR_SERVICE);
		vibrator.vibrate(5000);
		 Uri alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
	        if (alarmUri == null) {
	            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
	        }
	        ringtone = RingtoneManager.getRingtone(getActivity(), alarmUri);
	        ringtone.play();
        /** Creating a alert dialog builder */
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
 
        /** Setting title for the alert dialog */
        builder.setTitle("Reminder");
 
        /** Setting the content for the alert dialog */
        builder.setMessage(AlarmReceiver.notes);
 
        /** Defining an OK button event listener */
        builder.setPositiveButton("OK", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                /** Exit application on click OK */
            	ringtone.stop();
                getActivity().finish();
            }
        });
 
        /** Creating the alert dialog window */
        return builder.create();
    }
 
    /** The application should exit, if the user presses the back button */
    @Override
    public void onDestroy() {
        super.onDestroy();
        getActivity().finish();
    }
}
