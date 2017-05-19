package fisglobal.appstore.adapters;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fisglobal.appstore.R;

/**
 * Created by Jaspreet.Chhabra on 5/18/2017.
 */

public class FinanceAppAdapter extends RecyclerView.Adapter<FinanceAppAdapter.ViewHolder> {

    private final Context mContext;

    public FinanceAppAdapter(Context context) {

        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_app_item, parent, false);
        return new ViewHolder(mView);

    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if(position==0)
        {
            holder.icon.setImageResource(R.mipmap.ic_launcher);
            holder.name.setText("Citi Bank");
        } else if(position==1)
        {
            holder.icon.setImageResource(R.mipmap.ic_launcher);
            holder.name.setText("Life Insurance");
        }else{
            holder.icon.setImageResource(R.mipmap.ic_launcher);
            holder.name.setText("FIS");
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public final AppCompatImageView icon;
        public final AppCompatTextView name ;

        public ViewHolder(View itemView) {
            super(itemView);

            icon = (AppCompatImageView) itemView.findViewById(R.id.appImage);
            name = (AppCompatTextView) itemView.findViewById(R.id.appName);
        }
    }
}

