package com.lsj.appeyroad.ex_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by lsj on 16. 5. 27.
 */
public class SongAdapter extends BaseAdapter{

    public SongAdapter(Context context) {
        this.context = context;
        arrayList = new ArrayList<>();
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    private class ViewHolder {
        ImageView image;
        TextView singer;
        TextView songname;
    }

    //TODO


    public ArrayList<Song> arrayList;
    private Context context;
    private LayoutInflater layoutInflater;


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.songelement, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.image = (ImageView) view.findViewById(R.id.songimage);
            viewHolder.singer = (TextView) view.findViewById(R.id.singer);
            viewHolder.songname = (TextView) view.findViewById(R.id.songname);
            view.setTag(viewHolder);
        }
        else
            viewHolder = (ViewHolder) view.getTag();
        viewHolder.singer.setText(arrayList.get(i).singer);
        viewHolder.songname.setText(arrayList.get(i).songname);

        final ViewHolder finalViewHolder = viewHolder;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, finalViewHolder.singer.getText().toString()+" "+ finalViewHolder.songname.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        finalViewHolder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(context, R.anim.fade_out);
                finalViewHolder.image.startAnimation(animation);
            }
        });
        return view;
    }
}
