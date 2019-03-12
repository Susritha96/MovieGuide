package com.example.moviereview;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvMovies;
    //public static final String MOVIE_DETAIL_KEY = "movie";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovies = (ListView) findViewById(R.id.lvMovies);
        ArrayList<String> aMovies = new ArrayList<String>();
//        ArrayList<String> movies = new ArrayList<String>();
//
//        // getting access to our ListView
        aMovies.add("captain marvel");
        aMovies.add("Aquaman");
        aMovies.add("Solo: A Star Wars Story ");
        aMovies.add("Fantastic Beasts: The Crimes of Grindelwald");
        aMovies.add("Black Panther ");
        aMovies.add("Fifty Shades Freed ");
        aMovies.add("Spider-Man: Into the Spider-Verse");
//        ListView nasaLV = (ListView) findViewById(R.id.listviewLV);
        ArrayAdapter adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, aMovies);
        lvMovies.setAdapter(adapter);


    }
    public void movieDescription(View v){
        Intent ini=new Intent(this,SecondActivity.class);
        startActivity(ini);
    }


}
