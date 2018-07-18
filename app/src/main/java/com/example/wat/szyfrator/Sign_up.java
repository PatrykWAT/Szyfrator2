package com.example.wat.szyfrator;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class Sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void click(View view) {
        EditText number = (EditText) findViewById(R.id.editText);

        new MyAsyncTask(Sign_up.this).execute();
    }

    private class MyAsyncTask extends AsyncTask<String, Void, String> {
        Activity activity;
        EditText textView;
        IOException ioException;

        MyAsyncTask(Activity activity) {
            super();
            this.activity = activity;
            this.ioException = null;
        }

        @Override
        protected String doInBackground(String... params) {
            //   StringBuilder sb = new StringBuilder();

            Socket socket = null;
            try {
                PrintStream output;
                socket = Socket_Class.SingletonHelper.getInstance();
                output = new PrintStream(socket.getOutputStream());
                output.write(Integer.parseInt("Message"));
                System.out.print("send");
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }
    }
}
