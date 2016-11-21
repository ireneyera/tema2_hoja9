package arey.es.tema2_hoja9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDestino extends AppCompatActivity {

    public static final String DATO1 = "DATO1";
    private TextView aTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);

        aTextView = (TextView)findViewById(R.id.destinoTextView);

        Intent intentRecibido = getIntent();

        aTextView.setText(intentRecibido.getStringExtra(DATO1));

    }
}
