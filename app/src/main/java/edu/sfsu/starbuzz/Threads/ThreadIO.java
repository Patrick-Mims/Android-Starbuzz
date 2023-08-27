package edu.sfsu.starbuzz.Threads;

import android.support.v4.app.INotificationSideChannel;
import android.util.Log;

/*
import org.apache.http.HttpHost;
import org.apache.http.client.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.ProxyClient;
*/

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ThreadIO implements Runnable {

    public ThreadIO() {
    }

    @Override
    public void run() {
        try {
            URL url = new URL("http://www.cnn.com");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    /* Java provides locks to protect certain parts of the code to be executed by several threads at the same time.
     * The way to lock a certain method or class is to define the method or class with the synchronized keyword.
     * */
    public synchronized void critical() {
        Log.i("CRITICAL","This is the synchronized method");
    }
}