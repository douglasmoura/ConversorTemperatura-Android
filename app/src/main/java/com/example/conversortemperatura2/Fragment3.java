package com.example.conversortemperatura2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Fragment3 extends Fragment {

    TextView textViewResultado;
    EditText editTextTemperatura;
    Button button;
    ViewPager viewPager;

    public Fragment3(ViewPager viewPager) {
        this.viewPager = viewPager;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment3, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        editTextTemperatura = view.findViewById(R.id.txtNumeroTemperatura3);
        textViewResultado = view.findViewById(R.id.txtConversao3);
        button = view.findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                double temperatura = Double.parseDouble(editTextTemperatura.getText().toString());
                String conversao = Calculos.conversor(temperatura,viewPager.getCurrentItem());

                textViewResultado.setText(conversao);
            }
        });
    }


}