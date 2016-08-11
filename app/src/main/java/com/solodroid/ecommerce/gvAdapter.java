package com.solodroid.ecommerce;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sammie on 8/5/2016.
 */

public class gvAdapter extends BaseAdapter{

    private Context cntx;
    private ImageView imgv;
    private TextView txv;

    public gvAdapter(Context c) {
        cntx = c;
    }
    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        LayoutInflater linf = (LayoutInflater) cntx.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        view = linf.inflate(R.layout.idv, null);
        imgv = (ImageView) view.findViewById(R.id.imgb);
        txv = (TextView) view.findViewById(R.id.txv);
        imgv.setImageResource(imgs[position]);
        imgv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        txv.setText(str[position]);

        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starter(true);
            }
        });
        txv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starter(false);
            }
        });

        return view;
    }

    void starter(Boolean b) {
        if (b == true)
            Toast.makeText(cntx, "Image got clicked!!! But same method.", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(cntx, "Text got clicked!!! But same method.", Toast.LENGTH_SHORT).show();
    }

    private String str[] = {"image 1", "image 2", "image 3", "image 4",
            "image 5", "image 6", "image 7", "image 8", "image 9"};

    private int[] imgs = {
            R.drawable.img1, R.drawable.img2,
            R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6,
            R.drawable.img7, R.drawable.img8,
            R.drawable.img9
    };

}
