package com.example.QuickOrder;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.QuickOrder.R;


import android.R.integer;
import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Caidan extends Activity{
	private ListView lv;	
	private int number[]={R.drawable.ji,R.drawable.pisa,R.drawable.zhupa,R.drawable.thumb,R.drawable.ba,R.drawable.ab,R.drawable.ac};
	private String name[]={"¿¾¼¦","ÅûÈø","Å£ÅÅ","´óÁúÏº","ÑÎŸh¼¦","ºìÉÕÅÅ¹Ç","¹þ¹þ"};
	private float price[]={40,45,40,60,35,35,25};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		lv=(ListView)findViewById(R.id.listView1);
		final ArrayList<HashMap<String, Object>> listItem=new ArrayList<HashMap<String,Object>>();
		for (int i = 0; i < 7; i++) {
			HashMap<String, Object> map=new HashMap<String, Object>();
			map.put("ItemImage", number[i]);
			map.put("ItemTitle", name[i]);
			map.put("ItemText", price[i]);
			listItem.add(map);
				
		}
		SimpleAdapter simpleAdapter=new SimpleAdapter(Caidan.this, listItem, R.layout.item, 
				new String[]{"ItemImage","ItemTitle","ItemText"} , new int[]{R.id.imageItem,R.id.textTitle,R.id.textContent});
		lv.setAdapter(simpleAdapter);
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(Caidan.this, listItem.get(arg2).get("ItemTitle").toString(), Toast.LENGTH_LONG).show();
				if (listItem.get(arg2).equals("ÕâÊÇµÚ1ÐÐ")) {
					Toast.makeText(Caidan.this, "hello", Toast.LENGTH_LONG).show();
				}
			}
		});
	}

}
