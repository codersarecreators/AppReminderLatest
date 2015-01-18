package com.codersarecreators.myreminder;

import android.R;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.webkit.WebView.FindListener;
import android.widget.TextView;

public class MultiChoiceDialogue{
	final static CharSequence[] selectDay = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	static boolean[] selectVal = {false,false,false,false,false,false,false};
	
 public static void MultipleChoiceAlertBox(Context context, final TextView textview) { 
	
     Builder builder = new AlertDialog.Builder(context);  
     builder.setTitle("Select Weekdays");  
     
     builder.setMultiChoiceItems(selectDay, selectVal,  
         new DialogInterface.OnMultiChoiceClickListener() {  
           @Override  
           public void onClick(DialogInterface dialog, int which,  
               boolean isChecked) {  
             selectVal[which] = isChecked;  
           }  
         });  
     builder.setPositiveButton("Set", new DialogInterface.OnClickListener() {  
       @Override  
       public void onClick(DialogInterface dialog, int which) {
    	   String selectedVal = " ";
    	    textview.setVisibility(View.VISIBLE);
    	    for (int i = 0; i < selectDay.length; i++) {  
    	           if (selectVal[i]) {  
    	        	   selectedVal += selectDay[i]+ " ";  
    	           }  
    	         }  
    	    textview.setText(selectedVal);
           dialog.dismiss();  

       }  
     });  
     builder.setNegativeButton("Cancel",  
         new DialogInterface.OnClickListener() {  
           @Override  
           public void onClick(DialogInterface dialog, int which) {  
             dialog.dismiss();  
           }  
         });  
     AlertDialog alert = builder.create();  
     alert.show();  
   } 
}