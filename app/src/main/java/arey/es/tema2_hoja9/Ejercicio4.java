package arey.es.tema2_hoja9;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Ejercicio4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        AlarmManager anAlarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);

        Intent anIntent = new Intent("tema2_hoja9.ACCION");
        anIntent.putExtra(ActivityDestino.DATO1, "Dato enviado desde el ejercicio 4");

        PendingIntent aPendingIntent = PendingIntent.getBroadcast(this, 0, anIntent, PendingIntent.FLAG_ONE_SHOT);
        anAlarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime()+2000, aPendingIntent);
    }
}
