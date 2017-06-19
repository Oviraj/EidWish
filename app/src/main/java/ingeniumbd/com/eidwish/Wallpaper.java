package ingeniumbd.com.eidwish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Wallpaper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Button Nasta = (Button)findViewById(R.id.btnNasta);
        Button Mach = (Button)findViewById(R.id.btnMach);
        Button Mangso = (Button)findViewById(R.id.btnMangso);
        Button Panio = (Button)findViewById(R.id.btnPanio);
        Button Mistanno = (Button)findViewById(R.id.btnMistanno);

        Nasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Nasta.class);
                view.getContext().startActivity(Intent);
            }
        });
        Mach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Mach.class);
                view.getContext().startActivity(Intent);
            }
        });
        Mangso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Mangso.class);
                view.getContext().startActivity(Intent);
            }
        });
        Panio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Panio.class);
                view.getContext().startActivity(Intent);
            }
        });
        Mistanno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Mistanno.class);
                view.getContext().startActivity(Intent);
            }
        });

        }
    }
