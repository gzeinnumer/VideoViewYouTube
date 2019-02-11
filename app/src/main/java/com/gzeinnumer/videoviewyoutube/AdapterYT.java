package com.gzeinnumer.videoviewyoutube;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

public class AdapterYT extends RecyclerView.Adapter<AdapterYT.MyHolder> {

    List<ModelYT> mList;

    public AdapterYT() {
    }

    public AdapterYT(List<ModelYT> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.webView.loadData(mList.get(i).getVideo(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        WebView webView;

        public MyHolder(View itemView) {
            super(itemView);
            webView=itemView.findViewById(R.id.videoWebView);

            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new WebChromeClient(){

            });
        }
    }
}
