
package inventario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Connections {
  public String database = "user";
  public String login = "root";
  public String password = "3l1sar21";
  public String url = "jdbc:mysql://localhost/"+database;
  Connection connect = null;
  User user = new User();
    private int JTextField;
  public Connections(){
  try{
  Class.forName("com.mysql.jdbc.Driver");
  connect = DriverManager.getConnection(url, login, password);
  if(connect == null){
  JOptionPane.showConfirmDialog(null,"Ocurrio un error al conectarse\n a la base de datos"+database+"!" );
  
  }
  }catch(SQLException ex){
  }   catch (ClassNotFoundException ex) {
          System.out.println(ex);
        
      }
  
  }
  public Connection conectar(){
      try{
  Class.forName("com.mysql.jdbc.Driver");
  connect = DriverManager.getConnection(url, login, password);
  }catch(SQLException ex){
  }   catch (ClassNotFoundException ex) {
          System.out.println(ex);
        
      }
      return connect;
  }
  public Connection getConnection(){
      return connect;
  }
  List<User> users = new ArrayList<User>();
  public List<User> select(){
    try{
       connect = DriverManager.getConnection(url,login,password);
       Statement s = connect.createStatement();
       ResultSet rs = s.executeQuery("select * from User;");
       while(rs.next()){
           User us = new User();
           us.setUsername(rs.getString(2));           
           us.setPassword(rs.getString(3));
           users.add(us);
       }       
    }catch(SQLException ex){}
    return users;
  }
  
  public List<Product> Vender()
  { List<Product> producto = new ArrayList<Product>();
      try{    connect =  DriverManager.getConnection(url,login,password);
            Statement s = connect.createStatement();
            ResultSet rs = s.executeQuery("select * from medicamento;");
            while(rs.next())
            {   Product pd = new Product();
                pd.setCode(rs.getString(1));
                pd.setName(rs.getString(2));
                pd.setTrademark(rs.getString(3));
                pd.setDescription(rs.getString(4));
                pd.setExpired(rs.getString(5));
                pd.setCoste(rs.getDouble(6));
                pd.setPrice(rs.getDouble(7));
                pd.setAmount(rs.getInt(8));
                producto.add(pd);
            }
  }catch(SQLException ex){}
  return producto;
  }


  }
  
//// aqui se crea una matriz con tantas filas y columnas que se necesite
//Object[][] data = new String[logs][fields.split(",").length];
//// aqui se realiza la consulta a sql y llenamos los datos en la matriz objeto
//try{
// PreparedStatement pst = connect.prepareStatement(q);
// ResultSet res = pst.executeQuery();
// int i = 0;
// while(res.next()){
// for(int j = 0; j <= fields.split(",").length -1; j++){
// data[i][j] = res.getBytes(columname[j].trim());
// }
// i++;
// res.close();
// }
//}catch(SQLException ex){
//System.out.println(ex);
//}
//return data;
//}
//  public boolean enter(String user , String password){
//  Object[][] res = this.select("user", "user , password"," user='"+user+"' AND password='"+password+"' ");
//  if(res.length > 0){
//  this.user.setUsername(res[0][0].toString());
//  this.user.setPassword(res[0][1].toString());
//  return true;
//  }else
//  return false;
//  
//  }
//  public void NewUser(String username, String password){
//      try {
//          PreparedStatement pstm = this.getConnection().prepareStatement("insert into "+"user(USERNAME,PASSWORD) " + " values(?,?)");
//          pstm.setString(1,username);
//          pstm.setString(1,password);
//          pstm.execute();
//          pstm.close();
//          JOptionPane.showMessageDialog(null, "username"+" " + username+" "+"Creado Correctamente");
//      } catch (SQLException ex) {
//          System.out.println(ex);
//      }
//  }
//}
///**Apartir de aqui se crea un metodo que nos permitira hacer 
// * consultas del programa hacia la base de datos
// */

