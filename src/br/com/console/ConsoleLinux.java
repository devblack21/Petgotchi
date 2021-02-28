package br.com.console;

import java.io.IOException;

public class ConsoleLinux extends Console{

    @Override
    public void limpar() throws IOException, InterruptedException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
    }
}
