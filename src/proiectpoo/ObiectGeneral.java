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
// as face clasa abstracta, sa nu poata sa fir initializata
//metode doar de baza precum get and set
 public class ObiectGeneral implements Serializable{
    
    private String nume;
    private String producator;
    private boolean inStoc;//numar produse
    private float pret;
    private int anAparitie;
    
    public ObiectGeneral() //pot sa l fac private 
    {
        this.nume="Necunoscut";
        this.producator="Necunoscut";
        this.inStoc=false;
        this.pret=0f;
        this.anAparitie=1;
    }
    
    public ObiectGeneral(String nume,String producator,boolean inStoc,float pret,int anAparitie)
            throws IllegalArgumentException
    {
       if(nume!=null)
        { if(nume.equals("")==false)
            this.nume=nume;
        else throw new IllegalArgumentException("numele nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("numele nu poate sa fie nul ");
        if(producator!=null)
        { if(producator.equals("")==false)
            this.producator=producator;
        else throw new IllegalArgumentException("producatorul nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("producatorul nu poate sa fie nul ");
        this.inStoc=inStoc;
       if(pret>=0f)
          this.pret=pret;
          else throw new IllegalArgumentException("Pretul nu poate sa fie negativ");
       if(anAparitie>0)
         this.anAparitie=anAparitie;
         else throw new IllegalArgumentException("Anul nu poate sa fie negativ");
        
    }
    public ObiectGeneral(ObiectGeneral obj) throws IllegalArgumentException
    {
        if(obj.nume!=null)
        { if(obj.nume.equals("")==false)
            this.nume=obj.nume;
        else throw new IllegalArgumentException("numele nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("numele nu poate sa fie nul ");
        if(obj.producator!=null)
        { if(obj.producator.equals("")==false)
            this.producator=obj.producator;
        else throw new IllegalArgumentException("producatorul nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("producatorul nu poate sa fie nul ");
        this.inStoc=obj.inStoc;
       if(obj.pret>=0f)
          this.pret=obj.pret;
          else throw new IllegalArgumentException("Pretul nu poate sa fie negativ");
       if(obj.anAparitie>0)
         this.anAparitie=obj.anAparitie;
         else throw new IllegalArgumentException("Anul nu poate sa fie negativ");
    }
    
    @Override
    public String toString()
    {
        return "Nume: "+this.nume+"\n"+"Producator: "+this.producator+"\n"
                +"Stoc: "+this.inStoc+"\n"+"Pret: "+this.pret+"\n"+"An aparitie: "+this.anAparitie+"\n";
    }
    
    public String getNume()
    {
            return this.nume;
    }
    public void setNume(String nume) throws IllegalArgumentException
    {
       if(nume!=null)
        { if(nume.equals("")==false)
            this.nume=nume;
        else throw new IllegalArgumentException("numele nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("numele nu poate sa fie nul ");
    }
   
    public String getProducator()
    {
        return this.producator;
    }
     public void setProducator(String producator) throws IllegalArgumentException
    {
         if(producator!=null)
        { if(producator.equals("")==false)
            this.producator=producator;
        else throw new IllegalArgumentException("producatorul nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("producatorul nu poate sa fie nul ");
    }
     
     public boolean getInStoc()
     {
         return this.inStoc;
     }
     public void setInStoc(boolean val)
     {
         this.inStoc=val;
     }
     
     public float getPret()
     {
         return this.pret;
     }
     public void setPret(float pret) throws IllegalArgumentException
     {
        
          if(pret>=0f)
          this.pret=pret;
          else throw new IllegalArgumentException("Pretul nu poate sa fie negativ");
     }
     
     public int getAnAparitie() 
     {
         return this.anAparitie;
     }
     public void setAnAparitie(int anAparitie) throws IllegalArgumentException
     {
         if(anAparitie>0)
         this.anAparitie=anAparitie;
         else throw new IllegalArgumentException("Anul nu poate sa fie negativ");
             
     }

    
}
