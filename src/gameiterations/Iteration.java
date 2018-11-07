package gameiterations;

import java.util.ArrayList;
import java.util.List;

public class Iteration {
    private int round;
    private String homeA;
    private String homeB;
    private int hBreaks,vBreaks;
    public List<Iteration> games = new ArrayList<>();
    
    public Iteration(int i, String homeA, String homeB){
        round = i;
        this.homeA = homeA;
        this.homeB = homeB;
    }
    
    public Iteration(int i){
        round = i;
    }
    
    public Iteration(){}
    
    public void SetHomeA(String x){
        homeA = x;
    }
    
    public void SetHomeB(String x){
        homeB = x;
    }

    public void CheckRound(Iteration round, List<Iteration> games){
        String checkA = games.get(0).homeA;
        String checkB = games.get(0).homeB;
        hBreaks = 0;
        vBreaks = 0;      
        
        for(int i = 1; i < round.round; i++){
            if(games.get(i).homeA != null){
                if(checkA.equals("home") && games.get(i).homeA.equals("home")){
                hBreaks += 1;
                //System.out.println(games.get(i).round);
                }
                checkA = games.get(i).homeA;
            }  
        }

        for(int i = 1; i < round.round; i++){
            if(games.get(i).homeB != null){
                if(checkB.equals("home") && games.get(i).homeB.equals("home")){
                vBreaks += 1;
                //System.out.println(games.get(i).round);
                }
                checkB = games.get(i).homeB;
            }            
        }
        
        System.out.println((round.round) + " kierroksella on kertynyt breikkejä kotijoukkueelle: " + 
                hBreaks + " ja vierasjoukkueelle: " + vBreaks);
    }
    
    public int BreakCheckA(List<Iteration> games){
        String check = games.get(0).homeA;
        hBreaks = 0;
        
        for(int i = 1; i < games.size(); i++){
            if(games.get(i).homeA != null){
                if(check.equals("home") && games.get(i).homeA.equals("home")){
                hBreaks += 1;
                //System.out.println(games.get(i).round);
                }
                check = games.get(i).homeA;
            }  
        }     
        return hBreaks;
    }
    
    public int BreakCheckB(List<Iteration> games){
        String check = games.get(0).homeB;
        vBreaks = 0;
        
        for(int i = 1; i < games.size(); i++){
            if(games.get(i).homeB != null){
                if(check.equals("home") && games.get(i).homeB.equals("home")){
                vBreaks += 1;
                //System.out.println(games.get(i).round);
                }
                check = games.get(i).homeB;
            }            
        }     
        return vBreaks;
    }
}
