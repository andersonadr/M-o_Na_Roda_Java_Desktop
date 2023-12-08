/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.ConnectionDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class ClienteDAO extends ConnectionDataBase {

    private ConnectionDataBase ConnectionDataBase;
    private Connection conn;

    public ClienteDAO() {
        this.ConnectionDataBase = new ConnectionDataBase();
        this.conn = ConnectionDataBase.getConnection();
    }

    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO telaregister (nome,numerocnh,tipocnh,idade,email,senha) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCnh());
            stmt.setString(3, cliente.getTipocnh());
            stmt.setString(4, cliente.getIdade());
            stmt.setString(5, cliente.getEmail());
            stmt.setString(6, cliente.getSenha());
            stmt.execute();
            System.out.println("Inseriu as informações no banco de dados com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Cliente getInfo(String nome) {

        String sql = "SELECT * FROM telaregister WHERE nome = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            Cliente cliente = new Cliente();
            rs.first();
            cliente.setNome(rs.getString("nome"));
            cliente.setCnh(rs.getString("numerocnh"));
            cliente.setTipocnh(rs.getString("tipocnh"));
            cliente.setIdade(rs.getString("idade"));
            cliente.setEmail(rs.getString("email"));
            cliente.setSenha(rs.getString("senha"));
            return cliente;
        } catch (Exception e) {
            return null;
        }
    }

    public ResultSet autenticacaoLogin(Cliente objcliente) {

        conn = new ConnectionDataBase().getConnection();

        try {
            String sql = "SELECT email, senha FROM telaregister WHERE email = ? AND senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcliente.getEmail());
            pstm.setString(2, objcliente.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }

    }

}
