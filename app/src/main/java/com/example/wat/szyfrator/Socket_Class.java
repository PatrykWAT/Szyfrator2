package com.example.wat.szyfrator;


import java.io.IOException;
import java.net.Socket;

public class Socket_Class {
    public static class SingletonHelper{

        private static Socket INSTANCE = null;


        public static Socket getInstance() throws IOException {
            if(INSTANCE == null){
                INSTANCE = new Socket("192.168.1.18", 5678);
            }

            return INSTANCE;
        }

    }
}
