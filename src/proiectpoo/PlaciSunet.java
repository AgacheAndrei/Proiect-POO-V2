/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpoo;

/**
 *
 * @author ioio
 */
public class PlaciSunet extends ObiectGeneral {
    
    private String interfata;
    private int rezolutie;
    private float nrCanale;
    
    
    public PlaciSunet (){
        interfata = "Necunoscuta";
        rezolutie = 0;
        nrCanale = 0.1f;       
    };
    
    public PlaciSunet (int rez ,float nrC , String name, String nume, String producator, boolean inStoc, float pret, int anAparitie ){
        super(nume, producator, inStoc, pret, anAparitie);
        rezolutie = rez;
        nrCanale = nrC;
        interfata = name;
    };
    
    public PlaciSunet(PlaciSunet obj){
        super(obj);
        this.interfata=obj.interfata;
        this.rezolutie=obj.rezolutie;
        this.nrCanale=obj.nrCanale;
    };
    
    public String getInterfata(){
        return interfata;
    };
    
    public void setInterfata(String interfata){
        this.interfata = interfata;
    };
    
    public int getRezolutie(){
        return rezolutie;
    };
    
    public void setRezolutie(int rezolutie){
        if(rezolutie>0)
            this.rezolutie = rezolutie;
        else throw new IllegalArgumentException("");
    };
    
    public float getCanale(){
        return nrCanale;
    };
    
    public void setCanale(float nrCanale){
        if(nrCanale>0)
            this.nrCanale = nrCanale;
        else throw new IllegalArgumentException("");
    }; 
    
    @Override
    public String toString() {
        return super.toString() + "Interfata placii de sunet : " + interfata + "\nNumarul de canale ale placii de sunet : " + nrCanale + "\nRezolutia placii de sunet : " + rezolutie +"\n";
    };
   
}
