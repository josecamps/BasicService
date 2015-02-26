package myothor.com.basicservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {


    private static String TAG = "MyService";
    private static MyService instance = null;

    public MyService() {
    }

    public static boolean isRunning() {
        return instance != null;
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate");
        instance = this;
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy");

        instance = null;
        super.onDestroy();

        Intent intent = new Intent("com.android.basicservice");
        sendBroadcast(intent);



    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand");

        // --------------------
        // Your Code.
        //
        //

        return Service.START_STICKY;

    }
}
