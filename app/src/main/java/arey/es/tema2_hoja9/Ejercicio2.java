package arey.es.tema2_hoja9;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Ejercicio2 extends AppCompatActivity {

    /**
     * Dado que no hay requisitos de cuando enviar la información, se crea y envía el pendingIntent en el método oncreat
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        AlarmManager anAlarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        Intent anIntent = new Intent(this, ActivityDestino.class);
        anIntent.putExtra(ActivityDestino.DATO1, "Dato enviado desde el ejercicio 2");
        PendingIntent aPendingIntent = PendingIntent.getActivity(this, 0, anIntent, PendingIntent.FLAG_ONE_SHOT);

        anAlarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime()+6000, aPendingIntent);

    }
}
