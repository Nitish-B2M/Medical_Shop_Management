import java.util.*;
//login
//option-> 1. Medicine details ,2. Company Manage(Supplier) ,3. Selling ,4. Refilling Stock ,5. Clients Details,6. Exit 

abstract class credentials{
    void login();
}
class Shop extends Login{
    // Declare A L L  V A R I A B L E 
    shop(){
        Class.forName("com.mysql.jdbc.Driver");
		String driver = "jdbc:mysql://localhost:3306/oop";
		Connection con = DriverManager.getConnection(driver,"root",""); 
    }
    @Override
    void login(){}
    void med_details(){
        //choice 1)display->Database  2)add new (insert query)
    }
    void supplier_details(){
        //CHOICE : a) Display details (Retrieve database dateils) ,b) Add Comp(insert que),c) Remove Comp(delete que)
    }
    void user_input(){
        //1. users details, 2. choice med_id 
    }
    void invoice(){
        //1. display bill, 2. insert into JDBC(user details, which med buyed by user, total_cost)
    }
    void stock(){
            //1. display
            //choice - you wants to reffiing your stock-[YES/NO]
    }
    void customer_his(){
        //Display JDBC
    }
}

public class Medical_shop_management_system {
    public static void main(String[] args) {
        shop s = new shop();
        s.showStock();
    }

}