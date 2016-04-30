package postgreSql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class PostgreSqlFactory 
{
    public static Connection createConnection() throws SQLException
    {
        Connection conexao=null;
        try{
            String url ="jdbc:postgresql://ec2-23-21-255-14.compute-1.amazonaws.com/d9hd0af40k3srh?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
            String usuario="cnkffylbzpmxab";
            String senha = "SIh9u9UQ7UhflVZWIH2UUjBaRs";

            Class.forName("org.postgresql.Driver");           

            conexao = DriverManager.getConnection(url,usuario,senha);

            System.out.println("Conexão realizada com sucesso.");
            
            
        }catch(Exception exc)
        {
            System.out.println(exc);
        }
        return conexao;
    }
    
    public static PreparedStatement CriarComandoSql(Connection conexao, String sql) throws SQLException
    {
       PreparedStatement stmt = null;
       if(sql.isEmpty())
       {
       }else
       {
           conexao.setAutoCommit(false);
           stmt = conexao.prepareStatement(sql);           
       }
       return stmt;
    }
    public static void ExecutarComandoSql(Connection conexao, PreparedStatement stmt, String sql) throws SQLException
    {
        if(stmt != null)
        {
            //Perguntar para o cléber
            stmt.executeUpdate(sql);
            conexao.commit();
        }
    }
    public static ResultSet Receptor(PreparedStatement stmt) throws SQLException
    {
        return stmt.executeQuery();
    }
    public static void SemRetorno(PreparedStatement stmt) throws SQLException
    {
        stmt.executeUpdate();
    }
        public static void FecharConexao(Connection conexao) throws SQLException
    {
        conexao.close();
    }
}