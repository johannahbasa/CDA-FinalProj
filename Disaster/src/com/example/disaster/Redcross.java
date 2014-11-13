package com.example.disaster;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class Redcross extends ActionBarActivity {

	 Button guidelines, firstaid, redcross;
	 TextView line,line1, line2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_redcross);
		
		   guidelines =(Button) findViewById(R.id.guidelines);
	        redcross =(Button) findViewById(R.id.redcross);
	        firstaid = (Button) findViewById(R.id.firstaid);
	        line = (TextView) findViewById(R.id.line);
	        line1 = (TextView) findViewById(R.id.line1);


	        guidelines.setBackgroundColor(Color.GRAY);
	        redcross.setBackgroundColor(Color.RED);
	        firstaid.setBackgroundColor(Color.GRAY);
	        line.setBackgroundColor(Color.BLACK);
	        line1.setBackgroundColor(Color.BLACK);
	        
	        WebView webView = (WebView)findViewById(R.id.webView);


			webView.getSettings().setJavaScriptEnabled(true);
			webView.loadUrl("http://www.firstaid.ph");
			WebViewClient yourWebClient = new WebViewClient()
		       {
		           // Override page so it's load on my view only
		           @Override
		           public boolean shouldOverrideUrlLoading(WebView  view, String  url)
		           {
		        	   view.loadUrl(url);
		            return true;
		           }
		       };


			webView.getSettings().setLoadWithOverviewMode(true);
			webView.getSettings().setUseWideViewPort(true);
			webView.getSettings().setSupportZoom(true);   webView.getSettings().setBuiltInZoomControls(true);
			webView.setWebViewClient(yourWebClient);
    //on clicking guidelines button
    guidelines.setOnClickListener( new OnClickListener() {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            startActivity(new Intent(Redcross.this, Guidelines.class));
            finish();
        }
    });


    //on clicking firstaid button
    firstaid.setOnClickListener( new OnClickListener() {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            startActivity(new Intent(Redcross.this, Firstaid.class));
            finish();
        }
    });
    
    redcross.setOnClickListener( new OnClickListener() {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            startActivity(new Intent(Redcross.this, Redcross.class));
            finish();
        }
    });





}



}
