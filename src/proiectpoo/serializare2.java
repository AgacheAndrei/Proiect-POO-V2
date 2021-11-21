/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpoo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author ioio
 */
public class serializare2 {
    
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
        
        
        try{    
        Vector<ObiectGeneral> objs=new Vector<ObiectGeneral>();
        ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream("list.txt"));
        
        objs.add(hdd5);
        objs.add(hdd3);
        objs.add(hdd4);
        
        objs.add(ssd3);
        objs.add(ssd4);
        objs.add(ssd5);
           
        objs.add(ram7);
        objs.add(ram8);
        objs.add(ram3);
        os1.writeObject(objs);
        os1.close();
        }catch(Exception e)
        {
            e.getStackTrace();
        }
        try{
            
        ObjectInputStream is2=new ObjectInputStream(new FileInputStream("list.txt"));    
        Vector<ObiectGeneral> objs1=new Vector<ObiectGeneral>();
        
        objs1=(Vector<ObiectGeneral>)is2.readObject();
        objs1.add(hdd3);
        
        is2.close(); 
        ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream("list.txt", true));
        
        os2.writeObject(objs1);
        os2.close();
           
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("list.txt")); 
        Vector<ObiectGeneral> objs=new Vector<ObiectGeneral>();
        objs=(Vector<ObiectGeneral>)is.readObject();
        
         for(ObiectGeneral ob:objs)
        {
             StringBuilder clasa = new StringBuilder(ob.getClass().getCanonicalName());
             
             int pos=clasa.lastIndexOf(".");
             clasa.delete(0, pos+1);
             String clasaC=clasa.toString();
             switch(clasaC)
             {
                 case "RAM":
                 { 
                    
                     System.out.println(clasa);
                     RAM ram=RAM.class.cast(ob);
                     System.out.println(ram.toString());
                     break;
                 }
                 case "SSD":
                 {
                     System.out.println(clasa);
                     SSD ssd=SSD.class.cast(ob);
                     System.out.println(ssd.toString());
                     break;
                 }
                 case "HDD":
                 {
                      System.out.println(clasa);
                      HDD hdd=HDD.class.cast(ob);
                      System.out.println(hdd.toString());
                      break;
                 }
                 
             }}
        
        
        }catch(Exception e)
        {
            e.getStackTrace();
        }
        
        
        
        }
        catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
    
}
