package com.example.QuickOrder;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@SuppressLint("NewApi")
public class LoginActivity extends Activity {
	private Button loginbtn, regbtn;
	private EditText userName, pswEditText;
	private MyOpenHelper dbHelper,menuHelper;
	final public int CODE = 0x1717;

	/** Called when the activity 第一次启动. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginpage);
		loginbtn = (Button) findViewById(R.id.loginbtn);
		regbtn = (Button) findViewById(R.id.regbtn);
		userName = (EditText) findViewById(R.id.login_edit_account);
		pswEditText = (EditText) findViewById(R.id.login_edit_pwd);
		registerForContextMenu(userName);
		
		menuHelper = new MyOpenHelper(LoginActivity.this, "menuTable.db",
				null, 1);
		dbHelper = new MyOpenHelper(LoginActivity.this, "sudoku.db",
				null, 1);
		final SQLiteDatabase db = dbHelper.getReadableDatabase();
		final SQLiteDatabase menu = menuHelper.getReadableDatabase();
		loginbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String usernameString = userName.getText().toString();
				String pwdString = pswEditText.getText().toString();
				Cursor cursor = db.rawQuery(
						"select pwd from userTable where name=?",
						new String[] { usernameString }, null);
				if (cursor.moveToFirst()) {
					Log.i("test", cursor.getString(cursor.getColumnIndex("pwd")));
					if (pwdString.equals(cursor.getString(cursor.getColumnIndex("pwd")))) {
						Intent intent = new Intent(LoginActivity.this,
								MainActivity.class);
						Bundle bundle = new Bundle();
						Log.i("test", "1111111");
						bundle.putString("userName", userName.getText().toString());
						bundle.putString("psw", pswEditText.getText().toString());
						Log.i("test", "22222");
						intent.putExtras(bundle);
						startActivityForResult(intent, CODE);
					}else {
						Toast.makeText(LoginActivity.this, "用户名或密码错误！", Toast.LENGTH_LONG).show();
					}
					
				}
				
				// startActivity(intent);
				// finish();
			}
		});
		regbtn.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String usernameString = userName.getText().toString();
				String pwdString = pswEditText.getText().toString();

				Log.i("test", "11111111");
				// Cursor cursor=db.query(userTable, null, "name=?", new
				// String[]{usernameString}, null, null, null);
				Log.i("test", "22222222");
				if (usernameString.equals("") || pwdString.equals("")) {

					Toast.makeText(LoginActivity.this, "请输入用户名/密码",
							Toast.LENGTH_LONG).show();
				} else {
					Cursor cursor = db.rawQuery(
							"select * from userTable where name=?",
							new String[] { usernameString }, null);
					if (cursor.getCount() > 0) {
						Toast.makeText(LoginActivity.this, "用户名已经被注册！",
								Toast.LENGTH_LONG).show();

					}

					else {
						ContentValues values = new ContentValues();
						// 开始填数据
						values.put("name", userName.getText().toString());
						values.put("pwd", pswEditText.getText().toString());
						db.insert("userTable", null, values);
						values.clear();
						Toast.makeText(LoginActivity.this,
								"注册成功" ,
								Toast.LENGTH_LONG).show();
					}
				}
			}

		});

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == CODE && resultCode == CODE) {
			((EditText) findViewById(R.id.login_edit_pwd)).setText(""); // 清空密码编辑框

		}
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.main, menu);
		menu.setHeaderIcon(R.drawable.favicon);
		menu.setHeaderTitle("请选择");
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		// setIconEnable(menu, true);
		getMenuInflater().inflate(R.menu.main, menu);

		return true;
	}

	// private void setIconEnable(Menu menu,boolean enable){
	// try {
	// Class<?>
	// clazz=Class.forName("com.android.internal.view.menu.MenuBuilder");
	// Method m = clazz.getDeclaredMethod("setOptionalIconsVisible",
	// boolean.class);
	// m.setAccessible(true);
	//
	// //MenuBuilder实现Menu接口，创建菜单时，传进来的menu其实就是MenuBuilder对象(java的多态特征)
	// m.invoke(menu, enable);
	// } catch (Exception e) {
	// // TODO: handle exception
	// }
	// }
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

}