/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.car.center.presentacion;

import com.mycompany.car.center.controller.FuncionarioController;
import com.mycompany.car.center.domain.Funcionario;
import java.sql.SQLException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cargo
 */
public class Main2 extends javax.swing.JFrame {

    private final FuncionarioController funcionarioController;
    private final static String[] COLUMNS = {
        "ID",
        "TIPO IDENTIFICACION",
        " NUMERO IDENTIFICAICON",
        "NOMBRE",
        "APELLIDO",
        "ESATDO CIVIL",
        "SEXO",
        "DIRECCION",
        "TELEFONO",
        "FECHA NACIMIENTO"
    };

    private final static String SELECCIONE = "--SELECCIONE--";

    /**
     * Creates new form Main2
     */
    public Main2() {
        initComponents();
        txtId.setEditable(false);
        funcionarioController = new FuncionarioController();
        listFuncionarios();
        addListener();

    }

    private void listFuncionarios() {

        cmFuncionario.removeAllItems();
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNumero_identificacion(SELECCIONE);
        funcionario1.setNombre("");
        cmFuncionario.addItem(funcionario1);
        tbFuncionarios.removeAll();

        DefaultTableModel defaultTableModel = new DefaultTableModel();
        for (String COLUMN : COLUMNS) {
            defaultTableModel.addColumn(COLUMN);
        }

        tbFuncionarios.setModel(defaultTableModel);
        try {
            List<Funcionario> funcionarios = funcionarioController.obtenerFuncionarios();
            if (funcionarios.isEmpty()) {
                return;
            }

            defaultTableModel.setRowCount(funcionarios.size());

            int row = 0;

            for (Funcionario funcionario : funcionarios) {

                defaultTableModel.setValueAt(funcionario.getId(), row, 0);
                defaultTableModel.setValueAt(funcionario.getTipo_identificacion(), row, 1);
                defaultTableModel.setValueAt(funcionario.getNumero_identificacion(), row, 2);
                defaultTableModel.setValueAt(funcionario.getNombre(), row, 3);
                defaultTableModel.setValueAt(funcionario.getApellido(), row, 4);
                defaultTableModel.setValueAt(funcionario.getEstado_civil(), row, 5);
                defaultTableModel.setValueAt(funcionario.getSexo(), row, 6);
                defaultTableModel.setValueAt(funcionario.getDireccion(), row, 7);
                defaultTableModel.setValueAt(funcionario.getTelefono(), row, 8);
                defaultTableModel.setValueAt(funcionario.getFecha_nacimiento(), row, 9);
                row++;

                cmFuncionario.addItem(funcionario);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private void addListener() {
        cmFuncionario.addItemListener(event -> {
            Funcionario selectedFuncionario = (Funcionario) event.getItem();
            if (selectedFuncionario.getNumero_identificacion().equals(SELECCIONE)) {
                txtId.setText("");
                txtTipoIdentificacionEdit.setText("");
                txtNumeroIdentificacionEdit.setText("");
                txtNombreEdit.setText("");
                txtApellidoEdit.setText("");
                txtEstadoCivilEdit.setText("");
                txtSexoEdit.setText("");
                txtDireccionEdit.setText("");
                txtTelefonoEdit.setText("");
                txtFechaEdit.setText("");

            } else {
                txtId.setText(String.valueOf(selectedFuncionario.getId()));
                txtTipoIdentificacionEdit.setText(String.valueOf(selectedFuncionario.getTipo_identificacion()));
                txtNumeroIdentificacionEdit.setText(String.valueOf(selectedFuncionario.getNumero_identificacion()));
                txtNombreEdit.setText(String.valueOf(selectedFuncionario.getNombre()));
                txtApellidoEdit.setText(String.valueOf(selectedFuncionario.getApellido()));
                txtEstadoCivilEdit.setText(String.valueOf(selectedFuncionario.getApellido()));
                txtSexoEdit.setText(String.valueOf(selectedFuncionario.getSexo()));
                txtDireccionEdit.setText(String.valueOf(selectedFuncionario.getDireccion()));
                txtTelefonoEdit.setText(String.valueOf(selectedFuncionario.getTelefono()));
                txtFechaEdit.setText(String.valueOf(selectedFuncionario.getFecha_nacimiento()));

            }

            System.out.println("selectedCar = " + selectedFuncionario);
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTPanel = new javax.swing.JTabbedPane();
        jP1 = new javax.swing.JPanel();
        jPCrear = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTipoIdentificacion = new javax.swing.JTextField();
        txtNumeroIdentificacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionarios = new javax.swing.JTable();
        jP2 = new javax.swing.JPanel();
        jPEditar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtTipoIdentificacionEdit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNumeroIdentificacionEdit = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombreEdit = new javax.swing.JTextField();
        txtApellidoEdit = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEstadoCivilEdit = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtSexoEdit = new javax.swing.JTextField();
        txtDireccionEdit = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTelefonoEdit = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtFechaEdit = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmFuncionario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("GESTION DE FUNCIONARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, 20));

        jPCrear.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite los siguientes campos"));

        jLabel2.setText("Tipo Identificación: ");

        jLabel3.setText("Numero Identificación:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Estado Civil:");

        jLabel7.setText("Sexo:");

        jLabel8.setText("Dirección:");

        jLabel9.setText("Teléfono");

        jLabel10.setText("Fecha nacimiento:");

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        tbFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbFuncionarios);

        javax.swing.GroupLayout jPCrearLayout = new javax.swing.GroupLayout(jPCrear);
        jPCrear.setLayout(jPCrearLayout);
        jPCrearLayout.setHorizontalGroup(
            jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPCrearLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPCrearLayout.createSequentialGroup()
                        .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPCrearLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(134, 134, 134)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPCrearLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(63, 63, 63)
                                    .addComponent(txtTipoIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addGroup(jPCrearLayout.createSequentialGroup()
                                    .addGap(194, 194, 194)
                                    .addComponent(txtNumeroIdentificacion))))
                        .addGap(31, 31, 31)
                        .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCrearLayout.createSequentialGroup()
                                .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPCrearLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPCrearLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPCrearLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                                .addGap(59, 59, 59))
                            .addGroup(jPCrearLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCrearLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPCrearLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCrearLayout.createSequentialGroup()
                                        .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(33, 33, 33)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48))))
            .addGroup(jPCrearLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCrearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrear)
                .addGap(416, 416, 416))
        );
        jPCrearLayout.setVerticalGroup(
            jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCrearLayout.createSequentialGroup()
                        .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNumeroIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPCrearLayout.createSequentialGroup()
                        .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jP1Layout = new javax.swing.GroupLayout(jP1);
        jP1.setLayout(jP1Layout);
        jP1Layout.setHorizontalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jP1Layout.setVerticalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPanel.addTab("Crear", jP1);

        jPEditar.setBorder(javax.swing.BorderFactory.createTitledBorder("Modifique los siguientes campos"));

        jLabel12.setText("ID");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtTipoIdentificacionEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoIdentificacionEditActionPerformed(evt);
            }
        });

        jLabel13.setText("Tipo identificacion");

        txtNumeroIdentificacionEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroIdentificacionEditActionPerformed(evt);
            }
        });

        jLabel14.setText("numero identificacion");

        jLabel15.setText("nombre");

        txtNombreEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEditActionPerformed(evt);
            }
        });

        txtApellidoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoEditActionPerformed(evt);
            }
        });

        jLabel16.setText("apellido");

        txtEstadoCivilEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoCivilEditActionPerformed(evt);
            }
        });

        jLabel17.setText("estado civil");

        jLabel18.setText("sexo");

        txtSexoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoEditActionPerformed(evt);
            }
        });

        txtDireccionEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionEditActionPerformed(evt);
            }
        });

        jLabel19.setText("direccion");

        txtTelefonoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEditActionPerformed(evt);
            }
        });

        jLabel20.setText("telefono");

        txtFechaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaEditActionPerformed(evt);
            }
        });

        jLabel21.setText("Fecha");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");

        jLabel11.setText("Funcionarios");

        cmFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPEditarLayout = new javax.swing.GroupLayout(jPEditar);
        jPEditar.setLayout(jPEditarLayout);
        jPEditarLayout.setHorizontalGroup(
            jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPEditarLayout.createSequentialGroup()
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPEditarLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumeroIdentificacionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPEditarLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtTipoIdentificacionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPEditarLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPEditarLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(txtEstadoCivilEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPEditarLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPEditarLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPEditarLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPEditarLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtSexoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPEditarLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(28, 28, 28)
                        .addComponent(cmFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar)
                        .addGap(49, 49, 49)
                        .addComponent(btnEliminar)
                        .addGap(186, 186, 186)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPEditarLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPEditarLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefonoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPEditarLayout.setVerticalGroup(
            jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEditarLayout.createSequentialGroup()
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtSexoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtDireccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtTelefonoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPEditarLayout.createSequentialGroup()
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtNombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtApellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtEstadoCivilEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPEditarLayout.createSequentialGroup()
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtTipoIdentificacionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtNumeroIdentificacionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEditarLayout.createSequentialGroup()
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtFechaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEditarLayout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar)
                            .addComponent(jLabel11)
                            .addComponent(cmFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );

        javax.swing.GroupLayout jP2Layout = new javax.swing.GroupLayout(jP2);
        jP2.setLayout(jP2Layout);
        jP2Layout.setHorizontalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addComponent(jPEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jP2Layout.setVerticalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        jTPanel.addTab("Editar", jP2);

        getContentPane().add(jTPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 970, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtTipoIdentificacionEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoIdentificacionEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoIdentificacionEditActionPerformed

    private void txtNumeroIdentificacionEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroIdentificacionEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroIdentificacionEditActionPerformed

    private void txtNombreEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEditActionPerformed

    private void txtApellidoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEditActionPerformed

    private void txtEstadoCivilEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoCivilEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoCivilEditActionPerformed

    private void txtSexoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoEditActionPerformed

    private void txtDireccionEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionEditActionPerformed

    private void txtTelefonoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEditActionPerformed

    private void txtFechaEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaEditActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cmFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmFuncionarioActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        if (txtTipoIdentificacion.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite Tipo Identificacion");
            txtTipoIdentificacion.requestFocus();
            return;
        }

        if (txtNumeroIdentificacion.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite Numero identificacion");
            txtNumeroIdentificacion.requestFocus();
            return;
        }

        if (txtNombre.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite Nombre");
            txtNombre.requestFocus();
            return;
        }

        if (txtApellido.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite Apellido");
            txtApellido.requestFocus();
            return;
        }

        if (txtEstadoCivil.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite Estao Civil");
            txtEstadoCivil.requestFocus();
            return;
        }

        if (txtSexo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite sexo");
            txtSexo.requestFocus();
            return;
        }

        if (txtDireccion.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite Direccion");
            txtDireccion.requestFocus();
            return;
        }

        if (txtTelefono.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite Telefono");
            txtTelefono.requestFocus();
            return;
        }

        if (txtFechaNacimiento.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite Fecha nacimiento");
            txtFechaNacimiento.requestFocus();
            return;
        }

        Funcionario funcionario = new Funcionario();
        funcionario.setTipo_identificacion(txtTipoIdentificacion.getText().trim());
        funcionario.setNumero_identificacion(txtNumeroIdentificacion.getText().trim());
        funcionario.setNombre(txtNombre.getText().trim());
        funcionario.setApellido(txtApellido.getText().trim());
        funcionario.setEstado_civil(txtEstadoCivil.getText().trim());
        funcionario.setSexo(txtSexo.getText().trim());
        funcionario.setDireccion(txtDireccion.getText().trim());
        funcionario.setTelefono(txtTelefono.getText().trim());

        String fechaNacimientoStr = txtFechaNacimiento.getText().trim();
        java.sql.Date fechaNacimiento = null;

        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date utilFechaNacimiento = formatoFecha.parse(fechaNacimientoStr);
            fechaNacimiento = new java.sql.Date(utilFechaNacimiento.getTime());
            funcionario.setFecha_nacimiento(fechaNacimiento);
        } catch (ParseException e) {

        }

        try {
            funcionarioController.crear(funcionario);

            txtTipoIdentificacion.setText("");
            txtNumeroIdentificacion.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtEstadoCivil.setText("");
            txtSexo.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            txtFechaNacimiento.setText("");
            listFuncionarios();
            JOptionPane.showMessageDialog(null , "Funcionario creado con éxito");

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se puede crear ");
        }


    }//GEN-LAST:event_btnCrearActionPerformed

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
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Funcionario> cmFuncionario;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jP2;
    private javax.swing.JPanel jPCrear;
    private javax.swing.JPanel jPEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTPanel;
    private javax.swing.JTable tbFuncionarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoEdit;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionEdit;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtEstadoCivilEdit;
    private javax.swing.JTextField txtFechaEdit;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEdit;
    private javax.swing.JTextField txtNumeroIdentificacion;
    private javax.swing.JTextField txtNumeroIdentificacionEdit;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSexoEdit;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoEdit;
    private javax.swing.JTextField txtTipoIdentificacion;
    private javax.swing.JTextField txtTipoIdentificacionEdit;
    // End of variables declaration//GEN-END:variables
}
