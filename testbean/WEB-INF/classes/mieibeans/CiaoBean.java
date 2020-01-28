package mieibeans;

import java.time.*;
import java.sql.*;

public class CiaoBean implements java.io.Serializable{
	private String testo;
	private String utenti;
	public CiaoBean(){
		
	}
	public String getSaluto(){
		if(testo == null){
		 LocalDateTime today = LocalDateTime.now();
		 if(today.getHour() < 12){
		 	return "buongiorno";
		 }else{
			return "buonasera";
		 }
		}else{
			return testo;
		}
	}

	public String getUtenti(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/dizionario?serverTimezone=UTC","root","");
			//here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM dizionario");
			utenti = "<ul>";
			while(rs.next()){
				utenti+= "<li>";
				utenti+= rs.getString(1) + " ";
				utenti+= rs.getString(2)+ " ";
				utenti+= rs.getString(3);
				utenti+= "</li>";
			}
			utenti+= "</ul>";
			con.close();
			}catch(Exception e){
			utenti+= (e);
			}


		return utenti;
	}


	public void setSaluto(String val){
		testo = val;
	}
	
}