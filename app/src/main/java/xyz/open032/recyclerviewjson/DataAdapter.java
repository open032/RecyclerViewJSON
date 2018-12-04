package xyz.open032.recyclerviewjson;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<AndroidVersion> quotes;

    public DataAdapter(ArrayList<AndroidVersion> quotes) {
        this.quotes = quotes;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_version.setText("id: " + Html.fromHtml(quotes.get(i).getVer()).toString());
        viewHolder.tv_name.setText(Html.fromHtml(quotes.get(i).getName()));


        viewHolder.tv_api_level.setText(Html.fromHtml(quotes.get(i).getApi()));
        viewHolder.tv_rating.setText("rating: " + Html.fromHtml(quotes.get(i).getRating()));
    }

    @Override
    public int getItemCount() {
        return quotes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name,tv_version,tv_api_level, tv_rating;
        public ViewHolder(View view) {
            super(view);
            String text;


            tv_name = (TextView)view.findViewById(R.id.tv_name);
            tv_version = (TextView)view.findViewById(R.id.tv_version);
            tv_api_level = (TextView)view.findViewById(R.id.tv_api_level);
            tv_rating = (TextView)view.findViewById(R.id.rating);

        }
    }

}