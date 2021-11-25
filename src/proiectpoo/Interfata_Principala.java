/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpoo;

import java.awt.Color;
import java.awt.Component;
import static java.awt.Frame.NORMAL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import sun.text.resources.zh.JavaTimeSupplementary_zh_TW;

/**
 *
 * @author ioio
 */
 
public class Interfata_Principala extends javax.swing.JFrame {

    /**
     * Creates new form Interfata_Principala
     */
    public Interfata_Principala() {
        initComponents();
        
       
       jScrollPane2.setOpaque(false);
       jScrollPane2.getViewport().setOpaque(false);
       jScrollPane3.setOpaque(false);
       jScrollPane3.getViewport().setOpaque(false);
       jScrollPane4.setOpaque(false);
       jScrollPane4.getViewport().setOpaque(false);
       jScrollPane5.setOpaque(false);
       jScrollPane5.getViewport().setOpaque(false);
       pnl_Filtre_Major_RAM.setVisible(false);
       pnl_Filtre_Major_SSD.setVisible(false);
       pnl_Filtre_Major_HDD.setVisible(false);
       jLayeredPane_Filtre.setVisible(false);
       
      
      try{
       MyClass.funtie();
      }catch(Exception e)
      {
          e.getStackTrace();
      }
  
    }
   
   ArrayList<ObiectGeneral> arrayListBuffer = new ArrayList<>();
   public void PopulareMasiveDeDateSSD()
   {
       ArrayList<ObiectGeneral> arrayList = new ArrayList<>();

    try  {
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("data.olivera"));
        while (true) {
            Object read = objectInputStream.readObject();
            if (read == null)
                break;

            // We should always cast explicitly
            ObiectGeneral myClassRead = (ObiectGeneral) read;
            arrayList.add(myClassRead);
            
        }
    }
    catch (EOFException e) {
        // This exception is expected
    }   catch (IOException ex) {
            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    float minPretSSD=Float.MAX_VALUE;
    float maximPretSSD=0.0f;
    ArrayList<String> formsFactors=new ArrayList<>();
    ArrayList<String> tipuriControls=new ArrayList<>();
    ArrayList<String> tipuriMemorie=new ArrayList<>();
    ArrayList<String> capacitatiList=new ArrayList<>();
    ArrayList<String> tipuriComunicare=new ArrayList<>();
    for(ObiectGeneral m:arrayList)
    {
        if(m instanceof SSD)
        { 
            tipuriControls.add(((SSD) m).getTipController());
            tipuriMemorie.add(((SSD) m).getTipMemorie());
            capacitatiList.add(Integer.toString(((SSD) m).getCpacitate()));
            tipuriComunicare.add(((SSD) m).getTipComunicare());
            formsFactors.add(((SSD) m).getFormFactor());
                if(((SSD)m).getPret()>maximPretSSD)
                maximPretSSD=((SSD)m).getPret();
            else if(((SSD)m).getPret()<minPretSSD)
                minPretSSD=((SSD)m).getPret();
        }
    }
    sliderPretSSD.setMinimum((int)minPretSSD);
    sliderPretSSD.setMaximum((int)maximPretSSD);
    
    Set<String> set = new HashSet<>(formsFactors);
    formsFactors.clear();
    formsFactors.addAll(set);
    
    set = new HashSet<>(tipuriControls);
    tipuriControls.clear();
    tipuriControls.addAll(set);
    
    set = new HashSet<>(tipuriMemorie);
    tipuriMemorie.clear();
    tipuriMemorie.addAll(set);
    
    set = new HashSet<>(capacitatiList);
    capacitatiList.clear();
    capacitatiList.addAll(set);
    
    set = new HashSet<>(tipuriComunicare);
    tipuriComunicare.clear();
    tipuriComunicare.addAll(set);
    
    listFormFactorSSD.setModel(new DefaultComboBoxModel<String>(formsFactors.toArray(new String[0])));
    
    listaTipControlsSSD.setModel(new DefaultComboBoxModel<String>(tipuriControls.toArray(new String[0])));
    
    listaTipMemorieSSD.setModel(new DefaultComboBoxModel<String>(tipuriMemorie.toArray(new String[0])));
    
    listaCapacitatiSSD.setModel(new DefaultComboBoxModel<String>(capacitatiList.toArray(new String[0])));
    
    listaTipComunicareSSD.setModel(new DefaultComboBoxModel<String>(tipuriComunicare.toArray(new String[0])));
    
   }
   
   
   
   public void PopulareMasiveDeDateHDD()
   {
       ArrayList<ObiectGeneral> arrayList = new ArrayList<>();

    try  {
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("data.olivera"));
        while (true) {
            Object read = objectInputStream.readObject();
            if (read == null)
                break;

            // We should always cast explicitly
            ObiectGeneral myClassRead = (ObiectGeneral) read;
            arrayList.add(myClassRead);
        }
    }
    catch (EOFException e) {
        // This exception is expected
    }   catch (IOException ex) {
            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
        }
    float minPretHdd=Float.MAX_VALUE;
    float maximPretHdd=0.0f;
    ArrayList<String> vitezeRotatie=new ArrayList<>();
    ArrayList<String> tipuriMemorie=new ArrayList<>();
    ArrayList<String> capacitatiList=new ArrayList<>();
    ArrayList<String> tipuriComunicare=new ArrayList<>();
    for(ObiectGeneral m:arrayList)
    {
        if(m instanceof HDD)
        {
            vitezeRotatie.add(Integer.toString(((HDD) m).getVitezaRotatie()));
            tipuriMemorie.add(((HDD) m).getTipMemorie());
            capacitatiList.add(Integer.toString(((HDD) m).getCpacitate()));
            tipuriComunicare.add(((HDD) m).getTipComunicare());
            
             if(((HDD)m).getPret()>maximPretHdd)
                maximPretHdd=((HDD)m).getPret();
            else if(((HDD)m).getPret()<minPretHdd)
                minPretHdd=((HDD)m).getPret();
        }
    }
    sliderPretHDD.setMinimum((int)minPretHdd);
    sliderPretHDD.setMaximum((int)maximPretHdd);
    
    Set<String> set = new HashSet<>(vitezeRotatie);
    vitezeRotatie.clear();
    vitezeRotatie.addAll(set);
    
    set = new HashSet<>(tipuriMemorie);
    tipuriMemorie.clear();
    tipuriMemorie.addAll(set);
    
    set = new HashSet<>(capacitatiList);
    capacitatiList.clear();
    capacitatiList.addAll(set);
    
    set = new HashSet<>(tipuriComunicare);
    tipuriComunicare.clear();
    tipuriComunicare.addAll(set);
    
    listaVitezeRotatieHDD.setModel(new DefaultComboBoxModel<String>(vitezeRotatie.toArray(new String[0])));
    listaTipuriMemorieHDD.setModel(new DefaultComboBoxModel<String>(tipuriMemorie.toArray(new String[0])));
    listaCapacitatiHDD.setModel(new DefaultComboBoxModel<String>(capacitatiList.toArray(new String[0])));
    listaTipComunicareHDD.setModel(new DefaultComboBoxModel<String>(tipuriComunicare.toArray(new String[0])));
   }
   
   
   
   public void PopulareMasiveDeDateRAM()
   {
        ArrayList<ObiectGeneral> arrayList = new ArrayList<>();

    try  {
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("data.olivera"));
        while (true) {
            Object read = objectInputStream.readObject();
            if (read == null)
                break;

            // We should always cast explicitly
            ObiectGeneral myClassRead = (ObiectGeneral) read;
            arrayList.add(myClassRead);
        }
    }
    catch (EOFException e) {
        // This exception is expected
    }   catch (IOException ex) {
            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    float minPretRam=Float.MAX_VALUE;
    float maximPretRam=0.0f;
    
    ArrayList<String> tipuriComunicare=new ArrayList<>();
    ArrayList<String> tipuriLatente=new ArrayList<>();
    ArrayList<String> tipuriMemorie=new ArrayList<>();
    ArrayList<String> voltajList=new ArrayList<>();
    ArrayList<String> tipuriDeCapacitate=new ArrayList<>();
    ArrayList<String> listaFrecvente=new ArrayList<>();
    for(ObiectGeneral m:arrayList)
    {
        if(m instanceof RAM)
        {
            tipuriComunicare.add(((RAM) m).getTipComunicare());
            tipuriLatente.add(((RAM) m).getLatenta());
            tipuriMemorie.add(((RAM) m).getTipMemorie());
            voltajList.add(Float.toString(((RAM) m).getVoltaj()));
            tipuriDeCapacitate.add(Integer.toString(((RAM) m).getCpacitate()));
            listaFrecvente.add(Integer.toString(((RAM) m).getFrecventa()));
            
            if(((RAM)m).getPret()>maximPretRam)
                maximPretRam=((RAM)m).getPret();
            else if(((RAM)m).getPret()<minPretRam)
                minPretRam=((RAM)m).getPret();
            

        }
    }
    Set<String> set = new HashSet<>(tipuriComunicare);
    
    tipuriComunicare.clear();
    tipuriComunicare.addAll(set);
    
    set=new HashSet<>(tipuriLatente);
    tipuriLatente.clear();
    tipuriLatente.addAll(set);
    
    set=new HashSet<>(tipuriMemorie);
    tipuriMemorie.clear();
    tipuriMemorie.addAll(set);
    
    set=new HashSet<>(voltajList);
    voltajList.clear();
    voltajList.addAll(set);
    
    set=new HashSet<>(tipuriDeCapacitate);
    tipuriDeCapacitate.clear();
    tipuriDeCapacitate.addAll(set);
    
     set=new HashSet<>(listaFrecvente);
    listaFrecvente.clear();
    listaFrecvente.addAll(set);
    
    listaTipuriLatenteRam.setModel(new DefaultComboBoxModel<String>(tipuriLatente.toArray(new String[0])));
    
    listaTipuriComunicariRam.setModel(new DefaultComboBoxModel<String>(tipuriComunicare.toArray(new String[0])));
    
    listaTipuriMemorieRam.setModel(new DefaultComboBoxModel<String>(tipuriMemorie.toArray(new String[0])));
    
    listaVoltajRam.setModel(new DefaultComboBoxModel<String>(voltajList.toArray(new String[0])));
    
    listaCapacitateRam.setModel(new DefaultComboBoxModel<String>(tipuriDeCapacitate.toArray(new String[0])));
    
    listaFrecventeRam.setModel(new DefaultComboBoxModel<String>(listaFrecvente.toArray(new String[0])));
    
    pretRamSlider.setMinimum((int)minPretRam);
    pretRamSlider.setMaximum((int)maximPretRam);
    
    
    
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTIP = new javax.swing.ButtonGroup();
        pnl_bg = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        btn_pgPR = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        icon_text1 = new javax.swing.JLabel();
        btn_setari = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        icon_text = new javax.swing.JLabel();
        btn_obNou = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        icon_text2 = new javax.swing.JLabel();
        icon_text3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        telefon_text = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email_text = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panel_info_PR = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btn_AfisareTotala = new com.k33ptoo.components.KButton();
        btn_filtru_AplicareTIP = new com.k33ptoo.components.KButton();
        RAM_Tip = new javax.swing.JRadioButton();
        HDD_Tip = new javax.swing.JRadioButton();
        SSD_Tip = new javax.swing.JRadioButton();
        jLayeredPane_Filtre = new javax.swing.JLayeredPane();
        pnl_Filtre_Major_RAM = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnl_Filtre_Ram = new javax.swing.JPanel();
        pretRam = new javax.swing.JCheckBox();
        pretRamSlider = new javax.swing.JSlider();
        listaTipuriComunicariRam = new javax.swing.JComboBox<>();
        valoare_Slider_Pret_Ram = new javax.swing.JLabel();
        comunicareRam = new javax.swing.JCheckBox();
        frecventaRam = new javax.swing.JCheckBox();
        latentaRam = new javax.swing.JCheckBox();
        listaTipuriLatenteRam = new javax.swing.JComboBox<>();
        voltajRam = new javax.swing.JCheckBox();
        listaVoltajRam = new javax.swing.JComboBox<>();
        tipMemorieRam = new javax.swing.JCheckBox();
        listaTipuriMemorieRam = new javax.swing.JComboBox<>();
        capacitateRam = new javax.swing.JCheckBox();
        listaCapacitateRam = new javax.swing.JComboBox<>();
        listaFrecventeRam = new javax.swing.JComboBox<>();
        btn_filtre_RAM = new com.k33ptoo.components.KButton();
        pnl_Filtre_Major_HDD = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        pnl_Filtre_HDD = new javax.swing.JPanel();
        sliderPretHDD = new javax.swing.JSlider();
        pretHDD = new javax.swing.JCheckBox();
        valoare_Slider_Pret_HDD = new javax.swing.JLabel();
        vitezaRotatieHDD = new javax.swing.JCheckBox();
        listaVitezeRotatieHDD = new javax.swing.JComboBox<>();
        tipMemorieHDD = new javax.swing.JCheckBox();
        listaTipuriMemorieHDD = new javax.swing.JComboBox<>();
        capacitateHDD = new javax.swing.JCheckBox();
        listaCapacitatiHDD = new javax.swing.JComboBox<>();
        tipComunicareHDD = new javax.swing.JCheckBox();
        listaTipComunicareHDD = new javax.swing.JComboBox<>();
        btn_filtre_HDD = new com.k33ptoo.components.KButton();
        pnl_Filtre_Major_SSD = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pnl_Filtre_SSD = new javax.swing.JPanel();
        sliderPretSSD = new javax.swing.JSlider();
        pretSSD = new javax.swing.JCheckBox();
        valoare_Slider_Pret_SSD = new javax.swing.JLabel();
        formFactorSSD = new javax.swing.JCheckBox();
        listFormFactorSSD = new javax.swing.JComboBox<>();
        tipControlSSD = new javax.swing.JCheckBox();
        listaTipControlsSSD = new javax.swing.JComboBox<>();
        tipMemorieSSD = new javax.swing.JCheckBox();
        listaTipMemorieSSD = new javax.swing.JComboBox<>();
        capacitateSSD = new javax.swing.JCheckBox();
        listaCapacitatiSSD = new javax.swing.JComboBox<>();
        tipComunicareSSD = new javax.swing.JCheckBox();
        listaTipComunicareSSD = new javax.swing.JComboBox<>();
        btn_filtre_SSD = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        panel_info_Setari = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_info_Obj = new keeptoo.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_logout = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_bg.setBackground(new java.awt.Color(255, 255, 255));

        sidebar.setBackground(new java.awt.Color(41, 168, 73));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_pgPR.setBackground(new java.awt.Color(119, 220, 132));
        btn_pgPR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pgPRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pgPRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pgPRMouseExited(evt);
            }
        });

        icon1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        icon1.setForeground(new java.awt.Color(255, 255, 255));
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/icons8-house-30.png"))); // NOI18N

        icon_text1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        icon_text1.setForeground(new java.awt.Color(255, 255, 255));
        icon_text1.setText("Pagina Principala");

        javax.swing.GroupLayout btn_pgPRLayout = new javax.swing.GroupLayout(btn_pgPR);
        btn_pgPR.setLayout(btn_pgPRLayout);
        btn_pgPRLayout.setHorizontalGroup(
            btn_pgPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pgPRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon_text1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
        );
        btn_pgPRLayout.setVerticalGroup(
            btn_pgPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pgPRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_pgPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(icon_text1)
                    .addComponent(icon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidebar.add(btn_pgPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 50));

        btn_setari.setBackground(new java.awt.Color(107, 198, 110));
        btn_setari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_setariMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_setariMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_setariMouseExited(evt);
            }
        });

        icon.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        icon.setForeground(new java.awt.Color(255, 255, 255));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/icons8-settings-30.png"))); // NOI18N

        icon_text.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        icon_text.setForeground(new java.awt.Color(255, 255, 255));
        icon_text.setText("Profilul meu");

        javax.swing.GroupLayout btn_setariLayout = new javax.swing.GroupLayout(btn_setari);
        btn_setari.setLayout(btn_setariLayout);
        btn_setariLayout.setHorizontalGroup(
            btn_setariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_setariLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon_text, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_setariLayout.setVerticalGroup(
            btn_setariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_setariLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_setariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(icon_text)
                    .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidebar.add(btn_setari, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 50));

        btn_obNou.setBackground(new java.awt.Color(107, 198, 110));
        btn_obNou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_obNouMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_obNouMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_obNouMouseExited(evt);
            }
        });

        icon2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        icon2.setForeground(new java.awt.Color(255, 255, 255));
        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/icons8-add-30.png"))); // NOI18N

        icon_text2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        icon_text2.setForeground(new java.awt.Color(255, 255, 255));
        icon_text2.setText("Obiect nou");

        javax.swing.GroupLayout btn_obNouLayout = new javax.swing.GroupLayout(btn_obNou);
        btn_obNou.setLayout(btn_obNouLayout);
        btn_obNouLayout.setHorizontalGroup(
            btn_obNouLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_obNouLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon_text2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
        );
        btn_obNouLayout.setVerticalGroup(
            btn_obNouLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_obNouLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_obNouLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(btn_obNouLayout.createSequentialGroup()
                        .addComponent(icon_text2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        sidebar.add(btn_obNou, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 50));

        icon_text3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        icon_text3.setForeground(new java.awt.Color(255, 255, 255));
        icon_text3.setText("COMBO");
        sidebar.add(icon_text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        sidebar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 240, 20));

        jPanel2.setBackground(new java.awt.Color(119, 197, 220));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Magazinul nr.1 in Romania ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pentru orice problema tehnica sunati la numarul:");

        telefon_text.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        telefon_text.setForeground(new java.awt.Color(255, 255, 255));
        telefon_text.setText("+40 07******* ");
        telefon_text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telefon_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                telefon_textMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                telefon_textMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("sau email la adresa:");

        email_text.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        email_text.setForeground(new java.awt.Color(255, 255, 255));
        email_text.setText("tehnic@combo.com");
        email_text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        email_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                email_textMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                email_textMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefon_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_text))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(telefon_text)
                    .addComponent(jLabel5)
                    .addComponent(email_text))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        panel_info_PR.setkEndColor(new java.awt.Color(119, 197, 220));
        panel_info_PR.setkStartColor(new java.awt.Color(41, 168, 73));

        jScrollPane1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Aici o sa se afiseze produsele selectate");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setBackground(new java.awt.Color(107, 198, 110));
        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(119, 197, 220));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_AfisareTotala.setText("AFISARE TOTALA");
        btn_AfisareTotala.setkHoverColor(new java.awt.Color(119, 197, 220));
        btn_AfisareTotala.setkHoverEndColor(new java.awt.Color(119, 197, 220));
        btn_AfisareTotala.setkHoverForeGround(new java.awt.Color(188, 217, 231));
        btn_AfisareTotala.setkHoverStartColor(new java.awt.Color(41, 168, 73));
        btn_AfisareTotala.setkPressedColor(new java.awt.Color(220, 119, 156));
        btn_AfisareTotala.setkStartColor(new java.awt.Color(119, 197, 220));
        btn_AfisareTotala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AfisareTotalaMouseClicked(evt);
            }
        });
        btn_AfisareTotala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AfisareTotalaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_AfisareTotala, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 27));

        btn_filtru_AplicareTIP.setText(" Aplicare Tip Produs");
        btn_filtru_AplicareTIP.setkHoverColor(new java.awt.Color(119, 197, 220));
        btn_filtru_AplicareTIP.setkHoverEndColor(new java.awt.Color(119, 197, 220));
        btn_filtru_AplicareTIP.setkHoverForeGround(new java.awt.Color(188, 217, 231));
        btn_filtru_AplicareTIP.setkHoverStartColor(new java.awt.Color(41, 168, 73));
        btn_filtru_AplicareTIP.setkPressedColor(new java.awt.Color(220, 119, 156));
        btn_filtru_AplicareTIP.setkStartColor(new java.awt.Color(119, 197, 220));
        btn_filtru_AplicareTIP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_filtru_AplicareTIPMouseClicked(evt);
            }
        });
        btn_filtru_AplicareTIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtru_AplicareTIPActionPerformed(evt);
            }
        });
        jPanel1.add(btn_filtru_AplicareTIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, -1));

        buttonGroupTIP.add(RAM_Tip);
        RAM_Tip.setText("RAM");
        RAM_Tip.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RAM_Tip.setOpaque(false);
        RAM_Tip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAM_TipActionPerformed(evt);
            }
        });
        jPanel1.add(RAM_Tip, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        buttonGroupTIP.add(HDD_Tip);
        HDD_Tip.setText("HDD");
        HDD_Tip.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HDD_Tip.setOpaque(false);
        HDD_Tip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HDD_TipActionPerformed(evt);
            }
        });
        jPanel1.add(HDD_Tip, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        buttonGroupTIP.add(SSD_Tip);
        SSD_Tip.setText("SSD");
        SSD_Tip.setOpaque(false);
        SSD_Tip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSD_TipActionPerformed(evt);
            }
        });
        jPanel1.add(SSD_Tip, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLayeredPane_Filtre.setLayout(new java.awt.CardLayout());

        pnl_Filtre_Major_RAM.setOpaque(false);
        pnl_Filtre_Major_RAM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBackground(new java.awt.Color(119, 197, 220));
        jScrollPane3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setOpaque(false);

        pnl_Filtre_Ram.setBackground(new java.awt.Color(119, 197, 220));
        pnl_Filtre_Ram.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl_Filtre_Ram.setOpaque(false);

        pretRam.setText("Pret");
        pretRam.setOpaque(false);
        pretRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretRamActionPerformed(evt);
            }
        });

        pretRamSlider.setOpaque(false);
        pretRamSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pretRamSliderMouseDragged(evt);
            }
        });
        pretRamSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pretRamSliderMouseClicked(evt);
            }
        });

        listaTipuriComunicariRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaTipuriComunicariRam.setOpaque(false);

        valoare_Slider_Pret_Ram.setText("Valoare\n");

        comunicareRam.setText("Comunicare");
        comunicareRam.setOpaque(false);
        comunicareRam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comunicareRamMouseClicked(evt);
            }
        });
        comunicareRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comunicareRamActionPerformed(evt);
            }
        });

        frecventaRam.setText("Frecventa");
        frecventaRam.setOpaque(false);
        frecventaRam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frecventaRamMouseClicked(evt);
            }
        });

        latentaRam.setText("Latenta");
        latentaRam.setOpaque(false);
        latentaRam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                latentaRamMouseClicked(evt);
            }
        });
        latentaRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latentaRamActionPerformed(evt);
            }
        });

        listaTipuriLatenteRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        voltajRam.setText("Voltaj");
        voltajRam.setOpaque(false);
        voltajRam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltajRamMouseClicked(evt);
            }
        });
        voltajRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltajRamActionPerformed(evt);
            }
        });

        listaVoltajRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tipMemorieRam.setText("Tip Memorie");
        tipMemorieRam.setOpaque(false);
        tipMemorieRam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipMemorieRamMouseClicked(evt);
            }
        });

        listaTipuriMemorieRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        capacitateRam.setText("Capacitate");
        capacitateRam.setOpaque(false);

        listaCapacitateRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        listaFrecventeRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnl_Filtre_RamLayout = new javax.swing.GroupLayout(pnl_Filtre_Ram);
        pnl_Filtre_Ram.setLayout(pnl_Filtre_RamLayout);
        pnl_Filtre_RamLayout.setHorizontalGroup(
            pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Filtre_RamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Filtre_RamLayout.createSequentialGroup()
                        .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(voltajRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(latentaRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pretRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comunicareRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frecventaRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_Filtre_RamLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(listaTipuriComunicariRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_Filtre_RamLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(pretRamSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valoare_Slider_Pret_Ram))
                            .addGroup(pnl_Filtre_RamLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(listaVoltajRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_Filtre_RamLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(listaFrecventeRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(listaTipuriLatenteRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnl_Filtre_RamLayout.createSequentialGroup()
                        .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(capacitateRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipMemorieRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaTipuriMemorieRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listaCapacitateRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_Filtre_RamLayout.setVerticalGroup(
            pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Filtre_RamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(valoare_Slider_Pret_Ram)
                    .addComponent(pretRamSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pretRam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comunicareRam)
                    .addComponent(listaTipuriComunicariRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frecventaRam)
                    .addComponent(listaFrecventeRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latentaRam)
                    .addComponent(listaTipuriLatenteRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(voltajRam)
                    .addComponent(listaVoltajRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(listaTipuriMemorieRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipMemorieRam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Filtre_RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacitateRam)
                    .addComponent(listaCapacitateRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(pnl_Filtre_Ram);

        pnl_Filtre_Major_RAM.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 170));

        btn_filtre_RAM.setText("Filtre Ram");
        btn_filtre_RAM.setkHoverColor(new java.awt.Color(119, 197, 220));
        btn_filtre_RAM.setkHoverEndColor(new java.awt.Color(119, 197, 220));
        btn_filtre_RAM.setkHoverForeGround(new java.awt.Color(188, 217, 231));
        btn_filtre_RAM.setkHoverStartColor(new java.awt.Color(41, 168, 73));
        btn_filtre_RAM.setkPressedColor(new java.awt.Color(220, 119, 156));
        btn_filtre_RAM.setkStartColor(new java.awt.Color(119, 197, 220));
        btn_filtre_RAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_filtre_RAMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_filtre_RAMMouseEntered(evt);
            }
        });
        btn_filtre_RAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtre_RAMActionPerformed(evt);
            }
        });
        pnl_Filtre_Major_RAM.add(btn_filtre_RAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, -1));

        jLayeredPane_Filtre.add(pnl_Filtre_Major_RAM, "card2");

        pnl_Filtre_Major_HDD.setOpaque(false);
        pnl_Filtre_Major_HDD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBackground(new java.awt.Color(119, 197, 220));
        jScrollPane5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane5.setOpaque(false);

        pnl_Filtre_HDD.setBackground(new java.awt.Color(119, 197, 220));
        pnl_Filtre_HDD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl_Filtre_HDD.setOpaque(false);

        sliderPretHDD.setOpaque(false);
        sliderPretHDD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliderPretHDDMouseDragged(evt);
            }
        });
        sliderPretHDD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sliderPretHDDMouseClicked(evt);
            }
        });

        pretHDD.setText("Pret");
        pretHDD.setOpaque(false);

        valoare_Slider_Pret_HDD.setText("Valoare");

        vitezaRotatieHDD.setText("Viteza Rotatie");
        vitezaRotatieHDD.setOpaque(false);

        listaVitezeRotatieHDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tipMemorieHDD.setText("Tip Memorie");
        tipMemorieHDD.setOpaque(false);

        listaTipuriMemorieHDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        capacitateHDD.setText("Capacitate");
        capacitateHDD.setOpaque(false);

        listaCapacitatiHDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tipComunicareHDD.setText("Tip Comunicare");
        tipComunicareHDD.setOpaque(false);

        listaTipComunicareHDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnl_Filtre_HDDLayout = new javax.swing.GroupLayout(pnl_Filtre_HDD);
        pnl_Filtre_HDD.setLayout(pnl_Filtre_HDDLayout);
        pnl_Filtre_HDDLayout.setHorizontalGroup(
            pnl_Filtre_HDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Filtre_HDDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Filtre_HDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Filtre_HDDLayout.createSequentialGroup()
                        .addGroup(pnl_Filtre_HDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pretHDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vitezaRotatieHDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipMemorieHDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(capacitateHDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(pnl_Filtre_HDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaCapacitatiHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_Filtre_HDDLayout.createSequentialGroup()
                                .addComponent(sliderPretHDD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(valoare_Slider_Pret_HDD))
                            .addComponent(listaVitezeRotatieHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listaTipuriMemorieHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_Filtre_HDDLayout.createSequentialGroup()
                        .addComponent(tipComunicareHDD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaTipComunicareHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnl_Filtre_HDDLayout.setVerticalGroup(
            pnl_Filtre_HDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Filtre_HDDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Filtre_HDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(valoare_Slider_Pret_HDD)
                    .addComponent(pretHDD)
                    .addComponent(sliderPretHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Filtre_HDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vitezaRotatieHDD)
                    .addComponent(listaVitezeRotatieHDD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Filtre_HDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipMemorieHDD)
                    .addComponent(listaTipuriMemorieHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Filtre_HDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(listaCapacitatiHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacitateHDD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Filtre_HDDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipComunicareHDD)
                    .addComponent(listaTipComunicareHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(pnl_Filtre_HDD);

        pnl_Filtre_Major_HDD.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 170));

        btn_filtre_HDD.setText("Filtre HDD");
        btn_filtre_HDD.setkHoverColor(new java.awt.Color(119, 197, 220));
        btn_filtre_HDD.setkHoverEndColor(new java.awt.Color(119, 197, 220));
        btn_filtre_HDD.setkHoverForeGround(new java.awt.Color(188, 217, 231));
        btn_filtre_HDD.setkHoverStartColor(new java.awt.Color(41, 168, 73));
        btn_filtre_HDD.setkPressedColor(new java.awt.Color(220, 119, 156));
        btn_filtre_HDD.setkStartColor(new java.awt.Color(119, 197, 220));
        btn_filtre_HDD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_filtre_HDDMouseClicked(evt);
            }
        });
        btn_filtre_HDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtre_HDDActionPerformed(evt);
            }
        });
        pnl_Filtre_Major_HDD.add(btn_filtre_HDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, -1));

        jLayeredPane_Filtre.add(pnl_Filtre_Major_HDD, "card2");

        pnl_Filtre_Major_SSD.setOpaque(false);
        pnl_Filtre_Major_SSD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBackground(new java.awt.Color(119, 197, 220));
        jScrollPane4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane4.setOpaque(false);

        pnl_Filtre_SSD.setBackground(new java.awt.Color(119, 197, 220));
        pnl_Filtre_SSD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl_Filtre_SSD.setOpaque(false);

        sliderPretSSD.setOpaque(false);
        sliderPretSSD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliderPretSSDMouseDragged(evt);
            }
        });
        sliderPretSSD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sliderPretSSDMouseClicked(evt);
            }
        });

        pretSSD.setText("Pret");
        pretSSD.setOpaque(false);
        pretSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretSSDActionPerformed(evt);
            }
        });

        valoare_Slider_Pret_SSD.setText("Valoare");

        formFactorSSD.setText("Form Factor");
        formFactorSSD.setOpaque(false);
        formFactorSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formFactorSSDActionPerformed(evt);
            }
        });

        listFormFactorSSD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listFormFactorSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listFormFactorSSDActionPerformed(evt);
            }
        });

        tipControlSSD.setText("Tip Controler");
        tipControlSSD.setOpaque(false);

        listaTipControlsSSD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tipMemorieSSD.setText("Tip Memorie");
        tipMemorieSSD.setOpaque(false);
        tipMemorieSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipMemorieSSDActionPerformed(evt);
            }
        });

        listaTipMemorieSSD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        capacitateSSD.setText("Capacitate");
        capacitateSSD.setOpaque(false);
        capacitateSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacitateSSDActionPerformed(evt);
            }
        });

        listaCapacitatiSSD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tipComunicareSSD.setText("Tip Comunicare");
        tipComunicareSSD.setOpaque(false);

        listaTipComunicareSSD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnl_Filtre_SSDLayout = new javax.swing.GroupLayout(pnl_Filtre_SSD);
        pnl_Filtre_SSD.setLayout(pnl_Filtre_SSDLayout);
        pnl_Filtre_SSDLayout.setHorizontalGroup(
            pnl_Filtre_SSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Filtre_SSDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Filtre_SSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipComunicareSSD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(capacitateSSD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipControlSSD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formFactorSSD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipMemorieSSD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_Filtre_SSDLayout.createSequentialGroup()
                        .addComponent(pretSSD, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Filtre_SSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaTipMemorieSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listFormFactorSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Filtre_SSDLayout.createSequentialGroup()
                        .addComponent(sliderPretSSD, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(valoare_Slider_Pret_SSD))
                    .addComponent(listaTipControlsSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaCapacitatiSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaTipComunicareSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        pnl_Filtre_SSDLayout.setVerticalGroup(
            pnl_Filtre_SSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Filtre_SSDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Filtre_SSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pretSSD)
                    .addComponent(sliderPretSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valoare_Slider_Pret_SSD))
                .addGap(5, 5, 5)
                .addGroup(pnl_Filtre_SSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(listFormFactorSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formFactorSSD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Filtre_SSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tipControlSSD)
                    .addComponent(listaTipControlsSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Filtre_SSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(listaTipMemorieSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipMemorieSSD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Filtre_SSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacitateSSD, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaCapacitatiSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_Filtre_SSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipComunicareSSD)
                    .addComponent(listaTipComunicareSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane4.setViewportView(pnl_Filtre_SSD);

        pnl_Filtre_Major_SSD.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 170));

        btn_filtre_SSD.setText("Filtre SSD");
        btn_filtre_SSD.setkHoverColor(new java.awt.Color(119, 197, 220));
        btn_filtre_SSD.setkHoverEndColor(new java.awt.Color(119, 197, 220));
        btn_filtre_SSD.setkHoverForeGround(new java.awt.Color(188, 217, 231));
        btn_filtre_SSD.setkHoverStartColor(new java.awt.Color(41, 168, 73));
        btn_filtre_SSD.setkPressedColor(new java.awt.Color(220, 119, 156));
        btn_filtre_SSD.setkStartColor(new java.awt.Color(119, 197, 220));
        btn_filtre_SSD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_filtre_SSDMouseClicked(evt);
            }
        });
        btn_filtre_SSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtre_SSDActionPerformed(evt);
            }
        });
        pnl_Filtre_Major_SSD.add(btn_filtre_SSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, -1));

        jLayeredPane_Filtre.add(pnl_Filtre_Major_SSD, "card2");

        jPanel1.add(jLayeredPane_Filtre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 430, 210));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout panel_info_PRLayout = new javax.swing.GroupLayout(panel_info_PR);
        panel_info_PR.setLayout(panel_info_PRLayout);
        panel_info_PRLayout.setHorizontalGroup(
            panel_info_PRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_info_PRLayout.createSequentialGroup()
                .addGroup(panel_info_PRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addGroup(panel_info_PRLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_info_PRLayout.setVerticalGroup(
            panel_info_PRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_info_PRLayout.createSequentialGroup()
                .addGroup(panel_info_PRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jLabel3)
                .addGap(120, 120, 120))
        );

        jLayeredPane1.add(panel_info_PR, "card2");

        panel_info_Setari.setkEndColor(new java.awt.Color(119, 197, 220));
        panel_info_Setari.setkStartColor(new java.awt.Color(41, 168, 73));

        jLabel4.setText("Panel info Pagina cu setari");

        javax.swing.GroupLayout panel_info_SetariLayout = new javax.swing.GroupLayout(panel_info_Setari);
        panel_info_Setari.setLayout(panel_info_SetariLayout);
        panel_info_SetariLayout.setHorizontalGroup(
            panel_info_SetariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_info_SetariLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 705, Short.MAX_VALUE))
        );
        panel_info_SetariLayout.setVerticalGroup(
            panel_info_SetariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_info_SetariLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 549, Short.MAX_VALUE))
        );

        jLayeredPane1.add(panel_info_Setari, "card3");

        panel_info_Obj.setkEndColor(new java.awt.Color(119, 197, 220));
        panel_info_Obj.setkStartColor(new java.awt.Color(41, 168, 73));

        jLabel6.setText("Panel info Pagina cu obiecte noi");

        javax.swing.GroupLayout panel_info_ObjLayout = new javax.swing.GroupLayout(panel_info_Obj);
        panel_info_Obj.setLayout(panel_info_ObjLayout);
        panel_info_ObjLayout.setHorizontalGroup(
            panel_info_ObjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_info_ObjLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 664, Short.MAX_VALUE))
        );
        panel_info_ObjLayout.setVerticalGroup(
            panel_info_ObjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_info_ObjLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 549, Short.MAX_VALUE))
        );

        jLayeredPane1.add(panel_info_Obj, "card4");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("WE");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/icons8-heart-24.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("COMBO");

        btn_logout.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout.setBorder(null);
        btn_logout.setText("Logout");
        btn_logout.setFont(new java.awt.Font("Swis721 BT", 0, 14)); // NOI18N
        btn_logout.setkBackGroundColor(new java.awt.Color(153, 0, 153));
        btn_logout.setkBorderRadius(-20);
        btn_logout.setkHoverColor(new java.awt.Color(119, 197, 220));
        btn_logout.setkHoverEndColor(new java.awt.Color(119, 197, 220));
        btn_logout.setkHoverForeGround(new java.awt.Color(188, 217, 231));
        btn_logout.setkHoverStartColor(new java.awt.Color(41, 168, 73));
        btn_logout.setkPressedColor(new java.awt.Color(220, 119, 156));
        btn_logout.setkStartColor(new java.awt.Color(119, 197, 220));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_bgLayout = new javax.swing.GroupLayout(pnl_bg);
        pnl_bg.setLayout(pnl_bgLayout);
        pnl_bgLayout.setHorizontalGroup(
            pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bgLayout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1)
                    .addGroup(pnl_bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnl_bgLayout.setVerticalGroup(
            pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_bgLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telefon_textMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefon_textMouseEntered
        // TODO add your handling code here:
        telefon_text.setForeground(new Color(119,220,132));
    }//GEN-LAST:event_telefon_textMouseEntered

    private void telefon_textMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefon_textMouseExited
        // TODO add your handling code here:
        telefon_text.setForeground(Color.WHITE);
    }//GEN-LAST:event_telefon_textMouseExited

    private void email_textMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_textMouseEntered
        // TODO add your handling code here:
        email_text.setForeground(new Color(119,220,132));
    }//GEN-LAST:event_email_textMouseEntered

    private void email_textMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_textMouseExited
        // TODO add your handling code here:
        email_text.setForeground(Color.WHITE);
    }//GEN-LAST:event_email_textMouseExited

    private void btn_pgPRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pgPRMouseClicked
        // TODO add your handling code here:
        panel_info_PR.setVisible(true);
        panel_info_Setari.setVisible(false);
        panel_info_Obj.setVisible(false);
        btn_pgPR.setBackground(new Color(220, 119, 156));
        
    }//GEN-LAST:event_btn_pgPRMouseClicked

    private void btn_setariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_setariMouseClicked
        // TODO add your handling code here:
        panel_info_PR.setVisible(false);
        panel_info_Setari.setVisible(true);
        panel_info_Obj.setVisible(false);
        btn_setari.setBackground(new Color(220, 119, 156));
    }//GEN-LAST:event_btn_setariMouseClicked

    private void btn_obNouMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_obNouMouseClicked
        // TODO add your handling code here:
        panel_info_PR.setVisible(false);
        panel_info_Setari.setVisible(false);
        panel_info_Obj.setVisible(true);
        btn_obNou.setBackground(new Color(220, 119, 156));
    }//GEN-LAST:event_btn_obNouMouseClicked

    private void btn_pgPRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pgPRMouseEntered
        // TODO add your handling code here:
        btn_pgPR.setBackground(new Color(119,197,220));
    }//GEN-LAST:event_btn_pgPRMouseEntered

    private void btn_pgPRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pgPRMouseExited
        // TODO add your handling code here:
        btn_pgPR.setBackground(new Color(119,220,132));
    }//GEN-LAST:event_btn_pgPRMouseExited

    private void btn_setariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_setariMouseEntered
        // TODO add your handling code here:
        btn_setari.setBackground(new Color(119,197,220));
    }//GEN-LAST:event_btn_setariMouseEntered

    private void btn_setariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_setariMouseExited
        // TODO add your handling code here:
        btn_setari.setBackground(new Color(107,198,110));
    }//GEN-LAST:event_btn_setariMouseExited

    private void btn_obNouMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_obNouMouseEntered
        // TODO add your handling code here:
        btn_obNou.setBackground(new Color(119,197,220));
    }//GEN-LAST:event_btn_obNouMouseEntered

    private void btn_obNouMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_obNouMouseExited
        // TODO add your handling code here:
        btn_obNou.setBackground(new Color(107,198,110));
    }//GEN-LAST:event_btn_obNouMouseExited

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // TODO add your handling code here:
                Interfata_Logare in=new Interfata_Logare();
                in.show();
                dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_AfisareTotalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AfisareTotalaMouseClicked
        // TODO add your handling code here:
          ArrayList<ObiectGeneral> arrayList = new ArrayList<>();

    try  {
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("data.olivera"));
        while (true) {
            Object read = objectInputStream.readObject();
            if (read == null)
                break;

            // We should always cast explicitly
            ObiectGeneral myClassRead = (ObiectGeneral) read;
            arrayList.add(myClassRead);
        }
    }
    catch (EOFException e) {
        // This exception is expected
    }   catch (IOException ex) {
            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
        }
    jTextArea1.setText("");
    for (ObiectGeneral m : arrayList) {
        
        jTextArea1.append(m.toString()+"\n");
       
    }
    }//GEN-LAST:event_btn_AfisareTotalaMouseClicked

    private void btn_AfisareTotalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AfisareTotalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AfisareTotalaActionPerformed

    private void btn_filtru_AplicareTIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtru_AplicareTIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_filtru_AplicareTIPActionPerformed

    
    
     
    
    private void btn_filtru_AplicareTIPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filtru_AplicareTIPMouseClicked
        // TODO add your handling code here:
        ///--------------------aici citesc datele din buffer dupa ce au fost modificate si le afisez--------------------  
         ArrayList<ObiectGeneral> arrayList = new ArrayList<>();
         
          try  {
              ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("data.olivera"));

        while (true) {
            
            Object read = objectInputStream.readObject();
            if (read == null)
                break;

            
            // We should always cast explicitly
            ObiectGeneral myClassRead = (ObiectGeneral) read;
            arrayList.add(myClassRead);
        }
    }
    catch (Exception e) {
        // This exception is expected
    }
  
    arrayListBuffer.clear();
    
         Component[] comp = jPanel1.getComponents();
         
        for (int i = 0;i<comp.length;i++) {
        if (comp[i] instanceof JRadioButton) {

               JRadioButton nBox=(JRadioButton)comp[i];
            if(nBox.isSelected())  
            {if(nBox==RAM_Tip)
               {jTextArea1.setText("");
               PopulareMasiveDeDateRAM();
                      jLayeredPane_Filtre.setVisible(true);
                      pnl_Filtre_Major_RAM.setVisible(true);
                      pnl_Filtre_Major_SSD.setVisible(false);
                      pnl_Filtre_Major_HDD.setVisible(false);
                   for (ObiectGeneral m : arrayList) 
                   {
                       {
                           if(m.getClass().getCanonicalName().contains("RAM")==true)
                           {    jTextArea1.append("RAM"+"\n");
                               jTextArea1.append(m.toString()+"\n");
                               arrayListBuffer.add(m);
                           }
                       }
                  }
               }
         if(nBox==HDD_Tip)
               {jTextArea1.setText("");
               PopulareMasiveDeDateHDD();
                      jLayeredPane_Filtre.setVisible(true);
                      pnl_Filtre_Major_RAM.setVisible(false);
                      pnl_Filtre_Major_SSD.setVisible(false);
                      pnl_Filtre_Major_HDD.setVisible(true);
                      
                   for (ObiectGeneral m : arrayList) 
                   {
                       {
                           if(m.getClass().getCanonicalName().contains("HDD")==true)
                           {    jTextArea1.append("HDD"+"\n");
                               jTextArea1.append(m.toString()+"\n");
                               arrayListBuffer.add(m);
                           }
                       }
                  }
               }
         if(nBox==SSD_Tip)
               {jTextArea1.setText("");
              PopulareMasiveDeDateSSD();
                      jLayeredPane_Filtre.setVisible(true);
                      pnl_Filtre_Major_RAM.setVisible(false);
                      pnl_Filtre_Major_SSD.setVisible(true);
                      pnl_Filtre_Major_HDD.setVisible(false);
                                            
                   for (ObiectGeneral m : arrayList) 
                   {
                       {
                           if(m.getClass().getCanonicalName().contains("SSD")==true)
                           {    jTextArea1.append("SSD"+"\n");
                               jTextArea1.append(m.toString()+"\n");
                               arrayListBuffer.add(m);
                           }
                       }
                  }
               }
           
    }
        }
   }      
//    try  {
//        //deschid fisierul in care am scris datele
//        ObjectInputStream objectInputStream =
//                new ObjectInputStream(new FileInputStream("buffer.olivera"));
//        //resetez zona de text
//        jTextArea1.setText("");
//        while (true) {
//            //citesc obiecte
//            Object read = objectInputStream.readObject();
//            if (read == null)
//                break;
//            // We should always cast explicitly+afisare
//            ObiectGeneral myClassRead = (ObiectGeneral) read;
//            jTextArea1.append(myClassRead.toString()+"\n"); 
//        }
//        
//    }
//    catch (EOFException e) {
//        // This exception is expected
//    }   catch (IOException ex) {
//            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
//    }
//   ///--------------------aici reincarc datele din fisierul_mama in buffer pentru a putea fi filtrat again--------------------   
//    try  {
//        //deschid fisierul_mama din care citesc
//        ObjectInputStream objectInputStream =
//                new ObjectInputStream(new FileInputStream("data.olivera"));
//        //deschid fisierul_buffer din care scriu
//        ObjectOutputStream os3 = new ObjectOutputStream(new FileOutputStream("buffer.olivera")) ;
//        while (true) {
//            Object read = objectInputStream.readObject();
//            if (read == null)
//                break;
//
//            // We should always cast explicitly+scriere in buffer
//            ObiectGeneral myClassRead = (ObiectGeneral) read;
//            os3.writeObject(myClassRead);
//        }
//    }
//    catch (EOFException e) {
//        // This exception is expected
//    }   catch (FileNotFoundException ex) {
//            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Interfata_Principala.class.getName()).log(Level.SEVERE, null, ex);
//        }
    
    }//GEN-LAST:event_btn_filtru_AplicareTIPMouseClicked

    private void btn_filtre_SSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtre_SSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_filtre_SSDActionPerformed

    private void btn_filtre_HDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtre_HDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_filtre_HDDActionPerformed

    private void btn_filtre_HDDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filtre_HDDMouseClicked
        // TODO add your handling code here:
        ArrayList<HDD> obj_curent=new ArrayList<>();
        obj_curent=(ArrayList<HDD>)arrayListBuffer.clone();
        Component[] comp = pnl_Filtre_HDD.getComponents();
         for (int i = 0;i<comp.length;i++) {
            if (comp[i] instanceof JCheckBox) {
                
                JCheckBox nBox=(JCheckBox)comp[i];

                if(nBox.isSelected()==true)
                {
                    if(nBox==pretHDD)
                    {
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("HDD")==true)
                                {
                                    HDD hdd=HDD.class.cast(m);
                                    if(!((int)hdd.getPret()<=sliderPretHDD.getValue()))
                                    {
                                        obj_curent.remove(hdd);
                                    }

                                }
                            }
                        }
                    }
                    if(nBox==vitezaRotatieHDD)
                    {
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("HDD")==true)
                                {
                                    HDD hdd=HDD.class.cast(m);
                                    if(!(Integer.toString(hdd.getVitezaRotatie()).equals(listaVitezeRotatieHDD.getSelectedItem())))
                                    {
                                        obj_curent.remove(hdd);
                                    }

                                }
                            }
                        
                          }
                    }
                    if(nBox==tipMemorieHDD)
                    {
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("HDD")==true)
                                {
                                    HDD hdd=HDD.class.cast(m);
                                    if(!(hdd.getTipMemorie().equals(listaTipuriMemorieHDD.getSelectedItem())))
                                    {
                                        obj_curent.remove(hdd);
                                    }

                                }
                            }
                        
                          }
                    }
                    if(nBox==capacitateHDD)
                    {
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("HDD")==true)
                                {
                                    HDD hdd=HDD.class.cast(m);
                                    if(!(Integer.toString(hdd.getCpacitate()).equals(listaCapacitatiHDD.getSelectedItem())))
                                    {
                                        obj_curent.remove(hdd);
                                    }

                                }
                            }
                        
                          }
                    }
                    if(nBox==tipComunicareHDD)
                    {
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("HDD")==true)
                                {
                                    HDD hdd=HDD.class.cast(m);
                                    if(!(hdd.getTipComunicare().equals(listaTipComunicareHDD.getSelectedItem())))
                                    {
                                        obj_curent.remove(hdd);
                                    }

                                }
                            }
                        
                          }
                    }
                }
            }
         }
 
  
         if(obj_curent.isEmpty()==false)
        {jTextArea1.setText("");
       
            for(HDD r:obj_curent)
            {
                jTextArea1.append(r.toString()+"\n");
            }}
            else{jTextArea1.setText("Nu exista produse cu aceste caracteristici");}
 
    }//GEN-LAST:event_btn_filtre_HDDMouseClicked

    private void RAM_TipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAM_TipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RAM_TipActionPerformed

    private void HDD_TipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HDD_TipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HDD_TipActionPerformed

    private void SSD_TipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSD_TipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSD_TipActionPerformed

    private void btn_filtre_RAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtre_RAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_filtre_RAMActionPerformed

    private void btn_filtre_RAMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filtre_RAMMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_filtre_RAMMouseEntered

    private void btn_filtre_RAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filtre_RAMMouseClicked
        // TODO add your handling code here:

        ArrayList<RAM> obj_curent=new ArrayList<>();
        obj_curent=(ArrayList<RAM>)arrayListBuffer.clone();
        Component[] comp = pnl_Filtre_Ram.getComponents();
   
        for (int i = 0;i<comp.length;i++) {
            if (comp[i] instanceof JCheckBox) {

                JCheckBox nBox=(JCheckBox)comp[i];

                if(nBox.isSelected()==true)
                {
                    
                    if(nBox==pretRam)//pot sa fac cu instanta unui button
                    {
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("RAM")==true)
                                {
                                    RAM ram=RAM.class.cast(m);
                                    if(!((int)ram.getPret()<=pretRamSlider.getValue()))
                                    {
                                        obj_curent.remove(ram);
                                    }

                                }
                            }
                        }
                    }
                    if (nBox==comunicareRam){
                
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("RAM")==true)
                                {
                                    RAM ram=RAM.class.cast(m);
                                    if(!(ram.getTipComunicare().equals(listaTipuriComunicariRam.getSelectedItem())))
                                    {
                                        obj_curent.remove(ram);
                                    }

                                }
                            }
                        
                          }
                                            }
                    if(nBox==frecventaRam)
                    {
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("RAM")==true)
                                {
                                   RAM ram=RAM.class.cast(m);
                                    if(!(Integer.toString(ram.getFrecventa()).equals(listaFrecventeRam.getSelectedItem())))
                                    {
                                        obj_curent.remove(ram);
                                    }

                                }
                            }
                        }
                    }
                    if(nBox==latentaRam)
                    {
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("RAM")==true)
                                {
                                    RAM ram=RAM.class.cast(m);
                                    if(!(ram.getLatenta().equals(listaTipuriLatenteRam.getSelectedItem())))
                                    {
                                        obj_curent.remove(ram);
                                    }

                                }
                            }
                        
                          }
                    }
                    if(nBox==tipMemorieRam)
                    {
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("RAM")==true)
                                {
                                    RAM ram=RAM.class.cast(m);
                                    if(!(ram.getTipMemorie().equals(listaTipuriMemorieRam.getSelectedItem())))
                                    {
                                        obj_curent.remove(ram);
                                    }

                                }
                            }
                        
                          }
                    }
                    if(nBox==voltajRam)
                    {
                        
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("RAM")==true)
                                {
                                    RAM ram=RAM.class.cast(m);
                                   
                                    if(!(Float.toString(ram.getVoltaj()).equals(listaVoltajRam.getSelectedItem())))
                                    {
                                        obj_curent.remove(ram);
                                    }

                                }
                            }
                        }
                    }
                    if(nBox==capacitateRam)
                    {
                        for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("RAM")==true)
                                {
                                    RAM ram=RAM.class.cast(m);
                                   
                                    if(!(Integer.toString(ram.getCpacitate()).equals(listaCapacitateRam.getSelectedItem())))
                                    {
                                        obj_curent.remove(ram);
                                    }

                                }
                            }
                        }
                    }
                }
                 
            }
                    

        }
        
        if(obj_curent.isEmpty()==false)
        {jTextArea1.setText("");
       
            for(RAM r:obj_curent)
            {
                jTextArea1.append(r.toString()+"\n");
            }}
            else{jTextArea1.setText("Nu exista produse cu aceste caracteristici");}

    }//GEN-LAST:event_btn_filtre_RAMMouseClicked

    private void pretRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pretRamActionPerformed

    private void pretRamSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pretRamSliderMouseDragged
        // TODO add your handling code here:
        valoare_Slider_Pret_Ram.setText((Integer.toString(pretRamSlider.getValue())));
    }//GEN-LAST:event_pretRamSliderMouseDragged

    private void comunicareRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comunicareRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comunicareRamActionPerformed
  
    private void comunicareRamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comunicareRamMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_comunicareRamMouseClicked

    private void frecventaRamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frecventaRamMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_frecventaRamMouseClicked

    private void pretRamSliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pretRamSliderMouseClicked
        // TODO add your handling code here:
         valoare_Slider_Pret_Ram.setText((Integer.toString(pretRamSlider.getValue())));
    }//GEN-LAST:event_pretRamSliderMouseClicked

    private void latentaRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latentaRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latentaRamActionPerformed
    
    private void latentaRamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latentaRamMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_latentaRamMouseClicked

    private void voltajRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltajRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltajRamActionPerformed
    
    private void tipMemorieRamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipMemorieRamMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tipMemorieRamMouseClicked
   
    private void voltajRamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltajRamMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_voltajRamMouseClicked

    private void sliderPretHDDMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderPretHDDMouseDragged
        // TODO add your handling code here:
        valoare_Slider_Pret_HDD.setText((Integer.toString(sliderPretHDD.getValue())));
    }//GEN-LAST:event_sliderPretHDDMouseDragged

    private void sliderPretHDDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderPretHDDMouseClicked
        // TODO add your handling code here:
        valoare_Slider_Pret_HDD.setText((Integer.toString(sliderPretHDD.getValue())));
    }//GEN-LAST:event_sliderPretHDDMouseClicked

    private void btn_filtre_SSDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filtre_SSDMouseClicked
        // TODO add your handling code here:
        
        ArrayList<SSD> obj_curent=new ArrayList<>();
        obj_curent=(ArrayList<SSD>)arrayListBuffer.clone();
        Component[] comp = pnl_Filtre_SSD.getComponents();

        for (int i = 0;i<comp.length;i++) {
            if (comp[i] instanceof JCheckBox) {
                
                JCheckBox nBox=(JCheckBox)comp[i];
                if(nBox.isSelected()){
                if(nBox==pretSSD)
                {
                    for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("SSD")==true)
                                {
                                    SSD ssd=SSD.class.cast(m);
                                    if(!((int)ssd.getPret()<=sliderPretSSD.getValue()))
                                    {
                                        obj_curent.remove(ssd);
                                    }

                                }
                            }
                        }
                }
                if(nBox==formFactorSSD)
                {
                     for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("SSD")==true)
                                {
                                    SSD ssd=SSD.class.cast(m);
                                    if(!(ssd.getFormFactor().equals(listFormFactorSSD.getSelectedItem())))
                                    {
                                        obj_curent.remove(ssd);
                                    }

                                }
                            }
                        }
                }
                if(nBox==tipControlSSD)
                {
                     for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("SSD")==true)
                                {
                                    SSD ssd=SSD.class.cast(m);
                                    if(!(ssd.getTipController().equals(listaTipControlsSSD.getSelectedItem())))
                                    {
                                        obj_curent.remove(ssd);
                                    }

                                }
                            }
                        }
                }
                
                if(nBox==tipMemorieSSD)
                {
                    for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("SSD")==true)
                                {
                                    SSD ssd=SSD.class.cast(m);
                                    if(!(ssd.getTipMemorie().equals(listaTipMemorieSSD.getSelectedItem())))
                                    {
                                        obj_curent.remove(ssd);
                                    }

                                }
                            }
                        }
                }
                if(nBox==capacitateSSD)
                {
                    for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("SSD")==true)
                                {
                                    SSD ssd=SSD.class.cast(m);
                                    if(!(Integer.toString(ssd.getCpacitate()).equals(listaCapacitatiSSD.getSelectedItem())))
                                    {
                                        obj_curent.remove(ssd);
                                    }

                                }
                            }
                        }
                }
                if(nBox==tipComunicareSSD)
                {
                    for (ObiectGeneral m : arrayListBuffer)
                        {
                            {
                                if(m.getClass().getCanonicalName().contains("SSD")==true)
                                {
                                    SSD ssd=SSD.class.cast(m);
                                    if(!(ssd.getTipComunicare().equals(listaTipComunicareSSD.getSelectedItem())))
                                    {
                                        obj_curent.remove(ssd);
                                    }

                                }
                            }
                        }
                }
                
            }
            }
        }
        if(obj_curent.isEmpty()==false)
        {jTextArea1.setText("");
       
            for(SSD r:obj_curent)
            {
                jTextArea1.append(r.toString()+"\n");
            }}
            else{jTextArea1.setText("Nu exista produse cu aceste caracteristici");}
    }//GEN-LAST:event_btn_filtre_SSDMouseClicked

    private void pretSSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretSSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pretSSDActionPerformed

    private void sliderPretSSDMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderPretSSDMouseDragged
        // TODO add your handling code here:
        valoare_Slider_Pret_SSD.setText(Integer.toString(sliderPretSSD.getValue()));
    }//GEN-LAST:event_sliderPretSSDMouseDragged

    private void sliderPretSSDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderPretSSDMouseClicked
        // TODO add your handling code here:
        valoare_Slider_Pret_SSD.setText(Integer.toString(sliderPretSSD.getValue()));
    }//GEN-LAST:event_sliderPretSSDMouseClicked

    private void formFactorSSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formFactorSSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formFactorSSDActionPerformed

    private void listFormFactorSSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listFormFactorSSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listFormFactorSSDActionPerformed

    private void tipMemorieSSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipMemorieSSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipMemorieSSDActionPerformed

    private void capacitateSSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacitateSSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacitateSSDActionPerformed
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfata_Principala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfata_Principala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfata_Principala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfata_Principala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfata_Principala().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton HDD_Tip;
    private javax.swing.JRadioButton RAM_Tip;
    private javax.swing.JRadioButton SSD_Tip;
    private com.k33ptoo.components.KButton btn_AfisareTotala;
    private com.k33ptoo.components.KButton btn_filtre_HDD;
    private com.k33ptoo.components.KButton btn_filtre_RAM;
    private com.k33ptoo.components.KButton btn_filtre_SSD;
    private com.k33ptoo.components.KButton btn_filtru_AplicareTIP;
    private com.k33ptoo.components.KButton btn_logout;
    private javax.swing.JPanel btn_obNou;
    private javax.swing.JPanel btn_pgPR;
    private javax.swing.JPanel btn_setari;
    private javax.swing.ButtonGroup buttonGroupTIP;
    private javax.swing.JCheckBox capacitateHDD;
    private javax.swing.JCheckBox capacitateRam;
    private javax.swing.JCheckBox capacitateSSD;
    private javax.swing.JCheckBox comunicareRam;
    private javax.swing.JLabel email_text;
    private javax.swing.JCheckBox formFactorSSD;
    private javax.swing.JCheckBox frecventaRam;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon_text;
    private javax.swing.JLabel icon_text1;
    private javax.swing.JLabel icon_text2;
    private javax.swing.JLabel icon_text3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane_Filtre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox latentaRam;
    private javax.swing.JComboBox<String> listFormFactorSSD;
    private javax.swing.JComboBox<String> listaCapacitateRam;
    private javax.swing.JComboBox<String> listaCapacitatiHDD;
    private javax.swing.JComboBox<String> listaCapacitatiSSD;
    private javax.swing.JComboBox<String> listaFrecventeRam;
    private javax.swing.JComboBox<String> listaTipComunicareHDD;
    private javax.swing.JComboBox<String> listaTipComunicareSSD;
    private javax.swing.JComboBox<String> listaTipControlsSSD;
    private javax.swing.JComboBox<String> listaTipMemorieSSD;
    private javax.swing.JComboBox<String> listaTipuriComunicariRam;
    private javax.swing.JComboBox<String> listaTipuriLatenteRam;
    private javax.swing.JComboBox<String> listaTipuriMemorieHDD;
    private javax.swing.JComboBox<String> listaTipuriMemorieRam;
    private javax.swing.JComboBox<String> listaVitezeRotatieHDD;
    private javax.swing.JComboBox<String> listaVoltajRam;
    private keeptoo.KGradientPanel panel_info_Obj;
    private keeptoo.KGradientPanel panel_info_PR;
    private keeptoo.KGradientPanel panel_info_Setari;
    private javax.swing.JPanel pnl_Filtre_HDD;
    private javax.swing.JPanel pnl_Filtre_Major_HDD;
    private javax.swing.JPanel pnl_Filtre_Major_RAM;
    private javax.swing.JPanel pnl_Filtre_Major_SSD;
    private javax.swing.JPanel pnl_Filtre_Ram;
    private javax.swing.JPanel pnl_Filtre_SSD;
    private javax.swing.JPanel pnl_bg;
    private javax.swing.JCheckBox pretHDD;
    private javax.swing.JCheckBox pretRam;
    private javax.swing.JSlider pretRamSlider;
    private javax.swing.JCheckBox pretSSD;
    private javax.swing.JPanel sidebar;
    private javax.swing.JSlider sliderPretHDD;
    private javax.swing.JSlider sliderPretSSD;
    private javax.swing.JLabel telefon_text;
    private javax.swing.JCheckBox tipComunicareHDD;
    private javax.swing.JCheckBox tipComunicareSSD;
    private javax.swing.JCheckBox tipControlSSD;
    private javax.swing.JCheckBox tipMemorieHDD;
    private javax.swing.JCheckBox tipMemorieRam;
    private javax.swing.JCheckBox tipMemorieSSD;
    private javax.swing.JLabel valoare_Slider_Pret_HDD;
    private javax.swing.JLabel valoare_Slider_Pret_Ram;
    private javax.swing.JLabel valoare_Slider_Pret_SSD;
    private javax.swing.JCheckBox vitezaRotatieHDD;
    private javax.swing.JCheckBox voltajRam;
    // End of variables declaration//GEN-END:variables

    void setExtendedState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
