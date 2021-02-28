package br.com;

import br.com.console.ConsoleLinux;
import br.com.controller.Game;
import br.com.controller.GameFacade;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        Game game = new GameFacade(new ConsoleLinux());

        game.run();
    }


}
