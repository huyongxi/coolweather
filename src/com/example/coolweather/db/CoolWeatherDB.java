package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CoolWeatherDB {

	/**
	 * 数据库名字，定义为public，方便其他类引用
	 */
	public static final String DB_NAME = "cool_weather";
	
	public static final int VERSION = 1;
	
	private Context mcontext;
	
	private CoolWeatherDB coolweadb = new CoolWeatherDB(mcontext);
	/**
	 * 构造方法，引入创建数据库帮助类----单例设计模式，保证内存中只有一个
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
