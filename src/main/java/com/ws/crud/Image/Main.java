package com.ws.crud.Image;

public class Main {
    public static void main(String[] args) {
        String absolute = System.getProperty("user.dir");
        String change = absolute.replace("\\", "/");
        change = change + "/src/main/resources/static/images";
        System.out.println(change);
    }
}
