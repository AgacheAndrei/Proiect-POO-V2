/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpoo;

import java.io.Serializable;

/**
 *
 * @author ioio
 */
public class HDD extends ObiectGeneral implements Serializable{
    
    private int vitezaRotatie;
    
    private String tipMemorie;
    private int capacitate;
    private String tipComunicare;
    
    public HDD()
    {
        super();
        this.capacitate=1;
        this.tipComunicare="Necunoscut";
        this.tipMemorie="Necunoscut";
        this.vitezaRotatie=1;
    }
    public HDD(String nume,String producator,boolean inStoc,float pret,int anAparitie,String tipMemorie,int capacitate,String tipComunicare,int viteza) throws IllegalArgumentException
    {
        super(nume,producator,inStoc,pret,anAparitie);
        if(capacitate>0)
            this.capacitate=capacitate;
        else throw new IllegalArgumentException("Capacitatea nu poate sa fie 0 sau negativa");
        if(tipMemorie!=null)
        { if(tipMemorie.equals("")==false)
            this.tipMemorie=tipMemorie;
        else throw new IllegalArgumentException("Tipul de memorie nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Tipul de memorie nu poate sa fie nul ");
        if(tipComunicare!=null)
        { if(tipComunicare.equals("")==false)
            this.tipComunicare=tipComunicare;
        else throw new IllegalArgumentException("Tipul de comunicare nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Tipul de comunicare nu poate sa fie nul ");
        if(viteza>0)
            this.vitezaRotatie=viteza;
        else throw new IllegalArgumentException("Viteza de rotatie nu poate sa fie 0 sau negativa");
    }
    public HDD(HDD obj) throws IllegalArgumentException
    {
        super(obj);
         if(obj.capacitate>0)
            this.capacitate=obj.capacitate;
        else throw new IllegalArgumentException("Capacitatea nu poate sa fie 0 sau negativa");
        if(obj.tipMemorie!=null)
        { if(obj.tipMemorie.equals("")==false)
            this.tipMemorie=obj.tipMemorie;
        else throw new IllegalArgumentException("Tipul de memorie nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Tipul de memorie nu poate sa fie nul ");
        if(obj.tipComunicare!=null)
        { if(obj.tipComunicare.equals("")==false)
            this.tipComunicare=obj.tipComunicare;
        else throw new IllegalArgumentException("Tipul de comunicare nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Tipul de comunicare nu poate sa fie nul ");
        if(obj.vitezaRotatie>0)
            this.vitezaRotatie=obj.vitezaRotatie;
        else throw new IllegalArgumentException("Viteza de rotatie nu poate sa fie 0 sau negativa");
        
    }
    @Override
    public String toString()
    {
        return super.toString()+"Capacitate: "+this.capacitate+"\n"+"Tip comunicare: "+this.tipComunicare+"\n"+"Tip memorie: "+this.tipMemorie+"\n"+"Viteza de rotatie: "+this.vitezaRotatie+"\n";
    }
    public int getCpacitate()
    {
        return this.capacitate;
    }
    public void setCapacitate(int capacitate) throws IllegalArgumentException
    {
        if(capacitate>0)
            this.capacitate=capacitate;
        else throw new IllegalArgumentException("Capacitatea nu poate sa fie 0 sau negativa");
    }
    
    public String getTipMemorie()
    {
        return this.tipMemorie;
    }
    public void setTipMemorie(String tipMemorie) throws  IllegalArgumentException
    {
         if(tipMemorie!=null)
        { if(tipMemorie.equals("")==false)
            this.tipMemorie=tipMemorie;
        else throw new IllegalArgumentException("Tipul de memorie nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Tipul de memorie nu poate sa fie nul ");
    }
    
    public String getTipComunicare()
    {
        return this.tipComunicare;
    }
    public void setTiComunicare(String tipComunicare) throws  IllegalArgumentException
    {
         if(tipComunicare!=null)
        { if(tipComunicare.equals("")==false)
            this.tipComunicare=tipComunicare;
        else throw new IllegalArgumentException("Tipul de comunicare nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Tipul de comunicare nu poate sa fie nul ");
    }
    public int getVitezaRotatie()
    {
        return this.vitezaRotatie;
    }
    
    public void setVitezaRotatie(int viteza) throws IllegalArgumentException
    {
        if(viteza>0)
            this.vitezaRotatie=viteza;
        else throw new IllegalArgumentException("Viteza de rotatie nu poate sa fie 0 sau negativa");
    }
    
}
