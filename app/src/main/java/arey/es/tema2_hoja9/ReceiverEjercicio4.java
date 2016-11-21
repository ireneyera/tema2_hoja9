package arey.es.tema2_hoja9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ReceiverEjercicio4 extends BroadcastReceiver {

    public static final String TAG = "ReceiverEjercicio4";

    public ReceiverEjercicio4() {
    }

    /**
     * Recibe el broadcast tema2_hoja9.ACCION y crea una Activity con el dato recibido en el broadcast
     * @param context
     * @param intent
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "Se ha recibido un broadcast");

        Intent anIntent = new Intent(context, ActivityDestino.class);
        anIntent.putExtra(ActivityDestino.DATO1, intent.getStringExtra(ActivityDestino.DATO1));
        anIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(anIntent);
    }
}
