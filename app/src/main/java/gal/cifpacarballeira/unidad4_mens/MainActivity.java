package gal.cifpacarballeira.unidad4_mens;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layoutInterno;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // instancia del layout para modificar sus atributos luego de su creacion
        layoutInterno = (ConstraintLayout) findViewById(R.id.main);

        // instancia del textView para modificar sus atributos luego de su creacion
        //textView1 = (TextView) findViewById(R.id.textView1);

        // Asociamos un menú contextual al textView
        //registerForContextMenu(textView1);


        // Si creamos una toolbar personalizada
//        Toolbar toolbar = findViewById(R.id.your_toolbar);
//        setSupportActionBar(toolbar);
//
//        // Habilitar el botón de opciones (opcional)
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


//    // Método para el menú de opciones
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater=getMenuInflater();
//        inflater.inflate(R.menu.menu_opciones, menu);
//        return true;
//    }
//
//    // Método para gestionar los eventos de los elementos del menú de opciones
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == R.id.item_opc_1){
//            // Opción 1
//        }else if (item.getItemId() == R.id.item_opc_2){
//            // Opción 2
//        }
//        return true;
//    }
//
//    // Método para el menú contextual, donde sew asocia el menú contrextual al textView
//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
//    {
//        menu.setHeaderTitle("Elija el color de fondo:");
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_del_tv, menu);
//    }
//
//    // Método para gestionar los eventos de los elementos del menú contextual
//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//
//        if (item.getItemId() == R.id.itemRojo) {
//            // Acción al seleccionar el color rojo
//        }
//        return true;
//    }
//
//
//    // Método para asociar un menú emergente popup al pulsar en una vista
//    public void showPopUpMenu(View view) {
//        PopupMenu popupMenu = new PopupMenu(this,view);
//        MenuInflater menuInflater = popupMenu.getMenuInflater();
//        menuInflater.inflate(R.menu.acciones, popupMenu.getMenu());
//
//        // Manejador de clicks
//        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//
//                if (item.getItemId() == R.id.itemAccion1){
//                    // Acción 1
//                }
//                return true;
//            }
//        });
//
//        // mostrarlo
//        popupMenu.show();
//
//    }



}