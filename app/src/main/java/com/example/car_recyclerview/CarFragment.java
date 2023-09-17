package com.example.car_recyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CarFragment extends Fragment {
    private RecyclerView rvCar;
    private ArrayList<String> carList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCar = requireActivity().findViewById(R.id.rv_car);
        loadData();
        CarAdapter carAdapter = new CarAdapter(carList);
        rvCar.setAdapter(carAdapter);
    }

    private void loadData() {
        carList.add("BUGATTI VEYRON");
        carList.add("MCLAREN 720S");
        carList.add("KOENIGSEGG");
        carList.add("BMW е34");
        carList.add("Mercedes-Benz W210");
        carList.add("Tesla MODEL S");
        carList.add("AUDI RS8");
        carList.add("Volkswagen T-ROC");
        carList.add("TOYOTA SUPRA");
        carList.add("HONDA FIT");
        carList.add("NISSAN SKYLINE");
        carList.add("BENTLEY");
        carList.add("ROLLS-ROYCE GHOST");
        carList.add("LEXUS 570");
        carList.add("MAZDA RX-7");
        carList.add("MITSUBISHI");
        carList.add("PORSCHE");
        carList.add("LAMBORGHINI");
        carList.add("FERARRI");
        carList.add("MAZERATTI");
        carList.add("FORD");
        carList.add("HYUNDAI");
        carList.add("CHEVROLET");
        carList.add("KIA");
        carList.add("RANGE-ROVER");
        carList.add("JAGUAR");
    }
}