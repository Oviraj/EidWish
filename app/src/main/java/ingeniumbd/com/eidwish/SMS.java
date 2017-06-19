package ingeniumbd.com.eidwish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SMS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Button EnglishSms = (Button)findViewById(R.id.btnEnglish);
        Button BanglaSms = (Button)findViewById(R.id.btnBangla);

        EnglishSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), EnglishSms.class);
                view.getContext().startActivity(Intent);
            }
        });
        BanglaSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), BanglaSms.class);
                view.getContext().startActivity(Intent);
            }
        });
    }
}
