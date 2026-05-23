package registro_de_tareas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class frmTareas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmTareas.class.getName());

    public frmTareas() {
        initComponents();
    }
    
    clsTareas UpdateTarea;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID1 = new javax.swing.JTextField();
        txtTitulo1 = new javax.swing.JTextField();
        txtDescripcion1 = new javax.swing.JTextField();
        txtEntrega1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtPrioridad1 = new javax.swing.JComboBox<>();
        txtEstado1 = new javax.swing.JComboBox<>();
        btncompletar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstClientes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtEntrega = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtPrioridad = new javax.swing.JComboBox<>();
        txtEstado = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmiimportar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmiExportar = new javax.swing.JMenuItem();
        pmiExportar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizacion de Tarea"));

        jLabel2.setText("ID_Tarea:");
        jLabel3.setText("Titulo:");
        jLabel4.setText("Descripcion:");
        jLabel5.setText("Fecha de Entrega:");
        jLabel6.setText("Prioridad:");
        jLabel8.setText("Estado:");

        jButton2.setText("ACTUALIZAR");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        txtPrioridad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAJA", "MEDIA", "ALTA", "MUY ALTA" }));
        txtEstado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRUE", "FALSE" }));

        btncompletar.setText("Completar Tarea");
        btncompletar.addActionListener(this::btncompletarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID1)
                            .addComponent(txtTitulo1)
                            .addComponent(txtDescripcion1)
                            .addComponent(txtEntrega1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(txtPrioridad1, 0, 171, Short.MAX_VALUE)
                            .addComponent(txtEstado1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btncompletar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtEntrega1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrioridad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btncompletar))
                .addGap(40, 40, 40))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Tarea"));

        lstClientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Historial de búsqueda..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstClientes.addListSelectionListener(this::lstClientesValueChanged);
        jScrollPane1.setViewportView(lstClientes);

        jLabel1.setText("Buscar Tarea: ");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnBuscar)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Tarea"));

        jLabel9.setText("ID_Tarea:");
        jLabel10.setText("Titulo:");
        jLabel11.setText("Descripcion:");
        jLabel12.setText("Fecha de Entrega:");
        jLabel13.setText("Prioridad:");
        jLabel15.setText("Estado:");

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        txtPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAJA", "MEDIA", "ALTA", "MUY ALTA" }));
        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRUE", "FALSE" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar)
                    .addComponent(txtID)
                    .addComponent(txtTitulo)
                    .addComponent(txtDescripcion)
                    .addComponent(txtEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(txtPrioridad, 0, 171, Short.MAX_VALUE)
                    .addComponent(txtEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(43, 43, 43))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Tarea"));

        jLabel16.setText("ID_Tarea:");
        jLabel17.setText("Titulo:");
        jLabel18.setText("Descripcion:");
        jLabel19.setText("Fecha de Entrega:");
        jLabel20.setText("Prioridad:");
        jLabel22.setText("Estado:");

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        jLabel23.setText("jLabel23");
        jLabel24.setText("jLabel24");
        jLabel25.setText("jLabel25");
        jLabel26.setText("jLabel26");
        jLabel27.setText("jLabel27");
        jLabel28.setText("jLabel28");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(114, 114, 114)))
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel27))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel28))
                .addGap(64, 64, 64)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmiimportar.setText("Importar ");
        
        jMenuItem1.setText("Importar CSV");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jmiimportar.add(jMenuItem1);

        jmiExportar.setText("Exportar JSON");
        jmiExportar.addActionListener(this::jmiExportarActionPerformed);
        jmiimportar.add(jmiExportar);

        pmiExportar.setText("Exportar PDF");
        pmiExportar.addActionListener(this::pmiExportarActionPerformed);
        jmiimportar.add(pmiExportar);

        jMenuBar1.add(jmiimportar);

        jMenu2.setText("Informacion");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = (txtEntrega.getDate() != null) ? sdf.format(txtEntrega.getDate()) : "";

        clsTareas cTareas = new clsTareas(
                Integer.parseInt(txtID.getText().trim()),
                txtTitulo.getText().trim(),
                txtDescripcion.getText().trim(),
                fechaString, 
                txtPrioridad.getSelectedItem().toString(),
                txtEstado.getSelectedItem().toString() 
        );
        cTareas.guardar();
        btnBuscarActionPerformed(null); 
        
        javax.swing.JOptionPane.showMessageDialog(this, "¡Tarea registrada correctamente!");

        txtID.setText("");
        txtTitulo.setText("");
        txtDescripcion.setText("");
        txtEntrega.setDate(null); 
        txtPrioridad.setSelectedIndex(0);
        txtEstado.setSelectedIndex(0);
    }                                          

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (UpdateTarea == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero selecciona una tarea de la lista!");
            return;
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String newEntrega = (txtEntrega1.getDate() != null) ? sdf.format(txtEntrega1.getDate()) : "";
        
        Integer newId = Integer.parseInt(txtID1.getText().trim());
        String newTitulo = txtTitulo1.getText().trim();
        String newDescripcion = txtDescripcion1.getText().trim();
        String newPrioridad = txtPrioridad1.getSelectedItem().toString();
        String newEstado = txtEstado1.getSelectedItem().toString(); 
        
        UpdateTarea.actualizar(newId, newTitulo, newDescripcion, newEntrega, newPrioridad, newEstado);
        
        javax.swing.JOptionPane.showMessageDialog(this, "Tarea actualizada correctamente!");
        btnBuscarActionPerformed(null); 
    }                                        

    private void btncompletarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (UpdateTarea == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero selecciona una tarea de la lista!");
            return;
        }

        String[] datos = UpdateTarea.aTexto().split("\\|");
        Integer id = Integer.parseInt(datos[0]);
        String titulo = datos[1];
        String descripcion = datos[2];
        String entrega = datos[3];
        String prioridad = datos[4];
        String estadoActual = datos[5].trim(); 

        if (estadoActual.equalsIgnoreCase("TRUE")) {
            javax.swing.JOptionPane.showMessageDialog(this, "La tarea ya está completada.");
        } else {
            String nuevoEstado = "TRUE";

            UpdateTarea.actualizar(id, titulo, descripcion, entrega, prioridad, nuevoEstado);
            UpdateTarea = new clsTareas(id, titulo, descripcion, entrega, prioridad, nuevoEstado);

            txtEstado1.setSelectedItem("TRUE");
            jLabel28.setText("TRUE");

            javax.swing.JOptionPane.showMessageDialog(this, "¡Tarea marcada como completada exitosamente!");
            btnBuscarActionPerformed(null);
        }
    }                                            

    private void lstClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {                                         
        if (!evt.getValueIsAdjusting()) {
            String registroSeleccionado = lstClientes.getSelectedValue();

            if (registroSeleccionado != null && !registroSeleccionado.equals("Historial de búsqueda...")) {
                String[] datos = registroSeleccionado.split("\\|");

                if (datos.length >= 6) {
                    String id         = datos[0].replace("ID: ", "").trim();
                    String titulo     = datos[1].replace(" Titulo: ", "").trim();
                    String descripcion = datos[2].replace(" Descripcion: ", "").trim();
                    String entrega    = datos[3].replace(" Fecha de Entrega: ", "").trim();
                    String prioridad  = datos[4].replace(" Prioridad: ", "").trim();
                    String estado     = datos[5].replace(" Estado: ", "").trim();

                    txtID1.setText(id);
                    txtTitulo1.setText(titulo);
                    txtDescripcion1.setText(descripcion);
                    
                    try {
                        java.util.Date date = new SimpleDateFormat("dd/MM/yyyy").parse(entrega);
                        txtEntrega1.setDate(date);
                    } catch (Exception e) {
                        txtEntrega1.setDate(null);
                    }
                    
                    txtPrioridad1.setSelectedItem(prioridad);
                    txtEstado1.setSelectedItem(estado.toUpperCase());

                    jLabel23.setText(id);
                    jLabel24.setText(titulo);
                    jLabel25.setText(descripcion);
                    jLabel26.setText(entrega);
                    jLabel27.setText(prioridad);
                    jLabel28.setText(estado);

                    UpdateTarea = new clsTareas(
                        Integer.parseInt(id),
                        titulo,
                        descripcion,
                        entrega,
                        prioridad,
                        estado
                    );
                }
            }
        }
    }                                        

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (UpdateTarea != null) {
            int respuesta = javax.swing.JOptionPane.showConfirmDialog(this,
                    "¿Deseas eliminar la tarea: " + UpdateTarea.getDescripcion()+ "?",
                    "Eliminación de la tarea.",
                    javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);

            if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
                UpdateTarea.eliminar();
                javax.swing.JOptionPane.showMessageDialog(this, "Tarea eliminada con éxito");
                btnBuscarActionPerformed(null); 
            }
        }
    }                                           

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        clsTareas cTareas = new clsTareas(0, "", "", "", "", "FALSE");
        lstClientes.setModel(cTareas.llenarLista());
    }                                         

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int respuesta = JOptionPane.showConfirmDialog(this,
            "Asegúrate de que el archivo se llame 'tareas.csv' y esté en la raíz del proyecto.\nEl formato debe ser: ID,Titulo,Descripcion,Entrega,Prioridad,Estado",
            "Importación de datos desde tareas.csv",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
        if (respuesta == JOptionPane.YES_OPTION) {
            try (BufferedReader br = new BufferedReader(new FileReader("tareas.csv"));
                 BufferedWriter bw = new BufferedWriter(new FileWriter("lista_tareas.txt", true))) {
                
                String linea;
                int count = 0;
                while ((linea = br.readLine()) != null) {

                    String[] datos = linea.split(",");
                    if(datos.length >= 6) {
                        String lineaTxt = datos[0] + "|" + datos[1] + "|" + datos[2] + "|" + datos[3] + "|" + datos[4] + "|" + datos[5];
                        bw.write(lineaTxt);
                        bw.newLine();
                        count++;
                    }
                }
                JOptionPane.showMessageDialog(this, "Se importaron " + count + " tareas correctamente.");
                btnBuscarActionPerformed(null);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al importar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }                                          

    private void jmiExportarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            List<clsTareas> listaTareas = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("lista_tareas.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");

                if (datos.length >= 6) {
                    clsTareas nuevaTarea = new clsTareas(
                        Integer.parseInt(datos[0].trim()),
                        datos[1].trim(),
                        datos[2].trim(),
                        datos[3].trim(),
                        datos[4].trim(),
                        datos[5].trim() 
                    );
                    listaTareas.add(nuevaTarea);
                }
            }
            br.close();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonFinal = gson.toJson(listaTareas);

            BufferedWriter bw = new BufferedWriter(new FileWriter("tareas_completo.json"));
            bw.write(jsonFinal);
            bw.close();

            JOptionPane.showMessageDialog(this, "¡Exportación a JSON exitosa!");

        } catch (Exception e) {
            System.out.println("Error durante la exportación a JSON: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                           

    private void pmiExportarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("Reporte_Tareas.pdf"));
            documento.open();

            documento.add(new Paragraph("Reporte Gerencial de Tareas"));
            documento.add(new Paragraph(" "));

            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell("ID");
            tabla.addCell("TITULO");
            tabla.addCell("DESCRIPCION");
            tabla.addCell("ENTREGA");
            tabla.addCell("PRIORIDAD");
            tabla.addCell("ESTADO");

            BufferedReader br = new BufferedReader(new FileReader("lista_tareas.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");
                if (datos.length >= 6) {
                    tabla.addCell(datos[0].trim()); 
                    tabla.addCell(datos[1].trim()); 
                    tabla.addCell(datos[2].trim()); 
                    tabla.addCell(datos[3].trim()); 
                    tabla.addCell(datos[4].trim()); 
                    tabla.addCell(datos[5].trim()); 
                }
            }
            br.close();

            documento.add(tabla);
            documento.close();

            JOptionPane.showMessageDialog(this, "¡PDF generado con éxito en la carpeta del proyecto!");

        } catch (Exception e) {
            System.out.println("Error al generar el PDF: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage(), "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }                                           

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new frmTareas().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btncompletar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem jmiExportar;
    private javax.swing.JMenu jmiimportar;
    private javax.swing.JList<String> lstClientes;
    private javax.swing.JMenuItem pmiExportar;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcion1;
    private com.toedter.calendar.JDateChooser txtEntrega;
    private com.toedter.calendar.JDateChooser txtEntrega1;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JComboBox<String> txtEstado1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID1;
    private javax.swing.JComboBox<String> txtPrioridad;
    private javax.swing.JComboBox<String> txtPrioridad1;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTitulo1;
    // End of variables declaration                   
}