/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpoo;

import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author ioio
 */
//de eliminat
public class Memorie extends ObiectGeneral{
    
    //clasa o sa se ocupe de SSD,HDD,RAM

//    private String tipMemorie;
//    private int capacitate;
//    private String tipComunicare;
//    
//    
//    public int getCpacitate()
//    {
//        return this.capacitate;
//    }
//    public void setCapacitate(int capacitate) throws IllegalArgumentException
//    {
//        if(capacitate>0)
//            this.capacitate=capacitate;
//        else throw new IllegalArgumentException("Capacitatea nu poate sa fie 0 sau negativa");
//    }
//    
//    public String getTipMemorie()
//    {
//        return this.tipMemorie;
//    }
//    public void setTipMemorie(String tipMemorie) throws  IllegalArgumentException
//    {
//         if(tipMemorie!=null)
//        { if(tipMemorie.equals("")==false)
//            this.tipMemorie=tipMemorie;
//        else throw new IllegalArgumentException("Tipul de memorie nu poate sa fie sirul vid");
//        }
//        else throw new IllegalArgumentException("Tipul de memorie nu poate sa fie nul ");
//    }
//    
//    public String getTipComunicare()
//    {
//        return this.tipComunicare;
//    }
//    public void setTiComunicare(String tipComunicare) throws  IllegalArgumentException
//    {
//         if(tipComunicare!=null)
//        { if(tipComunicare.equals("")==false)
//            this.tipComunicare=tipComunicare;
//        else throw new IllegalArgumentException("Tipul de comunicare nu poate sa fie sirul vid");
//        }
//        else throw new IllegalArgumentException("Tipul de comunicare nu poate sa fie nul ");
//    }
//    
    
    public static void main(String[] args)
    {
        try{
        HDD hdd1=new HDD();
        HDD hdd2=new HDD("BARRACUDA", "Seagate", true, (float) 199.90, 2019 , "Desktop", 1000, "Sata 3", 7200);
        HDD hdd3=new HDD(hdd2);
        
        HDD hddV1=new HDD("IronWolf NAS", "Seagate", true, (float) 1089.00, 2021 , "NAS", 6000, "Sata 3", 7200);
        HDD hddV2=new HDD("IronWolf NAS", "Seagate", true, (float) 1199.90, 2019 , "NAS", 8000, "Sata 3", 7200);
        HDD hddV3=new HDD("SKYHAWCK", "Seagate", true, (float) 474, 2018 , "Surveillance", 4000, "Sata 3", 5900);
        HDD hddV4=new HDD("N300", "Toshiba", false, (float) 2268.97, 2021 , "Surveillance", 14000, "Sata/600", 7200);
        HDD hddV5=new HDD("HD2D100", "Toshiba", true, (float) 199.99, 2018 , "Desktop", 1000, "Sata 3", 7200);
        HDD hddV6=new HDD("MG06ACA10TE", "Toshiba", true, (float) 1245.50, 2017 , "Enterprise", 10000, "Sata/600", 7200);
        HDD hddV7=new HDD("BARRACUDA", "Seagate", true, (float) 199.90, 2021 , "Desktop", 1000, "Sata 3", 7200);
        HDD hddV8=new HDD("WD Blue", "WD", false, (float) 200, 2019 , "Desktop", 1000, "Sata 3", 5400);
        HDD hddV9=new HDD("WD UltraStar DC HC320", "WD", true, (float) 2088.14, 2021 , "Server", 8000, "Sata 3", 7200);
        HDD hddV10=new HDD("WD PURPLE", "WD", true, (float) 559.30, 2020 , "Server", 300, "Sata 3", 5400);
     
        System.out.println("Afisarea celor 3 hdd uri : ");
        System.out.println(hdd3.toString());
        System.out.println(hdd2.toString());
        System.out.println(hdd1.toString()); 
        System.out.println("**********************************************************************");
        
        SSD ssd1=new SSD();
        SSD ssd2=new SSD("Kingston A400", "Kingston", true, (float)259.00, 2019, "2.5", "Kingston",480,"TLC", "Sata 3");
        SSD ssd3=new SSD(ssd2);
        
        SSD ssdV1=new SSD("Kingston A400", "Kingston", true, (float)259.00, 2019, "2.5\"", "Kingston",480,"TLC", "Sata 3");
        SSD ssdV2=new SSD("Kingston KC2000", "Kingston", true, (float)1180.04, 2020, "M.2", "SMI 22623N",1000,"3D TLC", "PCIe");
        SSD ssdV3=new SSD("Kingston A2000", "Kingston", false, (float)208.78, 2020, "M.2", "NVMe",250,"3D NAND", "PCIe");
        SSD ssdV4=new SSD("Smasung 860 PRO", "Samsung", true, (float)1166.00, 2018, "2.5\"", "Samsung MJX",100,"MLC", "Sata 3");
        SSD ssdV5=new SSD("Samsung 870 EVO", "Samsung", false, (float)389.00, 2019, "2.5\"", "Samsung",500,"MLC", "Sata 3");
        SSD ssdV6=new SSD("Samusng 840 EVO Basic", "Samsung", true, (float)390.00, 2021, "2.5\"", "Samsung",480,"TLC", "Sata 3");
        SSD ssdV7=new SSD("XPG GAMMIX S11 PRO", "ADATA", true, (float)236.00, 2021, "M.2", "SMI",500,"TLC", "PCle");
        SSD ssdV8=new SSD("Aorus", "Gigabyte", true, (float)443.18, 2019, "M.2", "ToshiBa BiCS3",512,"3D TLC NAND", "PCle");
        SSD ssdV9=new SSD("XPG SX6000 Lite", "ADATA", false, (float)127.00, 2018, "M.2", "Nespecificat",128,"TLC", "PCle");
        SSD ssdV10=new SSD("Kingston A400 Lite", "Kingston", true, (float)132.50, 2019, "2.5", "Kingston",120,"TLC", "Sata 3");
       
        System.out.println("Afisarea celor 3 ssd uri : ");
        System.out.println(ssd3.toString());
        System.out.println(ssd2.toString());
        System.out.println(ssd1.toString()); 
        System.out.println("**********************************************************************");
        
        RAM ram1=new RAM();
        RAM ram2=new RAM("Fury Black", "HyperX", true, (float)242.99, 2020, 3200, "CL16", (float)1.35, "DDR4", 8, "Single channel");
        RAM ram3=new RAM(ram2);
        
        RAM ramV1=new RAM("Fury Beast", "HyperX", true, (float)377.50, 2021, 3200, "CL16", (float)1.2, "DDR4", 16, "Dual channel");
        RAM ramV2=new RAM("Corsair Vengeance RGB PRO", "Corsair", true, (float)516.99, 2021, 3600, "CL18", (float)1.35, "DDR4", 16, "Dual channel");
        RAM ramV3=new RAM("Corsair Vengeance RGB PRO", "Corsair", false, (float)516.99, 2021, 3200, "CL16", (float)1.35, "DDR4", 16, "Dual channel");
        RAM ramV4=new RAM(" XPG Spectrix D60G RGB", "ADATA", false, (float)403.98, 2021, 3200, "CL16", (float)1.35, "DDR4", 16, "Dual channel");
        RAM ramV5=new RAM("Memorie Kingston 4GB", "Kingston", true, (float)95.99, 2017, 1600, "CL11", (float)1.35, "DDR3", 4, "Single channel");
        RAM ramV6=new RAM("ADATA Premier", "ADATA ", false, (float)98.72, 2020, 1600, "CL11", (float)1.35, "DDR3", 4, "Single channel");
        RAM ramV7=new RAM("Memorie laptop TeamGroup", "TeamGroup ", true, (float)97.00, 2018,1600, "CL11", (float)1.35, "DDR3", 4, " PC3-12800");
        RAM ramV8=new RAM("XPG Spectrix D41 Titanium Gray", "ADATA ", true, (float)449.99, 2020, 3200, "CL16", (float)1.35, "DDR4", 16, "Single channel");
        RAM ramV9=new RAM("Fury Black PRO", "HyperX", true, (float)440.99, 2021, 2666, "CL16", (float)1.2, "DDR4", 8, "Single channel");
        RAM ramV10=new RAM("Corsair Vengeance RGB PRO", "Corsair", true, (float)1052.98, 2021, 3600, "CL18", (float)1.35, "DDR4", 32, "Quad  channel");
       
        System.out.println("Afisarea celor 3 ram uri : ");
        System.out.println(ram3.toString());
        System.out.println(ram2.toString());
        System.out.println(ram1.toString()); 
        System.out.println("**********************************************************************");
        //ObiectGeneral[] objs=new ObiectGeneral[30];
       // objs[1]=ram1;
        Vector<ObiectGeneral> objs=new Vector<>();
        objs.add(hddV6);
        objs.add(hddV2);
        objs.add(hddV3);
        objs.add(ramV4);
        objs.add(ramV7);
        objs.add(ramV5);
        objs.add(ssdV3);
        objs.add(ssdV4);
        objs.add(ssdV7);
        objs.add(hddV7);
        objs.add(ramV8);
        objs.add(ramV6);
        objs.add(hddV10);
        objs.add(ssdV9);
        objs.add(ssdV10);
        objs.add(ramV10);
        objs.add(ramV1);
        objs.add(ssdV2);
        objs.add(ssdV1);
        objs.add(ramV9);
        objs.add(ssdV8);
        objs.add(ssdV6);
        objs.add(hddV1);
        objs.add(hddV5);
        objs.add(ramV2);
        objs.add(ramV3);
        objs.add(ssdV5);
        objs.add(hddV4);
        objs.add(hddV8);
        objs.add(hddV9);
      
        for(ObiectGeneral obj:objs)
        {
             StringBuilder clasa = new StringBuilder(obj.getClass().getCanonicalName());
             int pos=clasa.lastIndexOf(".");
             clasa.delete(0, pos+1);
             String clasaC=clasa.toString();
             switch(clasaC)
             {
                 case "RAM":
                 { 
                     System.out.println(clasa);
                     RAM ram=RAM.class.cast(obj);
                     System.out.println(ram.toString());
                     break;
                 }
                 case "SSD":
                 {
                     System.out.println(clasa);
                     SSD ssd=SSD.class.cast(obj);
                     System.out.println(ssd.toString());
                     break;
                 }
                 case "HDD":
                 {
                      System.out.println(clasa);
                      HDD hdd=HDD.class.cast(obj);
                      System.out.println(hdd.toString());
                      break;
                 }
                 
             }
        }
          }catch(Exception e)
        {System.out.println(Arrays.toString(e.getStackTrace()));}
          
    }
    
    
}
