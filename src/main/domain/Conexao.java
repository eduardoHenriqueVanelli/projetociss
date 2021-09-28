package main.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection getConexao() {
        Connection con = null;
        try{
            Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
            con = DriverManager.getConnection("jdbc:db2://172.16.150.100:50025/TRMC", "dba", "a9d9p8.E10");
            System.out.println("Conectado com Sucesso!!");


        }catch (SQLException sqle){
            System.out.println("SQLException em ConexaoDb2.java " + sqle.getMessage());
        }catch (ClassNotFoundException npt){
            System.out.println("ClassNotFoundException em ConexaoDb2.java " + npt.getMessage());
        }catch (InstantiationException inst){
            System.out.println("InstantiationException em ConexaoDb2.java " + inst.getMessage());
        }catch (IllegalAccessException ile){
            System.out.println("IllegalAccessException em ConexaoDb2.java " + ile.getMessage());
        }
        return con;
    }
}
