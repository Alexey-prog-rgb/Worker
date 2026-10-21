package org.example;

public class Worker {
    OnTackDoneListener callback;

    public Worker(OnTackDoneListener callback) {
        this.callback = callback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Tack " + i + " is done!");
        }
    }
}
