package com.games.daniel.worldchallenge;

import android.content.Context;
import android.content.Intent;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

import java.io.File;
import java.util.Random;



public class Jugar extends AppCompatActivity {
        Button boton1 ,boton2,boton3, salir;
        Button[] botones = new Button[3];
        int cantPaises=20,longVec=15;
        Pais paises[] = new  Pais[cantPaises];;
        boolean seguir=true, botonCorrecto=false;
        TextView errores;
        String nombrePaises[]=new String[cantPaises];


        String nombreTemporal, intentosS;
        int numeroTemporal, intentos;
        @Override
        protected void onCreate(Bundle savedInstanceState) {

            crearPaises();
            super.onCreate(savedInstanceState);
            setContentView(com.games.daniel.worldchallenge.R.layout.activity_jugar);
            boton1=(Button)findViewById(R.id.pais1);
            boton2=(Button)findViewById(R.id.pais2);
            boton3=(Button)findViewById(R.id.pais3);
            salir=(Button)findViewById(R.id.salir);
            salir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Jugar.this, MainActivity.class);
                    startActivity(intent);
                }
            });
            intentos=0;
            botones[0]=boton1;
            botones[1]=boton2;
            botones[2]=boton3;
            intentosS= Integer.toString(intentos);
            errores=(TextView)findViewById(R.id.erroresText);
            errores.setText(intentosS);
            boton1.setText("");
            boton2.setText("");
            boton3.setText("");

            jugar(botones,paises,paises.length);


        }
    public void crearPaises() { //crea los paises
        String colombiaD = "@mipmap/b0";
        int id1 = getResources().getIdentifier(colombiaD, "drawable", getPackageName());
        Drawable colombiaDr = getResources().getDrawable(id1);
        String usaD = "@mipmap/b1";
        int id2 = getResources().getIdentifier(usaD, "drawable", getPackageName());
        Drawable usaDr = getResources().getDrawable(id2);
        String chileD = "@mipmap/b2";
        int id3 = getResources().getIdentifier(chileD, "drawable", getPackageName());
        Drawable chileDr = getResources().getDrawable(id3);

        String canadaD = "@mipmap/b3";
        int id4 = getResources().getIdentifier(canadaD, "drawable", getPackageName());
        Drawable canadaDr = getResources().getDrawable(id4);

        String argentinaD = "@mipmap/b4";
        int id5 = getResources().getIdentifier(argentinaD, "drawable", getPackageName());
        Drawable argentinaDr = getResources().getDrawable(id5);

        String brasilD = "@mipmap/b5";
        int id6 = getResources().getIdentifier(brasilD, "drawable", getPackageName());
        Drawable brasilDr = getResources().getDrawable(id6);

        String alemaniaD = "@mipmap/b6";
        int id7 = getResources().getIdentifier(alemaniaD, "drawable", getPackageName());
        Drawable alemaniaDr = getResources().getDrawable(id7);

        String inglaterraD = "@mipmap/b7";
        int id8 = getResources().getIdentifier(inglaterraD, "drawable", getPackageName());
        Drawable inglaterraDr = getResources().getDrawable(id8);

        String japonD = "@mipmap/b8";
        int id9 = getResources().getIdentifier(japonD, "drawable", getPackageName());
        Drawable japonDr = getResources().getDrawable(id9);

        String mexD = "@mipmap/b9";
        int id10 = getResources().getIdentifier(mexD, "drawable", getPackageName());
        Drawable mexicoDr = getResources().getDrawable(id10);

        String panamaD = "@mipmap/b10";
        int id11 = getResources().getIdentifier(panamaD, "drawable", getPackageName());
        Drawable panamaDr = getResources().getDrawable(id11);

        String hondurasD = "@mipmap/b11";
        int id12 = getResources().getIdentifier(hondurasD, "drawable", getPackageName());
        Drawable hondurasDr = getResources().getDrawable(id12);

        String rusiaD = "@mipmap/b12";
        int id13 = getResources().getIdentifier(rusiaD, "drawable", getPackageName());
        Drawable rusiaDR = getResources().getDrawable(id13);

        String peruD = "@mipmap/b13";
        int id14 = getResources().getIdentifier(peruD, "drawable", getPackageName());
        Drawable peruDR = getResources().getDrawable(id14);

        String holandaD = "@mipmap/b14";
        int id15 = getResources().getIdentifier(holandaD, "drawable", getPackageName());
        Drawable holandaDR = getResources().getDrawable(id15);

        String venezuelaD = "@mipmap/b15";
        int id16 = getResources().getIdentifier(venezuelaD, "drawable", getPackageName());
        Drawable venezuelaDR = getResources().getDrawable(id16);

        String boliviaB = "@mipmap/b16";
        int id17 = getResources().getIdentifier(boliviaB, "drawable", getPackageName());
        Drawable boliviaDR = getResources().getDrawable(id17);

        String cubaB = "@mipmap/b17";
        int id18 = getResources().getIdentifier(cubaB, "drawable", getPackageName());
        Drawable cubaDR = getResources().getDrawable(id18);

        String portugalB = "@mipmap/b18";
        int id19 = getResources().getIdentifier(portugalB, "drawable", getPackageName());
        Drawable portugarDR = getResources().getDrawable(id19);

        String españaD = "@mipmap/b19";
        int id20 = getResources().getIdentifier(españaD, "drawable", getPackageName());
        Drawable españaDR = getResources().getDrawable(id20);


        Pais colombia = new Pais("Colombia", colombiaDr);
        Pais usa = new Pais("USA", usaDr);
        Pais chile = new Pais("Chile", chileDr);
        Pais canada = new Pais("Canada", canadaDr);
        Pais argentina = new Pais("Argentina", argentinaDr);
        Pais brasil = new Pais("Brasil", brasilDr);
        Pais alemania = new Pais("Alemania", alemaniaDr);
        Pais inglaterra = new Pais("U.K", inglaterraDr);
        Pais japon = new Pais("Japon", japonDr);
        Pais mexico = new Pais("Mexico", mexicoDr);
        Pais panama = new Pais("Panama", panamaDr);
        Pais honduras = new Pais("Honduras", hondurasDr);
        Pais rusia = new Pais("Rusia", rusiaDR);
        Pais peru = new Pais("Peru", peruDR);
        Pais paisesBajos = new Pais("Paises Bajos", holandaDR);
        Pais venezuela = new Pais("Venezuela", venezuelaDR);
        Pais bolivia = new Pais("Bolivia", boliviaDR);
        Pais cuba = new Pais("Cuba", cubaDR);
        Pais portugal = new Pais("Portugal", portugarDR);
        Pais españa = new Pais("España", españaDR);
        paises[0] = colombia;
        paises[1] = usa;
        paises[2] = chile;
        paises[3] = canada;
        paises[4] = argentina;
        paises[5] = brasil;
        paises[6] = alemania;
        paises[7] = inglaterra;
        paises[8] = japon;
        paises[9] = mexico;
        paises[10] = panama;
        paises[11] = honduras;
        paises[12] = rusia;
        paises[13] = peru;
        paises[14] = paisesBajos;
        paises[15] = venezuela;
        paises[16] = bolivia;
        paises[17] = cuba;
        paises[18] = portugal;
        paises[19] = españa;
        for (int i = 0; i < cantPaises; i++){
            nombrePaises[i]=paises[i].nombre;
        }


    }
    public void jugar(final Button[] botones, final Pais[] paises, int longVec) { //empieza a jugar
        botonCorrecto = false;
        Random aleatorio = new Random(System.currentTimeMillis());
        final int randomBoton = aleatorio.nextInt(botones.length);
        aleatorio.setSeed(System.currentTimeMillis());
        final int randomPaises = aleatorio.nextInt(longVec);
        Random aleatorioP = new Random(System.currentTimeMillis());
        Random aleatorioP2 = new Random(System.currentTimeMillis());



        ImageView bandera = (ImageView) findViewById(R.id.banderasIV);
        bandera.setImageDrawable(paises[randomPaises].bandera);

        botones[randomBoton].setText(paises[randomPaises].nombre);
        botones[randomBoton].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcto(randomPaises);
            }
        });

        for (int i = 0; i < 3; i++) { //valida la respuesta
            int randomPaisesB = aleatorioP.nextInt(longVec);
            String nombreAhora = nombrePaises[randomPaisesB];

            if (!paises[randomPaises].nombre.equals(nombrePaises[randomPaisesB]) && randomBoton != i) {
                while (nombreAhora.equals(nombrePaises[randomPaisesB])) {
                    randomPaisesB = aleatorio.nextInt(paises.length);
                }
                while (paises[randomPaises].nombre.equals(nombrePaises[randomPaisesB])) {
                    randomPaisesB = aleatorio.nextInt(paises.length);
                }

                botones[i].setText(nombrePaises[randomPaisesB]);
                botones[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        intentos = intentos + 1;
                        fallaste();

                    }
                });
            }

        }






        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seguir = false;
                Intent intent = new Intent(Jugar.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


    public void correcto(int randomPaises){ //cuando la respuesta es correcta
        if (randomPaises < paises.length - 1) {
            paises[randomPaises] = paises[randomPaises + 1];
            int actual = randomPaises;
            int longi = paises.length-1 ;
            for (int j = actual; j < longi; j++) {
                if (paises[j+1].equals(null)){
                    paises[j]=null;
                }
                else
                    paises[j]=paises[j+1];

            }

        } else if (randomPaises == 8) {
            paises[randomPaises] = null;
        }
        System.out.println(paises.length);
        longVec=longVec-1;
        System.out.println(longVec);

        if(longVec>=1){
            jugar(botones, paises,longVec);
        }else
        if (longVec<1)

        {
            deleteCache(Jugar.this);
            Intent intent = new Intent(Jugar.this, activity_Ganaste.class);
            startActivity(intent);
        }




    }
    public void fallaste(){ //cuando la respuesta es erronea


        if (intentos!=3){
            intentosS= Integer.toString(intentos);
            errores=(TextView)findViewById(R.id.erroresText);
            errores.setText(intentosS);
            jugar(botones,paises,longVec);

        }else{
            deleteCache(Jugar.this);
            Intent intent = new Intent(Jugar.this, perdiste.class);
            startActivity(intent);
        }


    }
    public static void deleteCache(Context context) {
        try {
            File dir = context.getCacheDir();
            deleteDir(dir);
        } catch (Exception e) { e.printStackTrace();}
    }

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
            return dir.delete();
        } else if(dir!= null && dir.isFile()) {
            return dir.delete();
        } else {
            return false;
        }
    }



}
