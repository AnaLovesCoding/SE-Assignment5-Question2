package model.dataccess;

public class ConnectionFactory {
	
	public DataBaseConnection getConnection(String dataBase) {

		if (dataBase.equals("postgres")) {
			
			return new PostgresConnection();
		   
		} else if (dataBase.equals("mysql")) {
				
			return new MySqlConnection();

		}  else {
			
			return null;
			
		}
		
	}	

}
