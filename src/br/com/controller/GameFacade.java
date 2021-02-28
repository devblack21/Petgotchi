package br.com.controller;

import br.com.console.Console;
import java.io.IOException;

public class GameFacade implements Game{

    private Console console ;
    private boolean gameover = false;
    private String loading = "";
    public GameFacade(Console console){
        this.console = console;
    }

    private boolean isInstaciado(){
        return this.console != null;
    }

    @Override
    public void start() {
        if(this.isInstaciado() && !this.console.isRunner()){
            this.console.abrirConsole();
        }
    }

    @Override
    public void close() {
        if(this.isInstaciado() && this.console.isRunner()){
            this.console.fechar();
        }
    }

    @Override
    public void run() throws InterruptedException, IOException {

        this.start();
        while (this.console.isRunner()){

            banana();

           break;

        }
    }

    private void loading(String loading){
        this.loading += loading;
        System.out.println(this.loading);
    }

    @Override
    public void executar(String comando) {
        switch (comando.toUpperCase().trim()
                .replace(" ","")){
            case "1":
            case "INICIAR":
                System.out.println("comando iniciar");
                break;
        }
    }


    private void animation() throws InterruptedException, IOException {
        int a = 0;
        while ( a < 10){
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(
                    "|\\---/|\n" +
                            "| o_o |\n" +
                            " \\_^_/\n"
            );
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.println(
                    "/\\_/\\\n" +
                            "( o.o )\n" +
                            " > ^ <"
            );
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(
                    "|\\---/|\n" +
                            "| o_o |\n" +
                            " \\_^_/\n"
            );
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.println(
                    "/\\_/\\\n" +
                            "( o.o )\n" +
                            " > ^ <"
            );

            a++;
        }
    }

    private void dormir() throws InterruptedException, IOException {
        int a = 0;
        String a1 = "      |\\      _,,,---,,_\n" +
                "ZZZzz /,`.-'`'    -.  ;-;;,_\n" +
                "     |,4-  ) )-,_. ,\\ (  `'-'\n" +
                "    '---''(_/--'  `-'\\_)\n";

        String a2 = "      |\\      _,,,---,,_\n" +
                "   zz /,`.-'`'    -.  ;-;;,_\n" +
                "     |,4-  ) )-,_. ,\\ (  `'-'\n" +
                "    '---''(_/--'  `-'\\_)\n";

        while ( a < 10){
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(a2);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(a1);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(a2);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(a1);

            a++;
        }

    }

    private void banana() throws InterruptedException, IOException {
        int a = 0;
        String banana =
               "                     \n" +
                       "               \".           ,#  \n" +
                       "               \\ `-._____,-'=/\n" +
                       "            ____`._ ----- _,'_____\n" +
                       "                   `-----'\n";
        String banana2 =
                "                     \n" +
                        "               \".           ,#  \n" +
                        "               \\ `-._____,-'=/\n" +
                        "        ________`._ ----- _,'_________\n" +
                        "                   `-----'\n";

        while ( a < 10){
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);

            a++;
        }

    }

    private void amigos() throws InterruptedException, IOException {
        int a = 0;
        String banana =
                        "                    /^--^\\   /^--^\\   /^--^\\\n" +
                        "                    \\____/   \\____/   \\____/\n" +
                        "                    /    \\   /    \\   /     \\\n" +
                        "                   |      | |      | |       |\n" +
                        "                   \\__  __/ \\__  __/ \\__  __/\n" +
                        "|^|^|^|^|^|^|^|^|^|^|^\\ \\^|^|^/ /^|^|^|^\\ \\^|^|^|^|^|^|^|^|^|^|\n" +
                        "| | | | | | | | | | | |\\ \\| |/ /| | | | |\\ \\| | | | | | | | | |\n" +
                        "| | | | | | | | | | | |/ /| |\\ \\| | | | |/ /| | | | | | | | | |\n" +
                        "| | | | | | | | | | | |\\/ | | \\/| | | | |\\/ | | | | | | | | | |\n" +
                        "###############################################################\n";
        String banana2 =
                        "              miau! /^--^\\   /^--^\\   /^--^\\ miau!\n" +
                        "                    \\____/   \\____/   \\____/\n" +
                        "                    /    \\   /    \\   /     \\\n" +
                        "                   |      | |      | |       |\n" +
                        "                   \\__  __/ \\__  __/ \\__  __/\n" +
                        "|^|^|^|^|^|^|^|^|^|^|^\\ \\^|^|^/ /^|^|^|^\\ \\^|^|^|^|^|^|^|^|^|^|\n" +
                        "| | | | | | | | | | | |\\ \\| |/ /| | | | |\\ \\| | | | | | | | | |\n" +
                        "| | | | | | | | | | | |/ /| |\\ \\| | | | |/ /| | | | | | | | | |\n" +
                        "| | | | | | | | | | | |\\/ | | \\/| | | | |\\/ | | | | | | | | | |\n" +
                        "###############################################################\n";

        while ( a < 10){
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);

            a++;
        }

    }

    private void pee() throws InterruptedException, IOException {
        int a = 0;
        String banana =
                                "            ( }\n" +
                                "    ====  /\\\\\n" +
                                "    |  | / /\\\\\n" +
                                "    |__|_L_==n\n" +
                                "      L(   ) |\n" +
                                "       (___) L\n" +
                                "   \n";
        String banana2 =
                        "           ( }\n" +
                        "    ====  /\\\\\n" +
                        "    |  | / /\\\\\n" +
                        "    |__|_L_==n\n" +
                        "      L(   ) |_\n" +
                        "       (___) \n" +
                        "   \n";

        while ( a < 10){
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);

            a++;
        }

    }


    private void xeretar() throws InterruptedException, IOException {
        int a = 0;
        String banana =
                        "              ,-.       _,---._ __  / \\\n" +
                        "             /  /    .-'       `./ /   \\\n" +
                        "            (  (   ,'            `/    /|\n" +
                        "             \\  `-\"             \\'\\   / |\n" +
                        "              `.              ,  \\ \\ /  |\n" +
                        "               /`.          ,'-`----Y   |\n" +
                        "              (            ;        |   '\n" +
                        "              |  ,-.    ,-'         |  /\n" +
                        "              |  | (   |            | /\n" +
                        "              )  |  \\  `.___________|/\n" +
                        "              `--'   `--'\n";
        String banana2 =
                        "             ,-.       _,---._ __   / \\\n" +
                        "             )  )    .-'       `./ /   \\\n" +
                        "            (  (   ,'            `/    /|\n" +
                        "             \\  `-\"             \\'\\   / |\n" +
                        "              `.              ,  \\ \\ /  |\n" +
                        "               /`.          ,'-`----Y   |\n" +
                        "              (            ;        |   '\n" +
                        "              |  ,-.    ,-'         |  /\n" +
                        "              |  | (   |            | /\n" +
                        "              )  |  \\  `.___________|/\n" +
                        "              `--'   `--'\n";

        while ( a < 10){
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);

            a++;
        }

    }

    private void brincar() throws InterruptedException, IOException {
        int a = 0;
        String banana =
                        " \n" +
                        "              / )\n" +
                        "             ( (\n" +
                        "              ) )\n" +
                        "             ( (\n" +
                        "              )_)\n" +
                        "        _,-\"\"   \"\"-._\n" +
                        "      /_  /\\     /\\  _\\\n" +
                        "     (/ \\(/\\\\-~-//\\)/ \\)\n" +
                        "     {   \"         \"   }\n" +
                        "      \\ {  _  } /\n" +
                        "     ,--.>_ .:Y:. _<,--.\n" +
                        "     `'''  '--^--'  `'''\n";
        String banana2 =
                        " \n" +
                        "              ( \\ \n" +
                        "               ) )\n" +
                        "              ( (\n" +
                        "               ) )\n" +
                        "              (_(\n" +
                        "        _,-\"\"   \"\"-._\n" +
                        "      /_  /\\     /\\  _\\\n" +
                        "     (/ \\(/\\\\-~-//\\)/ \\)\n" +
                        "     {   \"         \"   }\n" +
                        "      \\ {  _  } /\n" +
                        "     ,--.>_ .:Y:. _<,--.\n" +
                        "     `'''  '--^--'  `'''\n";

        while ( a < 10){
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);

            a++;
        }

    }

    private void passear() throws InterruptedException, IOException {
        int a = 0;
        String banana =
                         "  *                  *\n" +
                        "            __                *\n" +
                        "         ,db'    *     *\n" +
                        "        ,d8/       *        *    *\n" +
                        "        888\n" +
                        "        `db\\       *     *\n" +
                        "          `o`_                    **\n" +
                        "      *               *   *   _      *\n" +
                        "            *                ( \\ \n" +
                        "         *    (\\__/) *       ) )  *\n" +
                        "       ,-.,-.,)    (.,-.,-.,-( (.,-.,-.\n" +
                        "      | @|  ={      }= | @|  / / | @|o |\n" +
                        "     _j__j__j_)     `-------/ /__j__j__j_\n" +
                        "     ________(               /___________\n" +
                        "      |  | @| \\              || o|O | @|\n" +
                        "      |o |  |,'\\       ,   ,'\"|  |  |  |\n" +
                        "     vV\\|/vV|`-'\\  ,---\\   | \\Vv\\hjwVv\\//v\n" +
                        "                _) )    `. \\ /\n" +
                        "               (__/       ) )\n" +
                        "                         (_/\n";
        String banana2 =
                        " *                  *\n" +
                        "             __                *\n" +
                        "          ,db'    *     *\n" +
                        "         ,d8/       *        *    *\n" +
                        "         888\n" +
                        "         `db\\       *     *\n" +
                        "           `o`_                    **\n" +
                        "      *               *   *    _      *\n" +
                        "            *                 / )\n" +
                        "         *    (\\__/) *       ( (  *\n" +
                        "       ,-.,-.,)    (.,-.,-.,-.) ).,-.,-.\n" +
                        "      | @|  ={      }= | @|  / / | @|o |\n" +
                        "     _j__j__j_)     `-------/ /__j__j__j_\n" +
                        "     ________(               /___________\n" +
                        "      |  | @| \\              || o|O | @|\n" +
                        "      |o |  |,'\\       ,   ,'\"|  |  |  |\n" +
                        "     vV\\|/vV|`-'\\  ,---\\   | \\Vv\\hjwVv\\//v\n" +
                        "                _) )    `. \\ /\n" +
                        "               (__/       ) )\n" +
                        "                         (_/\n";

        while ( a < 10){
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana);
            this.console.delay();
            this.console.limpar();
            this.console.abrirMenuDeComandos();
            System.out.print(banana2);

            a++;
        }

    }




}
