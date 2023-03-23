package sv.edu.utec.parcialetps2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class perfilprincipal extends AppCompatActivity {

    TextView nombreDetalle;
    ImageView foto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfilprincipal);
        Bundle bundle = getIntent().getExtras();
        nombreDetalle = findViewById(R.id.tvNombreEmp);
        String info = "El nombre del empleado seleccionado es: "+bundle.getString("nombre");
        nombreDetalle.setText(info);

        foto = findViewById(R.id.imvFotito);
        int info2 = bundle.getInt("foto");
        foto.setImageResource(info2);

    }
}