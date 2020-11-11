package jollosa.simarro.aplicacion13.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import jollosa.simarro.aplicacion13.R;
import jollosa.simarro.aplicacion13.fragment.Activity_Fragment_Detalle;
import jollosa.simarro.aplicacion13.fragment.Activity_Fragment_Lista;
import jollosa.simarro.aplicacion13.fragment.DiscosListener;
import jollosa.simarro.aplicacion13.pojo.Disco;

public class Activity_Principal extends AppCompatActivity implements DiscosListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_principal);

        Activity_Fragment_Lista frgListado = (Activity_Fragment_Lista)getSupportFragmentManager().findFragmentById(R.id.FrgLista);

        frgListado.setDiscosListener(this);

        //
    }

    @Override
    public void onDiscoSeleccionado(Disco disco){
        boolean hayDestalle = (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)!=null);

        if(hayDestalle){
            ((Activity_Fragment_Detalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)).mostrarDisco(disco);
        }else{

            Intent i = new Intent(this,Activity_Detalle.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("disco",disco);
            i.putExtras(bundle);
            startActivity(i);
        }
    }
}