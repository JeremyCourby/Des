package com.btsinfo.des;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    private Spinner spNbFaceDes;
    private Spinner spNbDes;
    private Button btLancer;
    private TextView tvResult;
    private String choixdes;
    private Integer choixnbdes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spNbFaceDes = (Spinner) findViewById(R.id.spNbFaceDes);
        spNbDes = (Spinner) findViewById(R.id.spNbDes);
        btLancer = (Button) findViewById(R.id.btLancer);
        tvResult = (TextView) findViewById(R.id.tvResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.des,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spNbFaceDes.setAdapter(adapter);

        spNbFaceDes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                choixdes = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.nbdes,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spNbDes.setAdapter(adapter2);

        spNbDes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                choixnbdes = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btLancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecureRandom random= new SecureRandom();

                Integer NbDes = choixnbdes;

                String Nombre = "";

                while(NbDes >= 0) {
                    if (choixdes.equalsIgnoreCase("Dés 4 faces")) {
                        int Nombre0;
                        Nombre0 = random.nextInt(5);
                        while (Nombre0 == 0) {
                            Nombre0 = random.nextInt(5);
                        }
                        Nombre += "Nombre : " + Nombre0 + "\n";
                    }
                    if (choixdes.equalsIgnoreCase("Dés 6 faces")) {
                        int Nombre0;
                        Nombre0 = random.nextInt(7);
                        while (Nombre0 == 0) {
                            Nombre0 = random.nextInt(7);
                        }
                        Nombre += "Nombre : " + Nombre0 + "\n";
                    }
                    if (choixdes.equalsIgnoreCase("Dés 8 faces")) {
                        int Nombre0;
                        Nombre0 = random.nextInt(9);
                        while (Nombre0 == 0) {
                            Nombre0 = random.nextInt(9);
                        }
                        Nombre += "Nombre : " + Nombre0 + "\n";
                    }
                    if (choixdes.equalsIgnoreCase("Dés 10 faces")) {
                        int Nombre0;
                        Nombre0 = random.nextInt(11);
                        while (Nombre0 == 0) {
                            Nombre0 = random.nextInt(11);
                        }
                        Nombre += "Nombre : " + Nombre0 + "\n";
                    }
                    if (choixdes.equalsIgnoreCase("Dés 12 faces")) {
                        int Nombre0;
                        Nombre0 = random.nextInt(13);
                        while (Nombre0 == 0) {
                            Nombre0 = random.nextInt(13);
                        }
                        Nombre += "Nombre : " + Nombre0 + "\n";
                    }
                    if (choixdes.equalsIgnoreCase("Dés 20 faces")) {
                        int Nombre0;
                        Nombre0 = random.nextInt(21);
                        while (Nombre0 == 0) {
                            Nombre0 = random.nextInt(21);
                        }
                        Nombre += "Nombre : " + Nombre0 + "\n";
                    }
                    tvResult.setText(Nombre);
                    NbDes = NbDes-1;
                }
            }
        });
    }
}