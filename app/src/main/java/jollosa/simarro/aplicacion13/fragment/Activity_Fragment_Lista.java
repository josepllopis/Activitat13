package jollosa.simarro.aplicacion13.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import jollosa.simarro.aplicacion13.R;
import jollosa.simarro.aplicacion13.adaptador.AdaptadorDiscos;
import jollosa.simarro.aplicacion13.pojo.Cancion;
import jollosa.simarro.aplicacion13.pojo.Disco;

public class Activity_Fragment_Lista extends Fragment {

    private ArrayList<Disco>discos = new ArrayList<Disco>();
    private ArrayList<Cancion>canciones = new ArrayList<Cancion>();
    private ListView lstListado;
    private DiscosListener listener;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.layout_fragment_lista,container,false);
    }

    public void setDiscosListener(DiscosListener listener){
        this.listener = listener;
    }

    @Override
    public void onActivityCreated(Bundle state){
        super.onActivityCreated(state);

        lstListado = (ListView)getView().findViewById(R.id.lstListado);

        canciones.add(new Cancion("Estopa","3:25","Tu calorro"));
        canciones.add(new Cancion("Estopa","4:12","Por la raja de tu falda"));
        canciones.add(new Cancion("Estopa","3:52","Como camaron"));
        canciones.add(new Cancion("Estopa","3:36","Cacho a cacho"));
        canciones.add(new Cancion("Estopa","4:01","Me falta el aliento"));

        discos.add(new Disco("Estopa",canciones));

        canciones.clear();
        canciones.add(new Cancion("Estopa","2:40","Vino Tinto"));
        canciones.add(new Cancion("Estopa","4:22","Nasío pa la Alegria"));
        canciones.add(new Cancion("Estopa","3:38","Partiendo la pana"));
        canciones.add(new Cancion("Estopa","3:08","Destrangis in the Night"));
        canciones.add(new Cancion("Estopa","4:27","Ojitos Rojos"));

        discos.add(new Disco("Destrangis",canciones));

        canciones.clear();
        canciones.add(new Cancion("Estopa","2:50","Fuente de Energía"));
        canciones.add(new Cancion("Estopa","4:31","Corazon Aerodinámico"));
        canciones.add(new Cancion("Estopa","3:28","Ya no me acuerdo"));
        canciones.add(new Cancion("Estopa","3:58","Cuanta Tinta Tonta"));
        canciones.add(new Cancion("Estopa","4:07","Tragicomedia"));


        discos.add(new Disco("¿La calle es tuya?",canciones));

        canciones.clear();
        canciones.add(new Cancion("Estopa","2:36","Malabares"));
        canciones.add(new Cancion("Estopa","4:12","Vacaciones"));
        canciones.add(new Cancion("Estopa","3:25","Gulere Gulere"));
        canciones.add(new Cancion("Estopa","3:18","No quiero verla mas"));
        canciones.add(new Cancion("Estopa","4:47","Paseo"));

        discos.add(new Disco("Voces de Ultratumba",canciones));

        canciones.clear();
        canciones.add(new Cancion("Estopa","2:22","Cuando Amanece"));
        canciones.add(new Cancion("Estopa","3:41","Hemicraneal"));
        canciones.add(new Cancion("Estopa","3:45","El Run Run"));
        canciones.add(new Cancion("Estopa","2:58","Pesadilla"));
        canciones.add(new Cancion("Estopa","3:52","Era"));
        discos.add(new Disco("Allenrock",canciones));

        lstListado.setAdapter(new AdaptadorDiscos(this,discos));

        lstListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(listener != null){
                    listener.onDiscoSeleccionado((Disco)lstListado.getAdapter().getItem(i));
                }
            }
        });
    }

}
