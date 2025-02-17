/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BEJMIN
 */
public class frm_personas extends javax.swing.JFrame {
    Cliente cliente;
    DefaultTableModel tbl_modelo;  // sirve para llenar tbl_clientes
    
     
    /**
     * Creates new form frm_personas
     */
    public frm_personas() {
        initComponents();
        cliente = new Cliente();
        tbl_modelo = new DefaultTableModel();
        // crear las columnas, modelo -> tbl clientes
        String encabezado[] = {"Código", "Nombres", "Apellidos", "Direccion", "Telefono", "Fecha de Nacimiento"};
        tbl_modelo.setColumnIdentifiers(encabezado);
        tbl_clientes.setModel(tbl_modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabp_principal = new javax.swing.JTabbedPane();
        pnl_empleados = new javax.swing.JPanel();
        lbl_titulo_empleados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnl_clientes = new javax.swing.JPanel();
        lbl_titulo_clientes = new javax.swing.JLabel();
        lbl_nit = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        txt_nit = new javax.swing.JTextField();
        lbl_apellidos = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_fn = new javax.swing.JLabel();
        txt_fn = new javax.swing.JTextField();
        btn_crear = new javax.swing.JButton();
        spnl_tabla_clientes = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo_empleados.setFont(new java.awt.Font("Harlow Solid Italic", 1, 48)); // NOI18N
        lbl_titulo_empleados.setForeground(new java.awt.Color(204, 51, 0));
        lbl_titulo_empleados.setText("Formulario Empleados");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout pnl_empleadosLayout = new javax.swing.GroupLayout(pnl_empleados);
        pnl_empleados.setLayout(pnl_empleadosLayout);
        pnl_empleadosLayout.setHorizontalGroup(
            pnl_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_empleadosLayout.createSequentialGroup()
                .addGroup(pnl_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_empleadosLayout.createSequentialGroup()
                        .addGap(718, 718, 718)
                        .addComponent(jLabel1))
                    .addGroup(pnl_empleadosLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_titulo_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        pnl_empleadosLayout.setVerticalGroup(
            pnl_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_empleadosLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGroup(pnl_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_empleadosLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2))
                    .addGroup(pnl_empleadosLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbl_titulo_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(502, Short.MAX_VALUE))
        );

        tabp_principal.addTab("Empleados", pnl_empleados);

        pnl_clientes.setBackground(new java.awt.Color(0, 51, 255));

        lbl_titulo_clientes.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 36)); // NOI18N
        lbl_titulo_clientes.setForeground(new java.awt.Color(204, 204, 0));
        lbl_titulo_clientes.setText("Formulario Clientes");

        lbl_nit.setForeground(new java.awt.Color(153, 0, 153));
        lbl_nit.setText("Código");

        lbl_nombres.setBackground(new java.awt.Color(102, 102, 255));
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setText("Nombres");

        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });

        txt_nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nitActionPerformed(evt);
            }
        });

        lbl_apellidos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_apellidos.setText("Apellidos");

        txt_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresActionPerformed(evt);
            }
        });

        lbl_direccion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_direccion.setText("Dirección");

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        lbl_telefono.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telefono.setText("Teléfono");

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        lbl_fn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fn.setText("Nacimiento");

        txt_fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnActionPerformed(evt);
            }
        });

        btn_crear.setBackground(new java.awt.Color(51, 255, 51));
        btn_crear.setText("Crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spnl_tabla_clientes.setViewportView(tbl_clientes);

        javax.swing.GroupLayout pnl_clientesLayout = new javax.swing.GroupLayout(pnl_clientes);
        pnl_clientes.setLayout(pnl_clientesLayout);
        pnl_clientesLayout.setHorizontalGroup(
            pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_clientesLayout.createSequentialGroup()
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_clientesLayout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(lbl_titulo_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_clientesLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_direccion)
                            .addComponent(lbl_telefono)
                            .addComponent(lbl_fn))
                        .addGap(51, 51, 51)
                        .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_clientesLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnl_tabla_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_clientesLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_clientesLayout.createSequentialGroup()
                                .addComponent(lbl_apellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_clientesLayout.createSequentialGroup()
                                .addComponent(lbl_nombres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_clientesLayout.createSequentialGroup()
                                .addComponent(lbl_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        pnl_clientesLayout.setVerticalGroup(
            pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_clientesLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lbl_titulo_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nit)
                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fn)
                    .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(spnl_tabla_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tabp_principal.addTab("Clientes", pnl_clientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabp_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabp_principal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void txt_nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nitActionPerformed

    private void txt_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        // TODO add your handling code here:
        cliente.setNit(txt_nit.getText());
         cliente.setNombres(txt_nombres.getText());
         cliente.setApellidos(txt_apellidos.getText());
         cliente.setDireccion(txt_direccion.getText());
         cliente.setTelefono(txt_telefono.getText());
         cliente.setFecha_nacimiento(txt_fn.getText());

         // agregar el modelo de cliente crear para que se cree
         tbl_modelo.addRow(cliente.crear());
         tbl_clientes.setModel(tbl_modelo);
    }//GEN-LAST:event_btn_crearActionPerformed

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
            java.util.logging.Logger.getLogger(frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_personas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_fn;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo_clientes;
    private javax.swing.JLabel lbl_titulo_empleados;
    private javax.swing.JPanel pnl_clientes;
    private javax.swing.JPanel pnl_empleados;
    private javax.swing.JScrollPane spnl_tabla_clientes;
    private javax.swing.JTabbedPane tabp_principal;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fn;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
