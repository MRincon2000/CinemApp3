/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import cinemapp.*;
import java.awt.Color;
import javax.swing.JToggleButton;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author MSI PC
 */
public class SeleccionSillas extends javax.swing.JFrame {

    private Horario actual=null;
    private ArrayList<Integer> carrito = new ArrayList<Integer>();
    private ListaCines cines;
    private CineArbol cine;
    private PeliAr peli;
    private Seleccionhorario daddy;
    private Usuario user;

    DefaultListModel modelo= new DefaultListModel();
    
    
    
    /**
     * Creates new form SeleccionSillas
     */
    public SeleccionSillas(ListaCines cines, CineArbol cine, PeliAr peli, Horario hora, Seleccionhorario daddy, Usuario user) {
        this.actual=hora;
        this.cines=cines;
        this.peli=peli;
        this.daddy=daddy;
        this.cine=cine;
        this.peli=peli;
        
        this.user=user;

        initComponents();
        if(this.actual.getSillas()[0].isOcupado()){
        A1.setBackground(Color.red);
        }
        A1.setName("A1");
        
         if(this.actual.getSillas()[1].isOcupado()){
        A2.setBackground(Color.red);
        }
        A2.setName("A2");
        
         if(this.actual.getSillas()[2].isOcupado()){
        A3.setBackground(Color.red);
        }
        A3.setName("A3");
        
         if(this.actual.getSillas()[3].isOcupado()){
        A4.setBackground(Color.red);
        }
        A4.setName("A4");
        
         if(this.actual.getSillas()[4].isOcupado()){
        A5.setBackground(Color.red);
        }
        A5.setName("A5");
        
         if(this.actual.getSillas()[5].isOcupado()){
        A6.setBackground(Color.red);
        }
        A6.setName("A6");
        
         if(this.actual.getSillas()[6].isOcupado()){
        A7.setBackground(Color.red);
        }
        A7.setName("A7");
        
         if(this.actual.getSillas()[7].isOcupado()){
        A8.setBackground(Color.red);
        }
        A8.setName("A8");
        
         if(this.actual.getSillas()[8].isOcupado()){
        A9.setBackground(Color.red);
        }
        A9.setName("A9");
        
         if(this.actual.getSillas()[9].isOcupado()){
        A10.setBackground(Color.red);
        }
        A10.setName("A10");
        
         if(this.actual.getSillas()[10].isOcupado()){
        B1.setBackground(Color.red);
        }
        B1.setName("B1");
        
         if(this.actual.getSillas()[11].isOcupado()){
        B2.setBackground(Color.red);
        }
        B2.setName("B2");
        
         if(this.actual.getSillas()[12].isOcupado()){
        B3.setBackground(Color.red);
        }
        B3.setName("B3");
        
         if(this.actual.getSillas()[13].isOcupado()){
        B4.setBackground(Color.red);
        }
        B4.setName("B4");
        
         if(this.actual.getSillas()[14].isOcupado()){
        B5.setBackground(Color.red);
        }
        B5.setName("B5");
        
         if(this.actual.getSillas()[15].isOcupado()){
        B6.setBackground(Color.red);
        }
        B6.setName("B6");
        
         if(this.actual.getSillas()[16].isOcupado()){
        B7.setBackground(Color.red);
        }
        B7.setName("B7");
        
         if(this.actual.getSillas()[17].isOcupado()){
        B8.setBackground(Color.red);
        }
        B8.setName("B8");
        
         if(this.actual.getSillas()[18].isOcupado()){
        B9.setBackground(Color.red);
        }
        B9.setName("B9");
        
         if(this.actual.getSillas()[19].isOcupado()){
        B10.setBackground(Color.red);
        }
        B10.setName("B10");
        
         if(this.actual.getSillas()[20].isOcupado()){
        C1.setBackground(Color.red);
        }
        C1.setName("C1");
        
         if(this.actual.getSillas()[21].isOcupado()){
        C2.setBackground(Color.red);
        }
        C2.setName("C2");
        
         if(this.actual.getSillas()[22].isOcupado()){
        C3.setBackground(Color.red);
        }
        C3.setName("C3");
        
         if(this.actual.getSillas()[23].isOcupado()){
        C4.setBackground(Color.red);
        }
        C4.setName("C4");
        
         if(this.actual.getSillas()[24].isOcupado()){
        C5.setBackground(Color.red);
        }
        C5.setName("C5");
        
         if(this.actual.getSillas()[25].isOcupado()){
        C6.setBackground(Color.red);
        }
        C6.setName("C6");
        
         
         if(this.actual.getSillas()[26].isOcupado()){
        C7.setBackground(Color.red);
        }
        C7.setName("C7");
        
         if(this.actual.getSillas()[27].isOcupado()){
        C8.setBackground(Color.red);
        }
        C8.setName("C8");
        
         if(this.actual.getSillas()[28].isOcupado()){
        C9.setBackground(Color.red);
        }
        C9.setName("C9");
        
         if(this.actual.getSillas()[29].isOcupado()){
        C10.setBackground(Color.red);
        }
        C10.setName("C10");
        
         if(this.actual.getSillas()[30].isOcupado()){
        D1.setBackground(Color.red);
        }
        D1.setName("D1");
        
         if(this.actual.getSillas()[31].isOcupado()){
        D2.setBackground(Color.red);
        }
        D2.setName("D2");
        
         if(this.actual.getSillas()[32].isOcupado()){
        D3.setBackground(Color.red);
        }
        D3.setName("D3");
        
         if(this.actual.getSillas()[33].isOcupado()){
        D4.setBackground(Color.red);
        }
        D4.setName("D4");
        
         if(this.actual.getSillas()[34].isOcupado()){
        D5.setBackground(Color.red);
        }
        D5.setName("D5");
        
         if(this.actual.getSillas()[35].isOcupado()){
        D6.setBackground(Color.red);
        }
        D6.setName("D6");
        
         if(this.actual.getSillas()[36].isOcupado()){
        D7.setBackground(Color.red);
        }
        D7.setName("D7");
        
         if(this.actual.getSillas()[37].isOcupado()){
        D8.setBackground(Color.red);
        }
        D8.setName("D8");
        
         if(this.actual.getSillas()[38].isOcupado()){
        D9.setBackground(Color.red);
        }
        D9.setName("D9");
        
         if(this.actual.getSillas()[39].isOcupado()){
        D10.setBackground(Color.red);
        }
        D10.setName("D10");
        
         if(this.actual.getSillas()[40].isOcupado()){
        E1.setBackground(Color.red);
        }
        E1.setName("E1");
        
         if(this.actual.getSillas()[41].isOcupado()){
        E2.setBackground(Color.red);
        }
        E2.setName("E2");
        
         if(this.actual.getSillas()[42].isOcupado()){
        E3.setBackground(Color.red);
        }
        E3.setName("E3");
        
         if(this.actual.getSillas()[43].isOcupado()){
        E4.setBackground(Color.red);
        }
        E4.setName("E4");
        
         if(this.actual.getSillas()[44].isOcupado()){
        E5.setBackground(Color.red);
        }
        E5.setName("E5");
        
         if(this.actual.getSillas()[45].isOcupado()){
        E6.setBackground(Color.red);
        }
        E6.setName("E6");
        
         if(this.actual.getSillas()[46].isOcupado()){
        E7.setBackground(Color.red);
        }
        E7.setName("E7");
        
         if(this.actual.getSillas()[47].isOcupado()){
        E8.setBackground(Color.red);
        }
        E8.setName("E8");
        
         if(this.actual.getSillas()[48].isOcupado()){
        E9.setBackground(Color.red);
        }
        E9.setName("E9");
        
         if(this.actual.getSillas()[49].isOcupado()){
        E10.setBackground(Color.red);
        }
        E10.setName("E10");
        
         if(this.actual.getSillas()[50].isOcupado()){
        F1.setBackground(Color.red);
        }
        F1.setName("F1");
        
         if(this.actual.getSillas()[51].isOcupado()){
        F2.setBackground(Color.red);
        }
        F2.setName("F2");
        
         if(this.actual.getSillas()[52].isOcupado()){
        F3.setBackground(Color.red);
        }
        F3.setName("F3");
        
         if(this.actual.getSillas()[53].isOcupado()){
        F4.setBackground(Color.red);
        }
         F4.setName("F4");
         if(this.actual.getSillas()[54].isOcupado()){
        F5.setBackground(Color.red);
        }
         F5.setName("F5");
         if(this.actual.getSillas()[55].isOcupado()){
        F6.setBackground(Color.red);
        }
         F6.setName("F6");
         if(this.actual.getSillas()[56].isOcupado()){
        F7.setBackground(Color.red);
        }
         F7.setName("F7");
         if(this.actual.getSillas()[57].isOcupado()){
        F8.setBackground(Color.red);
        }
         F8.setName("F8");
         if(this.actual.getSillas()[58].isOcupado()){
        F9.setBackground(Color.red);
        }
         F9.setName("F9");
         if(this.actual.getSillas()[59].isOcupado()){
        F10.setBackground(Color.red);
        }
         F10.setName("F10");
         if(this.actual.getSillas()[60].isOcupado()){
        G1.setBackground(Color.red);
        }
         G1.setName("G1");
         if(this.actual.getSillas()[61].isOcupado()){
        G2.setBackground(Color.red);
        }
         G2.setName("G2");
         if(this.actual.getSillas()[62].isOcupado()){
        G3.setBackground(Color.red);
        }
         G3.setName("G3");
         if(this.actual.getSillas()[63].isOcupado()){
        G4.setBackground(Color.red);
        }
         G4.setName("G4");
         if(this.actual.getSillas()[64].isOcupado()){
        G5.setBackground(Color.red);
        }
         G5.setName("G5");
         if(this.actual.getSillas()[65].isOcupado()){
        G6.setBackground(Color.red);
        }
         G6.setName("G6");
         if(this.actual.getSillas()[66].isOcupado()){
        G7.setBackground(Color.red);
        }
         G7.setName("G7");
         if(this.actual.getSillas()[67].isOcupado()){
        G8.setBackground(Color.red);
        }
         G8.setName("G8");
         if(this.actual.getSillas()[68].isOcupado()){
        G9.setBackground(Color.red);
        }
         G9.setName("G9");
         if(this.actual.getSillas()[69].isOcupado()){
        G10.setBackground(Color.red);
        }
         G10.setName("G10");
         if(this.actual.getSillas()[70].isOcupado()){
        H1.setBackground(Color.red);
        }
         H1.setName("H1");
         if(this.actual.getSillas()[71].isOcupado()){
        H2.setBackground(Color.red);
        }
          H2.setName("H2");
         if(this.actual.getSillas()[72].isOcupado()){
        H3.setBackground(Color.red);
        }
          H3.setName("H3");
         if(this.actual.getSillas()[73].isOcupado()){
        H4.setBackground(Color.red);
        }
          H4.setName("H4");
         if(this.actual.getSillas()[74].isOcupado()){
        H5.setBackground(Color.red);
        }
          H5.setName("H5");
         if(this.actual.getSillas()[75].isOcupado()){
        H6.setBackground(Color.red);
        }
          H6.setName("H6");
         if(this.actual.getSillas()[76].isOcupado()){
        H7.setBackground(Color.red);
        }
          H7.setName("H7");
         if(this.actual.getSillas()[77].isOcupado()){
        H8.setBackground(Color.red);
        }
          H8.setName("H8");
         if(this.actual.getSillas()[78].isOcupado()){
        H9.setBackground(Color.red);
        }
          H9.setName("H9");
         if(this.actual.getSillas()[79].isOcupado()){
        H10.setBackground(Color.red);
        }
          H10.setName("H10");
         if(this.actual.getSillas()[80].isOcupado()){
        I1.setBackground(Color.red);
        }
          I1.setName("I1");
         if(this.actual.getSillas()[81].isOcupado()){
        I2.setBackground(Color.red);
        }
          I2.setName("I2");
         if(this.actual.getSillas()[82].isOcupado()){
        I3.setBackground(Color.red);
        }
          I3.setName("I3");
         if(this.actual.getSillas()[83].isOcupado()){
        I4.setBackground(Color.red);
        }
          I4.setName("I4");
         if(this.actual.getSillas()[84].isOcupado()){
        I5.setBackground(Color.red);
        }
          I5.setName("I5");
         if(this.actual.getSillas()[85].isOcupado()){
        I6.setBackground(Color.red);
        }
          I6.setName("I6");
         if(this.actual.getSillas()[86].isOcupado()){
        I7.setBackground(Color.red);
        }
          I7.setName("I7");
         if(this.actual.getSillas()[87].isOcupado()){
        I8.setBackground(Color.red);
        }
          I8.setName("I8");
         if(this.actual.getSillas()[88].isOcupado()){
        I9.setBackground(Color.red);
        }
          I9.setName("I9");
         if(this.actual.getSillas()[89].isOcupado()){
        I10.setBackground(Color.red);
        }
          I10.setName("I10");
         if(this.actual.getSillas()[90].isOcupado()){
        J1.setBackground(Color.red);
        }
          J1.setName("J1");
         if(this.actual.getSillas()[91].isOcupado()){
        J2.setBackground(Color.red);
        }
         J2.setName("J2");
         if(this.actual.getSillas()[92].isOcupado()){
        J3.setBackground(Color.red);
        }
         J3.setName("J3");
         if(this.actual.getSillas()[93].isOcupado()){
        J4.setBackground(Color.red);
        }
         J4.setName("J4");
         if(this.actual.getSillas()[94].isOcupado()){
        J5.setBackground(Color.red);
        }
         J5.setName("J5");
         if(this.actual.getSillas()[95].isOcupado()){
        J6.setBackground(Color.red);
        }
         J6.setName("J6");
         if(this.actual.getSillas()[96].isOcupado()){
        J7.setBackground(Color.red);
        }
         J7.setName("J7");
         if(this.actual.getSillas()[97].isOcupado()){
        J8.setBackground(Color.red);
        }
         J8.setName("J8");
         if(this.actual.getSillas()[98].isOcupado()){
        J9.setBackground(Color.red);
        }
         J9.setName("J9");
         if(this.actual.getSillas()[99].isOcupado()){
        J10.setBackground(Color.red);
         }
         J1.setName("J1");
        modelo=new DefaultListModel();
        this.listacarro.setModel(modelo);
        
         
         
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listacarro = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtATotal = new javax.swing.JTextArea();
        btnCalcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        A1 = new javax.swing.JToggleButton();
        A2 = new javax.swing.JToggleButton();
        A3 = new javax.swing.JToggleButton();
        A4 = new javax.swing.JToggleButton();
        A5 = new javax.swing.JToggleButton();
        A6 = new javax.swing.JToggleButton();
        A7 = new javax.swing.JToggleButton();
        A8 = new javax.swing.JToggleButton();
        A9 = new javax.swing.JToggleButton();
        A10 = new javax.swing.JToggleButton();
        B2 = new javax.swing.JToggleButton();
        B3 = new javax.swing.JToggleButton();
        B4 = new javax.swing.JToggleButton();
        B5 = new javax.swing.JToggleButton();
        B6 = new javax.swing.JToggleButton();
        B7 = new javax.swing.JToggleButton();
        B8 = new javax.swing.JToggleButton();
        B9 = new javax.swing.JToggleButton();
        B10 = new javax.swing.JToggleButton();
        B1 = new javax.swing.JToggleButton();
        C2 = new javax.swing.JToggleButton();
        C3 = new javax.swing.JToggleButton();
        C4 = new javax.swing.JToggleButton();
        C5 = new javax.swing.JToggleButton();
        C6 = new javax.swing.JToggleButton();
        C7 = new javax.swing.JToggleButton();
        C8 = new javax.swing.JToggleButton();
        C9 = new javax.swing.JToggleButton();
        C10 = new javax.swing.JToggleButton();
        C1 = new javax.swing.JToggleButton();
        F1 = new javax.swing.JToggleButton();
        E2 = new javax.swing.JToggleButton();
        E3 = new javax.swing.JToggleButton();
        E4 = new javax.swing.JToggleButton();
        E5 = new javax.swing.JToggleButton();
        E6 = new javax.swing.JToggleButton();
        E7 = new javax.swing.JToggleButton();
        E8 = new javax.swing.JToggleButton();
        E9 = new javax.swing.JToggleButton();
        E10 = new javax.swing.JToggleButton();
        D1 = new javax.swing.JToggleButton();
        E1 = new javax.swing.JToggleButton();
        F2 = new javax.swing.JToggleButton();
        D2 = new javax.swing.JToggleButton();
        F3 = new javax.swing.JToggleButton();
        D3 = new javax.swing.JToggleButton();
        F4 = new javax.swing.JToggleButton();
        D4 = new javax.swing.JToggleButton();
        F5 = new javax.swing.JToggleButton();
        D5 = new javax.swing.JToggleButton();
        F6 = new javax.swing.JToggleButton();
        D6 = new javax.swing.JToggleButton();
        F7 = new javax.swing.JToggleButton();
        D7 = new javax.swing.JToggleButton();
        F8 = new javax.swing.JToggleButton();
        D8 = new javax.swing.JToggleButton();
        F9 = new javax.swing.JToggleButton();
        D9 = new javax.swing.JToggleButton();
        F10 = new javax.swing.JToggleButton();
        D10 = new javax.swing.JToggleButton();
        I1 = new javax.swing.JToggleButton();
        H2 = new javax.swing.JToggleButton();
        H3 = new javax.swing.JToggleButton();
        H4 = new javax.swing.JToggleButton();
        H5 = new javax.swing.JToggleButton();
        H6 = new javax.swing.JToggleButton();
        H7 = new javax.swing.JToggleButton();
        H8 = new javax.swing.JToggleButton();
        H9 = new javax.swing.JToggleButton();
        H10 = new javax.swing.JToggleButton();
        G1 = new javax.swing.JToggleButton();
        H1 = new javax.swing.JToggleButton();
        I2 = new javax.swing.JToggleButton();
        G2 = new javax.swing.JToggleButton();
        I3 = new javax.swing.JToggleButton();
        G3 = new javax.swing.JToggleButton();
        I4 = new javax.swing.JToggleButton();
        G4 = new javax.swing.JToggleButton();
        I5 = new javax.swing.JToggleButton();
        G5 = new javax.swing.JToggleButton();
        I6 = new javax.swing.JToggleButton();
        G6 = new javax.swing.JToggleButton();
        I7 = new javax.swing.JToggleButton();
        G7 = new javax.swing.JToggleButton();
        I8 = new javax.swing.JToggleButton();
        G8 = new javax.swing.JToggleButton();
        I9 = new javax.swing.JToggleButton();
        G9 = new javax.swing.JToggleButton();
        I10 = new javax.swing.JToggleButton();
        G10 = new javax.swing.JToggleButton();
        J1 = new javax.swing.JToggleButton();
        J2 = new javax.swing.JToggleButton();
        J3 = new javax.swing.JToggleButton();
        J4 = new javax.swing.JToggleButton();
        J5 = new javax.swing.JToggleButton();
        J6 = new javax.swing.JToggleButton();
        J7 = new javax.swing.JToggleButton();
        J8 = new javax.swing.JToggleButton();
        J9 = new javax.swing.JToggleButton();
        J10 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Compra de sillas");

        btnComprar.setText("Comprar");
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listacarro);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccionadas:");

        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor total:");

        txtATotal.setColumns(20);
        txtATotal.setRows(5);
        jScrollPane2.setViewportView(txtATotal);

        btnCalcular.setText("Calcular");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(49, 84, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pantalla");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        A1.setBackground(new java.awt.Color(0, 0, 0));
        A1.setForeground(new java.awt.Color(0, 0, 0));
        A1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setBackground(new java.awt.Color(0, 0, 0));
        A2.setForeground(new java.awt.Color(0, 0, 0));
        A2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setBackground(new java.awt.Color(0, 0, 0));
        A3.setForeground(new java.awt.Color(0, 0, 0));
        A3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A4.setBackground(new java.awt.Color(0, 0, 0));
        A4.setForeground(new java.awt.Color(0, 0, 0));
        A4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        A5.setBackground(new java.awt.Color(0, 0, 0));
        A5.setForeground(new java.awt.Color(0, 0, 0));
        A5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        A6.setBackground(new java.awt.Color(0, 0, 0));
        A6.setForeground(new java.awt.Color(0, 0, 0));
        A6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        A7.setBackground(new java.awt.Color(0, 0, 0));
        A7.setForeground(new java.awt.Color(0, 0, 0));
        A7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        A8.setBackground(new java.awt.Color(0, 0, 0));
        A8.setForeground(new java.awt.Color(0, 0, 0));
        A8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        A9.setBackground(new java.awt.Color(0, 0, 0));
        A9.setForeground(new java.awt.Color(0, 0, 0));
        A9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        A10.setBackground(new java.awt.Color(0, 0, 0));
        A10.setForeground(new java.awt.Color(0, 0, 0));
        A10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A10ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(0, 0, 0));
        B2.setForeground(new java.awt.Color(0, 0, 0));
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(0, 0, 0));
        B3.setForeground(new java.awt.Color(0, 0, 0));
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(0, 0, 0));
        B4.setForeground(new java.awt.Color(0, 0, 0));
        B4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(0, 0, 0));
        B5.setForeground(new java.awt.Color(0, 0, 0));
        B5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(0, 0, 0));
        B6.setForeground(new java.awt.Color(0, 0, 0));
        B6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(0, 0, 0));
        B7.setForeground(new java.awt.Color(0, 0, 0));
        B7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(0, 0, 0));
        B8.setForeground(new java.awt.Color(0, 0, 0));
        B8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(0, 0, 0));
        B9.setForeground(new java.awt.Color(0, 0, 0));
        B9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B10.setBackground(new java.awt.Color(0, 0, 0));
        B10.setForeground(new java.awt.Color(0, 0, 0));
        B10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(0, 0, 0));
        B1.setForeground(new java.awt.Color(0, 0, 0));
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        C2.setBackground(new java.awt.Color(0, 0, 0));
        C2.setForeground(new java.awt.Color(0, 0, 0));
        C2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setBackground(new java.awt.Color(0, 0, 0));
        C3.setForeground(new java.awt.Color(0, 0, 0));
        C3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C4.setBackground(new java.awt.Color(0, 0, 0));
        C4.setForeground(new java.awt.Color(0, 0, 0));
        C4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C5.setBackground(new java.awt.Color(0, 0, 0));
        C5.setForeground(new java.awt.Color(0, 0, 0));
        C5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        C6.setBackground(new java.awt.Color(0, 0, 0));
        C6.setForeground(new java.awt.Color(0, 0, 0));
        C6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C7.setBackground(new java.awt.Color(0, 0, 0));
        C7.setForeground(new java.awt.Color(0, 0, 0));
        C7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        C8.setBackground(new java.awt.Color(0, 0, 0));
        C8.setForeground(new java.awt.Color(0, 0, 0));
        C8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        C9.setBackground(new java.awt.Color(0, 0, 0));
        C9.setForeground(new java.awt.Color(0, 0, 0));
        C9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        C10.setBackground(new java.awt.Color(0, 0, 0));
        C10.setForeground(new java.awt.Color(0, 0, 0));
        C10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });

        C1.setBackground(new java.awt.Color(0, 0, 0));
        C1.setForeground(new java.awt.Color(0, 0, 0));
        C1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        F1.setBackground(new java.awt.Color(0, 0, 0));
        F1.setForeground(new java.awt.Color(0, 0, 0));
        F1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        E2.setBackground(new java.awt.Color(0, 0, 0));
        E2.setForeground(new java.awt.Color(0, 0, 0));
        E2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        E3.setBackground(new java.awt.Color(0, 0, 0));
        E3.setForeground(new java.awt.Color(0, 0, 0));
        E3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        E4.setBackground(new java.awt.Color(0, 0, 0));
        E4.setForeground(new java.awt.Color(0, 0, 0));
        E4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        E5.setBackground(new java.awt.Color(0, 0, 0));
        E5.setForeground(new java.awt.Color(0, 0, 0));
        E5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });

        E6.setBackground(new java.awt.Color(0, 0, 0));
        E6.setForeground(new java.awt.Color(0, 0, 0));
        E6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });

        E7.setBackground(new java.awt.Color(0, 0, 0));
        E7.setForeground(new java.awt.Color(0, 0, 0));
        E7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E7ActionPerformed(evt);
            }
        });

        E8.setBackground(new java.awt.Color(0, 0, 0));
        E8.setForeground(new java.awt.Color(0, 0, 0));
        E8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E8ActionPerformed(evt);
            }
        });

        E9.setBackground(new java.awt.Color(0, 0, 0));
        E9.setForeground(new java.awt.Color(0, 0, 0));
        E9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E9ActionPerformed(evt);
            }
        });

        E10.setBackground(new java.awt.Color(0, 0, 0));
        E10.setForeground(new java.awt.Color(0, 0, 0));
        E10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E10ActionPerformed(evt);
            }
        });

        D1.setBackground(new java.awt.Color(0, 0, 0));
        D1.setForeground(new java.awt.Color(0, 0, 0));
        D1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        E1.setBackground(new java.awt.Color(0, 0, 0));
        E1.setForeground(new java.awt.Color(0, 0, 0));
        E1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        F2.setBackground(new java.awt.Color(0, 0, 0));
        F2.setForeground(new java.awt.Color(0, 0, 0));
        F2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        D2.setBackground(new java.awt.Color(0, 0, 0));
        D2.setForeground(new java.awt.Color(0, 0, 0));
        D2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        F3.setBackground(new java.awt.Color(0, 0, 0));
        F3.setForeground(new java.awt.Color(0, 0, 0));
        F3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        D3.setBackground(new java.awt.Color(0, 0, 0));
        D3.setForeground(new java.awt.Color(0, 0, 0));
        D3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        F4.setBackground(new java.awt.Color(0, 0, 0));
        F4.setForeground(new java.awt.Color(0, 0, 0));
        F4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        D4.setBackground(new java.awt.Color(0, 0, 0));
        D4.setForeground(new java.awt.Color(0, 0, 0));
        D4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        F5.setBackground(new java.awt.Color(0, 0, 0));
        F5.setForeground(new java.awt.Color(0, 0, 0));
        F5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });

        D5.setBackground(new java.awt.Color(0, 0, 0));
        D5.setForeground(new java.awt.Color(0, 0, 0));
        D5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        F6.setBackground(new java.awt.Color(0, 0, 0));
        F6.setForeground(new java.awt.Color(0, 0, 0));
        F6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });

        D6.setBackground(new java.awt.Color(0, 0, 0));
        D6.setForeground(new java.awt.Color(0, 0, 0));
        D6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });

        F7.setBackground(new java.awt.Color(0, 0, 0));
        F7.setForeground(new java.awt.Color(0, 0, 0));
        F7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F7ActionPerformed(evt);
            }
        });

        D7.setBackground(new java.awt.Color(0, 0, 0));
        D7.setForeground(new java.awt.Color(0, 0, 0));
        D7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });

        F8.setBackground(new java.awt.Color(0, 0, 0));
        F8.setForeground(new java.awt.Color(0, 0, 0));
        F8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F8ActionPerformed(evt);
            }
        });

        D8.setBackground(new java.awt.Color(0, 0, 0));
        D8.setForeground(new java.awt.Color(0, 0, 0));
        D8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });

        F9.setBackground(new java.awt.Color(0, 0, 0));
        F9.setForeground(new java.awt.Color(0, 0, 0));
        F9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F9ActionPerformed(evt);
            }
        });

        D9.setBackground(new java.awt.Color(0, 0, 0));
        D9.setForeground(new java.awt.Color(0, 0, 0));
        D9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D9ActionPerformed(evt);
            }
        });

        F10.setBackground(new java.awt.Color(0, 0, 0));
        F10.setForeground(new java.awt.Color(0, 0, 0));
        F10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F10ActionPerformed(evt);
            }
        });

        D10.setBackground(new java.awt.Color(0, 0, 0));
        D10.setForeground(new java.awt.Color(0, 0, 0));
        D10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D10ActionPerformed(evt);
            }
        });

        I1.setBackground(new java.awt.Color(0, 0, 0));
        I1.setForeground(new java.awt.Color(0, 0, 0));
        I1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I1ActionPerformed(evt);
            }
        });

        H2.setBackground(new java.awt.Color(0, 0, 0));
        H2.setForeground(new java.awt.Color(0, 0, 0));
        H2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        H2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2ActionPerformed(evt);
            }
        });

        H3.setBackground(new java.awt.Color(0, 0, 0));
        H3.setForeground(new java.awt.Color(0, 0, 0));
        H3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        H3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H3ActionPerformed(evt);
            }
        });

        H4.setBackground(new java.awt.Color(0, 0, 0));
        H4.setForeground(new java.awt.Color(0, 0, 0));
        H4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        H4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H4ActionPerformed(evt);
            }
        });

        H5.setBackground(new java.awt.Color(0, 0, 0));
        H5.setForeground(new java.awt.Color(0, 0, 0));
        H5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        H5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H5ActionPerformed(evt);
            }
        });

        H6.setBackground(new java.awt.Color(0, 0, 0));
        H6.setForeground(new java.awt.Color(0, 0, 0));
        H6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        H6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H6ActionPerformed(evt);
            }
        });

        H7.setBackground(new java.awt.Color(0, 0, 0));
        H7.setForeground(new java.awt.Color(0, 0, 0));
        H7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        H7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H7ActionPerformed(evt);
            }
        });

        H8.setBackground(new java.awt.Color(0, 0, 0));
        H8.setForeground(new java.awt.Color(0, 0, 0));
        H8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        H8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H8ActionPerformed(evt);
            }
        });

        H9.setBackground(new java.awt.Color(0, 0, 0));
        H9.setForeground(new java.awt.Color(0, 0, 0));
        H9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        H9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H9ActionPerformed(evt);
            }
        });

        H10.setBackground(new java.awt.Color(0, 0, 0));
        H10.setForeground(new java.awt.Color(0, 0, 0));
        H10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        H10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H10ActionPerformed(evt);
            }
        });

        G1.setBackground(new java.awt.Color(0, 0, 0));
        G1.setForeground(new java.awt.Color(0, 0, 0));
        G1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        H1.setBackground(new java.awt.Color(0, 0, 0));
        H1.setForeground(new java.awt.Color(0, 0, 0));
        H1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });

        I2.setBackground(new java.awt.Color(0, 0, 0));
        I2.setForeground(new java.awt.Color(0, 0, 0));
        I2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        I2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I2ActionPerformed(evt);
            }
        });

        G2.setBackground(new java.awt.Color(0, 0, 0));
        G2.setForeground(new java.awt.Color(0, 0, 0));
        G2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        I3.setBackground(new java.awt.Color(0, 0, 0));
        I3.setForeground(new java.awt.Color(0, 0, 0));
        I3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        I3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I3ActionPerformed(evt);
            }
        });

        G3.setBackground(new java.awt.Color(0, 0, 0));
        G3.setForeground(new java.awt.Color(0, 0, 0));
        G3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });

        I4.setBackground(new java.awt.Color(0, 0, 0));
        I4.setForeground(new java.awt.Color(0, 0, 0));
        I4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        I4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I4ActionPerformed(evt);
            }
        });

        G4.setBackground(new java.awt.Color(0, 0, 0));
        G4.setForeground(new java.awt.Color(0, 0, 0));
        G4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });

        I5.setBackground(new java.awt.Color(0, 0, 0));
        I5.setForeground(new java.awt.Color(0, 0, 0));
        I5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        I5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I5ActionPerformed(evt);
            }
        });

        G5.setBackground(new java.awt.Color(0, 0, 0));
        G5.setForeground(new java.awt.Color(0, 0, 0));
        G5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });

        I6.setBackground(new java.awt.Color(0, 0, 0));
        I6.setForeground(new java.awt.Color(0, 0, 0));
        I6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        I6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I6ActionPerformed(evt);
            }
        });

        G6.setBackground(new java.awt.Color(0, 0, 0));
        G6.setForeground(new java.awt.Color(0, 0, 0));
        G6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G6ActionPerformed(evt);
            }
        });

        I7.setBackground(new java.awt.Color(0, 0, 0));
        I7.setForeground(new java.awt.Color(0, 0, 0));
        I7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        I7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I7ActionPerformed(evt);
            }
        });

        G7.setBackground(new java.awt.Color(0, 0, 0));
        G7.setForeground(new java.awt.Color(0, 0, 0));
        G7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G7ActionPerformed(evt);
            }
        });

        I8.setBackground(new java.awt.Color(0, 0, 0));
        I8.setForeground(new java.awt.Color(0, 0, 0));
        I8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        I8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I8ActionPerformed(evt);
            }
        });

        G8.setBackground(new java.awt.Color(0, 0, 0));
        G8.setForeground(new java.awt.Color(0, 0, 0));
        G8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G8ActionPerformed(evt);
            }
        });

        I9.setBackground(new java.awt.Color(0, 0, 0));
        I9.setForeground(new java.awt.Color(0, 0, 0));
        I9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        I9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I9ActionPerformed(evt);
            }
        });

        G9.setBackground(new java.awt.Color(0, 0, 0));
        G9.setForeground(new java.awt.Color(0, 0, 0));
        G9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G9ActionPerformed(evt);
            }
        });

        I10.setBackground(new java.awt.Color(0, 0, 0));
        I10.setForeground(new java.awt.Color(0, 0, 0));
        I10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        I10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I10ActionPerformed(evt);
            }
        });

        G10.setBackground(new java.awt.Color(0, 0, 0));
        G10.setForeground(new java.awt.Color(0, 0, 0));
        G10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        G10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G10ActionPerformed(evt);
            }
        });

        J1.setBackground(new java.awt.Color(0, 0, 0));
        J1.setForeground(new java.awt.Color(0, 0, 0));
        J1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });

        J2.setBackground(new java.awt.Color(0, 0, 0));
        J2.setForeground(new java.awt.Color(0, 0, 0));
        J2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J2ActionPerformed(evt);
            }
        });

        J3.setBackground(new java.awt.Color(0, 0, 0));
        J3.setForeground(new java.awt.Color(0, 0, 0));
        J3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J3ActionPerformed(evt);
            }
        });

        J4.setBackground(new java.awt.Color(0, 0, 0));
        J4.setForeground(new java.awt.Color(0, 0, 0));
        J4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J4ActionPerformed(evt);
            }
        });

        J5.setBackground(new java.awt.Color(0, 0, 0));
        J5.setForeground(new java.awt.Color(0, 0, 0));
        J5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J5ActionPerformed(evt);
            }
        });

        J6.setBackground(new java.awt.Color(0, 0, 0));
        J6.setForeground(new java.awt.Color(0, 0, 0));
        J6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J6ActionPerformed(evt);
            }
        });

        J7.setBackground(new java.awt.Color(0, 0, 0));
        J7.setForeground(new java.awt.Color(0, 0, 0));
        J7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J7ActionPerformed(evt);
            }
        });

        J8.setBackground(new java.awt.Color(0, 0, 0));
        J8.setForeground(new java.awt.Color(0, 0, 0));
        J8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J8ActionPerformed(evt);
            }
        });

        J9.setBackground(new java.awt.Color(0, 0, 0));
        J9.setForeground(new java.awt.Color(0, 0, 0));
        J9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J9ActionPerformed(evt);
            }
        });

        J10.setBackground(new java.awt.Color(0, 0, 0));
        J10.setForeground(new java.awt.Color(0, 0, 0));
        J10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        J10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(D9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(F9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(H9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(H10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        int numero=0;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.A1;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            String elemento=boton.getName();
            modelo.addElement(elemento);
            System.out.println(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        int numero=1;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.A2;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }

    }//GEN-LAST:event_A2ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        int numero=10;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.B1;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
                        modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }

    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        int numero=11;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.B2;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        int numero=20;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.C1;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
       int numero=21;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.C2;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_C2ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
        int numero=30;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.D1;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        // TODO add your handling code here:
        int numero=31;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.D2;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_D2ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
       int numero=3;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.A4;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_A4ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
 int numero=2;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.A3;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_A3ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        // TODO add your handling code here:
        int numero=4;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.A5;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        // TODO add your handling code here:
       int numero=5;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.A6;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_A6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        // TODO add your handling code here:
       int numero=6;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.A7;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_A7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        // TODO add your handling code here:
        int numero=7;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.A8;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_A8ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        // TODO add your handling code here:
                int numero=8;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.A9;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_A9ActionPerformed

    private void A10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A10ActionPerformed
        // TODO add your handling code here:
                int numero=9;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.A10;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_A10ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
                int numero=12;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.B3;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
                        int numero=13;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.B4;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
                        int numero=14;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.B5;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
                        int numero=15;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.B6;
        
        
        if(!sillaA.isOcupado() && boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
                        int numero=16;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.B7;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
                        int numero=17;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.B8;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
                        int numero=18;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.B9;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_B9ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        // TODO add your handling code here:
                        int numero=19;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.B10;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_B10ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        int numero=22;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.C3;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
        int numero=23;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.C4;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
        int numero=24;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.C5;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
        int numero=25;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.C6;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_C6ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
        int numero=26;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.C7;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
        int numero=27;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.C8;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_C8ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        // TODO add your handling code here:
        int numero=28;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.C9;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_C9ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        // TODO add your handling code here:
        int numero=29;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.C10;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_C10ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        // TODO add your handling code here:
        int numero=50;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.F1;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_F1ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        // TODO add your handling code here:
        int numero=41;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.E2;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_E2ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        // TODO add your handling code here:
                int numero=42;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.E3;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_E3ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        // TODO add your handling code here:
                int numero=43;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.E4;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_E4ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
        // TODO add your handling code here:
                int numero=44;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.E5;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_E5ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
        // TODO add your handling code here:
                int numero=45;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.E6;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_E6ActionPerformed

    private void E7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E7ActionPerformed
        // TODO add your handling code here:
                int numero=46;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.E7;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_E7ActionPerformed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        // TODO add your handling code here:
                int numero=47;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.E8;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_E8ActionPerformed

    private void E9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E9ActionPerformed
        // TODO add your handling code here:
                int numero=48;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.E9;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_E9ActionPerformed

    private void E10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E10ActionPerformed
        // TODO add your handling code here:
                int numero=49;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.E10;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_E10ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        // TODO add your handling code here:
                int numero=40;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.E1;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_E1ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        // TODO add your handling code here:
                int numero=51;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.F2;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_F2ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        // TODO add your handling code here:
         int numero=52;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.F3;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_F3ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        // TODO add your handling code here:
                        int numero=32;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.D3;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_D3ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        // TODO add your handling code here:
                        int numero=53;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.F4;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_F4ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        // TODO add your handling code here:
                        int numero=33;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.D4;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_D4ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        // TODO add your handling code here:
                        int numero=54;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.F5;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_F5ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        // TODO add your handling code here:
                        int numero=34;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.D5;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_D5ActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
        // TODO add your handling code here:
                        int numero=55;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.F6;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_F6ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        // TODO add your handling code here:
                        int numero=35;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.D6;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_D6ActionPerformed

    private void F7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F7ActionPerformed
        // TODO add your handling code here:
                        int numero=56;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.F7;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_F7ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        // TODO add your handling code here:
                        int numero=36;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.D7;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_D7ActionPerformed

    private void F8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F8ActionPerformed
        // TODO add your handling code here:
                        int numero=57;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.F8;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_F8ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        // TODO add your handling code here:
                        int numero=37;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.D8;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_D8ActionPerformed

    private void F9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F9ActionPerformed
        // TODO add your handling code here:
                        int numero=58;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.F9;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_F9ActionPerformed

    private void D9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D9ActionPerformed
        // TODO add your handling code here:
                        int numero=38;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.D9;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_D9ActionPerformed

    private void F10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F10ActionPerformed
        // TODO add your handling code here:
                        int numero=59;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.F10;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_F10ActionPerformed

    private void D10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D10ActionPerformed
        // TODO add your handling code here:
                        int numero=39;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.D10;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_D10ActionPerformed

    private void I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I1ActionPerformed
        // TODO add your handling code here:
                        int numero=80;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.I1;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_I1ActionPerformed

    private void H2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2ActionPerformed
        // TODO add your handling code here:
                        int numero=71;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.H2;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_H2ActionPerformed

    private void H3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H3ActionPerformed
        // TODO add your handling code here:
                        int numero=72;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.H3;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_H3ActionPerformed

    private void H4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H4ActionPerformed
        // TODO add your handling code here:
         int numero=73;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.H4;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_H4ActionPerformed

    private void H5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H5ActionPerformed
        // TODO add your handling code here:
         int numero=74;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.H5;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_H5ActionPerformed

    private void H6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H6ActionPerformed
        // TODO add your handling code here:
         int numero=75;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.H6;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_H6ActionPerformed

    private void H7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H7ActionPerformed
        // TODO add your handling code here:
         int numero=76;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.H7;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_H7ActionPerformed

    private void H8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H8ActionPerformed
        // TODO add your handling code here:
         int numero=77;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.H8;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_H8ActionPerformed

    private void H9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H9ActionPerformed
        // TODO add your handling code here:
         int numero=78;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.H9;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_H9ActionPerformed

    private void H10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H10ActionPerformed
        // TODO add your handling code here:
         int numero=79;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.H10;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_H10ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        // TODO add your handling code here:
         int numero=60;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.G1;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_G1ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
        // TODO add your handling code here:
         int numero=70;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.H1;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_H1ActionPerformed

    private void I2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I2ActionPerformed
        // TODO add your handling code here:
         int numero=83;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.I2;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_I2ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        // TODO add your handling code here:
         int numero=51;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.G2;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_G2ActionPerformed

    private void I3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I3ActionPerformed
        // TODO add your handling code here:
         int numero=82;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.I3;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_I3ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        // TODO add your handling code here:
         int numero=62;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.G3;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_G3ActionPerformed

    private void I4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I4ActionPerformed
        // TODO add your handling code here:
         int numero=83;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.I4;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_I4ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        // TODO add your handling code here:
         int numero=63;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.G4;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_G4ActionPerformed

    private void I5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I5ActionPerformed
        // TODO add your handling code here:
         int numero=84;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.I5;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_I5ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed
        // TODO add your handling code here:
         int numero=64;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.G5;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_G5ActionPerformed

    private void I6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I6ActionPerformed
        // TODO add your handling code here:
         int numero=85;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.I6;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_I6ActionPerformed

    private void G6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G6ActionPerformed
        // TODO add your handling code here:
         int numero=65;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.G6;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_G6ActionPerformed

    private void I7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I7ActionPerformed
        // TODO add your handling code here:
         int numero=96;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.I7;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_I7ActionPerformed

    private void G7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G7ActionPerformed
        // TODO add your handling code here:
         int numero=66;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.G7;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_G7ActionPerformed

    private void I8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I8ActionPerformed
        // TODO add your handling code here:
         int numero=87;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.I8;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_I8ActionPerformed

    private void G8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G8ActionPerformed
        // TODO add your handling code here:
         int numero=67;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.G8;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_G8ActionPerformed

    private void I9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I9ActionPerformed
        // TODO add your handling code here:
         int numero=88;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.I9;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_I9ActionPerformed

    private void G9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G9ActionPerformed
        // TODO add your handling code here:
         int numero=68;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.G9;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_G9ActionPerformed

    private void I10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I10ActionPerformed
        // TODO add your handling code here:
         int numero=89;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.I10;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_I10ActionPerformed

    private void G10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G10ActionPerformed
        // TODO add your handling code here:
         int numero=69;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.G10;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_G10ActionPerformed

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
        // TODO add your handling code here:
         int numero=90;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.J1;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_J1ActionPerformed

    private void J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J2ActionPerformed
        // TODO add your handling code here:
         int numero=91;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.J2;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_J2ActionPerformed

    private void J3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J3ActionPerformed
        // TODO add your handling code here:
         int numero=92;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.J3;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_J3ActionPerformed

    private void J4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J4ActionPerformed
        // TODO add your handling code here:
         int numero=93;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.J4;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_J4ActionPerformed

    private void J5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J5ActionPerformed
        // TODO add your handling code here:
         int numero=94;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.J5;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_J5ActionPerformed

    private void J6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J6ActionPerformed
        // TODO add your handling code here:
         int numero=95;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.J6;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_J6ActionPerformed

    private void J7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J7ActionPerformed
        // TODO add your handling code here:
         int numero=96;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.J7;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_J7ActionPerformed

    private void J8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J8ActionPerformed
        // TODO add your handling code here:
         int numero=97;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.J8;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_J8ActionPerformed

    private void J9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J9ActionPerformed
        // TODO add your handling code here:
         int numero=98;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.J9;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_J9ActionPerformed

    private void J10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J10ActionPerformed
        // TODO add your handling code here:
         int numero=99;
        Silla sillaA=actual.getSillas()[numero];
        JToggleButton boton= this.J10;
        
        
        if(!sillaA.isOcupado()&& boton.isSelected()){
            boton.setBackground(Color.green);
            carrito.add(numero);
            modelo.addElement(boton.getName());
        }else if(!boton.isSelected() && !sillaA.isOcupado()){
            boton.setBackground(Color.black);
            carrito.remove(new Integer(numero));
            modelo.removeElement(boton.getName());
        }else{
            boton.setSelected(false);
        }
    }//GEN-LAST:event_J10ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.daddy.setVisible(true);
        daddy.setBounds(200, 200, daddy.getWidth(), daddy.getHeight());
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        for(int i=0;i<carrito.size();i++){
            System.out.println(carrito.get(i));
        }
      
        while(!this.carrito.isEmpty()){
            actual.ComprarSilla(this.user.getNombre(), carrito.get(0));
            user.aniadirCompra(actual.getSillas()[carrito.get(0)]);
            carrito.remove(0);
        }
        JOptionPane.showMessageDialog(null, "Compra exitosa");
        Seleccioncine lista= new Seleccioncine(cines,daddy.getDaddy().getDaddy().getDaddy(),user);
        lista.setVisible(true);
        lista.setBounds(200, 200, lista.getWidth(), lista.getHeight());
        this.setVisible(false);
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int total= 12000*carrito.size();
        txtATotal.setText(Integer.toString(total));
    }//GEN-LAST:event_btnCalcularActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton A1;
    private javax.swing.JToggleButton A10;
    private javax.swing.JToggleButton A2;
    private javax.swing.JToggleButton A3;
    private javax.swing.JToggleButton A4;
    private javax.swing.JToggleButton A5;
    private javax.swing.JToggleButton A6;
    private javax.swing.JToggleButton A7;
    private javax.swing.JToggleButton A8;
    private javax.swing.JToggleButton A9;
    private javax.swing.JToggleButton B1;
    private javax.swing.JToggleButton B10;
    private javax.swing.JToggleButton B2;
    private javax.swing.JToggleButton B3;
    private javax.swing.JToggleButton B4;
    private javax.swing.JToggleButton B5;
    private javax.swing.JToggleButton B6;
    private javax.swing.JToggleButton B7;
    private javax.swing.JToggleButton B8;
    private javax.swing.JToggleButton B9;
    private javax.swing.JToggleButton C1;
    private javax.swing.JToggleButton C10;
    private javax.swing.JToggleButton C2;
    private javax.swing.JToggleButton C3;
    private javax.swing.JToggleButton C4;
    private javax.swing.JToggleButton C5;
    private javax.swing.JToggleButton C6;
    private javax.swing.JToggleButton C7;
    private javax.swing.JToggleButton C8;
    private javax.swing.JToggleButton C9;
    private javax.swing.JToggleButton D1;
    private javax.swing.JToggleButton D10;
    private javax.swing.JToggleButton D2;
    private javax.swing.JToggleButton D3;
    private javax.swing.JToggleButton D4;
    private javax.swing.JToggleButton D5;
    private javax.swing.JToggleButton D6;
    private javax.swing.JToggleButton D7;
    private javax.swing.JToggleButton D8;
    private javax.swing.JToggleButton D9;
    private javax.swing.JToggleButton E1;
    private javax.swing.JToggleButton E10;
    private javax.swing.JToggleButton E2;
    private javax.swing.JToggleButton E3;
    private javax.swing.JToggleButton E4;
    private javax.swing.JToggleButton E5;
    private javax.swing.JToggleButton E6;
    private javax.swing.JToggleButton E7;
    private javax.swing.JToggleButton E8;
    private javax.swing.JToggleButton E9;
    private javax.swing.JToggleButton F1;
    private javax.swing.JToggleButton F10;
    private javax.swing.JToggleButton F2;
    private javax.swing.JToggleButton F3;
    private javax.swing.JToggleButton F4;
    private javax.swing.JToggleButton F5;
    private javax.swing.JToggleButton F6;
    private javax.swing.JToggleButton F7;
    private javax.swing.JToggleButton F8;
    private javax.swing.JToggleButton F9;
    private javax.swing.JToggleButton G1;
    private javax.swing.JToggleButton G10;
    private javax.swing.JToggleButton G2;
    private javax.swing.JToggleButton G3;
    private javax.swing.JToggleButton G4;
    private javax.swing.JToggleButton G5;
    private javax.swing.JToggleButton G6;
    private javax.swing.JToggleButton G7;
    private javax.swing.JToggleButton G8;
    private javax.swing.JToggleButton G9;
    private javax.swing.JToggleButton H1;
    private javax.swing.JToggleButton H10;
    private javax.swing.JToggleButton H2;
    private javax.swing.JToggleButton H3;
    private javax.swing.JToggleButton H4;
    private javax.swing.JToggleButton H5;
    private javax.swing.JToggleButton H6;
    private javax.swing.JToggleButton H7;
    private javax.swing.JToggleButton H8;
    private javax.swing.JToggleButton H9;
    private javax.swing.JToggleButton I1;
    private javax.swing.JToggleButton I10;
    private javax.swing.JToggleButton I2;
    private javax.swing.JToggleButton I3;
    private javax.swing.JToggleButton I4;
    private javax.swing.JToggleButton I5;
    private javax.swing.JToggleButton I6;
    private javax.swing.JToggleButton I7;
    private javax.swing.JToggleButton I8;
    private javax.swing.JToggleButton I9;
    private javax.swing.JToggleButton J1;
    private javax.swing.JToggleButton J10;
    private javax.swing.JToggleButton J2;
    private javax.swing.JToggleButton J3;
    private javax.swing.JToggleButton J4;
    private javax.swing.JToggleButton J5;
    private javax.swing.JToggleButton J6;
    private javax.swing.JToggleButton J7;
    private javax.swing.JToggleButton J8;
    private javax.swing.JToggleButton J9;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listacarro;
    private javax.swing.JTextArea txtATotal;
    // End of variables declaration//GEN-END:variables
}
