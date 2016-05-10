package com.taiji.growth.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.taiji.growth.R;
import com.taiji.growth.bean.ModelBean;

import java.util.List;

/**
 * Created by panho on 2016-05-03.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private Context mContext;

    private List<ModelBean> modelBeanList;

    private Resources res;

    public RecyclerAdapter(Context context,List<ModelBean> modelBeanList){
        this.mContext = context;
        this.modelBeanList = modelBeanList;
        res = context.getResources();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ModelBean bean = modelBeanList.get(position);
        holder.imageView.setImageResource(bean.getResid());
        holder.title.setText(bean.getTitle());
    }

    @Override
    public int getItemCount() {
        return null == modelBeanList?0:modelBeanList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;

        private TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.pic);
            title = (TextView) itemView.findViewById(R.id.name);


        }
    }

}
