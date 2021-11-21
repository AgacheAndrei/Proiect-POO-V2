/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpoo;

/**
 *
 * @author Petru
 */
public class Carcasa extends ObiectGeneral{
    private int vent_incluse;
    private String tipCarcasa;
    private String format;
    private boolean sursa;//daca contine sursa sau nu
    
    
    public Carcasa(){
        vent_incluse = 0;
        tipCarcasa = "Necunoscuta";
        format = "Necunoscut";
        sursa = true;
    };
    
    public Carcasa(int vent,String tip,String form,boolean source, String nume, String producator, boolean inStoc, float pret, int anAparitie ){
        super(nume, producator, inStoc, pret, anAparitie);
        vent_incluse = vent;
        tipCarcasa = tip;
        format = form;
        sursa = source;
    };
    
     public Carcasa(Carcasa obj){
        super(obj);
        this.format=obj.format;
        this.vent_incluse=obj.vent_incluse;
        this.tipCarcasa=obj.tipCarcasa;
        this.sursa=obj.sursa;
    };
     
    public String getTip(){
        return tipCarcasa;
    };
    
    public void setTip(String tipCarcasa){
        this.tipCarcasa = tipCarcasa;
    };
    
    public String getFormat(){
        return format;
    };
    
    public void setFormat(String format){
        this.format = format;
    };
    
    public int getVentIncluse(){
        return vent_incluse;
    };
    
    public void setVentIncluse(int vent_incluse){
        if(vent_incluse>0)
            this.vent_incluse = vent_incluse;
        else throw new IllegalArgumentException("");
    };
    
    public boolean isSursa(){
    return sursa;
    };
    
    public void setSursa(final boolean sursa){
    this.sursa = sursa;
    };
    
    @Override
    public String toString() {
        return super.toString() +  "Numarul de ventilatoare incluse in carcasa : " + vent_incluse + "\nTipul carcasei : " + tipCarcasa + "\nContine sursa carcasa : " + sursa + "\nTipul de format al carcasei : "+ format+"\n";
    };
    
    
}

