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
import jollosa.simarro.aplicacion13.pojo.Disco;

public class AdaptadorDiscos extends ArrayAdapter<Disco> {

    Activity context;
    ArrayList<Disco> discos;

    public AdaptadorDiscos(Fragment context,ArrayList<Disco>discos){
        super(context.getActivity(), R.layout.layout_elemento_lista,discos);
        this.context = context.getActivity();
        this.discos = discos;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.layout_elemento_lista,null);

        TextView lblNombre = (TextView)item.findViewById(R.id.nombreDisco);
        lblNombre.setText(discos.get(position).getNombre());

        return(item);
    }
}
