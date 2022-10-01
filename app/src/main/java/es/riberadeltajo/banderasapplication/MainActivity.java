package es.riberadeltajo.banderasapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r=new Random();
    ImageButton imagen1=findViewById(R.id.imgbtn1);
    ImageButton imagen2=findViewById(R.id.imgbtn2);
    ImageButton imagen3=findViewById(R.id.imgbtn3);
    ImageButton imagen4=findViewById(R.id.imgbtn4);
    TextView pregunta=findViewById(R.id.txtPregunta);
    TextView puntuacion=findViewById(R.id.txtContador);
    TextView record=findViewById(R.id.txtNRecord);
    int aleatorio;
    int contador=0;
    int puntuacionRecord=0;






    ArrayList<Pais> paisesJuego=new ArrayList<>();
    int [] banderas=new int[]{R.drawable.ad, R.drawable.ae, R.drawable.af,
            R.drawable.ag, R.drawable.ai, R.drawable.al, R.drawable.am,
            R.drawable.ao, R.drawable.aq, R.drawable.ar, R.drawable.at,
            R.drawable.au, R.drawable.aw, R.drawable.ax, R.drawable.az,
            R.drawable.ba, R.drawable.bb, R.drawable.bd, R.drawable.be,
            R.drawable.bf, R.drawable.bg, R.drawable.bh, R.drawable.bi,
            R.drawable.bj, R.drawable.bl, R.drawable.bm, R.drawable.bn,
            R.drawable.bo, R.drawable.bq, R.drawable.br, R.drawable.bs,
            R.drawable.bt, R.drawable.bv, R.drawable.bw, R.drawable.by,
            R.drawable.bz, R.drawable.ca, R.drawable.cc, R.drawable.cd,
            R.drawable.cf, R.drawable.cg, R.drawable.ch, R.drawable.ci,
            R.drawable.ck, R.drawable.cl, R.drawable.cm, R.drawable.cn,
            R.drawable.co, R.drawable.cr, R.drawable.cu, R.drawable.cv,
            R.drawable.cw, R.drawable.cx, R.drawable.cy, R.drawable.cz,
            R.drawable.de, R.drawable.dj, R.drawable.dk, R.drawable.dm,
            R.drawable.dominic, R.drawable.dz, R.drawable.ec,
            R.drawable.ee, R.drawable.eg, R.drawable.eh, R.drawable.er,
            R.drawable.es, R.drawable.et, R.drawable.fi, R.drawable.fj,
            R.drawable.fk, R.drawable.fm, R.drawable.fo, R.drawable.fr,
            R.drawable.ga, R.drawable.gb, R.drawable.gd, R.drawable.ge,
            R.drawable.gf, R.drawable.gg, R.drawable.gh, R.drawable.gi,
            R.drawable.gl, R.drawable.gm, R.drawable.gn, R.drawable.gp,
            R.drawable.gq, R.drawable.gs, R.drawable.gt, R.drawable.gu,
            R.drawable.gw, R.drawable.gy, R.drawable.hk, R.drawable.hm,
            R.drawable.hn, R.drawable.hr, R.drawable.ht, R.drawable.hu,
            R.drawable.id, R.drawable.ie, R.drawable.il, R.drawable.im,
            R.drawable.in, R.drawable.io, R.drawable.iq, R.drawable.ir,
            R.drawable.is, R.drawable.it, R.drawable.je, R.drawable.jm,
            R.drawable.jo, R.drawable.jp, R.drawable.ke, R.drawable.kg,
            R.drawable.kh, R.drawable.ki, R.drawable.km, R.drawable.kn,
            R.drawable.kp, R.drawable.kr, R.drawable.kw, R.drawable.ky,
            R.drawable.kz, R.drawable.la, R.drawable.lb, R.drawable.lc,
            R.drawable.li, R.drawable.lk, R.drawable.lr, R.drawable.ls,
            R.drawable.lt, R.drawable.lu, R.drawable.lv, R.drawable.ly,
            R.drawable.ma, R.drawable.mc, R.drawable.md, R.drawable.me,
            R.drawable.mf, R.drawable.mg, R.drawable.mh, R.drawable.mk,
            R.drawable.ml, R.drawable.mm, R.drawable.mn, R.drawable.mo,
            R.drawable.mp, R.drawable.mq, R.drawable.mr, R.drawable.ms,
            R.drawable.mt, R.drawable.mu, R.drawable.mv, R.drawable.mw,
            R.drawable.mx, R.drawable.my, R.drawable.mz, R.drawable.na,
            R.drawable.nc, R.drawable.ne, R.drawable.nf,
            R.drawable.ng, R.drawable.ni, R.drawable.nl, R.drawable.no,
            R.drawable.np, R.drawable.nr, R.drawable.nu, R.drawable.nz,
            R.drawable.om, R.drawable.pa, R.drawable.pe, R.drawable.pf,
            R.drawable.pg, R.drawable.ph, R.drawable.pk, R.drawable.pl,
            R.drawable.pm, R.drawable.pn, R.drawable.pr, R.drawable.ps,
            R.drawable.pt, R.drawable.pw, R.drawable.py, R.drawable.qa,
            R.drawable.re, R.drawable.ro, R.drawable.rs, R.drawable.ru,
            R.drawable.rw, R.drawable.sa, R.drawable.sb, R.drawable.sc,
            R.drawable.sd, R.drawable.se, R.drawable.sg, R.drawable.sh,
            R.drawable.si, R.drawable.sj, R.drawable.sk, R.drawable.sl,
            R.drawable.sm, R.drawable.sn, R.drawable.so, R.drawable.sr,
            R.drawable.ss, R.drawable.st, R.drawable.sv, R.drawable.sx,
            R.drawable.sy, R.drawable.sz, R.drawable.tc, R.drawable.td,
            R.drawable.tf, R.drawable.tg, R.drawable.th, R.drawable.tj,
            R.drawable.tk, R.drawable.tl, R.drawable.tm, R.drawable.tn,
            R.drawable.to, R.drawable.tr, R.drawable.tt, R.drawable.tv,
            R.drawable.tw, R.drawable.tz, R.drawable.ua, R.drawable.ug,
            R.drawable.um, R.drawable.us, R.drawable.uy, R.drawable.uz,
            R.drawable.va, R.drawable.vc, R.drawable.ve, R.drawable.vg,
            R.drawable.vi, R.drawable.vn, R.drawable.vu, R.drawable.wf,
            R.drawable.ws, R.drawable.xk, R.drawable.ye, R.drawable.yt,
            R.drawable.za, R.drawable.zm, R.drawable.zw};

    String [] paises=new String[]{"Andorra", "Emiratos Árabes Unidos", "Afganistán",
            "Antigua y Barbuda", "Anguila", "Albania", "Armenia",
            "Angola", "Antártida", "Argentina", "Austria",
            "Australia", "Aruba", "Aland", "Azerbaiyán",
            "Bosnia y Herzegovina", "Barbados", "Bangladesh", "Bélgica",
            "Burkina Faso", "Bulgaria", "Baréin", "Burundi",
            "Benin", "San Bartolomé", "Bermudas", "Brunéi",
            "Bolivia", "Caribe Neerlandés", "Brasil", "Bahamas",
            "Bután", "Isla Bouvet", "Botsuana", "Bielorrusia",
            "Belice", "Canadá", "Islas Cocos", "República Democrática del Congo",
            "República Centroafricana", "Congo", "Suiza", "Costa de Marfil",
            "Islas Cook", "Chile", "Camerún", "China",
            "Colombia", "Costa Rica", "Cuba", "Cabo Verde",
            "Curazao", "Islas de Navidad", "Chipre", "República Checa",
            "Alemania", "Yibuti", "Dinamarca", "Dominica",
            "República Dominicana", "Argelia", "Ecuador",
            "Estonia", "Egipto", "Sahara Occidental", "Eritrea",
            "España", "Etiopía", "Finlandia", "Fiyi",
            "Islas Malvinas", "Micronesia", "Islas Feroe", "Francia",
            "Gabón", "Reino Unido", "Granada", "Georgia",
            "Guayana Francesa", "Guernsey", "Ghana", "Gibraltar",
            "Groenlandia", "Gambia", "Guinea", "Guadalupe",
            "Guinea Ecuatorial", "Islas Georgias del Sur y Sándwich del Sur", "Guatemala", "Guam",
            "Guinea-Bisáu", "Guyana", "Hong Kong", "Islas Heard y McDonald",
            "Honduras", "Croacia", "Haití", "Hungría",
            "Indonesia", "Irlanda", "Israel", "Isla de Man",
            "India", "Territorio Británico del Oceáno Índico", "Irak", "Irán",
            "Islandia", "Italia", "Jersey", "Jamaica",
            "Jordania", "Japón", "Kenia", "Kirguistán",
            "Camboya", "Kiribati", "Comoras", "San Cristóbal y Nieves",
            "Corea del Norte", "Corea del Sur", "Kuwait", "Islas Caim´m",
            "Kazajistán", "Laos", "Líbano", "Santa Lucía",
            "Liechtenstein", "Sri Lanka", "Liberia", "Lesoto",
            "Lituania", "Luxemburgo", "Letonia", "Libia",
            "Marruecos", "Mónaco", "Moldavia", "Montenegro",
            "San Martin (Francia)", "Madagascar", "Islas Marshall", "Macedonia",
            "Malí", "Myanmar", "Mongolia", "Macao",
            "Islas Marianas del Norte", "Martinica", "Mauritania", "Monsterrat",
            "Malta", "Mauricio", "Maldivas", "Malawi",
            "México", "Malasia", "Mozambique", "Namibia",
            "Nueva Caledonia", "Níger", "Isla Norfolk", "Nigeria",
            "Nicaragua", "Paises Bajos", "Noruega", "Nepal",
            "Nauru", "Niue", "Nueva Zelanda", "Omán",
            "Panamá", "Perú", "Polinesia Francesa", "Papúa Nueva Guinea",
            "Filipinas", "Pakistán", "Polonia", "San Pedro y Miquelón",
            "Islas Pitcairn", "Puerto Rico", "Palestina", "Portugal",
            "Palaos", "Paraguay", "Qatar","Reunión",
            "Rumanía", "Serbia", "Rusia", "Ruanda",
            "Arabia Saudita", "Islas Salomón", "Seychelles", "Sudán",
            "Suecia", "Singapur", "Santa Elena, Ascensión y Tristán de Acuña", "Eslovenia",
            "Isla Bouvet", "Eslovaquia","Sierra Leona", "San Marino",
            "Senegal", "Somalia", "Surinam", "Sudán del sur",
            "Santo Tomé y Príncipe", "El Salvador", "San Martín (Países Bajos)", "Siria",
            "Suazilandia", "Islas Turcas y Caicos", "Chad", "Tierras Australes y Antárticas Francesas",
            "Togo", "Tailandia", "Tayiskistán", "Tokelau",
            "Timor Oriental", "Turkmenistán", "Túnez", "Tonga",
            "Turquía", "Trinidad y Tobago", "Tuvalu", "Taiwán",
            "Tanzania", "Ucrania", "Uganda", "Islas Ultramarinas",
            "Estados Unidos", "Uruguay", "Uzbekistán", "Ciudad del Vaticano",
            "San Vicente y las Granadinas", "Venezuela", "Islas Vírgenes Británicas",
            "Islas Vírgenes de los Estados Unidos", "Vietnam", "Vanuatu",
            "Wallis y Futuna", "Samoa", "Kosovo", "Yemen",
            "Mayotte", "Sudáfrica", "Zambia", "Zimbabue"};



   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=findViewById(R.id.txtRespuesta);
        ImageButton btnEspa=findViewById(R.id.btnEsp);
        btnEspa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("¡CORRECTO!");
            }
        });

        ImageButton btnItal=findViewById(R.id.btnIta);
        btnItal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("¡Has fallado! Esta es la bandera de Italia");
            }
        });



    }*/
@Override
    protected void onCreate(Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        for(int i=0; i>banderas.length-1; i++){
            paisesAleaotorios();
        }

    imagen1.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {
            if(paisesJuego.get(0).getNombre()==paisesJuego.get(aleatorio).getNombre()){
                Toast.makeText(MainActivity.this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                contador++;
                puntuacion.setText(contador);
            }else{
                Toast.makeText(MainActivity.this, "Has fallado, tu puntuación ha sido "
                        +contador, Toast.LENGTH_SHORT).show();
                if(contador>puntuacionRecord) {
                    Toast.makeText(MainActivity.this, "Nuevo Record: " + puntuacionRecord, Toast.LENGTH_SHORT).show();
                    record.setText(puntuacionRecord);
                }
                contador=0;
            }

        }
    });

    }



    public class Pais{
        private String nombre;
        private int imagen;

        public Pais(String p, int b) {
            nombre=p;
            imagen=b;
        }

        public String getNombre(){
            return nombre;
        }

        public int  getImagen(){
            return imagen;
        }
    }

    public void paisesAleaotorios(){
        for (int i = 0; i < 4; i++) {
            int aleatorio = Math.abs(r.nextInt()) * paises.length;
            paisesJuego.add(new Pais(paises[aleatorio], banderas[aleatorio]));
        }
    }

    public void cambiarImg(){
        imagen1.setImageResource(paisesJuego.get(0).getImagen());
        imagen2.setImageResource(paisesJuego.get(1).getImagen());
        imagen3.setImageResource(paisesJuego.get(2).getImagen());
        imagen4.setImageResource(paisesJuego.get(3).getImagen());
    }

    public void setPregunta(){
        aleatorio= Math.abs(r.nextInt()) * paisesJuego.size();
        pregunta.setText("¿Cuál es la bandera de "+paisesJuego.get(aleatorio).getNombre()+"?");
    }





//View.OnClickListener(new View.OnClickListener())







   /* public void meHanPulsado(View v){
        EditText ed=findViewById(R.id.edNombre);
        String nombre=ed.getText().toString();
        if(nombre.equals(""))
            t.setText("No me sé tu nombre");
        else
            t.setText("Hola querido "+nombre);
    }*/

    /*@Override
    public void onClick(View view) {
        EditText ed=findViewById(R.id.edNombre);
        String nombre=ed.getText().toString();
        if(nombre.equals(""))
            t.setText("No me sé tu nombre");
        else
            t.setText("Hola querido "+nombre);
    }*/
}