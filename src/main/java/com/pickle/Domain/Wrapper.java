package com.pickle.Domain;

/**
 * Created by andrikurniawan.id@gmail.com on 3/23/2016.
 */
public class Wrapper {
    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) { this.message = message; }

    public Wrapper() {
    }

    public Wrapper(int status, String message) {

        this.status = status;
        this.message = message;
    }
}
