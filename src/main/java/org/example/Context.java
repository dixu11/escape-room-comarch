package org.example;

public class Context {
    private Player player;
    private Room room;
    private Service service;

    public Context(Player player, Room room, Service service) {
        this.player = player;
        this.room = room;
        this.service = service;
    }

    public Player getPlayer() {
        return player;
    }

    public Room getRoom() {
        return room;
    }

    public Service getService() {
        return service;
    }
}
