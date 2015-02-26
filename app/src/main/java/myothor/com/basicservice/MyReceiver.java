package myothor.com.basicservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Jose Camps.
 */
public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent myService = new Intent(context, MyService.class);
        if (!MyService.isRunning()) {
            context.startService(myService);
        }
   }

}
