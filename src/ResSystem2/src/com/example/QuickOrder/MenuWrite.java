package com.example.QuickOrder;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuWrite extends Activity {

	private Button submit;
	private EditText menuname, price;
	private MyOpenHelper menuHelper;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menuwrite);
		submit = (Button) findViewById(R.id.submit);
		menuname = (EditText) findViewById(R.id.menunameText);
		price = (EditText) findViewById(R.id.priceText);
		registerForContextMenu(menuname);
		
		menuHelper = new MyOpenHelper(MenuWrite.this, "menuTable.db",
				null, 1);
		final SQLiteDatabase menu = menuHelper.getReadableDatabase();
		
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String menunameString = menuname.getText().toString();
				String priceString = price.getText().toString();
				ContentValues values = new ContentValues();
				
				// 开始填数据
				values.put("cainame", menuname.getText().toString());
				values.put("price", price.getText().toString());
				menu.insert("menuTable", null, values);
				values.clear();
				Toast.makeText(MenuWrite.this,
						"写入成功" ,
						Toast.LENGTH_LONG).show();
			}
		});
	}
	
}
