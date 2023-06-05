package com.lify.livestock;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder>{

    private int[] imageIds;
    private String[] imageTitles;
    private Context context;


    public ImageAdapter(int[] imageIds, String[] imageTitles, Context context) {
        this.imageIds = imageIds;
        this.imageTitles = imageTitles;
        this.context =context;
    }

    @NonNull
    @Override
    public ImageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(imageIds[position]);
        holder.textView.setText(imageTitles[position]);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position) {
                    case 0:
                        // Handle click for image at position 0
                        // Example: show a toast message
                        showPopupBox1(imageTitles[position]);
                        break;
                    case 1:
                        showPopupBox2(imageTitles[position]);
                        break;
                    case 2:
                        // Handle click for image at position 2
                        // Example: perform some action
//                        performAction();
                        break;
                    // Add cases for other positions as needed
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return imageIds.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);

        }
    }

    private void showPopupBox1(String message) {
        // Create a dialog builder
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        // Inflate the custom layout for the dialog
        LayoutInflater inflater = LayoutInflater.from(context);
        View dialogView = inflater.inflate(R.layout.popup_cattle, null);

        // Set the custom layout for the dialog
        builder.setView(dialogView);

        // Get references to the views in the custom layout
        TextView textViewH = dialogView.findViewById(R.id.headpop);
        ImageView imageView = dialogView.findViewById(R.id.imageView);
        TextView textView1 = dialogView.findViewById(R.id.textView1);
        TextView textView2 = dialogView.findViewById(R.id.textView2);
        imageView.setImageResource(R.drawable.breeds);
        textViewH.setText("Livestock :: Cattle");
        // Set click event for the clickable text in the dialog
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for the clickable text
                // Example: show a toast message
                Intent intent = new Intent(v.getContext(), FeedindText.class);
                v.getContext().startActivity(intent);

            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for the clickable text
                // Example: show a toast message
                Intent intent = new Intent(v.getContext(), cattle_disease.class);
                v.getContext().startActivity(intent);

            }
        });

        // Create and show the dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopupBox2(String message) {
        // Create a dialog builder
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        // Inflate the custom layout for the dialog
        LayoutInflater inflater = LayoutInflater.from(context);
        View dialogView = inflater.inflate(R.layout.popup_cattle, null);

        // Set the custom layout for the dialog
        builder.setView(dialogView);

        // Get references to the views in the custom layout
        TextView textViewH = dialogView.findViewById(R.id.headpop);
        ImageView imageView = dialogView.findViewById(R.id.imageView);
        TextView textView1 = dialogView.findViewById(R.id.textView1);
        TextView textView2 = dialogView.findViewById(R.id.textView2);
        imageView.setImageResource(R.drawable.buffalo);
        textViewH.setText("Livestock :: Buffalo");
        // Set click event for the clickable text in the dialog
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for the clickable text
                // Example: show a toast message
                Intent intent = new Intent(v.getContext(), feed_buffllo.class);
                v.getContext().startActivity(intent);

            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for the clickable text
                // Example: show a toast message
                Intent intent = new Intent(v.getContext(), cattle_disease.class);
                v.getContext().startActivity(intent);

            }
        });

        // Create and show the dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}
