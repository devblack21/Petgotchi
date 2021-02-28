package br.com.console;

import java.io.IOException;

public class ConsoleWindows extends Console{
    @Override
    public void limpar() throws IOException, InterruptedException {
        new ProcessBuilder("cls").inheritIO().start().waitFor();
    }
}
