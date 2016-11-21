package arey.es.tema2_hoja9;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ejercicio1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
    }

    /**
     * Envía una notificación al dispositivo, con un pendingIntent asociado. Al pulsar sobre la notificación
     * el intent del pendingIntent se ejecutará.
     * @param v
     */
    public void sendNotification(View v) {

        NotificationManager aNotificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

        Notification.Builder aNotificationBuilder = new Notification.Builder(this);
        aNotificationBuilder.setContentTitle("Púlsame");
        aNotificationBuilder.setContentText("¡Sorpresa!");
        aNotificationBuilder.setSmallIcon(android.R.drawable.btn_minus);


        Intent anIntent = new Intent(this, ActivityDestino.class);
        anIntent.putExtra(ActivityDestino.DATO1, "Dato enviado desde el ejercicio 1");
        PendingIntent aPendingIntent = PendingIntent.getActivity(this, 0, anIntent, PendingIntent.FLAG_ONE_SHOT);

        aNotificationBuilder.setContentIntent(aPendingIntent);

        Notification aNotification = aNotificationBuilder.build();

        aNotificationManager.notify(0, aNotification);
    }
}
