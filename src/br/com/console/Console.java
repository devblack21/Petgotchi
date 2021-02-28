package br.com.console;

import br.com.animacao.Animation;
import java.util.Scanner;

public abstract class Console implements Terminal{

    protected Scanner scanner ;
    private boolean isRunner = false;
    private final int DELAY_TIME_MILLISECONDS = 1000;

    public Console(){
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void abrirMenuDeComandos() {
        System.out.println("!!! MENU !!!");
        System.out.println("--------+ ALIMENTAÇÃO");
        System.out.println("-------------+ COMIDAS");
        System.out.println("-----------------+ 1 | BANANA");
        System.out.println("-----------------+ 2 | CHOCOLATE");
        System.out.println("-----------------+ 6 | UVA");
        System.out.println("-----------------+ 7 | CARNE");
        System.out.println("-------------+ BEBIDAS");
        System.out.println("-----------------+ 8 | ÁGUA");
        System.out.println("-----------------+ 9 | REFRIGERANTE");
        System.out.println("-----------------+ 10 | SUCO");
        System.out.println("--------+ LAZER");
        System.out.println("-------------+ 11 | PASSEAR");
        System.out.println("-------------+ 12 | BRINCAR");
        System.out.println("-------------+ 13 | AMIGOS");
        System.out.println("-------------+ 13 | XERETAR");
        System.out.println("--------+ NECESSIDADES");
        System.out.println("-------------+ 15 | XIXI");
        System.out.println("-------------+ 16 | COCO");
        System.out.println("-------------+ 17 | DORMIR");
        System.out.println();



        System.out.println();



    }


    @Override
    public void delay() throws InterruptedException {
        Thread.sleep(DELAY_TIME_MILLISECONDS);
    }

    @Override
    public void fechar() {
        this.scanner.close();
        this.scanner = null;
        this.isRunner = false;
        System.out.println("Obrigado por jogar !!");
    }

    @Override
    public void pintarTela(Animation animation) {
        animation.draw();
    }

    @Override
    public void abrirConsole() {
        this.isRunner = true;
        System.out.println("Bem vindo ao Petgotchi !!");
    }

    public boolean isRunner() {
        return isRunner;
    }

    public Scanner getScanner() {
        return scanner;
    }
}
