/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author kiqdestro
 */
public class Time {
    private HashMap<String, Jogador> jogadores;

    public Time() {
        this.jogadores = new HashMap<>();
    }
    
    public HashMap getJogadores() {
        return jogadores;
    }
    
    public void addJogador(String S1, Jogador J1){
        jogadores.put(S1, J1);
    }
    
    public static void main(String[] args) {
        Time time1 = new Time();
        
        time1.addJogador("Goleiro", new Jogador(1, "Júlio César"));
        time1.addJogador("Zagueiro", new Jogador(3, "David Luiz"));
        time1.addJogador("Atacante", new Jogador(5, "Neymar"));
        
        Time time2 = new Time();
        
        time2.addJogador("Goleiro", new Jogador(2, "Júlia César"));
        time2.addJogador("Zagueiro", new Jogador(4, "Da vida Luiza"));
        time2.addJogador("Atacante", new Jogador(6, "Neymara"));
        
        Set<Object> Chaves = (time1.getJogadores()).keySet();
            
        System.out.println("Posição   Time1   Time2");
       
        for (Object entry: Chaves) {
        System.out.println( entry+"    "+ time1.getJogadores().get(entry) +"  "+ time2.getJogadores().get(entry));
        
    }
            
    }
}

