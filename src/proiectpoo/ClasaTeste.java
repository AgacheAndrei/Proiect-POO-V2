/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpoo;

/**
 *
 * @author Petru
 */
public class ClasaTeste {
    

 

public static void main(String[] args) {
  try{
  //s5
  Carcasa model1=new Carcasa();
  System.out.println("Afisare test 1 : \n "+model1.toString());
  System.out.println("\n");
  Carcasa model2=new Carcasa(1,"petru","test2",true,"carcasa2","proiect",true,0.02f,2001);
  System.out.println("Afisare test 2 : \n "+model2.toString());
  System.out.println("\n");
  Carcasa model3=new Carcasa(model2);
  System.out.println("Afisare test 3 : \n "+model3.toString());
  System.out.println("\n");
  Cooler model4=new Cooler();
  System.out.println("Afisare test 4 : \n "+model4.toString());
  System.out.println("\n");
  Cooler model5=new Cooler("Lichid",200,2,false,"test5","cooler2",false,0.05f,2005);
  System.out.println("Afisare test 5 : \n "+model5.toString());
  System.out.println("\n");
  Cooler model6=new Cooler(model5);
  System.out.println("Afisare test 6 : \n "+model6.toString());
  System.out.println("\n");
  PlaciSunet model7=new PlaciSunet();
  System.out.println("Afisare test 7 : \n "+model7.toString());
  System.out.println("\n");
  PlaciSunet model8=new PlaciSunet(24,5.1f,"petru","test8","pc3",false,0.08f,2008);
  System.out.println("Afisare test 8 : \n "+model8.toString());
  System.out.println("\n");
  PlaciSunet model9=new PlaciSunet(model8);
  System.out.println("Afisare test 9 : \n "+model9.toString());
  System.out.println("\n");
  
  
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
  
  Carcasa[] vCarcasa={c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
  
  Cooler c11=new Cooler("Aer",900,2,false,"GAMMAXX 300","Deepcool",true,83.44f,2020);
  Cooler c12=new Cooler("Aer",1350,1,true,"Frost Flow 240","ID-Cooling",true,229.99f,2021);
  Cooler c13=new Cooler("Lichid",800,1,true,"Kotetsu Mark II","Scythe",true,113.23f,2018);
  Cooler c14=new Cooler("Lichid",1800,1,false,"NH-D15","Noctua",false,570.61f,2021);
  Cooler c15=new Cooler("Aer",750,2,false,"Frost Flow 120","ID-Cooling",true,144.49f,2012);
  Cooler c16=new Cooler("Aer",1250,3,true,"Ninja 5","Scythe",true,450.99f,2019);
  Cooler c17=new Cooler("Lichid",2000,4,true,"NH-D14","Noctua",false,486.31f,2017);
  Cooler c18=new Cooler("Aer",400,1,false,"Aura Flow X 240","ID-Cooling",true,40.99f,2013);
  Cooler c19=new Cooler("Aer",550,2,true,"Cylon 4","Aerocool",false,159.35f,2018);
  Cooler c20=new Cooler("Aer",650,1,false,"Dark Rock 4","Noctua",false,322.39f,2021);
  
  Cooler[] vCooler={c11,c12,c13,c14,c15,c16,c17,c18,c19,c20};
  
  PlaciSunet c21=new PlaciSunet(16,5.1f,"PCI","Virtual UA0087","Logilink",true,37.99f,2012);
  PlaciSunet c22=new PlaciSunet(24,2.0f,"USB","Virtual","Logilink",false,25.11f,2017);
  PlaciSunet c23=new PlaciSunet(16,7.1f,"PCI","Strix Raid","Asus",true,599.99f,2021);
  PlaciSunet c24=new PlaciSunet(16,2.0f,"USB","SKT3","Orico",false,42.17f,2016);
  PlaciSunet c25=new PlaciSunet(16,2.0f,"USB","Sound Blaster","Creative",false,108.29f,2019);
  PlaciSunet c26=new PlaciSunet(24,7.1f,"PCI-E","Juke","Roccat",true,82.07f,2018);
  PlaciSunet c27=new PlaciSunet(24,5.1f,"PCI-E","XONAR SE","Asus",true,188.58f,2020);
  PlaciSunet c28=new PlaciSunet(24,5.1f,"PCI-E","ADA-10","AXAGON",false,39.88f,2019);
  PlaciSunet c29=new PlaciSunet(16,5.1f,"PCI","Clavis ESS 9281","Asus",false,549.99f,2018);
  PlaciSunet c30=new PlaciSunet(24,7.1f,"PCI","Audigy RX","Creative",true,310.86f,2020);
  
  PlaciSunet[] vPlaciSunet={c21,c22,c23,c24,c25,c26,c27,c28,c29,c30};
  
  for (int i=0;i<vCarcasa.length;i++){
       if(vCarcasa[i].getVentIncluse()<1)
           System.out.println("\n"+vCarcasa[i]);
       
  }
 
  
  for(int j=0;j<vCooler.length;j++){
      if(vCooler[j].getFormatRacire().contains("Aer") && vCooler[j].getPutere()>=1000 && vCooler[j].getNrVent()==1 && vCooler[j].isModularitate() && vCooler[j].getNume().contains("Flow") && vCooler[j].getInStoc() && vCooler[j].getPret()<=230.00f)
          System.out.println("\n"+vCooler[j]);
  }
  
  
  for(int k=0;k<vPlaciSunet.length;k++){
      if(vPlaciSunet[k].getNume().contains("Virtual") && !vPlaciSunet[k].getInStoc())
          System.out.println("\n"+vPlaciSunet[k]);

  }
  
  
  
  //ObiectGeneral[] vector={c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30};
  //System.out.println("\nAfisarea vectorului cu 30 de elemente\n");
  //for(int i=0;i<=30;i++){
    // System.out.println(vector[i]);
   //  System.out.println("\n");
  //}
}
  catch(Exception e){
      System.out.println("Eroare prezenta");
  }
  
}
};