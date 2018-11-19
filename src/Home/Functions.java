package Home;

import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Functions {
	
	public static Image setIcon(){
		try {
			Connection con=sqlConnection.dbConnection();
			//PreparedStatement pstmt= con.prepareStatement("SELECT describeImage FROM test1question WHERE rowid=?;");
			//pstmt.setInt(1, 1);
			ResultSet rs=con.createStatement().executeQuery("SELECT file FROM image_table WHERE name='work harder';");
			if (rs.next())
			{
				byte[] blob=rs.getBytes("file");
				ImageIcon image= new ImageIcon(blob);
				Image im=image.getImage();
				rs.close();
				con.close();
				return im;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public static void setBackground(JLabel label){
		try {
			Connection con=sqlConnection.dbConnection();
			//PreparedStatement pstmt= con.prepareStatement("SELECT describeImage FROM test1question WHERE rowid=?;");
			//pstmt.setInt(1, 1);
			ResultSet rs=con.createStatement().executeQuery("SELECT file FROM image_table WHERE name='wave';");
			if (rs.next())
			{
				byte[] blob=rs.getBytes("file");
				ImageIcon image= new ImageIcon(blob);
				Image im=image.getImage();
				Image myimg=im.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
				ImageIcon icon= new ImageIcon(myimg);
				label.setIcon(icon);
			}
			rs.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
