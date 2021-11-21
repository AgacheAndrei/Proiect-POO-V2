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
public class SSD extends ObiectGeneral{
    
    private String formFactor;
    private String tipController;
    
    private String tipMemorie;
    private int capacitate;
    private String tipComunicare;

    
    public SSD() 
    {
        super();
        this.formFactor="Necunoscut";
        this.tipController="Necunoscut";
        this.capacitate=1;
        this.tipComunicare="Necunoscut";
        this.tipMemorie="Necunoscut";
    }
    
    public SSD(String nume, String producator, boolean inStoc, float pret, int anAparitie,String formFactor, String tipController, int capacitate,String tipMemorie,  String tipComunicare ) throws IllegalArgumentException {
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
        if(formFactor!=null)
        { if(formFactor.equals("")==false)
            this.formFactor=formFactor;
        else throw new IllegalArgumentException("Form Factor ul  nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Form Factor ul  de memorie nu poate sa fie nul ");
        if(tipController!=null)
        { if(tipController.equals("")==false)
            this.tipController=tipController;
        else throw new IllegalArgumentException("Tip Controller ul  nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Tip Controller ul  de memorie nu poate sa fie nul ");
    }
    public SSD(SSD obj) throws IllegalArgumentException
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
        if(obj.formFactor!=null)
        { if(obj.formFactor.equals("")==false)
            this.formFactor=obj.formFactor;
        else throw new IllegalArgumentException("Form Factor ul  nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Form Factor ul  de memorie nu poate sa fie nul ");
        if(obj.tipController!=null)
        { if(obj.tipController.equals("")==false)
            this.tipController=obj.tipController;
        else throw new IllegalArgumentException("Tip Controller ul  nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Tip Controller ul  de memorie nu poate sa fie nul ");
    }
    
    
    @Override
    public String toString()
    {
        return super.toString()+"Capacitate: "+this.capacitate+"\n"+"Tip comunicare: "+this.tipComunicare+"\n"+"Tip memorie: "+this.tipMemorie+"\n"
                +"Form factor: "+this.formFactor+"\n"+"Tip controller: "+this.tipController+"\n";
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
    public void setTipComunicare(String tipComunicare) throws  IllegalArgumentException
    {
         if(tipComunicare!=null)
        { if(tipComunicare.equals("")==false)
            this.tipComunicare=tipComunicare;
        else throw new IllegalArgumentException("Tipul de comunicare nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Tipul de comunicare nu poate sa fie nul ");
    }
    public String getFormFactor()
    {
        return this.formFactor;
    }
    public void setFormFactor(String formFactor) throws  IllegalArgumentException
    {
         if(formFactor!=null)
        { if(formFactor.equals("")==false)
            this.formFactor=formFactor;
        else throw new IllegalArgumentException("Form Factor ul  nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Form Factor ul  de memorie nu poate sa fie nul ");
    }
    public String getTipController()
    {
        return this.tipController;
    }
    public void setTipController(String tipController) throws  IllegalArgumentException
    {
         if(tipController!=null)
        { if(tipController.equals("")==false)
            this.tipController=tipController;
        else throw new IllegalArgumentException("Tip Controller ul  nu poate sa fie sirul vid");
        }
        else throw new IllegalArgumentException("Tip Controller ul  de memorie nu poate sa fie nul ");
    }
}
