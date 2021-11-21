/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpoo;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;


/**
 *
 * @author ioio
 */
public class Serializare {
    
    public static void main(String[] args)
    {
        try {
            
        HDD hdd3=new HDD("SKYHAWCK", "Seagate", true, (float) 474, 2018 , "Surveillance", 4000, "Sata 3", 5900);
        HDD hdd4=new HDD("N300", "Toshiba", false, (float) 2268.97, 2021 , "Surveillance", 14000, "Sata/600", 7200);
        HDD hdd5=new HDD("HD2D100", "Toshiba", true, (float) 199.99, 2018 , "Desktop", 1000, "Sata 3", 7200);
        
        SSD ssd3=new SSD("Kingston A2000", "Kingston", false, (float)208.78, 2020, "M.2", "NVMe",250,"3D NAND", "PCIe");
        SSD ssd4=new SSD("Smasung 860 PRO", "Samsung", true, (float)1166.00, 2018, "2.5\"", "Samsung MJX",100,"MLC", "Sata 3");
        SSD ssd5=new SSD("Samsung 870 EVO", "Samsung", false, (float)389.00, 2019, "2.5\"", "Samsung",500,"MLC", "Sata 3");
        
        RAM ram7=new RAM("Memorie laptop TeamGroup", "TeamGroup ", true, (float)97.00, 2018,1600, "CL11", (float)1.35, "DDR3", 4, " PC3-12800");
        RAM ram8=new RAM("XPG Spectrix D41 Titanium Gray", "ADATA ", true, (float)449.99, 2020, 3200, "CL16", (float)1.35, "DDR4", 16, "Single channel");
        RAM ram3=new RAM("Corsair Vengeance RGB PRO", "Corsair", false, (float)516.99, 2021, 3200, "CL16", (float)1.35, "DDR4", 16, "Dual channel");
        
        
            
        
        ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream("list.txt"));
        
        os1.writeObject(hdd5);
        os1.writeObject(hdd3);
        os1.writeObject(hdd4);
        
        os1.writeObject(ssd3);
        os1.writeObject(ssd4);
        os1.writeObject(ssd5);
           
        os1.writeObject(ram7);
        os1.writeObject(ram8);
        os1.writeObject(ram3);
        
        
        os1.close();

        ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream("list.txt", true)) {
            protected void writeStreamHeader() throws IOException {
                reset();
            }
        };

        os2.writeObject(hdd3);
        os2.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("list.txt"));
        
        Vector<ObiectGeneral> objs=new Vector<ObiectGeneral>();
        Vector<RAM> rami=new Vector<RAM>();
        ObiectGeneral obj=new ObiectGeneral();
        boolean ok=true;
        while(ok)
        {
            obj=(ObiectGeneral)is.readObject();
            if(obj==null)
            {
                ok=false;
                break;
                
            }
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
                     rami.add(ram);
                    // System.out.println(ram.toString());
                     break;
                 }
                 case "SSD":
                 {
                     System.out.println(clasa);
                     SSD ssd=SSD.class.cast(obj);
                     //System.out.println(ssd.toString());
                     break;
                 }
                 case "HDD":
                 {
                      System.out.println(clasa);
                      HDD hdd=HDD.class.cast(obj);
                      //System.out.println(hdd.toString());
                      break;
                 }
                 
             }
           
        }
            
        rami.forEach((_item) -> {
            System.out.println(_item.toString());
                    });
        
        
        
        
        
        }
        catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
    
}
