package com.example.signin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class MyNetwork extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        try{
            if(isOnline(context)){
                Toast.makeText(context,"Network Connected",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(context,"No Network Connection",Toast.LENGTH_LONG).show();

            }

        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
    public static boolean isOnline(Context context){
        try{
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = cm.getActiveNetworkInfo();
            return (networkInfo!=null && networkInfo.isConnected());

        }catch (NullPointerException e){
            e.printStackTrace();
            return false;
        }
    }
}