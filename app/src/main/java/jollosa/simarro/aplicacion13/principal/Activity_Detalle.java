package jollosa.simarro.aplicacion13.principal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import jollosa.simarro.aplicacion13.R;
import jollosa.simarro.aplicacion13.fragment.Activity_Fragment_Detalle;
import jollosa.simarro.aplicacion13.pojo.Disco;

public class Activity_Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_detalle);

        Activity_Fragment_Detalle detalle = (Activity_Fragment_Detalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);

        Bundle bundle = getIntent().getExtras();

        Disco disco = (Disco) bundle.getSerializable("disco");

        detalle.mostrarCanciones(disco);



        //
    }


}
