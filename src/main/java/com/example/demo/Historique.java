package com.example.demo;

public class Historique{
    private Enchere enchere; 


    public Enchere getEnchere() {
        return this.enchere;
    }

    public void setEnchere(Enchere enchere) {
        this.enchere = enchere;
    }

    public Historique(){

    }
    public Enchere getHistorique(String idutilisateur){
        try{
           
           this.enchere = Enchere.selectEnchereByIdUser(idutilisateur);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return enchere;
    }
    
}