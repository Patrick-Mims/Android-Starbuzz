package edu.sfsu.starbuzz.Services;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class DataService extends IntentService {
    public static final String EXTRA_MESSAGE = "message";

    public DataService() {
        super("DataService");
    }

    // onCreate - runs immediately after the service is created.
    @Override
    public void onCreate() {
        Log.i("CREATE", "Created Message...");
    }

    // onStartCommand - runs when the service is about to start.
    @Override
    public int onStartCommand(Intent intent, int flag, int id) {
        super.onStartCommand(intent, flag, id);
        return START_NOT_STICKY;
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i("SERVICE", "onHandleIntent");
        synchronized (this) {
            try {
               wait(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String text = intent.getStringExtra(EXTRA_MESSAGE);
            showText(text);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("DESTROY", "The service has been destroyed");
    }

    public void showText(final String text) {
        Log.v("MSG", "The message is: " + text);
    }
}