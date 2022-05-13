package com.example.imgassignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class picturelayout extends Activity {
    private ImageView image1,image2,image3,image4;

    private  int place1,place2,place3,place4;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        addplaceview();
        initLstener();
        extraInput();
    }
    private void extraInput(){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();

        place1=bundle.getInt("place1");
        place2=bundle.getInt("place2");
        place3=bundle.getInt("place3");
        place4=bundle.getInt("place4");

        image1.setImageResource(place1);
        image2.setImageResource(place2);
        image3.setImageResource(place3);
        image4.setImageResource(place4);
    }
    private void addplaceview(){

        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);
        image4=findViewById(R.id.image4);
    }
    private void initLstener(){
        image1.setOnClickListener(new place1Click());
        image2.setOnClickListener(new place2Click());
        image3.setOnClickListener(new place3Click());
        image4.setOnClickListener(new place4Click());
    }
    class place1Click implements View.OnClickListener{

        public void onClick(View v){
            Intent resultiIntent=new Intent();
            resultiIntent.putExtra("result",place1);
            setResult(1,resultiIntent);
            finish();
       }
    }
    class place2Click implements View.OnClickListener{
        public void onClick(View v){
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result",place2);
            setResult(1,resultIntent);
            finish();
        }
    }
    class place3Click implements View.OnClickListener{
        public void onClick(View v){
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result",place3);
            setResult(1,resultIntent);
            finish();
        }
    }
    class place4Click implements View.OnClickListener{
        public void onClick(View v){
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result",place4);
            setResult(1,resultIntent);
            finish();
        }
    }


}
