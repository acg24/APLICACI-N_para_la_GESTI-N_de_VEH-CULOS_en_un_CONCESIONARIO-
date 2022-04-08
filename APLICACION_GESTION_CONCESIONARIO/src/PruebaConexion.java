import java . sql . Connection ;
import java . sql . DriverManager ;
import java.sql.ResultSet;
import java . sql . SQLException ;
import java . sql . Statement ;

public class PruebaConexion {
	private static String username = "root";
	private static String password = "root";
	private static Connection connection;
	private static Statement command;
	private static ResultSet data;
	
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/concesionariovehiculos", "root", "root"); 
			command = connection.createStatement();
			command.execute("Select");
		}catch(SQLException e){
			e.printStackTrace();
		}finally{	
			System.out.println("se ha insertado el nuevo cliente");
		}
	}
}
