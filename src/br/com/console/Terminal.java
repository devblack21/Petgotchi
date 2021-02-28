package br.com.console;

import br.com.animacao.Animation;
import java.io.IOException;

public interface Terminal {

    public void pintarTela(Animation animation);
    public void delay() throws InterruptedException;
    public void fechar();
    public void abrirConsole();
    public void abrirMenuDeComandos();
    public void limpar() throws IOException, InterruptedException;

}
