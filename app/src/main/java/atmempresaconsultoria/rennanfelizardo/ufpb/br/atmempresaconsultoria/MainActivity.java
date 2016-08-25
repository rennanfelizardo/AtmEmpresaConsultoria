package atmempresaconsultoria.rennanfelizardo.ufpb.br.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView empresaMenu;
    private ImageView servicosMenu;
    private ImageView clientesMenu;
    private ImageView contatoMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empresaMenu  = (ImageView) findViewById(R.id.empresaId);
        servicosMenu = (ImageView) findViewById(R.id.servicosId);
        clientesMenu = (ImageView) findViewById(R.id.clientesId);
        contatoMenu  = (ImageView) findViewById(R.id.contatoId);

        empresaMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });


        servicosMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ServicosActivity.class));
            }
        });

        clientesMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }
        });

        contatoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });
    }

}
