package com.example.dylan.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Dylan on 2/20/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

   private String[] country_names, country_capital;

    public RecyclerAdapter(String[] country_names, String[] country_capital){
        this.country_names = country_names;
        this.country_capital = country_capital;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.Tx_Country.setText(country_names[position]);
        holder.Tx_Capital.setText(country_capital[position]);
    }

    @Override
    public int getItemCount() {
        return country_names.length;
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView Tx_Country, Tx_Capital;

        public  RecyclerViewHolder(View view){
            super(view);
            Tx_Country = (TextView) view.findViewById(R.id.tx_country_name);
            Tx_Capital = (TextView) view.findViewById(R.id.tx_capital_name);

        }
    }
}
