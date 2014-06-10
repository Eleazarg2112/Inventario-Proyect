package inventario;
public class User {
   private String username;
   private String password;
   private String code;
   public User(){}
   public User(String username, String password, String code){
   this.username = username;
   this.password = password;
   this.code = code;
   }
   public void setUsername(String username){
   this.username = username;
   }
   public String getUsername(){
   return this.username;
   }
   public void setPassword(String password){
   this.password = password;
   }
   public String getPassword(){
   return this.password;
   }
   public void setCode(String code){
   this.code = code;
   }
   public String getCode(){
   return this.code;
   }
}
