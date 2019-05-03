package com.example.calculadora;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MultiplicacionFragment extends Fragment implements View.OnClickListener {
    View vistamul;
    EditText multnum1,multnum2;
    Button multiplicar;
    TextView resultadomul;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        vistamul =inflater.inflate(R.layout.fragment_multiplicacion, container, false);

        multnum1 = vistamul.findViewById(R.id.mulum1);
        multnum2= vistamul.findViewById(R.id.mulnum2);
        multiplicar =vistamul.findViewById(R.id.multiplicar);
        resultadomul = vistamul.findViewById(R.id.resultadomul);

        multiplicar.setOnClickListener(this);

        return vistamul;

    }


    @Override
    public void onClick(View v) {

        String m1= multnum1.getText().toString();
        String m2= multnum2.getText().toString();

        int mult1 =Integer.parseInt(m1);
        int mult2 =Integer.parseInt(m2);

        int rtam =0;



        switch (v.getId()){

            case R.id.multiplicar:
                rtam = mult1*mult2;
                break;
        }

        resultadomul.setText(""+rtam);

    }
}
