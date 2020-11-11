package jollosa.simarro.aplicacion13.adaptador;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import jollosa.simarro.aplicacion13.R;
import jollosa.simarro.aplicacion13.pojo.Cancion;
import jollosa.simarro.aplicacion13.pojo.Disco;

public class AdaptadorCanciones extends ArrayAdapter<Cancion> {

    Activity context;
    ArrayList<Cancion> canciones;
    ArrayList<Disco>discos;

    public AdaptadorCanciones(Fragment context,ArrayList<Cancion>canciones){
        super(context.getActivity(), R.layout.layout_elemento_detalle,canciones);
        this.context = context.getActivity();
        this.canciones = canciones;
    }

    public View getView(int position, View convetView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.layout_elemento_detalle,null);

        TextView lblNombre = (TextView)item.findViewById(R.id.LblNombre);
        lblNombre.setText(canciones.get(position).getNombre());


        return(item);
    }
}
