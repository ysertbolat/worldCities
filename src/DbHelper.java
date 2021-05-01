import java.sql.*; //istediğimiz kütüphane

public class DbHelper {
    //veritabanı erişimi için gerekli olan bilgilerimiz
    private String userName = "root";
    private String password = "yusuf16";
    //database server lokasyonumuz
    private String dbUrl ="jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    
    //connector için libraries folder'ına mysql jar'ımızı yükleyelim(Program files'tan)
    
    public Connection getConnection() throws SQLException{
        //import işleminde istediğimiz kütüphane yok kendimiz yazmamız gerek
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    //hata mesajlarını yönetmek için
    public void showErrorMessage(SQLException exception){
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }
    //dbhelper işlemlerimizi de tamamlamış olduk
}
