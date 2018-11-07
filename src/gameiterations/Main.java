/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameiterations;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Iteration a = new Iteration();
        
        a.games.add(new Iteration(1,"home","visitor"));
        a.games.add(new Iteration(2,"visitor","home"));
        a.games.add(new Iteration(3,"visitor","home"));
        a.games.add(new Iteration(4,"home","visitor"));
        a.games.add(new Iteration(5));
        a.games.add(new Iteration(6));
        a.games.add(new Iteration(7));
        a.games.add(new Iteration(8));
        a.games.add(new Iteration(9,"home","visitor"));
        a.games.add(new Iteration(10,"visitor","home"));
        
        System.out.println("Koti breakit: " + a.BreakCheckA(a.games));
        System.out.println("Vieras breakit: " + a.BreakCheckB(a.games));
        
        a.games.get(6).SetHomeA("home");
        a.games.get(6).SetHomeB("visitor");
        
        System.out.println("Koti breakit: " + a.BreakCheckA(a.games));
        System.out.println("Vieras breakit: " + a.BreakCheckB(a.games));
    }
    
}
