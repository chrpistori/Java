
package main;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class Janela extends JFrame {
    
    public Janela() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        TabPanel = new JTabbedPane();
        TabClienteCliente = new JPanel();
        lb_Nome = new JLabel();
        cp_Nome = new JTextField();
        lb_Snome = new JLabel();
        cp_Snome = new JTextField();
        lb_Cpf = new JLabel();
        cp_Cpf = new JTextField();
        scroll = new JScrollPane();
        tb_Clientes = new JTable();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jSeparator1 = new JSeparator();
        jButton4 = new JButton();
        jLabel5 = new JLabel();
        TabPedido = new JPanel();
        jLabel1 = new JLabel();
        cp_Nome2 = new JTextField();
        cp_Snome2 = new JTextField();
        cp_Cpf2 = new JTextField();
        lb_Cpf2 = new JLabel();
        lb_Snome2 = new JLabel();
        lb_Nome2 = new JLabel();
        jSeparator2 = new JSeparator();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        lb_Snome3 = new JLabel();
        lb_Nome3 = new JLabel();
        lb_Cpf3 = new JLabel();
        jSeparator3 = new JSeparator();
        cp_Cpf3 = new JTextField();
        cp_Snome3 = new JTextField();
        cp_Nome3 = new JTextField();
        lb_Snome4 = new JLabel();
        lb_Snome5 = new JLabel();
        jComboBox1 = new JComboBox();
        jComboBox2 = new JComboBox();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        scroll1 = new JScrollPane();
        tb_Clientes1 = new JTable();
        jLabel4 = new JLabel();
        cp_Snome4 = new JTextField();
        TabPreco = new JPanel();
        jLabel6 = new JLabel();
        lb_Cpf4 = new JLabel();
        cp_Snome5 = new JTextField();
        lb_Nome4 = new JLabel();
        jComboBox3 = new JComboBox();
        jButton9 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");

        lb_Nome.setText("Nome:");

        lb_Snome.setText("Sobrenome:");

        cp_Snome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_SnomeActionPerformed(evt);
            }
        });

        lb_Cpf.setText("CPF:");

        cp_Cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_CpfActionPerformed(evt);
            }
        });

        tb_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Sobrenome"
            }
        ));
        tb_Clientes.setShowVerticalLines(false);
        scroll.setViewportView(tb_Clientes);

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Listar");

        jButton3.setText("Excluir");

        jButton4.setText("Incluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cliente");

        org.jdesktop.layout.GroupLayout TabClienteClienteLayout = new org.jdesktop.layout.GroupLayout(TabClienteCliente);
        TabClienteCliente.setLayout(TabClienteClienteLayout);
        TabClienteClienteLayout.setHorizontalGroup(
            TabClienteClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TabClienteClienteLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(TabClienteClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(scroll, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .add(TabClienteClienteLayout.createSequentialGroup()
                        .add(48, 48, 48)
                        .add(TabClienteClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lb_Cpf)
                            .add(lb_Snome)
                            .add(lb_Nome))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(TabClienteClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cp_Snome)
                            .add(cp_Nome)
                            .add(cp_Cpf)))
                    .add(TabClienteClienteLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jButton4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton3))
                    .add(jLabel5)
                    .add(jSeparator1))
                .add(20, 20, 20))
        );

        TabClienteClienteLayout.linkSize(new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        TabClienteClienteLayout.setVerticalGroup(
            TabClienteClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TabClienteClienteLayout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jLabel5)
                .add(15, 15, 15)
                .add(TabClienteClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lb_Nome)
                    .add(cp_Nome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabClienteClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lb_Snome)
                    .add(cp_Snome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabClienteClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lb_Cpf)
                    .add(cp_Cpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(TabClienteClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2)
                    .add(jButton3)
                    .add(jButton4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scroll, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .add(15, 15, 15))
        );

        TabPanel.addTab("Cliente", TabClienteCliente);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cliente");

        cp_Nome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_Nome2ActionPerformed(evt);
            }
        });

        cp_Snome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_Snome2ActionPerformed(evt);
            }
        });

        cp_Cpf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_Cpf2ActionPerformed(evt);
            }
        });

        lb_Cpf2.setText("CPF:");

        lb_Snome2.setText("Sobrenome:");

        lb_Nome2.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Item do Pedido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Resumo do Pedido");

        lb_Snome3.setText("Altura(m):");

        lb_Nome3.setText("Tamanho:");

        lb_Cpf3.setText("Largura(m):");

        cp_Cpf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_Cpf3ActionPerformed(evt);
            }
        });

        cp_Snome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_Snome3ActionPerformed(evt);
            }
        });

        lb_Snome4.setText("Forma do Tapete:");

        lb_Snome5.setText("Material");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton5.setText("Incluir item");

        jButton6.setText("Excluir item");

        jButton7.setText("Alterar item");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Pesquisar");

        tb_Clientes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Forma", "Material", "Tamanho (m2)", "Preço"
            }
        ));
        tb_Clientes1.setShowVerticalLines(false);
        scroll1.setViewportView(tb_Clientes1);

        jLabel4.setText("Total do Pedido:");

        cp_Snome4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cp_Snome4.setText("R$ 250,00");
        cp_Snome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_Snome4ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout TabPedidoLayout = new org.jdesktop.layout.GroupLayout(TabPedido);
        TabPedido.setLayout(TabPedidoLayout);
        TabPedidoLayout.setHorizontalGroup(
            TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, TabPedidoLayout.createSequentialGroup()
                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(TabPedidoLayout.createSequentialGroup()
                        .add(53, 53, 53)
                        .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lb_Snome2)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lb_Nome2)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lb_Cpf2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(TabPedidoLayout.createSequentialGroup()
                                .add(cp_Snome2)
                                .add(1, 1, 1))
                            .add(cp_Cpf2)
                            .add(TabPedidoLayout.createSequentialGroup()
                                .add(cp_Nome2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, TabPedidoLayout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, TabPedidoLayout.createSequentialGroup()
                        .add(25, 25, 25)
                        .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lb_Snome5)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lb_Snome3)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lb_Cpf3)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lb_Nome3)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lb_Snome4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, cp_Snome3)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, cp_Cpf3)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jComboBox2, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jComboBox1, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, cp_Nome3)))
                    .add(TabPedidoLayout.createSequentialGroup()
                        .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, TabPedidoLayout.createSequentialGroup()
                                .add(20, 20, 20)
                                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, TabPedidoLayout.createSequentialGroup()
                                        .add(jLabel4)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(cp_Snome4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 149, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, scroll1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)))
                            .add(TabPedidoLayout.createSequentialGroup()
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jButton7)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton6)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton5)))
                        .add(2, 2, 2))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, TabPedidoLayout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(TabPedidoLayout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 137, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(jSeparator2))))
                .add(18, 18, 18))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, TabPedidoLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jSeparator3)
                .addContainerGap())
        );

        TabPedidoLayout.linkSize(new java.awt.Component[] {jButton5, jButton6, jButton7, jButton8}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        TabPedidoLayout.setVerticalGroup(
            TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TabPedidoLayout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15)
                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cp_Nome2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton8)
                    .add(lb_Cpf2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cp_Snome2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lb_Nome2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cp_Cpf2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lb_Snome2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(2, 2, 2)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lb_Snome4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lb_Snome5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cp_Cpf3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lb_Snome3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cp_Nome3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lb_Cpf3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cp_Snome3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lb_Nome3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton7)
                    .add(jButton6)
                    .add(jButton5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scroll1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 142, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabPedidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cp_Snome4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(15, 15, 15))
        );

        TabPanel.addTab("Pedido", TabPedido);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Preço do Material");

        lb_Cpf4.setText("Material:");

        cp_Snome5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_Snome5ActionPerformed(evt);
            }
        });

        lb_Nome4.setText("Preço do m2:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton9.setText("Atualizar");

        org.jdesktop.layout.GroupLayout TabPrecoLayout = new org.jdesktop.layout.GroupLayout(TabPreco);
        TabPreco.setLayout(TabPrecoLayout);
        TabPrecoLayout.setHorizontalGroup(
            TabPrecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TabPrecoLayout.createSequentialGroup()
                .add(TabPrecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(TabPrecoLayout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel6))
                    .add(TabPrecoLayout.createSequentialGroup()
                        .add(82, 82, 82)
                        .add(TabPrecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jButton9)
                            .add(TabPrecoLayout.createSequentialGroup()
                                .add(TabPrecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lb_Nome4)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lb_Cpf4))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(TabPrecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(cp_Snome5)
                                    .add(jComboBox3, 0, 257, Short.MAX_VALUE))))))
                .add(158, 158, 158))
        );
        TabPrecoLayout.setVerticalGroup(
            TabPrecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TabPrecoLayout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jLabel6)
                .add(18, 18, 18)
                .add(TabPrecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lb_Cpf4)
                    .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabPrecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cp_Snome5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lb_Nome4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton9)
                .addContainerGap(460, Short.MAX_VALUE))
        );

        TabPanel.addTab("Preço Material", TabPreco);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TabPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TabPanel)
        );

        pack();
    }// </editor-fold>

    private void cp_CpfActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void cp_SnomeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cp_Snome3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cp_Cpf3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cp_Cpf2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cp_Snome2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cp_Snome4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cp_Snome5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cp_Nome2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    public static void main(String args[]) {
        
        try {
            LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++){
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // Mostra a janela
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify
    private javax.swing.JPanel TabClienteCliente;
    private javax.swing.JTabbedPane TabPanel;
    private javax.swing.JPanel TabPedido;
    private javax.swing.JPanel TabPreco;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cp_Cpf;
    private javax.swing.JTextField cp_Cpf2;
    private javax.swing.JTextField cp_Cpf3;
    private javax.swing.JTextField cp_Nome;
    private javax.swing.JTextField cp_Nome2;
    private javax.swing.JTextField cp_Nome3;
    private javax.swing.JTextField cp_Snome;
    private javax.swing.JTextField cp_Snome2;
    private javax.swing.JTextField cp_Snome3;
    private javax.swing.JTextField cp_Snome4;
    private javax.swing.JTextField cp_Snome5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lb_Cpf;
    private javax.swing.JLabel lb_Cpf2;
    private javax.swing.JLabel lb_Cpf3;
    private javax.swing.JLabel lb_Cpf4;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_Nome2;
    private javax.swing.JLabel lb_Nome3;
    private javax.swing.JLabel lb_Nome4;
    private javax.swing.JLabel lb_Snome;
    private javax.swing.JLabel lb_Snome2;
    private javax.swing.JLabel lb_Snome3;
    private javax.swing.JLabel lb_Snome4;
    private javax.swing.JLabel lb_Snome5;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JTable tb_Clientes;
    private javax.swing.JTable tb_Clientes1;
    // End of variables declaration
    
}
