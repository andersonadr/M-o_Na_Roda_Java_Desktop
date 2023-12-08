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
 * @author Aluno_Manha
 */
public class CarroDAO {
    private ConnectionDataBase ConnectionDataBase;
    private Connection conn;

    public CarroDAO(){
        this.ConnectionDataBase = ConnectionDataBase;
        this.conn = ConnectionDataBase.getConnection();
    }
    
        public void inserir(Carro carro){
        String sql = "INSERT INTO carros (modelo,potencia,ano,precoaluguel,precocompra) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, carro.getModelo());
            stmt.setString(2, carro.getPotencia());
            stmt.setString(3, carro.getAno());
            stmt.setString(4, carro.getPrecoaluguel());
            stmt.setString(5, carro.getPrecocompra());
            stmt.execute();
            System.out.println("Inseriu as informações no banco de dados com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Carro getInfo(String modelo){
        
        String sql = "SELECT * FROM carros WHERE modelo = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,modelo);
            ResultSet rs = stmt.executeQuery();
            
            Carro carro = new Carro();
            rs.first();
            carro.setModelo(rs.getString("modelo"));
            carro.setPotencia(rs.getString("potencia"));
            carro.setAno(rs.getString("ano"));
            carro.setPrecoaluguel(rs.getString("precoaluguel"));
            carro.setPrecocompra(rs.getString("precocompra"));
            return carro;
        } catch (Exception e) {
            return null;
        }
    }
}
