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
    private HashMap<String, Jogador> jogadores = new HashMap<>();;

    public Time() {
    }
    
    public HashMap getJogadores() {
        return jogadores;
    }
    
    public void addJogador(String S1, Jogador J1){
        jogadores.put(S1, J1);
    }
  
}

