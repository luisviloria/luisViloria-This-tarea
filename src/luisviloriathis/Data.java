/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luisviloriathis;

/**
 *
 * @author 54911
 */
public class Data {
    public static void main(String[] args) {
        
        Data User1, User2, User3, User4, User5;
        
        User1 = new Data();
        User2 = new Data (18395630);
        User3 = new Data (20839567, "bety");
        User4 = new Data (45484058, "lesly","Viloria");
        User5 = new Data(789456321, "luis", "Viloria", 30);
        
        
        User1.Info();
        User2.Info();
        User3.Info();
        User4.Info();
        User5.Info();
        
        
    }
    

}
    

