package io.alastria.alastriaid.util;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import io.alastria.alastriaid.R;

/**
 * Created by Alvaro Suarez on 12/10/2017.
 */

public class Utils {
    public static void ShowToast(String message, Activity activity){
        Toast _toast = Toast.makeText(activity.getApplicationContext(), message, Toast.LENGTH_LONG);
        _toast.show();
    }

    public static void ShowErrorToast(String message, Activity activity){
        Toast _toast = Toast.makeText(activity.getApplicationContext(), message, Toast.LENGTH_LONG);
        //TODO: change background and font color
        //View _v = (View) _toast.getView();
        //_v.setBackgroundColor(Color.RED);
        //TextView _tv = (TextView) _v.findViewById(android.R.id.message);
        //_tv.setTextColor(Color.WHITE);
        //_tv.setBackgroundColor(Color.RED);
        _toast.show();
    }
}
