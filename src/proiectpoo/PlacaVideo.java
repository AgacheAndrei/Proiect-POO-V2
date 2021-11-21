package proiectpoo;

public class PlacaVideo extends ObiectGeneral  {
    
    private String tipMemorie;
    private String chipset;
    private String interfata;
    private String seria;
    private Integer gpuClock;
    private Integer gpuBoostClock;
    private Integer frecventaMemorieEfectiva;
    private Byte dimensiuneMemorie;
     
    public PlacaVideo(){
        super();
        tipMemorie="Necunoscut";
        chipset="Necunoscut";
        interfata="Necunoscuta";
        seria="Necunoscuta";
        gpuClock=0;
        gpuBoostClock=0;
        frecventaMemorieEfectiva=0;
        dimensiuneMemorie=0;

    }
    public PlacaVideo(String nume, String producator, boolean inStoc, float pret, int anAparitie , String tipMemorie , String chipshet , String interfata , String seria , Integer gpuClock , Integer gpuBoostClock , Integer frecventaMemorieEfectiva , Byte dimensiuneMemorie){
        super(nume, producator, inStoc, pret, anAparitie);
        this.chipset=chipshet;        
        this.interfata=interfata;
        this.seria=seria;
        this.gpuClock=gpuClock;
        this.gpuBoostClock=gpuBoostClock;
        this.frecventaMemorieEfectiva=frecventaMemorieEfectiva;
        this.tipMemorie=tipMemorie;
        this.dimensiuneMemorie=dimensiuneMemorie;

    }
   
    
    public PlacaVideo(PlacaVideo obj){
        super(obj);
        if(this.tipMemorie!=null)this.tipMemorie=obj.tipMemorie;

        if(this.chipset!=null)this.chipset=obj.chipset;

        if(this.interfata!=null)this.interfata=obj.interfata;

        if(this.seria!=null)this.seria=obj.seria;

        if(this.gpuClock>0)this.gpuClock=obj.gpuClock;

        if(this.gpuBoostClock>0)this.gpuBoostClock=obj.gpuBoostClock;

        if(this.frecventaMemorieEfectiva>0)this.frecventaMemorieEfectiva=obj.frecventaMemorieEfectiva;

        if(this.dimensiuneMemorie>0)this.dimensiuneMemorie=obj.dimensiuneMemorie;

        
    }
    
    @Override
    public String toString() {
        return super.toString()+"Tip memorie: "+this.tipMemorie+"\n"+"Chipset: "+this.chipset+"\n"
                +"Seria: "+this.seria+"\n"+"Gpu clock:"+ this.gpuClock + "hz\n"+"Gpu boost clock:"+ this.gpuBoostClock + "hz\n"+"Dimensiune memorie:"+ this.dimensiuneMemorie + "GB\n";
    }


    public String getTipMemorie() {
        return tipMemorie;
    }
    public void setTipMemorie(String tipMemorie) {
        if(tipMemorie!=null)
            if(tipMemorie.equals("")==false)
                this.tipMemorie = tipMemorie;
    }
    public String getChipset() {
        return chipset;
    }
    public void setChipset(String chipset) {
        if(tipMemorie!=null)
            if(tipMemorie.equals("")==false)
                this.chipset = chipset;
    }
   
    public String getInterfata() {
        return interfata;
    }
    public void setInterfata(String interfata) {
        if(interfata!=null)
            if(interfata.equals("")==false)
                this.interfata = interfata;
    }
    public String getSeria() {
        return seria;
    }
    public void setSeria(String seria) {
        if(seria!=null)
            if(seria.equals("")==false)
                this.seria = seria;
    }
    public Integer getGpuBoostClock() {
        return gpuBoostClock;
    }
    public void setGpuBoostClock(Integer gpuBoostClock) {
        if(gpuBoostClock>0)
            this.gpuBoostClock = gpuBoostClock;
    }
    public Integer getFrecventaMemorieEfectiva() {
        return frecventaMemorieEfectiva;
    }
    public void setFrecventaMemorieEfectiva(Integer frecventaMemorieEfectiva) {
        if(frecventaMemorieEfectiva>0)
            this.frecventaMemorieEfectiva = frecventaMemorieEfectiva;
        
    }
    public Byte getDimensiuneMemorie() {
        return dimensiuneMemorie;
    }
    public void setDimensiuneMemorie(Byte dimensiuneMemorie) {
        if(dimensiuneMemorie>0)
            this.dimensiuneMemorie = dimensiuneMemorie;
    }
    public Integer getGpuClock() {
        return gpuClock;
    }
    public void setGpuClock(Integer gpuClock) {
        if(gpuClock>0)
            this.gpuClock = gpuClock;
    }
}
