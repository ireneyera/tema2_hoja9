package arey.es.tema2_hoja9;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ejercicio3 extends AppCompatActivity {

    private PendingIntent aPendingIntent;

    /**
     * Dado que no ha requisitos, podemos crear la alarma en el método oncreate.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        AlarmManager anAlarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);

        Intent anIntent = new Intent(this, ActivityDestino.class);
        anIntent.putExtra(ActivityDestino.DATO1, "Dato enviado desde el ejercicio 3");

        aPendingIntent = PendingIntent.getActivity(this, 0, anIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        // Creamos una alarma basándonos en la última hora en la que el dispositivo se inició
        anAlarmManager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime()+6000, 6000, aPendingIntent);
    }

    /**
     * La cancelanción de la alarma se realiza a través del pendingIntent
     * @param v
     */
    public void cancelarAlarma(View v) {
        aPendingIntent.cancel();
    }
}
