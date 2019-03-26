//package com.example.navanee;
package www.smartandroidcourse.com;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import android.text.Html;


import www.colorsfx.com.R;

public class MainActivity extends Activity {

    String ModelNumber, Board, Brand, Display, FingerPrint, ID, TAGS, Type,
            AndroidVersion, APILevel, CodeName, INCREMENTAL;

    TextView text;

    TelephonyManager telephonyManager;
    TextView textView1;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        text = (TextView) findViewById(R.id.textView1);
        text.setText("\nSIM TYPE"+
                "\nOperator Code : " + telephonyManager.getSimOperator().toString()
                + "\nOperator Name : " + telephonyManager.getSimOperatorName().toString()
                + "\nCountry ISO : " + telephonyManager.getSimCountryIso().toString());

        ModelNumber = android.os.Build.MODEL;
        Board = android.os.Build.BOARD;
        Brand = android.os.Build.BRAND;
        Display = android.os.Build.DISPLAY;
        FingerPrint = android.os.Build.FINGERPRINT;
        ID = android.os.Build.ID;
        TAGS = android.os.Build.TAGS;
        Type = android.os.Build.TYPE;

        AndroidVersion = android.os.Build.VERSION.RELEASE;
        APILevel = android.os.Build.VERSION.SDK;
        CodeName = android.os.Build.VERSION.CODENAME;
        INCREMENTAL = android.os.Build.VERSION.INCREMENTAL;

        text = (TextView) findViewById(R.id.textView);

        text.setText(Html.fromHtml("Phone Type" +
                "<br/><br/><font color = 'red';>Model Number : </font></font>" + ModelNumber
                + "<br/><font color = 'red';>Board : </font>" + Board
                + "<br/><font color = 'red';>Brand : </font>" + Brand
                + "<br/><font color = 'red';>Display : </font>" + Display
                + "<br/><font color = 'red';>FingerPrint : </font>" + FingerPrint
                + "<br/><font color = 'red';>ID : </font>" + ID
                + "<br/><font color = 'red';>TAGS : </font>" + TAGS
                + "<br/><font color = 'red';>Type : </font>" + Type

                + "<br/>"

                + "<br/><font color = 'red';>Android Version : </font>" + AndroidVersion
                + "<br/><font color = 'red';>API Level : </font>" + APILevel
                + "<br/><font color = 'red';>CodeName : </font>" + CodeName
                + "<br/><font color = 'red';>INCREMENTAL : </font>" + INCREMENTAL));
    }
}

