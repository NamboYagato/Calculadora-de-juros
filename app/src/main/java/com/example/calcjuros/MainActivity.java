package com.example.calcjuros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
private TextView textView, textView2;
private EditText valorInicial, juros, tempo;
private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        valorInicial = findViewById(R.id.valorInicial);
        juros = findViewById(R.id.juros);
        tempo = findViewById(R.id.tempo);
        calcular = findViewById(R.id.calcularJuros);
        textView2 = findViewById(R.id.textView2);
    }

    public void mostrarTexto(View v) {
        int valIni = Integer.parseInt(valorInicial.getText().toString());
        double jur = Double.parseDouble(juros.getText().toString());
        int temp = Integer.parseInt(tempo.getText().toString());
        double calculo = valIni + Math.pow(1 + jur, temp);
        textView2.setText(String.format("%.2f", calculo));
    }
}