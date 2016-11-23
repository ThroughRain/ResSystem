package com.example.QuickOrder;

import java.lang.reflect.Method;

import com.example.QuickOrder.R;

//import com.example.mymenudemo.MainActivity;
//import com.example.mymenudemo.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button button1,button2,button3,button4,button5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1=(Button)findViewById(R.id.serve);
		
		button2=(Button)findViewById(R.id.caidan);
		
		button3=(Button)findViewById(R.id.tongji);
		
		button4=(Button)findViewById(R.id.pay);
		
		
		
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent=new Intent();
					intent.setClass(MainActivity.this, Pay.class);
					startActivity(intent);
				
			}
		});
		
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(MainActivity.this, Tongji.class);
				startActivity(intent);
			}
		});
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(MainActivity.this, Serve.class);
				startActivity(intent);				
				
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent =new Intent();
				intent.setClass(MainActivity.this,Caidan.class);
				startActivity(intent);
			}
		});
	} 
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		getMenuInflater().inflate(R.menu.main, menu);
		menu.setHeaderTitle("請選擇菜單");
		
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		
		return super.onContextItemSelected(item);
		
	}
	
	private void setIconVisible(Menu menu) {

		try {

			Class<?> clazz = Class
					.forName("com.android.internal.view.menu.MenuBuilder");
			// 未知的类
			Method m = clazz.getDeclaredMethod("setOptionalIconsVisible",

			boolean.class);

			m.setAccessible(true);

			m.invoke(menu, true);
			// MenuBuilder实现Menu接口，创建菜单时，传进来的menu其实就是MenuBuilder对象(java的多态特征)
		} catch (Exception e) {

			e.printStackTrace();

		}

	}
	
}
