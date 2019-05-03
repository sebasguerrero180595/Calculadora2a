package com.example.calculadora;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class RestaFragment extends Fragment implements View.OnClickListener {

    View vistarestar;
    EditText restanum1,restanum2;
    Button restar;
    TextView resultadoresta;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        vistarestar =inflater.inflate(R.layout.fragment_resta, container, false);

        restanum1 = vistarestar.findViewById(R.id.restaum1);
        restanum2 = vistarestar.findViewById(R.id.restanum2);
        restar =vistarestar.findViewById(R.id.restar);
        resultadoresta = vistarestar.findViewById(R.id.resultadores);

        restar.setOnClickListener(this);

        return vistarestar;

    }


    @Override
    public void onClick(View v) {

        String r1= restanum1.getText().toString();
        String r2= restanum2.getText().toString();

        int resta1 =Integer.parseInt(r1);
        int resta2 =Integer.parseInt(r2);

        int rtar =0;



        switch (v.getId()){

            case R.id.restar:
                rtar = resta1-resta2;
                break;
        }

        resultadoresta.setText(""+rtar);

    }
}
