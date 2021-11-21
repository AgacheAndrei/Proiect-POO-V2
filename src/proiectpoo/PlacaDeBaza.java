package proiectpoo;


public class PlacaDeBaza extends ObiectGeneral {
    private String tipMemorie;
    private String format;
    private String socluProcesor;
    private String producatorChipset;
    private String tehnologie;


    public PlacaDeBaza(){
        super();
        tipMemorie="Necunoscut";
        format="Necunoscut";
        socluProcesor="Necunoscut";
        producatorChipset="Necunoscut";
        tehnologie="Necunoscuta";
    }

   
    public PlacaDeBaza(String nume, String producator, boolean inStoc, float pret, int anAparitie , String format , String socluProcesor ,String tipMemorie , String producatorChipset , String tehnologie)
    {super(nume, producator, inStoc, pret, anAparitie);
    this.format=format;
    this.socluProcesor=socluProcesor;
    this.producatorChipset=producatorChipset;
    this.tehnologie=tehnologie;
    this.tipMemorie=tipMemorie;
    }   
    
    public PlacaDeBaza(PlacaDeBaza obj){
        super(obj);
        if(obj.format!=null)this.format=obj.format;
        
        if(obj.socluProcesor!=null)this.socluProcesor=obj.socluProcesor;
        
        if(obj.producatorChipset!=null)this.producatorChipset=obj.producatorChipset;

        if(obj.tehnologie!=null)this.tehnologie=obj.tehnologie;

        if(obj.tipMemorie!=null)this.tipMemorie=obj.tipMemorie;
    

    }
    
    @Override
    public String toString() {
        return super.toString()+"Format: "+this.format+"\n"+"Soclu procesor: "+this.socluProcesor+"\n"+"Producator chipset: "+this.producatorChipset+"\n"
                +"Tehnologie: "+this.tehnologie+"\n"+"Tip memorie:"+ this.tipMemorie + "\n";
    }

    public String getTipMemorie() {
    return tipMemorie;
    }

    public void setTipMemorie(String tipMemorie) {
        if(tipMemorie!=null)
            if(tipMemorie.equals("")==false)
               this.tipMemorie = tipMemorie;
    }

   

    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        if(format!=null)
            if(format.equals("")==false)
                this.format = format;
    }
    public String getSocluProcesor() {
        return socluProcesor;
    }
    public void setSocluProcesor(String socluProcesor) {
        if(socluProcesor!=null)
            if(socluProcesor.equals("")==false)
                this.socluProcesor = socluProcesor;
    }
    public String getProducatorChipset() {
        return producatorChipset;
    }
    public void setProducatorChipset(String producatorChipset) {
        if(producatorChipset!=null)
            if(producatorChipset.equals("")==false)
                this.producatorChipset = producatorChipset;
    }
    public String getTehnologie() {
        return tehnologie;
    }
    public void setTehnologie(String tehnologie) {
        if(tehnologie!=null)
            if(tehnologie.equals("")==false)
                this.tehnologie = tehnologie;
    }
    

    
}
