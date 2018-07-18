package com.example.wat.szyfrator;

import java.io.Serializable;

public class Message implements Serializable {

    private static int idProvider = 0;

    private MessageTypes messegeTypes;
    private String sender_ID;
    private String receiver_ID;
    private String sampleMessage;
    private String authenticationToken;
    private int id;

    public Message(MessageTypes messegeTypes, String sender_ID, String receiver_ID, String authenticationToken) {
        this.messegeTypes = messegeTypes;
        this.sender_ID = sender_ID;
        this.receiver_ID = receiver_ID;
        this.id = ++idProvider;
        this.sampleMessage = "Sample message " + id;
        this.authenticationToken = authenticationToken;
    }

    public Message(){
        this.id = ++idProvider;
        this.sampleMessage = "New message object" + id;
    }

    public String getSampleMessage() {
        return sampleMessage;
    }
}
