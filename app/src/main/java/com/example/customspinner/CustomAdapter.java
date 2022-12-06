package com.example.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter
{
    Context context;
    LayoutInflater inflater;
    int[] symbols;
    String[] countriesList;
    String[] citiesList;

    public CustomAdapter(Context applicationContext, String[] countryList, String[] cityList, int[] symbols) {
        this.context = applicationContext;
        this.countriesList = countryList;
        this.citiesList = cityList;
        this.symbols = symbols;
        inflater = (LayoutInflater.from(applicationContext));
    }


    @Override
    public int getCount() {
        return citiesList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custom_lv_layout, null);
        TextView country = (TextView) view.findViewById(R.id.tvcountry);
        TextView city = (TextView) view.findViewById(R.id.tvcity);
        ImageView symbol = (ImageView) view.findViewById(R.id.imageView);
        city.setText(this.citiesList[i]);
        country.setText(this.countriesList[i]);
        symbol.setImageResource(symbols[i]);
        return view;
    }

}
