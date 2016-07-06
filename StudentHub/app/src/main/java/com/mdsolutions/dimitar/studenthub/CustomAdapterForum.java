package com.mdsolutions.dimitar.studenthub;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Dimitar on 12.3.2016 г..
 */
public class CustomAdapterForum  extends RecyclerView.Adapter<CustomAdapterForum.ViewHolder> {
    private static final String TAG = "CustomAdapter";

    private String[] mDataSet;

    // BEGIN_INCLUDE(recyclerViewSampleViewHolder)
    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        public TextView element1;
        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
            textView = (TextView) v.findViewById(R.id.textView);
            element1 = (TextView) v.findViewById(R.id.textViewForumRecycler);
        }

        public TextView getTextView() {
            element1.setText("r");
            return element1;
        }
    }
    // END_INCLUDE(recyclerViewSampleViewHolder)

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used by RecyclerView.
     */
    public CustomAdapterForum(String[] dataSet) {



        mDataSet = dataSet;
    }

    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_item_forum, viewGroup, false);
        RecyclerView horizontal_recycler_view= (RecyclerView)v.findViewById(R.id.recyclerViewForum);
        return new ViewHolder(v);
    }
    // END_INCLUDE(recyclerViewOnCreateViewHolder)

    // BEGIN_INCLUDE(recyclerViewOnBindViewHolder)
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        // Get element from your dataset at this position and replace the contents of the view
        // with that element

        //!!!CRASHES!!!  viewHolder.getTextView().setText(mDataSet[position]);
        viewHolder.getTextView().setText(mDataSet[1]);
        //viewHolder.getTextView().setText(mDataSet[1]);


    }
    // END_INCLUDE(recyclerViewOnBindViewHolder)

    // Return the size of your dataset (invoked by the layout manager)

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
