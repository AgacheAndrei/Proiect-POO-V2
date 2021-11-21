package proiectpoo;

public class TesteMA {
    public static void main(String[] args) {

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
       
    }
}

