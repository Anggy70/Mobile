package com.example.mobile;

/*
 Dibuat Oleh Muhammad Anggy Oryza Pradana
 */

import android.content.Context;
import android.content.SharedPreferences;

public class Sharedprefmanager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public Sharedprefmanager(Context context){
        sharedPreferences = context.getSharedPreferences("latihan shredpref",context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
    public void saveString(String value){
        editor.putString("string",value);
        editor.commit();
    }
    public String getString(){return sharedPreferences.getString("string","");}

    public String getUsername(){
        return sharedPreferences.getString("sp_username", "anggy");
    }

    public String getPassword(){
        return sharedPreferences.getString("sp_password", "1970");
    }

    public void saveIsLogin(Boolean value){
        editor.putBoolean("sp_islogin",value);
        editor.commit();
    }

    public Boolean getIsLogin(){
        return sharedPreferences.getBoolean("sp_islogin", false);
    }


}
