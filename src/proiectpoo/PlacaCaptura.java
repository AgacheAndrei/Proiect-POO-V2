package proiectpoo;

public class PlacaCaptura extends ObiectGeneral {
    private String interfata;
    private String rezolutie;
    private String tipIesire;
    private Byte numarIesiri;

    public PlacaCaptura(){
        super();
        interfata="Necunoscuta";
        rezolutie="Necunoscuta";
        tipIesire="Necunoscuta";
        numarIesiri=0;

    }
    public PlacaCaptura( String nume, String producator, boolean inStoc, float pret, int anAparitie ,String interfata , String rezolutie , String tipIesiri , Byte numarIesiri ){
        super(nume, producator, inStoc, pret, anAparitie);

        this.interfata=interfata;
        this.rezolutie=rezolutie;
        this.tipIesire=tipIesiri;
        this.numarIesiri=numarIesiri;
    
    }

    public PlacaCaptura(PlacaCaptura obj){
        super(obj);
        if(obj.interfata!=null)this.interfata=obj.interfata;
        
        if(obj.rezolutie!=null)this.rezolutie=obj.rezolutie;
        
        if(obj.tipIesire!=null)this.tipIesire=obj.tipIesire;
        
        if(obj.numarIesiri>=0)this.numarIesiri=obj.numarIesiri;
    


    }

    @Override
    public String toString() {
        return super.toString()+"Interfata: "+this.interfata+"\n"+"Rezolutie: "+this.rezolutie+"\n"+"Tip iesiri "+this.tipIesire+"\n"
                +"Numar iesiri: "+this.numarIesiri+"\n";
    }
    

    
    public String getInterfata() {
        return interfata;
    }
    public void setInterfata(String interfata) {
        if(interfata!=null)
         if(interfata.equals("")==false)
                this.interfata = interfata;
    }
    public String getRezolutie() {
        return rezolutie;
    }
    public void setRezolutie(String rezolutie) {
        if(rezolutie!=null)
            if(rezolutie.equals("")==false)
                this.rezolutie = rezolutie;
    }
    public String getTipIesire() {
        return tipIesire;
    }
    public void setTipIesire(String tipIesire) {
        if(tipIesire!=null)
            if(tipIesire.equals("")==false)
               this.tipIesire = tipIesire;
    }
    public Byte getNumarIesiri() {
        return numarIesiri;
    }
    public void setNumarIesiri(Byte numarIesiri) {
        if(numarIesiri>0)
        this.numarIesiri = numarIesiri;
    }
    
}
