package com.example.geometria;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText Altura;
    EditText base;
    Button calcular;
    TextView resultado;

    AlertDialog.Builder dialog;
    double area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Altura = (EditText) findViewById(R.id.txtaltura);
        base = (EditText) findViewById(R.id.txtbase);

        calcular = (Button) findViewById(R.id.btnCalcular);
        resultado = (TextView) findViewById(R.id.txtResultado);
    }
    else
    {
            if(Altura.getText().toString().length() == 0){
                dialog = new AlertDialog.Builder(MainActivity.this);
                AlertDialog.Builder la_altura_del_rectangulo = dialog.setMessage("Ingresar la altura del rectangulo");

            }else{
                if(base.getText().toString().length() == 0){
                    dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setMessage("Ingresar la base del rectangulo")

            } else{
                area = Double.parseDouble(Altura.getText().toString()) * Double.parseDouble(base.getText().toString()) / 2;
                resultado.setText("El área es: " + formato.format(area));
                calcular.setText("Limpiar");
            }


                }
            }
        }
    }
