package br.com.controller;

import java.io.IOException;

public interface Game {

    public void start();
    public void close();
    public void run() throws InterruptedException, IOException;
    public void executar(String comando);

}
