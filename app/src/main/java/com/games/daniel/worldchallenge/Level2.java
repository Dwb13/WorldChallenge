package com.games.daniel.worldchallenge;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.Random;

public class Level2 extends AppCompatActivity {

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
                Intent intent = new Intent(Level2.this, MainActivity.class);
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
        String andorraD = "@mipmap/andorra";
        int id1 = getResources().getIdentifier(andorraD, "drawable", getPackageName());
        Drawable andorraDr = getResources().getDrawable(id1);

        String argeliaD = "@mipmap/argelia";
        int id2 = getResources().getIdentifier(argeliaD, "drawable", getPackageName());
        Drawable argeliaDr = getResources().getDrawable(id2);

        String armeniaD = "@mipmap/armenia";
        int id3 = getResources().getIdentifier(armeniaD, "drawable", getPackageName());
        Drawable armeniaDr = getResources().getDrawable(id3);

        String bangladeshD = "@mipmap/bangladesh";
        int id4 = getResources().getIdentifier(bangladeshD, "drawable", getPackageName());
        Drawable bangladeshDr = getResources().getDrawable(id4);

        String barbadosD = "@mipmap/barbados";
        int id5 = getResources().getIdentifier(barbadosD, "drawable", getPackageName());
        Drawable barbadosDr = getResources().getDrawable(id5);

        String dubaiD = "@mipmap/dubai";
        int id6 = getResources().getIdentifier(dubaiD, "drawable", getPackageName());
        Drawable dubaiDr = getResources().getDrawable(id6);

        String guayanaD = "@mipmap/guayana";
        int id7 = getResources().getIdentifier(guayanaD, "drawable", getPackageName());
        Drawable guayanaDr = getResources().getDrawable(id7);

        String indiaD = "@mipmap/india";
        int id8 = getResources().getIdentifier(indiaD, "drawable", getPackageName());
        Drawable indiaDr = getResources().getDrawable(id8);

        String iranD = "@mipmap/iran";
        int id9 = getResources().getIdentifier(iranD, "drawable", getPackageName());
        Drawable iranDr = getResources().getDrawable(id9);

        String keniaD = "@mipmap/kenia";
        int id10 = getResources().getIdentifier(keniaD, "drawable", getPackageName());
        Drawable keniaDr = getResources().getDrawable(id10);

        String lituniaD = "@mipmap/lituania";
        int id11 = getResources().getIdentifier(lituniaD, "drawable", getPackageName());
        Drawable lituniaDr = getResources().getDrawable(id11);

        String macedoniaD = "@mipmap/macedonia";
        int id12 = getResources().getIdentifier(macedoniaD, "drawable", getPackageName());
        Drawable macedoniaDr = getResources().getDrawable(id12);

        String mozambiqueD = "@mipmap/mozambique";
        int id13 = getResources().getIdentifier(mozambiqueD, "drawable", getPackageName());
        Drawable mozambiqueDR = getResources().getDrawable(id13);

        String pakistanD = "@mipmap/pakistan";
        int id14 = getResources().getIdentifier(pakistanD, "drawable", getPackageName());
        Drawable pakistanDR = getResources().getDrawable(id14);

        String sanMarinoD = "@mipmap/sanmarino";
        int id15 = getResources().getIdentifier(sanMarinoD, "drawable", getPackageName());
        Drawable sanMarinoDR = getResources().getDrawable(id15);

        String somaliaD = "@mipmap/somalia";
        int id16 = getResources().getIdentifier(somaliaD, "drawable", getPackageName());
        Drawable somaliaDR = getResources().getDrawable(id16);

        String sudanD = "@mipmap/sudan";
        int id17 = getResources().getIdentifier(sudanD, "drawable", getPackageName());
        Drawable sudanDR = getResources().getDrawable(id17);

        String surinamD = "@mipmap/surinam";
        int id18 = getResources().getIdentifier(surinamD, "drawable", getPackageName());
        Drawable surinamDR = getResources().getDrawable(id18);

        String turquiaD = "@mipmap/turquia";
        int id19 = getResources().getIdentifier(turquiaD, "drawable", getPackageName());
        Drawable turquiaDR = getResources().getDrawable(id19);

        String yugoslaviaD = "@mipmap/yugoslavia";
        int id20 = getResources().getIdentifier(yugoslaviaD, "drawable", getPackageName());
        Drawable yugoslaviaDR = getResources().getDrawable(id20);


        Pais andorra = new Pais("Andorra", andorraDr);
        Pais argelia = new Pais("Argelia", argeliaDr);
        Pais armenia = new Pais("Armenia", armeniaDr);
        Pais bangladesh = new Pais("Bangladesh", bangladeshDr);
        Pais barbados = new Pais("Barbados", barbadosDr);
        Pais dubai = new Pais("Dubai", dubaiDr);
        Pais guayana = new Pais("Guayana", guayanaDr);
        Pais india= new Pais("India", indiaDr);
        Pais iran = new Pais("Iran", iranDr);
        Pais kenia = new Pais("Kenia", keniaDr);
        Pais litunia = new Pais("Litunia", lituniaDr);
        Pais macedonia = new Pais("Macedonia", macedoniaDr);
        Pais mozambique = new Pais("Mozambique", mozambiqueDR);
        Pais pakistan = new Pais("Pakistan", pakistanDR);
        Pais sanMarino = new Pais("San Marino", sanMarinoDR);
        Pais somalia = new Pais("Somalia", somaliaDR);
        Pais sudan = new Pais("Sudan", sudanDR);
        Pais surinam = new Pais("surinam", surinamDR);
        Pais turquia = new Pais("Turquia", turquiaDR);
        Pais yugoslavia = new Pais("Yugoslavia", yugoslaviaDR);
        paises[0] = andorra;
        paises[1] = argelia;
        paises[2] = armenia;
        paises[3] = bangladesh;
        paises[4] = barbados;
        paises[5] = dubai;
        paises[6] = guayana;
        paises[7] = india;
        paises[8] = iran;
        paises[9] = kenia;
        paises[10] = litunia;
        paises[11] = macedonia;
        paises[12] = mozambique;
        paises[13] = pakistan;
        paises[14] = sanMarino;
        paises[15] = somalia;
        paises[16] = sudan;
        paises[17] = surinam;
        paises[18] = turquia;
        paises[19] = yugoslavia;
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
                Intent intent = new Intent(Level2.this, MainActivity.class);
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
            deleteCache(Level2.this);
            Intent intent = new Intent(Level2.this, activity_ganasteFinal.class);
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
            deleteCache(Level2.this);
            Intent intent = new Intent(Level2.this, perdiste.class);
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
