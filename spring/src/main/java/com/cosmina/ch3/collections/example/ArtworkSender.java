package com.cosmina.ch3.collections.example;

public interface ArtworkSender {

    void sendArtwork(String artworkPath, Recipient recipient);

    String getFriendlyName();

    String getShortName();
}
