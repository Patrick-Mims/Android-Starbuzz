package edu.sfsu.starbuzz;

import android.os.Environment;
import android.util.Log;

import java.io.File;

// Read, Write, Input and Output
public class RWIO {
    private String fileName;

    public RWIO() {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void getData() {
        File external = Environment.getExternalStorageDirectory();

        if(external.isDirectory()) {
            Log.i("FILE", "This is a Directory");
        } else {
            Log.i("FILE", "This is not Directory");
        }
    }
}