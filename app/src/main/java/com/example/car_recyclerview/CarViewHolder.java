package com.example.car_recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCar;
    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCar = itemView.findViewById(R.id.tv_car);
    }

    public void bind(String carName){
        tvCar.setText(carName);
    }
}
