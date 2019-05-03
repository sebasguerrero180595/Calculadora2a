package com.example.calculadora;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class DivicionFragment extends Fragment implements View.OnClickListener {

    View vistadiv;
    EditText divnum1,divnum2;
    Button dividir;
    TextView resultadodiv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        vistadiv =inflater.inflate(R.layout.fragment_divicion, container, false);

        divnum1 = vistadiv.findViewById(R.id.divnum1);
        divnum2= vistadiv.findViewById(R.id.divnum2);
        dividir =vistadiv.findViewById(R.id.dividir);
        resultadodiv = vistadiv.findViewById(R.id.resultadodiv);

        dividir.setOnClickListener(this);

        return vistadiv;

    }


    @Override
    public void onClick(View v) {

        String d1= divnum1.getText().toString();
        String d2= divnum2.getText().toString();

        int div1 =Integer.parseInt(d1);
        int div2 =Integer.parseInt(d2);

        int rtad =0;



        switch (v.getId()){

            case R.id.dividir:
                rtad = div1/div2;
                break;
        }

        resultadodiv.setText(""+rtad);

    }
}
