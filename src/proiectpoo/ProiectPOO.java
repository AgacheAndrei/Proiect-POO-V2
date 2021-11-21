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
public class ProiectPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
         System.out.println("**********************************************************************");
         System.out.println("**********************************************************************");
        for(ObiectGeneral obj:objs)
        {
             StringBuilder clasa = new StringBuilder(obj.getClass().getCanonicalName());
             int pos=clasa.lastIndexOf(".");
             clasa.delete(0, pos+1);
             String clasaC=clasa.toString();
             switch(clasaC)
             {
                 
                 case "SSD":
                 {
                    
                     SSD ssd=SSD.class.cast(obj);
                     String tip=ssd.getTipMemorie();       
                     if(tip.contains("LC")==true)
                     {System.out.println(clasa);
                         System.out.println(ssd.toString());}
                     break;
                 }
                
                 
             }
             
        }
        
          }catch(Exception e)
        {System.out.println(Arrays.toString(e.getStackTrace()));}
          
    
    
    
    ////alta
       System.out.println("**********************************************************************");
       System.out.println("**********************************************************************");
       System.out.println("**********************************************************************");
    try {
            
       
        PlacaCaptura pc1 = new PlacaCaptura("Placa de captura Elgato Game Capture HD60 S" , "Elgato" , true , 899f , 2020 , "USB 3.0" , "1080p60, 108030p, 720p60 , 720p30, 480p " , "HDMI" , (byte)1 );
        PlacaCaptura pc2 = new PlacaCaptura("Placa de captura Elgato Game Capture HD60 PRO" , "Elgato" , true , 979f , 2020 , "HDMI" , "4k60, 1080p60, 108030p, 720p60 , 720p30, 480p " , "HDMI" , (byte)2 );
        PlacaCaptura pc3 = new PlacaCaptura("Placa de captura Elgato Cam Link 4k" , "Elgato" , true , 599f , 2019 , "USB 3.0" , "4k60, 1080p60, 108030p, 720p60 " , "HDMI" , (byte)1 );
        PlacaCaptura pc4 = new PlacaCaptura("Placa de captura ATEN CAMLIVE UC3020 " , "ATEN" , true , 416f , 2020 , "USB-C" , "4k60 1080p60 , 720p60 , 480p " , "HDMI" , (byte)1);
        PlacaCaptura pc5 = new PlacaCaptura("Placa de captura Elgato Game Capture 4K60 PRO MK.2" , "Elgato" , false , 1300f , 2021 , "HDMI" , "2160p60, 1080p60, 108030p, 720p60 , 720p30, 480p " , "HDMI" , (byte)3 );
        PlacaCaptura pc6 = new PlacaCaptura("Placa de captura Logilink VG" , "Logilink" , true , 79f , 2018 , "USB 2.0" , " 720p60 , 720p30, 480p " , "RCA" , (byte)1 );
        PlacaCaptura pc7 = new PlacaCaptura("Placa de captura Asus GT HD120" , "Asus" , true , 1400f , 2021 , "HDMI" , " 1080p120, 720p120, 720p60 , 720p30, 480p " , "HDMI" , (byte)2 );
        PlacaCaptura pc8 = new PlacaCaptura("Placa de captura Asus GX 4k" , "Asus" , true , 20000f , 2021 , "HDMI" , " 4k120, 1080p120, 720p60 , 720p30, 480p " , "HDMI" , (byte)3 );
        PlacaCaptura pc9 = new PlacaCaptura("Placa de captura Noname PRO" , "Noname" , false , 200f , 2017 , "USB 3.0" , " 720p60 , 720p30, 480p " , "RCA" , (byte)1 );
        PlacaCaptura pc10 = new PlacaCaptura("Placa de captura Noname lite" , "Noname" , false , 29f , 2018 , "USB 1.0" , " 480p " , "RCA" , (byte)1 );
        
        PlacaCaptura[] vPlacaCaptura={pc1,pc2,pc3,pc4,pc5,pc6,pc7,pc8,pc9,pc10};

        PlacaDeBaza pb1= new PlacaDeBaza("Placa de baza GIGABYTE B450M DS3H","Gigabyte" ,true , 339f, 2019 , "mATX" , "AM4" , "DRR4" , "AMD" , "Dual channel" );
        PlacaDeBaza pb2= new PlacaDeBaza("Placa de baza ASRock B450 PRO4","ASRock" ,true , 383f, 2020 , "ATX" , "AM4" , "DRR4" , "AMD" , "Dual channel" );
        PlacaDeBaza pb3= new PlacaDeBaza("Placa de baza GIGABYTE B450M AORUS ELITE","Gigabyte" ,false , 466f, 2021 , "mATX" , "AM4" , "DRR5" , "AMD" , "Dual channel" );
        PlacaDeBaza pb4= new PlacaDeBaza("Placa de baza ASRock B365 PRO4","ASRock" ,true , 397f, 2020 , "ATX" , "1151 v2" , "DRR4" , "Intel" , "Dual channel" );
        PlacaDeBaza pb5= new PlacaDeBaza("Placa de baza MSI A320M-A PRO MAX","MSI" ,true , 217f, 2017 , "mATX" , "AM3" , "DRR4" , "AMD" , "Dual channel" );
        PlacaDeBaza pb6= new PlacaDeBaza("Placa de baza ASUS TUF GAMING B550-PLUS","ASUS" ,true , 839f, 2021 , "ATX" , "AM4" , "DRR5" , "AMD" , "Dual channel" );
        PlacaDeBaza pb7= new PlacaDeBaza("Placa de baza GIGABYTE B450M DS3H V2","Gigabyte" ,true , 239f, 2019 , "mATX" , "AM4" , "DRR3" , "AMD" , "Dual channel" );
        PlacaDeBaza pb8= new PlacaDeBaza("Placa de baza MSI B460M PRO-VDH","MSI" ,false , 419f, 2019 , "mATX" , "1200" , "DRR4" , "Intel" , "Dual channel" );
        PlacaDeBaza pb9= new PlacaDeBaza("Placa de baza ASUS PRIME B560-Plus","Asus" ,true , 713f, 2020 , "aATX" , "1200" , "DRR2" , "Intel" , "Dual channel" );
        PlacaDeBaza pb10= new PlacaDeBaza("Placa de baza GIGABYTE B650M DS3H","Gigabyte" ,true , 539f, 2021 , "mATX" , "AM5" , "DRR5" , "AMD" , "Triple channel" );
        
        PlacaDeBaza[] vPlacaDeBaza={pb1,pb2,pb3,pb4,pb5,pb6,pb7,pb8,pb9,pb10};
        
        PlacaVideo pv1 = new PlacaVideo("Placa video Sapphire Radeon RX 6800 XT NITRO+ SE 16GB GDDR6 256-bit" ,"Radeon" , true , 8999f , 2021 ,"GDDR6" , "AMD" , "PCI Express x16 4.0" , "Radeon RX 6000",2000 ,2360 , 16000 , (byte)16 );  
        PlacaVideo pv2 = new PlacaVideo("Placa video Palit GeForce RTX 3090 GamingPro 24GB GDDR6X 384-bit" ,"Palit" , true , 18999f , 2021 ,"GDDR6X" , "Nvidia" , "PCI Express x16 4.0" , "RTX 3000",1395 ,1695 , 19500 , (byte)24 );  
        PlacaVideo pv3 = new PlacaVideo("Placa video GIGABYTE GTX 1650 D6 OC 4GB GDDR6 128-bit" ,"GIGABYTE" , false , 1699f , 2019 ,"GDDR6" , "Nvidia" , "PCI Express x16 3.0" , "GeForce GTX 1600",1200 ,1635 , 12000 , (byte)4 );  
        PlacaVideo pv4 = new PlacaVideo("Placa video GIGABYTE RTX 3060 Ti EAGLE LHR 8GB GDDR6 256-bit" ,"GIGABYTE" , true , 4999f , 2020 ,"GDDR6" , "Nvidia" , "PCI Express x16 4.0" , "GeForce RTX 3000",1395 ,1692 , 14000 , (byte)8 );  
        PlacaVideo pv5 = new PlacaVideo("Placa video MSI GeForce RTX 3070 GAMING Z TRIO LHR 8GB GDDR6 256-bit" ,"MSI" , false , 7299f , 2021 ,"GDDR6" , "Nvidia" , "PCI Express x16 4.0" , "GeForce RTX 3000",1600 ,1860 , 14000 , (byte)8 );  
        PlacaVideo pv6 = new PlacaVideo("Placa video MSI GeForce GT 730 4GB DDR3 128-bit V2" , "MSI" , true , 537.32f , 2018 , "GDDR3" , "Nvidia" , "PCI EXpress x16 2.0" , "GeForce GT 700" , 700 , 800 , 1800 , (byte)4);
        PlacaVideo pv7 = new PlacaVideo("Placa video ASUS GeForce GT 730 Silent 2GB GDDR5 64-bit" ,"ASUS" , true , 499f , 2019 ,"GDDR5" , "Nvidia" , "PCI Express x16 2.0" , "GeForce GT 700",900 ,1000 , 5000 , (byte)2 );  
        PlacaVideo pv8 = new PlacaVideo("Placa video Zotac GeForce GTX 1650 OC 4GB GDDR6 128-bit" ,"Zotac" , true , 1799f , 2020 ,"GDDR6" , "Nvidia" , "PCI Express x16 2.0" , "GeForce GTX 1600",1400 ,1660 , 12000 , (byte)4 );  
        PlacaVideo pv9 = new PlacaVideo("Placa video XFX GeForce RTX 3070 GAMING RIO LHR 8GB GDDR6 256-bit" ,"XFX" , false , 8599f , 2021 ,"GDDR6" , "Nvidia" , "PCI Express x16 4.0" , "GeForce RTX 3000",1640 ,1960 , 15000 , (byte)8 );  
        PlacaVideo pv10 = new PlacaVideo("Placa video MSI GeForce RTX 3080 GAMING Z TRIO LHR 16GB GDDR6 256-bit" ,"MSI" , false , 9299f , 2021 ,"GDDR6" , "Nvidia" , "PCI Express x16 4.0" , "GeForce RTX 3000",1700 ,1960 , 14000 , (byte)16 );  
            
        PlacaVideo[] vPlacaVideo={pv1,pv2,pv3,pv4,pv5,pv6,pv7,pv8,pv9,pv10};
        ObiectGeneral[] v={pc1,pc2,pc3,pc4,pc5,pc6,pc7,pc8,pc9,pc10,pb1,pb2,pb3,pb4,pb5,pb6,pb7,pb8,pb9,pb10,pv1,pv2,pv3,pv4,pv5,pv6,pv7,pv8,pv9,pv10};
 
        System.out.println("Afisarea necesara cerintei S5\n\n\n");
        for (int i = 0; i <= 2; i++) {
            System.out.println(vPlacaCaptura[i]);
            System.out.println(vPlacaDeBaza[i]);
            System.out.println(vPlacaVideo[i]);
        }

       System.out.println("\n Afisarea necesara cerintei S6\n\n\n");
        for(int i = 0; i <= 30 ; i++)
            System.out.println(v[i]);
                   
    } catch (Exception e) {
        System.out.println("O eroare a fost detectata");
       }
    
System.out.println("**********************************************************************");
System.out.println("**********************************************************************");
System.out.println("**********************************************************************");
 try{
  //s5
  Carcasa model1=new Carcasa();
  System.out.println("Afisare test 1 : \n"+model1.toString());
  Carcasa model2=new Carcasa(1,"petru","test2",true,"carcasa2","proiect",true,0.02f,2001);
  System.out.println("Afisare test 2 : \n"+model2.toString());
  Carcasa model3=new Carcasa(model2);
  System.out.println("Afisare test 3 : \n"+model3.toString());
  Cooler model4=new Cooler();
  System.out.println("Afisare test 4 : \n"+model4.toString());
  Cooler model5=new Cooler("Lichid",200,2,false,"test5","cooler2",false,0.05f,2005);
  System.out.println("Afisare test 5 : \n"+model5.toString());
  Cooler model6=new Cooler(model5);
  System.out.println("Afisare test 6 : \n"+model6.toString());
  PlaciSunet model7=new PlaciSunet();
  System.out.println("Afisare test 7 : \n"+model7.toString());
  PlaciSunet model8=new PlaciSunet(24,5.1f,"petru","test8","pc3",false,0.08f,2008);
  System.out.println("Afisare test 8 : \n"+model8.toString());
  PlaciSunet model9=new PlaciSunet(model8);
  System.out.println("Afisare test 9 : \n"+model9.toString());
  
  //S6
  Carcasa c1=new Carcasa(0,"Cube Tower","ATX",true,"TYRON","Serioux",true,185.31f,2018);
  Carcasa c2=new Carcasa(2,"Middle Tower","DTX",true,"Prime ARGB","Aerocool",false,142.56f,2010);
  Carcasa c3=new Carcasa(1,"Mini Tower","Micro ATX",false,"Gravity Black","Floston",false,117.09f,2017);
  Carcasa c4=new Carcasa(1,"Slim Tower","XL ATX",true,"Katana","Inaza",true,119.60f,2021);
  Carcasa c5=new Carcasa(0,"Full Tower","Mini ATX",true,"Canopus","AQIRYS",false,233.09f,2016);
  Carcasa c6=new Carcasa(3,"HTPC","Mini ITX",false,"Wezen","AQIRYS",true,251.53f,2009);
  Carcasa c7=new Carcasa(2,"Open Case","ATX",false,"nJoy","Oryn",true,193.19f,2015);
  Carcasa c8=new Carcasa(1,"Cube Tower","DTX",true,"Canopus White","AQIRYS",true,252.13f,2017);
  Carcasa c9=new Carcasa(0,"HTPC","ITX",true,"Arcturus","AQIRYS",true,332.91f,2012);
  Carcasa c10=new Carcasa(4,"Full Tower","Micro ATX",false,"Cylon","Aerocool",false,409.12f,2021);
  Cooler c11=new Cooler("Aer",900,2,false,"GAMMAXX 300","Deepcool",true,83.44f,2020);
  Cooler c12=new Cooler("Aer",1350,1,true,"FrostFlow 240","ID-Cooling",true,229.99f,2021);
  Cooler c13=new Cooler("Lichid",800,1,true,"Kotetsu Mark II","Scythe",true,113.23f,2018);
  Cooler c14=new Cooler("Lichid",1800,1,false,"NH-D15","Noctua",false,570.61f,2021);
  Cooler c15=new Cooler("Aer",750,2,false,"FrostFlow 120","ID-Cooling",true,144.49f,2012);
  Cooler c16=new Cooler("Aer",1250,3,true,"Ninja 5","Scythe",true,450.99f,2019);
  Cooler c17=new Cooler("Lichid",2000,4,true,"NH-D14","Noctua",false,486.31f,2017);
  Cooler c18=new Cooler("Aer",400,1,false,"Auraflow X 240","ID-Cooling",true,40.99f,2013);
  Cooler c19=new Cooler("Aer",550,2,true,"Cylon 4","Aerocool",false,159.35f,2018);
  Cooler c20=new Cooler("Aer",650,1,false,"Dark Rock 4","Noctua",false,322.39f,2021);
  PlaciSunet c21=new PlaciSunet(16,5.1f,"PCI","Virtual UA0087","Logilink",true,37.99f,2012);
  PlaciSunet c22=new PlaciSunet(24,2.0f,"USB","Virtual 3D","Logilink",false,25.11f,2017);
  PlaciSunet c23=new PlaciSunet(16,7.1f,"PCI","Strix Raid","Asus",true,599.99f,2021);
  PlaciSunet c24=new PlaciSunet(16,2.0f,"USB","SKT3","Orico",false,42.17f,2016);
  PlaciSunet c25=new PlaciSunet(16,2.0f,"USB","Sound Blaster","Creative",false,108.29f,2019);
  PlaciSunet c26=new PlaciSunet(24,7.1f,"PCI-E","Juke","Roccat",true,82.07f,2018);
  PlaciSunet c27=new PlaciSunet(24,5.1f,"PCI-E","XONAR SE","Asus",true,188.58f,2020);
  PlaciSunet c28=new PlaciSunet(24,5.1f,"PCI-E","ADA-10","AXAGON",false,39.88f,2019);
  PlaciSunet c29=new PlaciSunet(16,5.1f,"PCI","Clavis ESS 9281","Asus",false,549.99f,2018);
  PlaciSunet c30=new PlaciSunet(24,7.1f,"PCI","Audigy RX","Creative",true,310.86f,2020);
  
  ObiectGeneral[] vector={c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30};
  System.out.println("\nAfisarea vectorului cu 30 de elemente\n");
  for(int i=0;i<=30;i++){
     System.out.println(vector[i]);
     System.out.println("\n");
  }
}
  catch(Exception e){
      System.out.println("Eroare prezenta");
  }
    
    }
}
    

