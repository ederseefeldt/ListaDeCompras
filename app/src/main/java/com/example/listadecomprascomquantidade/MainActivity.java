package com.example.listadecomprascomquantidade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    CheckBox mouse, teclado, monitor, jbl, apresentador, projetor;
    Button calcular;
    TextView resultado;
    EditText qtdMouse, qtdTeclado, qtdMonitor, qtdJBL, qtdApresentador, qtdProjetor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mouse = findViewById(R.id.mouse);
        teclado = findViewById(R.id.teclado);
        monitor = findViewById(R.id.monitor);
        jbl = findViewById(R.id.jbl);
        apresentador = findViewById(R.id.apresentador);
        projetor = findViewById(R.id.projetor);

        calcular = findViewById(R.id.calcular);

        resultado = findViewById(R.id.resultado);

        qtdMouse = findViewById(R.id.qtdMouse);
        qtdTeclado = findViewById(R.id.qtdTeclado);
        qtdMonitor = findViewById(R.id.qtdMonitor);
        qtdJBL = findViewById(R.id.qtdJBL);
        qtdApresentador = findViewById(R.id.qtdApresentador);
        qtdProjetor = findViewById(R.id.qtdProjetor);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double soma = 0;

                if (mouse.isChecked()){
                    double mouses = Double.parseDouble(qtdMouse.getText().toString());
                    soma += 20.02 * mouses;
                }
                if (teclado.isChecked()){
                    double teclados = Double.parseDouble(qtdTeclado.getText().toString());
                    soma += 26.95 * teclados;
                }
                if (monitor.isChecked()){
                    double monitores = Double.parseDouble(qtdMonitor.getText().toString());
                    soma += 279.00 * monitores;
                }
                if (jbl.isChecked()){
                    double jbls = Double.parseDouble(qtdJBL.getText().toString());
                    soma += 139.00 * jbls;
                }
                if (apresentador.isChecked()){
                    double apresentadores = Double.parseDouble(qtdApresentador.getText().toString());
                    soma += 77.09 * apresentadores;
                }
                if (projetor.isChecked()){
                    double projetores = Double.parseDouble(qtdProjetor.getText().toString());
                    soma += 1799.00 * projetores;
                }

                resultado.setText("Valor Total: R$" + String.valueOf(new DecimalFormat("#,##0.00").format(soma)));
            }
        });
    }
}