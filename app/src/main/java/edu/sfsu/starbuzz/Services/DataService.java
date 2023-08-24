package edu.sfsu.starbuzz.Services;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
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

    public void showText(final String text) {
        Log.v("MSG", "The message is: " + text);
    }
}