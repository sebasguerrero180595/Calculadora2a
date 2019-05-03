package com.example.calculadora;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SumaFragment extends Fragment implements View.OnClickListener {

    View vista;
    EditText sumanum1,sumanum2;
    Button sumar;
    TextView resultadosuma;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        vista =inflater.inflate(R.layout.fragment_suma, container, false);

        sumanum1 = vista.findViewById(R.id.sumanum1);
        sumanum2 = vista.findViewById(R.id.sumanum2);
        sumar =vista.findViewById(R.id.sumar);
        resultadosuma = vista.findViewById(R.id.resultadosum);

        sumar.setOnClickListener(this);

        return vista;

    }


    @Override
    public void onClick(View v) {

        String s1= sumanum1.getText().toString();
        String s2= sumanum2.getText().toString();

        int suma1 =Integer.parseInt(s1);
        int suma2 =Integer.parseInt(s2);

        int rtas =0;



      switch (v.getId()){

          case R.id.sumar:
              rtas = suma1+suma2;
              break;
      }

      resultadosuma.setText(""+rtas);

    }
}
