package com.cabot.dino.recycle.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cabot.dino.recycle.R;
import com.cabot.dino.recycle.model.ListItem;

import java.util.List;

/**
 * Created by dino on 19/09/16.
 */
public class DummyAdapter extends RecyclerView.Adapter<DummyAdapter.DerpHolder>  {

    private List<ListItem> listData;
    private LayoutInflater inflater;

    public DummyAdapter(List<ListItem> listData, Context c){
        inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getImageResId());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView icon;
        private View container;

        public DerpHolder(View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.lbl_item_text);
            icon = (ImageView)itemView.findViewById(R.id.im_item_icon);
            //We'll need the container later on, when we add an View.OnClickListener
            container = itemView.findViewById(R.id.cont_item_root);
        }
    }
}
