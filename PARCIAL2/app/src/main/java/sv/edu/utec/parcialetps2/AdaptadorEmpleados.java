package sv.edu.utec.parcialetps2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class AdaptadorEmpleados extends ArrayAdapter<Empleados> {
    Context contexto;
    List<Empleados>aListEmp;

    public AdaptadorEmpleados(Context contexto, List<Empleados>lisEmp) {
        super(contexto, R.layout.empleados,lisEmp);
        this.contexto = contexto;
        this.aListEmp = lisEmp;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater =LayoutInflater.from(contexto);
        View item =inflater.inflate(R.layout.empleados,null);

        Empleados emp = aListEmp.get(position);
        ImageView imagen =item.findViewById(R.id.imvFoto);
        imagen.setImageResource(emp.getImagen());

        TextView nombre = item.findViewById(R.id.tvNombre);
        nombre.setText(emp.getNombre());

        TextView cargo = item.findViewById(R.id.tvCargo);
        cargo.setText(emp.getCargo());

        TextView compania = item.findViewById(R.id.tvCompania);
        compania.setText(emp.getCompania());
        return(item);
    }
}
