package sv.edu.utec.parcialetps2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Empleados>listaEmpleados;
    private ListView lvEmp;
    private ListAdapter lstAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmp = findViewById(R.id.listaEmpleados);
        llenadoDeEmpleados();
        AdaptadorEmpleados adaptadorFru = new AdaptadorEmpleados(this,listaEmpleados);
        lvEmp.setAdapter(adaptadorFru);

        lvEmp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "Has pulsado: "+ listaEmpleados.get(i).getNombre(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),perfilprincipal.class);
                intent.putExtra("nombre",listaEmpleados.get(i).getNombre());
                startActivity(intent);
                //Intent intent2 = new Intent(getApplicationContext(),perfilprincipal.class);
                intent.putExtra("foto",listaEmpleados.get(i).getImagen());
                startActivity(intent);
            }
        });

    }

    public ArrayList<Empleados> llenadoDeEmpleados(){
        listaEmpleados = new ArrayList<Empleados>();
        listaEmpleados.add(new Empleados("Alexander Pierrot","CEO","Insures S.O",R.drawable.lead_photo_1));
        listaEmpleados.add(new Empleados("Carlos Lopez","Asistente","Hospital Bllue",R.drawable.lead_photo_2));
        listaEmpleados.add(new Empleados("Sara Bonz","Directora de Marketing","Electrical Parts Itd",R.drawable.lead_photo_3));
        listaEmpleados.add(new Empleados("Liliana Clarence","Diseñarodra de Producto","CreativaApp",R.drawable.lead_photo_4));
        listaEmpleados.add(new Empleados("Benito Peralta","Supervidor de Ventas","Neumáticos Press",R.drawable.lead_photo_5));
        listaEmpleados.add(new Empleados("Juan Jaramillo","CEO","Banco Nacional",R.drawable.lead_photo_6));
        listaEmpleados.add(new Empleados("Christian Step","CTO","Cooperativa Verde",R.drawable.lead_photo_7));
        listaEmpleados.add(new Empleados("Alexa Giraldo","Lead Programmer","Frutisofy",R.drawable.lead_photo_8));
        listaEmpleados.add(new Empleados("Linda Murillo","Director de Marketing","Seguros Bolivar",R.drawable.lead_photo_9));
        listaEmpleados.add(new Empleados("Lizeth Astrada","CEO","Concesionario Motolox",R.drawable.lead_photo_10));

        return listaEmpleados;
    }
}