package com.lsj.appeyroad.ex_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.songlist);
        songAdapter = new SongAdapter(this);
        for (int i = 0; i < 10; i++) {
            songAdapter.arrayList.add(new Song("오리", "꽥꽥"));
            songAdapter.arrayList.add(new Song("참새", "짹짹"));
            songAdapter.arrayList.add(new Song("돼지", "꿀꿀"));
        }
        listView.setAdapter(songAdapter);
    }
}
