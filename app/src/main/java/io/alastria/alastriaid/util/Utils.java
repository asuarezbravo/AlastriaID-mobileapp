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
        Toast toast = Toast.makeText(activity.getApplicationContext(), message, Toast.LENGTH_LONG);
        toast.show();
    }

    public static void ShowErrorToast(String message, Activity activity){
        Toast toast = Toast.makeText(activity.getApplicationContext(), message, Toast.LENGTH_LONG);
        //TODO: change background and font color
        //View v = (View) toast.getView();
        //v.setBackgroundColor(Color.RED);
        //TextView tv = (TextView) v.findViewById(android.R.id.message);
        //tv.setTextColor(Color.WHITE);
        //tv.setBackgroundColor(Color.RED);
        toast.show();
    }
}
