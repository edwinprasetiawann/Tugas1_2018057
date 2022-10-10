package com.example.pertemuan1_intens;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pertemuan1_intens.R;

public class segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        final EditText alas=
                (EditText)findViewById(R.id.alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.tinggi);
        final TextView hasil =
                (TextView)findViewById(R.id.txt_hasil);
        final Button tampil =
                (Button)findViewById(R.id.btn_hitung);

        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Double tinggi1, alas1;
                alas1 = Double.parseDouble(alas.getText().toString());
                tinggi1 = Double.parseDouble(tinggi.getText().toString());
                Double rumus =0.5*alas1 *tinggi1;
                hasil.setText(Double.toString(rumus));

            }
        });
    }


}
