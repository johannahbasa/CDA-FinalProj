package com.example.disaster;

import android.content.Intent;

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

public class Guidelines extends ActionBarActivity {

    //declaration of widgets in layout
    Button guidelines, firstaid, redcross;
    TextView line,line1, line2, line3, line4, line5, line6, line7, line8, earthquake, fire, flooding, foodsafety, landslide, power, tornado, volcano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //set activity layout
        setContentView(R.layout.activity_guidelines);

        //assinging buttons from layout

        guidelines =(Button) findViewById(R.id.guidelines);
        firstaid = (Button) findViewById(R.id.firstaid);
        redcross = (Button) findViewById(R.id.redcross);
    
      
        line = (TextView) findViewById(R.id.line);
        line1 = (TextView) findViewById(R.id.line1);
        line2 = (TextView) findViewById(R.id.line2);
        line3 = (TextView) findViewById(R.id.line3);
        line4 = (TextView) findViewById(R.id.line4);
        line5 = (TextView) findViewById(R.id.line5);
        line6 = (TextView) findViewById(R.id.line6);
        line7 = (TextView) findViewById(R.id.line7);
        line8 = (TextView) findViewById(R.id.line8);

  
        //tsunami = (TextView) findViewById(R.id.tsunami);
        fire = (TextView) findViewById(R.id.fire);
        earthquake = (TextView) findViewById(R.id.earthquake);
        flooding = (TextView) findViewById(R.id.flooding);
        landslide = (TextView) findViewById(R.id.landslide);
        foodsafety = (TextView) findViewById(R.id.foodsafety);
        power = (TextView) findViewById(R.id.power);
        tornado = (TextView) findViewById(R.id.tornado);
        volcano = (TextView) findViewById(R.id.volcano);

        //assigning background color of buttons
        guidelines.setBackgroundColor(Color.RED);
        firstaid.setBackgroundColor(Color.GRAY);
        redcross.setBackgroundColor(Color.GRAY);
      
        line.setBackgroundColor(Color.BLACK);
        line1.setBackgroundColor(Color.BLACK);
        line2.setBackgroundColor(Color.GRAY);
        line3.setBackgroundColor(Color.GRAY);
        line4.setBackgroundColor(Color.GRAY);
        line5.setBackgroundColor(Color.GRAY);
        line6.setBackgroundColor(Color.GRAY);
        line7.setBackgroundColor(Color.GRAY);
        line8.setBackgroundColor(Color.GRAY);
        //on clicking firstaid button
        
        firstaid.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Firstaid.class));
                finish();
            }
        });

        redcross.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Redcross.class));
                finish();
            }
        });

        //on clicking prepare button
       earthquake.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Earthquake.class));
                finish();
            }
        });
       
       flooding.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Guidelines.this, Flooding.class));
               finish();
           }
       });
       
       fire.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Guidelines.this, Fire.class));
               finish();
           }
       });
       
       foodsafety.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Guidelines.this, Foodsafety.class));
               finish();
           }
       });
       
       landslide.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Guidelines.this, Landslide.class));
               finish();
           }
       });

       power.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Guidelines.this, Poweroutrage.class));
               finish();
           }
       });
        
       tornado.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Guidelines.this, Tornado.class));
               finish();
           }
       });
       
       volcano.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Guidelines.this, Volcano.class));
               finish();
           }
       });
        
        //on clicking prepare button
      /*  prepare.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Prepare.class));
                finish();
            }
        });

       
       flooding.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Flooding.class));
                finish();
            }
        });

        tsunami.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Tsunami.class));
                finish();
            }
        });

       volcano.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Volcano.class));
                finish();
            }
        });*/

    }


}
