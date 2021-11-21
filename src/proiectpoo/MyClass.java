/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpoo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ioio
 */
public  class MyClass implements Serializable {
    
public static void main(String[] args) throws IOException, ClassNotFoundException {
    // The file extension doesn't matter in this case, since they're only there to tell
    // the OS with what program to associate a particular file
    ObjectOutputStream objectOutputStream =
        new ObjectOutputStream(new FileOutputStream("data.olivera"));
    
        HDD hdd3=new HDD("SKYHAWCK", "Seagate", true, (float) 474, 2018 , "Surveillance", 4000, "Sata 3", 5900);
        HDD hdd4=new HDD("N300", "Toshiba", false, (float) 2268.97, 2021 , "Surveillance", 14000, "Sata/600", 7200);
        HDD hdd5=new HDD("HD2D100", "Toshiba", true, (float) 199.99, 2018 , "Desktop", 1000, "Sata 3", 7200);
        
        SSD ssd5=new SSD("Samsung 870 EVO", "Samsung", false, (float)389.00, 2019, "2.5\"", "Samsung",500,"MLC", "Sata 3");
        SSD ssd6=new SSD("Samusng 840 EVO Basic", "Samsung", true, (float)390.00, 2021, "2.5\"", "Samsung",480,"TLC", "Sata 3");
        SSD ssd7=new SSD("XPG GAMMIX S11 PRO", "ADATA", true, (float)236.00, 2021, "M.2", "SMI",500,"TLC", "PCle");
        
        RAM ram6=new RAM("ADATA Premier", "ADATA ", false, (float)98.72, 2020, 1600, "CL11", (float)1.35, "DDR3", 4, "Single channel");
        RAM ram7=new RAM("Memorie laptop TeamGroup", "TeamGroup ", true, (float)97.00, 2018,1600, "CL11", (float)1.35, "DDR3", 4, " PC3-12800");
        RAM ram10=new RAM("Corsair Vengeance RGB PRO", "Corsair", true, (float)1052.98, 2021, 3600, "CL18", (float)1.35, "DDR4", 32, "Quad  channel");
        RAM ram5=new RAM("Memorie Kingston 4GB", "Kingston", true, (float)95.99, 2017, 1600, "CL11", (float)1.35, "DDR3", 4, "Single channel");
        
        PlacaCaptura pc2 = new PlacaCaptura("Placa de captura Elgato Game Capture HD60 PRO" , "Elgato" , true , 979f , 2020 , "HDMI" , "4k60, 1080p60, 108030p, 720p60 , 720p30, 480p " , "HDMI" , (byte)2 );
        PlacaCaptura pc3 = new PlacaCaptura("Placa de captura Elgato Cam Link 4k" , "Elgato" , true , 599f , 2019 , "USB 3.0" , "4k60, 1080p60, 108030p, 720p60 " , "HDMI" , (byte)1 );
        PlacaCaptura pc4 = new PlacaCaptura("Placa de captura ATEN CAMLIVE UC3020 " , "ATEN" , true , 416f , 2020 , "USB-C" , "4k60 1080p60 , 720p60 , 480p " , "HDMI" , (byte)1);
        
        PlacaDeBaza pb3= new PlacaDeBaza("Placa de baza GIGABYTE B450M AORUS ELITE","Gigabyte" ,false , 466f, 2021 , "mATX" , "AM4" , "DRR5" , "AMD" , "Dual channel" );
        PlacaDeBaza pb4= new PlacaDeBaza("Placa de baza ASRock B365 PRO4","ASRock" ,true , 397f, 2020 , "ATX" , "1151 v2" , "DRR4" , "Intel" , "Dual channel" );
        PlacaDeBaza pb5= new PlacaDeBaza("Placa de baza MSI A320M-A PRO MAX","MSI" ,true , 217f, 2017 , "mATX" , "AM3" , "DRR4" , "AMD" , "Dual channel" );
        
        PlacaVideo pv2 = new PlacaVideo("Placa video Palit GeForce RTX 3090 GamingPro 24GB GDDR6X 384-bit" ,"Palit" , true , 18999f , 2021 ,"GDDR6X" , "Nvidia" , "PCI Express x16 4.0" , "RTX 3000",1395 ,1695 , 19500 , (byte)24 );  
        PlacaVideo pv3 = new PlacaVideo("Placa video GIGABYTE GTX 1650 D6 OC 4GB GDDR6 128-bit" ,"GIGABYTE" , false , 1699f , 2019 ,"GDDR6" , "Nvidia" , "PCI Express x16 3.0" , "GeForce GTX 1600",1200 ,1635 , 12000 , (byte)4 );  
        PlacaVideo pv4 = new PlacaVideo("Placa video GIGABYTE RTX 3060 Ti EAGLE LHR 8GB GDDR6 256-bit" ,"GIGABYTE" , true , 4999f , 2020 ,"GDDR6" , "Nvidia" , "PCI Express x16 4.0" , "GeForce RTX 3000",1395 ,1692 , 14000 , (byte)8 );
        
        Carcasa c4=new Carcasa(1,"Slim Tower","XL ATX",true,"Katana","Inaza",true,119.60f,2021);
        Carcasa c5=new Carcasa(0,"Full Tower","Mini ATX",true,"Canopus","AQIRYS",false,233.09f,2016);
        Carcasa c6=new Carcasa(3,"HTPC","Mini ITX",false,"Wezen","AQIRYS",true,251.53f,2009);
        
        Cooler c13=new Cooler("Lichid",800,1,true,"Kotetsu Mark II","Scythe",true,113.23f,2018);
        Cooler c14=new Cooler("Lichid",1800,1,false,"NH-D15","Noctua",false,570.61f,2021);
        Cooler c15=new Cooler("Aer",750,2,false,"FrostFlow 120","ID-Cooling",true,144.49f,2012);
        
        PlaciSunet c23=new PlaciSunet(16,7.1f,"PCI","Strix Raid","Asus",true,599.99f,2021);
        PlaciSunet c24=new PlaciSunet(16,2.0f,"USB","SKT3","Orico",false,42.17f,2016);
        PlaciSunet c25=new PlaciSunet(16,2.0f,"USB","Sound Blaster","Creative",false,108.29f,2019);
        
        
        
    objectOutputStream.writeObject(hdd3);
    objectOutputStream.writeObject(hdd4);
    objectOutputStream.writeObject(hdd5);
    
    objectOutputStream.writeObject(ssd7);
    objectOutputStream.writeObject(ssd6);
    objectOutputStream.writeObject(ssd5);
    
    objectOutputStream.writeObject(ram7);
    objectOutputStream.writeObject(ram6);
    objectOutputStream.writeObject(ram10);
    objectOutputStream.writeObject(ram5);
     
    objectOutputStream.writeObject(pc3);
    objectOutputStream.writeObject(pc4);
    objectOutputStream.writeObject(pc2);
    
    objectOutputStream.writeObject(pb3);
    objectOutputStream.writeObject(pb4);
    objectOutputStream.writeObject(pb5);
    
    objectOutputStream.writeObject(pv3);
    objectOutputStream.writeObject(pv4);
    objectOutputStream.writeObject(pv2);
    
    objectOutputStream.writeObject(c5);
    objectOutputStream.writeObject(c4);
    objectOutputStream.writeObject(c6);
    
    objectOutputStream.writeObject(c13);
    objectOutputStream.writeObject(c4);
    objectOutputStream.writeObject(c15);
    
    objectOutputStream.writeObject(c23);
    objectOutputStream.writeObject(c4);
    objectOutputStream.writeObject(c25);
    
    
    objectOutputStream.close();

      ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream("data.olivera", true)) {
            protected void writeStreamHeader() throws IOException {
                reset();
            }
        };

        os2.writeObject(hdd5);
         os2.writeObject(pc2);
        os2.close();
    
    
    ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("data.olivera"));

    ArrayList<ObiectGeneral> arrayList = new ArrayList<>();
    ObjectOutputStream os3 = new ObjectOutputStream(new FileOutputStream("buffer.olivera")) ;
    try  {
        while (true) {
            
            Object read = objectInputStream.readObject();
            if (read == null)
                break;

            
            // We should always cast explicitly
            ObiectGeneral myClassRead = (ObiectGeneral) read;
             os3.writeObject(read);
            arrayList.add(myClassRead);
        }
    }
    catch (EOFException e) {
        // This exception is expected
    }
  
    
    for (ObiectGeneral m : arrayList) {
            System.out.println(m);
    }
    System.out.println("///////////////////////////////////////////////////////////////////////");
     System.out.println("///////////////////////////////////////////////////////////////////////");
      System.out.println("///////////////////////////////////////////////////////////////////////");
     ObjectInputStream objectInputStreamBuffer =
                new ObjectInputStream(new FileInputStream("buffer.olivera"));
    try  {
        while (true) {
            Object read = objectInputStreamBuffer.readObject();
            if (read == null)
                break;

            // We should always cast explicitly
            ObiectGeneral myClassRead = (ObiectGeneral) read;
            System.out.println(myClassRead);
        }
    }
    catch (EOFException e) {
        // This exception is expected
    }
    
}
}