package com.matrimony.Adapter;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.matrimony.Bean.Bean_City;
import com.matrimony.Bean.Bean_Registration;
import com.matrimony.R;

import java.util.ArrayList;

/**
 * Created by admin on 5/3/2018.
 */

public class Adapter_City extends BaseAdapter{

    Activity act;
    ArrayList<Bean_City> arrayCity;


    public Adapter_City(Activity act, ArrayList<Bean_City> arrayCity) {
        this.act = act;
        this.arrayCity = arrayCity;


    }

    @Override
    public int getCount() {
        return arrayCity.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return arrayCity.get(i).getCityID();
    }

    private class ViewHolder {
        TextView tvName;
        TextView tvID;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder viewHolder;
        LayoutInflater inflater = act.getLayoutInflater();

        if (view == null) {
            view = inflater.inflate(R.layout.sp_city, null);
            viewHolder = new ViewHolder();


            viewHolder.tvName = (TextView) view.findViewById(R.id.sp_city_tv_cityname);
            viewHolder.tvID = (TextView) view.findViewById(R.id.sp_city_tv_cityid);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();

        }


        viewHolder.tvName.setText(arrayCity.get(i).getCityName());

        viewHolder.tvID.setText(arrayCity.get(i).getCityID()+"");


        return view;
    }
}
