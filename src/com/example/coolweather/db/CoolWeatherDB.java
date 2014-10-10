package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CoolWeatherDB {

	/**
	 * ���ݿ����֣�����Ϊpublic����������������
	 */
	public static final String DB_NAME = "cool_weather";
	
	public static final int VERSION = 1;
	
	private Context mcontext;
	
	private CoolWeatherDB coolweadb = new CoolWeatherDB(mcontext);
	/**
	 * ���췽�������봴�����ݿ������----�������ģʽ����֤�ڴ���ֻ��һ��
	 * @param context
	 */
	private CoolWeatherDB(Context context) {
		CoolWeatherOpenHelper openHelper = new CoolWeatherOpenHelper(mcontext, DB_NAME, null, VERSION);
		SQLiteDatabase db = openHelper.getWritableDatabase();
	}
	public CoolWeatherDB getInstance(){
		return coolweadb;
	}
}
