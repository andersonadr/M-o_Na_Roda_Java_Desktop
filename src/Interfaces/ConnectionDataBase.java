/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno_Manha
 */

public class ConnectionDataBase {
        //NOME DO BANCO DE DADOS
	private static final String URL_MYSQL = "jdbc:mysql://localhost/sa";
	//JDBC COM DRIVER
	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	//USER DO DB
	private static final String USER = "root";
	//SENHA DO DB
	private static final String PASS = "";
        
        //FUNÇÃO PARA CONECTAR AO BANCO DE DADOS
	public static Connection getConnection() {
		System.out.println("Conectando ao Banco de Dados");
		try {
			Class.forName(DRIVER_CLASS);
                        Connection conn = DriverManager.getConnection(URL_MYSQL, USER, PASS);
			return DriverManager.getConnection(URL_MYSQL, USER, PASS);
                        
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
                
		return null;
	}
}
