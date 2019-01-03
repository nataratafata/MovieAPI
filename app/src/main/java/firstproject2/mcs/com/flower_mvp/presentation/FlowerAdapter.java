package firstproject2.mcs.com.flower_mvp.presentation;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import firstproject2.mcs.com.flower_mvp.R;
import firstproject2.mcs.com.flower_mvp.data.FlowerModel;

import static android.content.ContentValues.TAG;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.ViewHolder> {


    private List<FlowerModel> flowerModelList;

    public FlowerAdapter(List<FlowerModel> flowerList) {
        this.flowerModelList = flowerList;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Log.v( TAG,"index=" + position );
        Log.v( TAG,"title=" + flowerModelList.get(position).getTitle() );
        Log.v( TAG,"year=" + flowerModelList.get(position).getYear().toString());
        Log.v( TAG,"genre=" + flowerModelList.get(position).getGenre() );
        Log.v( TAG,"url=" + flowerModelList.get(position).getPoster());
        holder.tvTitle.setText(flowerModelList.get(position).getTitle());
        holder.tvYear.setText(flowerModelList.get(position).getYear().toString());
        holder.tvGenre.setText(flowerModelList.get(position).getGenre());

        //String url = "https://movies-sample.herokuapp.com/api/movies/" + flowerModelList.get(position).getPoster();
        String url = flowerModelList.get(position).getPoster();
        Picasso.get().load(url).resize(50, 50).centerCrop().into(holder.APIImage);
    }

    @Override
    public int getItemCount() {
        return flowerModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

       // private ImageView ivFlower;
        private ImageView APIImage;
        private TextView tvTitle;
        private TextView tvYear;
        private TextView tvGenre;
        public ViewHolder(View view) {
            super(view);

            tvTitle = view.findViewById(R.id.tv_name);
            tvGenre= view.findViewById(R.id.tv_instructions);
            tvYear = view.findViewById(R.id.tv_price);
            APIImage = view.findViewById(R.id.iv_flower);

            Log.d( TAG,"TITLE=" + tvTitle );
            Log.d( TAG,"GENRE=" + tvGenre );
            Log.d( TAG,"YEAR=" + tvYear );
            Log.d( TAG,"IMAGE=" + APIImage );
        }
    }
}
