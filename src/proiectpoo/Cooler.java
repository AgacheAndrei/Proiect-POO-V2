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

public class Cooler extends ObiectGeneral{
     //cooler este obiect aparte
    private String formatRacire;
    private int putere;
    private int numarVentilatoare;
    private boolean modularitate;
    
    public Cooler (){
        formatRacire = "Necunoscut";
        putere = 0;
        numarVentilatoare = 0;
        modularitate = false;
    };
    
    public Cooler (String format ,int p,int nrV,boolean modul, String nume, String producator, boolean inStoc, float pret, int anAparitie ){
        super(nume, producator, inStoc, pret, anAparitie);
        this.formatRacire = format;
        this.putere = p;
        this.numarVentilatoare = nrV;
        this.modularitate = modul;
    };
    
    public Cooler(Cooler obj){
        super(obj);
        this.formatRacire=obj.formatRacire;
        this.putere=obj.putere;
        this.numarVentilatoare=obj.numarVentilatoare;
        this.modularitate=obj.modularitate;
    };
    
    public String getFormatRacire(){
        return formatRacire;
    };
    
    public void setFormat(String format){
        this.formatRacire = format;
    };
   
    public int getNrVent(){
        return numarVentilatoare;
    };
    
    public void setNrVent(int numarVentilatoare){
        if(numarVentilatoare>0)
            this.numarVentilatoare = numarVentilatoare;
        else throw new IllegalArgumentException("");
    };
    
    public int getPutere(){
        return putere;
    };
    
    public void setPutere(int putere){
        if(putere>0)
            this.putere = putere;
        else throw new IllegalArgumentException("");
    };
    
    public boolean isModularitate(){
    return modularitate;
    }

    public void setModularitate(final boolean modularitate){
    this.modularitate = modularitate;
    };
    
    @Override
    public String toString() {
        return super.toString() +  "Formatul cooler-ului : " + formatRacire + "\nModularitatea cooler-ului : " + modularitate + "\nNumarul de ventilatoare ale cooler-ului : "+ numarVentilatoare +"\nPuterea cooler-ului : "+ putere;
    };
}