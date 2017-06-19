package ingeniumbd.com.eidwish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {
    private TextView tvOne;
    String Data;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_content);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        tvOne = (TextView) findViewById(R.id.tvOne);
        Intent intent= getIntent();
        Bundle extras = getIntent().getExtras();
        if (extras == null)
        {
            return;
        }
        int res = extras.getInt("resourseInt");

        ImageView view = (ImageView) findViewById(R.id.image);

        view.setImageResource(res);
        Data = intent.getStringExtra("Data");
        tvOne.setText(Data);

    }
}

