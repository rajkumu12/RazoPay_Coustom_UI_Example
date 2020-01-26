package com.okzio.raj.razopay_coustom;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.razorpay.Razorpay;

import org.json.JSONObject;

public class MainActivity extends Activity {
    private Razorpay razorpay;
    private Activity activity;
    private WebView webview;
    private ViewGroup outerBox;
    private JSONObject payload;
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        setContentView(R.layout.activity_main);

        webview = (WebView) findViewById(R.id.payment_webview);
        outerBox = (ViewGroup) findViewById(R.id.outerbox);

        View button = findViewById(R.id.pay_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(MainActivity.this, Payment_option_activity.class);
                startActivity(intent);

            }

        });
    }
}
