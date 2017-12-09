/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import java.sql.*;

public class ModuloConexao {

    //Mer=todo respomsavel por conexao do banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        String url = "jdbc:mysql://localhost:3306/restaurante";
        String user = "root";
        String password = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado");
            return conexao;
            
            
        }
        catch(Exception e){
            System.out.println("desconectado");
            return null;
            
        }
            

    }

}
