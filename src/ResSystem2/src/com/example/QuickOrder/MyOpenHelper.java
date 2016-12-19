package com.example.QuickOrder;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyOpenHelper extends SQLiteOpenHelper{
public static final String CREAT_USER="create table userTable(id integer primary key autoincrement,name,pwd)";
//									+"id integer primary key autoincrement,"
//									+"name,pwd");
private Context mycContext;
	public MyOpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
		mycContext=context;
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		arg0.execSQL(CREAT_USER);
		arg0.execSQL("create table menu(id integer primary key autoincrement,cainame,price,count)");
		arg0.execSQL("insert into menu(cainame,price) values('����Ϻ',80)");
		arg0.execSQL("insert into menu(cainame,price) values('ˮ��ţ��',40)");
		arg0.execSQL("insert into menu(cainame,price) values('�����Ź�',35)");
		arg0.execSQL("insert into menu(cainame,price) values('���Ŷ���',28)");
		arg0.execSQL("insert into menu(cainame,price) values('������',25)");
		arg0.execSQL("insert into menu(cainame,price) values('�Οh��',40)");
		arg0.execSQL("insert into menu(cainame,price) values('�ն�',45)");
		arg0.execSQL("insert into menu(cainame,price) values('ˮ����',50)");
		arg0.execSQL("insert into menu(cainame,price) values('�����Ź�',30)");
		arg0.execSQL("insert into menu(cainame,price) values('���',20)");
		

		Toast.makeText(mycContext, "���ݿⴴ���ɹ�", Toast.LENGTH_LONG).show();
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
