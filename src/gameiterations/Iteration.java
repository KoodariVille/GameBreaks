/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameiterations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
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
//    public int BreakCheckA(List<Iteration> games){
//        Iteration g = games.get(0);
//        for(int i = 1; i < games.size(); i++){
//            if(g.homeA == true && games.get(i).homeA == true){
//                hBreaks += 1;
//            }
//            g = games.get(i);           
//        }
//        return hBreaks;
//    }
    
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
