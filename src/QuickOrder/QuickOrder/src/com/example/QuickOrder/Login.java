package com.example.QuickOrder;

import com.example.QuickOrder.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Login extends Activity{
	Button button; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);	
		button=(Button)findViewById(R.id.loginbtn);
	
		button.setOnClickListener(new OnClickListener() {
			
			@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent=new Intent();
					intent.setClass(Login.this, MainActivity.class);
					startActivity(intent);
				
			}
		});
		
	}
	
	

}
