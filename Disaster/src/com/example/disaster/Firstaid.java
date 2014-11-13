package com.example.disaster;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Firstaid extends ActionBarActivity {

    //declaration of widgets in layout
    Button guidelines, firstaid, redcross;
    TextView line,line1, line3, line4, line5, line6, line7, line8, line9, line10, line11, line12, line13, line14, line15, line16, line17, allergies, asthma, bleeding, brokenbone, burns, choking, diabetic, distress, heartattack, headinjury, heatstroke, hypothermia, meningitis, seizure, shock, stroke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set activity layout
        setContentView(R.layout.activity_firstaid);

        //assinging buttons from layout

        guidelines =(Button) findViewById(R.id.guidelines);
        firstaid = (Button) findViewById(R.id.firstaid);
        redcross = (Button) findViewById(R.id.redcross);
        line = (TextView) findViewById(R.id.line);
        line1 = (TextView) findViewById(R.id.line1);
        line3 = (TextView) findViewById(R.id.line3);
        line4 = (TextView) findViewById(R.id.line4);
        line5 = (TextView) findViewById(R.id.line5);
        line6 = (TextView) findViewById(R.id.line6);
        line7 = (TextView) findViewById(R.id.line7);
        line8 = (TextView) findViewById(R.id.line8);
        line9 = (TextView) findViewById(R.id.line9);
        line10 = (TextView) findViewById(R.id.line10);
        line11 = (TextView) findViewById(R.id.line11);
        line12 = (TextView) findViewById(R.id.line12);
        line13 = (TextView) findViewById(R.id.line13);
        line14 = (TextView) findViewById(R.id.line14);
        line15 = (TextView) findViewById(R.id.line15);
        line16 = (TextView) findViewById(R.id.line16);
        line17 = (TextView) findViewById(R.id.line17);
  
      
        

       allergies = (TextView) findViewById(R.id.allergies);
       asthma = (TextView) findViewById(R.id.asthma);
     bleeding = (TextView) findViewById(R.id.bleeding);
     brokenbone = (TextView) findViewById(R.id.brokenbone);
     burns = (TextView) findViewById(R.id.burns);
     choking = (TextView) findViewById(R.id.choking);
     diabetic = (TextView) findViewById(R.id.diabetic);
     distress = (TextView) findViewById(R.id.distress);
     heartattack = (TextView) findViewById(R.id.heartattack);
     headinjury= (TextView) findViewById(R.id.headinjury);
     heatstroke= (TextView) findViewById(R.id.heatstroke);
     hypothermia= (TextView) findViewById(R.id.hypothermia);
     meningitis= (TextView) findViewById(R.id.meningitis);
     seizure= (TextView) findViewById(R.id.seizure);
     shock= (TextView) findViewById(R.id.shock);
     stroke= (TextView) findViewById(R.id.stroke);

        //assigning background color of buttons
        guidelines.setBackgroundColor(Color.GRAY);
        firstaid.setBackgroundColor(Color.RED);
      redcross.setBackgroundColor(Color.GRAY);
        line.setBackgroundColor(Color.BLACK);
        line1.setBackgroundColor(Color.BLACK);
        line3.setBackgroundColor(Color.LTGRAY);
        line4.setBackgroundColor(Color.LTGRAY);
        line5.setBackgroundColor(Color.LTGRAY);
        line6.setBackgroundColor(Color.LTGRAY);
        line7.setBackgroundColor(Color.LTGRAY);
        line8.setBackgroundColor(Color.LTGRAY);
        line9.setBackgroundColor(Color.LTGRAY);
        line10.setBackgroundColor(Color.LTGRAY);
        line11.setBackgroundColor(Color.LTGRAY);
        line12.setBackgroundColor(Color.LTGRAY);
        line13.setBackgroundColor(Color.LTGRAY);
        line14.setBackgroundColor(Color.LTGRAY);
        line15.setBackgroundColor(Color.LTGRAY);
        line16.setBackgroundColor(Color.LTGRAY);
        line17.setBackgroundColor(Color.LTGRAY);
    
      
        


        //on clicking guidelines button
        guidelines.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Guidelines.class));
                finish();
            }
        });
        
        redcross.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Redcross.class));
                finish();
            }
        });

        //on clicking allergies
        allergies.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Allergies.class));
                finish();
            }
        });

        //on clicking allergies
        asthma.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Asthma.class));
                finish();
            }
        });
        
        bleeding.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Bleeding.class));
                finish();
            }
        });
        
        

        //on clicking allergies
        brokenbone.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Brokenbone.class));
                finish();
            }
        });

        //on clicking allergies
        burns.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Burns.class));
                finish();
            }
        });


        //on clicking allergies
        choking.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Choking.class));
                finish();
            }
        });

        //on clicking allergies
      diabetic.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Diabetic.class));
                finish();
            }
        });

        //on clicking allergies
       distress.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Distress.class));
                finish();
            }
        });

        //on clicking allergies
        heartattack.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Heartattack.class));
                finish();
            }
        });
        
        headinjury.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Headinjury.class));
                finish();
            }
        });

        heatstroke.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Heatstroke.class));
                finish();
            }
        });


        hypothermia.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Hypothermia.class));
                finish();
            }
        });

        meningitis.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Meningitis.class));
                finish();
            }
        });
        
        seizure.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Seizure.class));
                finish();
            }
        });
        
        shock.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Shock.class));
                finish();
            }
        });

        stroke.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Stroke.class));
                finish();
            }
        });





    }



}