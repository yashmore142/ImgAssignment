package com.example.imgassignment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button animals,flowers,planets;
    private int result;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
        setContentView(R.layout.img_layout);

        animals=findViewById(R.id.animals);
        flowers=findViewById(R.id.flowers);
        planets=findViewById(R.id.planets);
      initListner();
    }
    private void initListner(){
        animals.setOnClickListener(new animalsClick());
        flowers.setOnClickListener(new flowerOnClick());
        planets.setOnClickListener(new planetOnClick());
    }
    private class animalsClick implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(MainActivity.this,picturelayout.class);
            intent.putExtra("image1",R.drawable.monkey);
            intent.putExtra("image2",R.drawable.tiger);
            intent.putExtra("image3",R.drawable.lion);
            intent.putExtra("image4",R.drawable.elephant);
            startActivity(intent);
        }
    }
    private class flowerOnClick implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(MainActivity.this,picturelayout.class);
            intent.putExtra("image1",R.drawable.flower);
            intent.putExtra("image2",R.drawable.flower2);
            intent.putExtra("image3",R.drawable.flower3);
            intent.putExtra("image4",R.drawable.flower4);
        }
    }
    private class planetOnClick implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(MainActivity.this,picturelayout.class);
            intent.putExtra("image1",R.drawable.planet1);
            intent.putExtra("image2",R.drawable.planet2);
            intent.putExtra("image3",R.drawable.planet3);
            intent.putExtra("image4",R.drawable.planet4);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(data==null){
            return;
        }
        Bundle bundle=data.getExtras();
        result=bundle.getInt("result");
        imageView.setImageResource(result);
    }

}