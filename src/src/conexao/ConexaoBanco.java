
package conexao;

import java.sql.*;

/**
 *
 * @author 
 */
public class ConexaoBanco {

    private String URL = null;
    private String DRIVER_CLASS= null;
    private String USUARIO = null;
    private String SENHA = null;
    public Connection conn = null;

    public ConexaoBanco(){

        URL = "jdbc:postgresql://uti.uesb.br:5432/BD1";//URL de conexão com o banco
        DRIVER_CLASS = "org.postgresql.Driver"; //Classe do driver JDBC       
        USUARIO = "postgres";// Nome do usuário
        SENHA = "mestre"; // Senha do usuário
    }

    public Connection getConnection() {

        try {
            if (conn == null) {
                Class.forName(DRIVER_CLASS); //Carrega o driver
                //Obtém a conexão
                conn = DriverManager.getConnection(URL, USUARIO, SENHA);
                
                System.out.println("Esta Conectado!");

            } else if (conn.isClosed()) {
                conn = null;
                return getConnection();
            }
        } catch (ClassNotFoundException ex) {

            ex.printStackTrace();

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

        return conn;

    }

    public void closeConnection() {
        if (conn != null) {
            
            System.out.println("Conexao Fechada!");
            try {
                conn.close();

            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
    }
}
