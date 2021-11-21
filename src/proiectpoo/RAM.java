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
public class RAM extends ObiectGeneral{
    
    private int frecventa;
    private String latenta;
    private float voltaj;
    
    private String tipMemorie;
    private int capacitate;
    private String tipComunicare;

    public RAM() 
    {
        super();
        this.capacitate=1;
        this.tipComunicare="Necunoscut";
        this.tipMemorie="Necunoscut";
        this.latenta="Necunoscut";
        this.voltaj=0.1f;
        this.frecventa=1;
    }

    //public RAM(int frecventa, String latenta, float voltaj, String tipMemorie, int capacitate, String tipComunicare, ObiectGeneral obj)

    public RAM(String nume, String producator, boolean inStoc, float pret, int anAparitie,int frecventa, String latenta, float voltaj, String tipMemorie, int capacitate, String tipComunicare ) throws IllegalArgumentException {
        super(nume, producator, inStoc, pret, anAparitie);
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
        if(latenta!=null)
        { if(latenta.equals("")==false)
            this.latenta=latenta;
        else throw new IllegalArgumentException("Latenta de memorie nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Latenta de memorie nu poate sa fie nul ");
         if(frecventa>0)
            this.frecventa=frecventa;
        else throw new IllegalArgumentException("Frecventa nu poate sa fie 0 sau negativa");
          if(voltaj>0)
            this.voltaj=voltaj;
        else throw new IllegalArgumentException("Voltaj ul nu poate sa fie 0 sau negativa");
    }
    
    public RAM(RAM obj)
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
        
         if(obj.latenta!=null)
        { if(obj.latenta.equals("")==false)
            this.latenta=obj.latenta;
        else throw new IllegalArgumentException("Latenta de memorie nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Latenta de memorie nu poate sa fie nul ");
         if(obj.frecventa>0)
            this.frecventa=obj.frecventa;
        else throw new IllegalArgumentException("Frecventa nu poate sa fie 0 sau negativa");
          if(obj.voltaj>0)
            this.voltaj=obj.voltaj;
        else throw new IllegalArgumentException("Voltaj ul nu poate sa fie 0 sau negativa");
        }
    }
    @Override
    public String toString()
    {
         return super.toString()+"Capacitate: "+this.capacitate+"\n"+"Tip comunicare: "+this.tipComunicare+"\n"+"Tip memorie: "+this.tipMemorie+"\n"
                 +"Latenta: "+this.latenta+"\n"+"Frecventa: "+this.frecventa+"\n"+"Voltaj: "+this.voltaj+"\n";
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
    
    public String getLatenta()
    {
        return this.latenta;
    }
    public void setLatenta(String latenta) throws  IllegalArgumentException
    {
         if(latenta!=null)
        { if(latenta.equals("")==false)
            this.latenta=latenta;
        else throw new IllegalArgumentException("Latenta de memorie nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Latenta de memorie nu poate sa fie nul ");
    }
    
    public int getFrecventa()
    {
        return this.frecventa;
    }
    
    public void setFrecventa(int frecventa)
    {
        if(frecventa>0)
            this.frecventa=frecventa;
        else throw new IllegalArgumentException("Frecventa nu poate sa fie 0 sau negativa");
    }
    
    public float getVoltaj()
    {
        return this.voltaj;
    }
    
    public void setVoltaj(float voltaj) throws IllegalArgumentException
    {
        if(voltaj>0)
            this.voltaj=voltaj;
        else throw new IllegalArgumentException("Voltaj ul nu poate sa fie 0 sau negativa");
    }
    
    
}
