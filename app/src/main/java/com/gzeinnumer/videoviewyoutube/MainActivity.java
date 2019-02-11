package com.gzeinnumer.videoviewyoutube;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<ModelYT> yts = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        yts.add(new ModelYT("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/QPTB4wpi1a8\" frameborder=\"0\" allowfullscreen></iframe>"));

        AdapterYT adapter = new AdapterYT(yts);
        recyclerView.setAdapter(adapter);

    }
}
