package jollosa.simarro.aplicacion13.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import jollosa.simarro.aplicacion13.R;
import jollosa.simarro.aplicacion13.adaptador.AdaptadorCanciones;
import jollosa.simarro.aplicacion13.pojo.Disco;

public class Activity_Fragment_Detalle extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.layout_fragment_detalle,container,false);
    }

    public void mostrarDisco(Disco disco){
        ListView lsv = (ListView)getView().findViewById(R.id.CaracteristicasCanciones);

        lsv.setAdapter(new AdaptadorCanciones(this,disco.getCanciones()));
    }
}
