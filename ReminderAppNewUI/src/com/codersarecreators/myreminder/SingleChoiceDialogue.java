package com.codersarecreators.myreminder;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class SingleChoiceDialogue {
	
	static CharSequence[] selectMonth = {"1","2","3","4","5","6","7","8","9","10","11"};
	
	public static void SingleChoiceWithRadioButton(Context context, final TextView textview) {  
	     Builder builder = new AlertDialog.Builder(context);  
	     builder.setTitle("Select Month Interval");  
	     builder.setSingleChoiceItems(selectMonth, -1,  
	         new DialogInterface.OnClickListener() {  
	           @Override  
	           public void onClick(DialogInterface dialog, int which) {  
	           }  
	         }); 
	     builder.setPositiveButton("Set", new DialogInterface.OnClickListener() {  
	         @Override  
	         public void onClick(DialogInterface dialog, int which) { 
	        	 
	     	    textview.setVisibility(View.VISIBLE);
	     	   ListView lw = ((AlertDialog)dialog).getListView();
	     	  Object checkedItem = lw.getAdapter().getItem(lw.getCheckedItemPosition());
	     	    textview.setText("Remind every "+checkedItem.toString()+ " month");
	             dialog.dismiss();  

	          /* for (int i = 0; i < selectDay.length; i++) {  
	             if (selectVal[i]) {  
	               selectetdVal += "+" + selectDay[i];  
	             }  
	           }  
	           Toast.makeText(MainActivity.this, selectetdVal,  
	               Toast.LENGTH_LONG).show(); */ 
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
