package com.example.fredy.exados;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Exados extends AppCompatActivity {

    private Paint[] pincelitos;

    //Primero debemos hacer una vista, seguidamente una clase donde irá el canvas y finalmente el pincel para poder dibujar
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Vista vista = new Vista(this);
        setContentView(vista);
    }

    class Vista extends View {

        public Vista(Context context){

            super(context);
        }

        public void onDraw(Canvas canvas){

            canvas.drawRGB(25,25,25);

            //Obtenemos el ancho (widht) y el alto (height)
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();

            //Ahora vamos a declarar los pinceles que vamos a usar para dibujar los circulos

            //Pincel
            Paint pincel=new Paint();
            Paint pincel2=new Paint();
            /*Amarillo
            pincel.setARGB(255,255,255,51);
            //Blanco
            pincel.setARGB(255,255,255,255);
            //Negro
            pincel.setARGB(255,0,0,0);
            //Azul
            pincel.setARGB(255,0,128,255);
            //Rojo
            pincel.setARGB(255,255,0,0);*/

            //Array



            //DIBUJADO DE CIRCULOS / NOTA: X Y RADIO Y PINCEL EN LOS CIRCULOS----------------------
            pincel.setARGB(255,0,128,255);
            pincel.setStyle(Paint.Style.STROKE);
            int radio = ancho/2/5;

            for (int cont=0;cont<= 5; cont++) {
                canvas.drawCircle(ancho / 2, alto / 2, cont * radio, pincel);
            }
            pincel2.setARGB(255,255,255,255);
            pincel.setStyle(Paint.Style.STROKE);

            /*for (int cont2=0;cont2 <= 5; cont2++) {

                canvas.drawText(numeros[5],ancho/2,cont2*radio,pincel2);

            }*/
            //array
            String [] texto ={
             "hola", "k","2"
            };


            //DIBUJADO DE LAS GUÍAS----------------------------------------------------------------
            pincel.setARGB(255,255,0,0);
            //eje x
            canvas.drawLine(0,alto/2,ancho - 1,alto/2,pincel);

            //eje y
            canvas.drawLine(ancho/2,0,ancho/2,alto-1,pincel);


            //DIBUJADO DE TEXTO--------------------------------------------------------------------




        }
    }
}