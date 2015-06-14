import java.util.Map;
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Main {
    
    public static void main(String[] args) {
        Time time1 = new Time();
        
        time1.addJogador("Goleiro", new Jogador(1, "Júlio César"));
        time1.addJogador("Zagueiro", new Jogador(3, "David Luiz"));
        time1.addJogador("Atacante", new Jogador(5, "Neymar"));
        
        Time time2 = new Time();
        
        time2.addJogador("Goleiro", new Jogador(2, "Júlia César"));
        time2.addJogador("Zagueiro", new Jogador(4, "Da vida Luiza"));
        time2.addJogador("Atacante", new Jogador(6, "Neymara"));
        
        Set<String> Chaves = (time1.getJogadores()).keySet();
            
        System.out.println("Posição   Time1   Time2");
       
        for (String entry: Chaves) {
        System.out.println( entry+"    "+ time1.getJogadores().get(entry) +"  "+ time2.getJogadores().get(entry));
        
    }
            
 }
}
