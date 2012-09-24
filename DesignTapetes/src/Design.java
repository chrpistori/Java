
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class Design extends JFrame implements ActionListener{

    //Tabela tb = new Tabela();
    //Consultas c = new Consultas();
    // Declarando as abas
    private JPanel cliente;
    private JPanel pedido;
    private JPanel preco;
    // Declarando as labels
    private JLabel nome;
    private JLabel sobrenome;
    private JLabel cpf;
    // Declarando os campos
    private JTextField camponome;
    private JTextField camposobrenome;
    private JTextField campocpf;
    // Declarando os botões
    private JButton incluir;
    private JButton atualizar;
    private JButton listar;
    private JButton excluir;

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


        // Instanciando os componentes
        cliente = new JPanel();
        pedido = new JPanel();
        preco = new JPanel();
        nome = new JLabel("Nome:");
        sobrenome = new JLabel("Sobrenome:");
        cpf = new JLabel("CPF:");
        camponome = new JTextField();
        camposobrenome = new JTextField();
        campocpf = new JTextField();
        incluir = new JButton("Incluir");
        atualizar = new JButton("Atualizar");
        listar = new JButton("Listar");
        excluir = new JButton("Excluir");
        jtp = new JTabbedPane();
        

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

        // Posicionando os botões na tela
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

    public static void main(String[] args) {
        Design design = new Design();
        design.setVisible(true);
    }
}