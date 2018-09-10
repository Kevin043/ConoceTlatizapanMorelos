package mx.edu.utng.conocemorelos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    private ListView lvItems;
    private Adaptador adaptabor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        lvItems = (ListView) findViewById(R.id.lvItems);
        adaptabor = new Adaptador(GetArrayItems(), this);
        lvItems.setAdapter(adaptabor);

    }

    private ArrayList<Entidad> GetArrayItems() {

        ArrayList<Entidad> listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.arbo, "La Arboleda", "Se encuentra en la zona centro de Tlaltizapán.", "Dirección: Paso del Campesino, Centro, 62770 Tlaltizapán, Mor."));
        listItems.add(new Entidad(R.drawable.jari, "Rest. Familiar el Jaripeo", "Es un lugar en medio de la naturaleza, ofrecen deliciosos platillos y cuentan con espacio para estacionamiento, albercas y un tobogan.", "Dirección: Carr. Yautepec-Jojutla km11., Colonia Morelos, 62773 Ticumán, Mor."));
        listItems.add(new Entidad(R.drawable.venado, "La Palapa del Vendado", "Se encuentra a bordo de carretera en la Col. Alejandra es un excelente lugar.", "Dirección: Carr Yautepec - Jojutla, 62770 Bonifacio García, Mor."));
        listItems.add(new Entidad(R.drawable.edwin, "Edwin Pizzas", "Es un lugar que ofrece las mejores pizzas cocinadas en horno de leña de esta zona, además de que cuenta con servicio a domicilio y queda a 5 min, de las Estacas.", "Dirección: Carr Yautepec - Jojutla, 62770 Bonifacio García, Mor."));
        listItems.add(new Entidad(R.drawable.panza, "Rest. Panzacola", "Es un lugar que se encuentra en medio de la naturaleza, el cual cuenta con albercas y áreas verdes.", "Dirección: Ticumán, Mor."));
        listItems.add(new Entidad(R.drawable.ranch, "Pie De La Cueva Mi Ranchito", "Es un lugar en medio del campo con albercas.", "Dirección: Camino cueva del gallo, Ticumán, Mor."));

        return listItems;
    }
}
