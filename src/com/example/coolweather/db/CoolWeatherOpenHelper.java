package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	private final static String PROVINCE_TABLE = "create table province (" +
			"id integer primary key autoincrement, " +
			"province_name text, " +
			"province_code text)";
	
	private static final String CITY_TABLE = "create table city (" +
			" id integer primary key autoincrement," +
			" city_name text," +
			" city_code text," +
			" province_id integer )";
	
	private static final String COUNTRY_TABLE = "create table country (" +
			"id integer primary key autoincrement, " +
			"country_name text " +
			"country_code text " +
			"city_id integer )";
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}
	
	public CoolWeatherOpenHelper(Context context){
		this(context,"coolweather.db",null,1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(PROVINCE_TABLE);
		db.execSQL(CITY_TABLE);
		db.execSQL(COUNTRY_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		switch (oldVersion) {
		case 1:
			
			break;

		default:
			break;
		}
	}

}
