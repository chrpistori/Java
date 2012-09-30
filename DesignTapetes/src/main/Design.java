package main;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class Design extends JFrame implements ActionListener {

    //Tabela tb = new Tabela();
    //Consultas c = new Consultas();
    // Declarando as abas
    private JPanel cliente;
    private JPanel pedido;
    private JPanel preco;
    // Declarando e instanciando os componentes da tela Cliente
    private JLabel nome = new JLabel("Nome:");
    private JLabel sobrenome = new JLabel("Sobrenome:");
    private JLabel cpf = new JLabel("CPF:");
    private JTextField camponome = new JTextField();
    private JTextField camposobrenome = new JTextField();
    private JTextField campocpf = new JTextField();
    private JButton incluir = new JButton("Incluir");
    private JButton atualizar = new JButton("Atualizar");
    private JButton listar = new JButton("Listar");
    private JButton excluir = new JButton("Excluir");
    // Declarando os componentes da tela Pedido
    private JLabel titulo1 = new JLabel("Cliente");
    private JLabel cpfPedido = new JLabel("CPF do cliente:");
    private JLabel nomePedido = new JLabel("Nome:");
    private JLabel sobrenomePedido = new JLabel("Sobrenome:");
    private JLabel titulo2 = new JLabel("Item de Pedido");
    private JLabel forma = new JLabel("Forma do Tapete:");
    private JLabel material = new JLabel("Selecione Material:");
    private JLabel altura = new JLabel("Altura (m)");
    private JLabel largura = new JLabel("Largura(m)");
    private JLabel tamanho = new JLabel("Tamanho(m2)");
    private JTextField campocpfPedido;
    private JTextField camponomePedido;
    private JTextField camposobrenomePedido;
    private JButton pesquisar = new JButton("Alterar item de Pedido");
    private JButton alterarItem = new JButton("Alterar item de Pedido");
    private JButton ExcluirItem = new JButton("Incluir item do Pedido");
    private JButton IncluirItem = new JButton("Excluir item do Pedido");
    private JComboBox comboForma;
    private JComboBox comboMaterial;
    private JLabel titulo3 = new JLabel("Resumo do Pedido");
    private JLabel total = new JLabel("Total do Pedido:");
    private JTextField valorTotal = new JTextField("R$ 250,00" /*Valor total do pedido.. soma do banco*/);

    private String[] itens = { "Selecione", "Branco" , "Vermelho" , "Verde" , "Azul" };
    
    public Design() {
        setTitle("Design Tapetes");
        setSize(700, 700);
        Container cp = getContentPane();
        JTabbedPane jtp;


        //add(tb.getJScrollPane());

        //tb.atualizarTabela();

        /*if (tb.contador()
         == true) {
         excluir.setEnabled(true);
         atualizar.setEnabled(true);
         } else {
         excluir.setEnabled(false);
         atualizar.setEnabled(false);
         }*/
        // tabela do deam
        String[] colunas = {"CPF", "Nome", "Sobrenome"};

        String[][] dados = {
            {"Teste", "Teste", "Teste"},
            {"Teste", "Teste", "Teste"},
            {"Teste", "Teste", "Teste"}
        };

        JTable tabela = new JTable(dados, colunas);

        tabela.setSize(300, 200);


        
        

        jtp = new JTabbedPane();

        comboForma = new JComboBox(itens);
        comboMaterial = new JComboBox(itens);

        incluir.addActionListener(this);
        atualizar.addActionListener(this);
        listar.addActionListener(this);
        excluir.addActionListener(this);

        cliente.setLayout(null);

        cliente.add(nome);
        cliente.add(sobrenome);
        cliente.add(cpf);
        cliente.add(camponome);
        cliente.add(camposobrenome);
        cliente.add(campocpf);
        cliente.add(incluir);
        cliente.add(atualizar);
        cliente.add(listar);
        cliente.add(excluir);
        cliente.add(tabela);
        cp.add(jtp);

        pedido.setLayout(null);

        pedido.add(titulo1);
        pedido.add(cpfPedido);
        pedido.add(nomePedido);
        pedido.add(sobrenomePedido);
        pedido.add(titulo2);
        pedido.add(forma);
        pedido.add(material);
        pedido.add(altura);
        pedido.add(largura);
        pedido.add(tamanho);
        pedido.add(campocpfPedido);
        pedido.add(camponomePedido);
        pedido.add(camposobrenomePedido);
        pedido.add(pesquisar);
        pedido.add(alterarItem);
        pedido.add(ExcluirItem);
        pedido.add(IncluirItem);
        pedido.add(comboForma);
        pedido.add(comboMaterial);
        pedido.add(tabela);
        pedido.add(titulo3);
        pedido.add(total);
        pedido.add(valorTotal);

        // Posicionando os botões na tela Cliente
        nome.setBounds(10, 10, 100, 10);
        sobrenome.setBounds(10, 40, 100, 10);
        cpf.setBounds(10, 70, 100, 10);
        camponome.setBounds(110, 8, 500, 20);
        camposobrenome.setBounds(110, 37, 500, 20);
        campocpf.setBounds(110, 65, 500, 20);
        incluir.setBounds(191, 150, 100, 30);
        atualizar.setBounds(296, 150, 100, 30);
        listar.setBounds(401, 150, 100, 30);
        excluir.setBounds(506, 150, 100, 30);
        tabela.setLocation(20, 300);
        
        // Posicionando os botões na tela Pedido
        cpfPedido.setBounds(30, 10, 100, 10);
        nomePedido.setBounds(10, 40, 100, 10);
        sobrenomePedido.setBounds(10, 70, 100, 10);
        forma.setBounds(110, 8, 500, 20);
        material.setBounds(110, 37, 500, 20);
        altura.setBounds(110, 65, 500, 20);
        largura.setBounds(191, 150, 100, 30);
        tamanho.setBounds(296, 150, 100, 30);
        campocpfPedido.setBounds(401, 150, 100, 30);
        camponomePedido.setBounds(506, 150, 100, 30);
        camposobrenomePedido.setBounds(506, 150, 100, 30);
        pesquisar.setBounds(506, 150, 100, 30);
        alterarItem.setBounds(506, 150, 100, 30);
        ExcluirItem.setBounds(506, 150, 100, 30);
        IncluirItem.setBounds(506, 150, 100, 30);
        comboForma.setBounds(506, 150, 100, 30);
        comboMaterial.setBorder(null);
        tabela.setLocation(20, 300);

        jtp.addTab("Cliente", cliente);
        jtp.addTab("Pedido", pedido);
        jtp.addTab("Preço do Material", preco);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        Object obj = arg0.getSource();

        if (obj == incluir) { // Novo
        } else if (obj == listar) { // btnSalvar
/*
             if (comboEstados.getSelectedItem().equals("")) {
             JOptionPane.showMessageDialog(null,
             "Erro: Campo 'Estados' deve ser preenchido");
             } else if (campoCidade.getText().length() < 3) {
             JOptionPane
             .showMessageDialog(null,
             "Erro: Campo 'Cidade' deve conter 3 caracteres ou mais");
             campoCidade.setText(null);
             campoCidade.requestFocus();
             } else {
             boolean cond = true;
             String[] x = ((String) comboEstados.getSelectedItem())
             .split("-");
             int codUf = 0;

             for (Estado e : listaEstados) {
             if (e.getSigla().equals(x[0])) {
             codUf = e.getCodigo();
             break;
             }
             }

             listaCidades = c.listarCidades();
             for (Cidade c : listaCidades) {
             if ((codUf == Integer.parseInt(c.getFk_idestado()))) {
             if (campoCidade.getText().trim().toUpperCase()
             .equals(c.getDescricao())) {

             JOptionPane
             .showMessageDialog(null,
             "Erro: Cidade j� cadastrada no banco de dados");
             campoCidade.setText(null);
             campoCidade.requestFocus();
             cond = false;
             break;

             }
             }
             }
             if (cond == true) {
             if (validarString(String.valueOf(campoCidade.getText())) == false) {
             JOptionPane
             .showMessageDialog(null,
             "Erro: A informacao esta incorreta, digite apenas nomes de cidades");
             campoCidade.setText(null);
             campoCidade.requestFocus();
             } else {

             String txtSql = "insert into tb_cidades(descricao,fk_idestado)";
             txtSql += "values('"
             + campoCidade.getText().trim().toUpperCase()
             + "'," + codUf + ");";

             try {
             boolean listaAux = Conexao.obterStatement()
             .execute(txtSql);

             } catch (SQLException e) {
             e.printStackTrace();
             }
             tb.atualizarTabela();
             if (tb.contador() == true) {
             btnExcluir.setEnabled(true);
             btnEditar.setEnabled(true);
             } else {
             btnExcluir.setEnabled(false);
             btnEditar.setEnabled(false);
             }

             comboEstados.setSelectedIndex(0);
             campoCidade.setText(null);
             campoCidade.setEnabled(false);
             comboEstados.setEnabled(false);
             }
             }
             }
             */
        } else if (obj == atualizar) { //btnEditar
			/*try {
             int viewRow = tb.getTabela().getSelectedRow();
             campoEditCidade.setText(tb.getTabela().getValueAt(viewRow, 3).toString());
             frame2.setVisible(true);
				

             } catch (Exception e) {
             JOptionPane.showMessageDialog(null,
             "Erro: Selecione um registro na tabela");
             }
             */
        } else if (obj == excluir) {
            /*			try {
             tb.deletarDados();
             tb.atualizarTabela();
             if (tb.contador() == true) {
             btnExcluir.setEnabled(true);
             btnEditar.setEnabled(true);
             } else {
             btnExcluir.setEnabled(false);
             btnEditar.setEnabled(false);
             }

             } catch (Exception e) {
             JOptionPane.showMessageDialog(null,
             "Erro: Selecione um registro da tabela");
             }

             */        }


    }

   /* public static void main(String[] args) {
        Design design = new Design();
        design.setVisible(true);
    }*/
}