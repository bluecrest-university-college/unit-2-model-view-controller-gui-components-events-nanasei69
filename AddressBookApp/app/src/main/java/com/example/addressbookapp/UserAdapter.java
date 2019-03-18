package com.example.addressbookapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {


    ArrayList<AddressBook> userAddress;

    public UserAdapter(ArrayList<AddressBook> userAddress) {
        userAddress = userAddress;
    }

    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row, parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserAdapter.ViewHolder holder, int position) {
        holder.full_name.setText(userAddress.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return userAddress.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView full_name;

        public ViewHolder(View itemView) {
            super(itemView);
            full_name = itemView.findViewById(R.id.full_name);
        }
    }
}
