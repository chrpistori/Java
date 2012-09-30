package main;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
//import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author tonare
 */
public class ClienteDAO {

    private Connection connection;

    public ClienteDAO() {
        this.connection = new ConnectionFactoryComProperties().getConnection();
    }

    //ok
    public List<Cliente> listaClientes() {
        List<Cliente> listaClientes = new ArrayList<Cliente>();

        String sql = "select nome,sobrenome,cpf from cliente";
        try {
            java.sql.Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("nome"));
                cliente.setSobreNome(rs.getString("sobrenome"));
                //cliente.setCpf(Integer.parseInt(rs.getString("cpf")));
                cliente.setCpf(rs.getString("cpf"));

                listaClientes.add(cliente);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaClientes;
    }

    //Ok
    public Cliente getCliente(String CPF) {

        Cliente cliente = new Cliente();

        String sql = "select nome,sobrenome,cpf from cliente where cpf = " + CPF;
        try {
            java.sql.Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                cliente.setNome(rs.getString("nome"));
                cliente.setSobreNome(rs.getString("sobrenome"));
                //cliente.setCpf(Integer.parseInt(rs.getString("cpf")));
                cliente.setCpf(rs.getString("cpf"));

            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cliente;
    }

    //ok
    public Cliente getClientePorPedido(int identificadorPedido) {
        Cliente cliente = new Cliente();

        String id = Integer.toString(identificadorPedido);

        String sql = "select nome,sobrenome,cpf from cliente where idPedido = " + id;
        try {
            java.sql.Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                cliente.setNome(rs.getString("nome"));
                cliente.setSobreNome(rs.getString("sobrenome"));
                //cliente.setCpf(Integer.parseInt(rs.getString("cpf")));
                cliente.setCpf(rs.getString("cpf"));
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cliente;
    }

    //ok
    public void CadastraCliente(Cliente cliente) {

        String sql = "insert into cliente(nome,sobrenome,cpf) values(?,?,?)";
        try {
            java.sql.PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getSobreNome());
            //pstmt.setInt(3, cliente.getCpf());
            pstmt.setString(3, cliente.getCpf());

            int res = pstmt.executeUpdate();

            pstmt.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    //ñ ok
    public void AtualizaCliente(Cliente cliente) {

        String sql = "update cliente set "
                + "nome=" + cliente.getNome()
                + ",sobrenome=" + cliente.getSobreNome()
                + ",cpf=" + cliente.getCpf()
                + ",pedido=" + cliente.getPedido() + " where nome like " + cliente.getNome();

        try {
            java.sql.Statement stmt = connection.createStatement();

            stmt.addBatch(sql);

            int res[] = stmt.executeBatch();
            connection.commit();
            stmt.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void excluiCliente(Cliente cliente) {
        String sql = "delete from cliente where nome=" + cliente.getNome();

        try {
            java.sql.Statement stmt = connection.createStatement();

            stmt.addBatch(sql);

            int res[] = stmt.executeBatch();
            connection.commit();
            stmt.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    /* public Pedido getPedidoDoCliente(Cliente cliente){
     Pedido pedido = new Pedido();
        
     String idCliente = 
        
     String sql = "select idPedido,valorTotalPedido from pedido where idCliente ="+;

     try {
     java.sql.Statement stmt = connection.createStatement();
     ResultSet rs = stmt.executeQuery(sql);

     while (rs.next()) {

     cliente.setNome(rs.getString("nome"));
     cliente.setSobreNome(rs.getString("sobrenome"));
     cliente.setCpf(Integer.parseInt(rs.getString("cpf")));

     }
     stmt.close();
     } catch (SQLException e) {
     throw new RuntimeException(e);
     }
        
     return pedido;
     }
     public String buscaIdCliente(String nome) {
     }*/
}