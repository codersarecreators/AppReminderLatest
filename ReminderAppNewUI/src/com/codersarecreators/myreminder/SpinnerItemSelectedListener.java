package com.codersarecreators.myreminder;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class SpinnerItemSelectedListener implements AdapterView.OnItemSelectedListener {
	static int occurrence;
	Context context;
	TextView textview;
	SpinnerItemSelectedListener(Context context, TextView textview){
		this.context = context;
		this.textview = textview;
	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int pos,
			long arg3) {
		switch(pos){
		case 0: occurrence = 0;
			break;
		case 1: occurrence = 1;
		MultiChoiceDialogue.MultipleChoiceAlertBox(context,textview);
		break;
		case 2: occurrence = 2;
		SingleChoiceDialogue.SingleChoiceWithRadioButton(context,textview);
		break;
		case 3: occurrence = 3;
		break;
		default: break;
		}
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
