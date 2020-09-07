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

    int DNI;
    int Age;
    String Name;
    String lastName;
    
    public Data(){
      System.out.println("Creating User...");
      this.lastName = "No Data";
      this.DNI = 0;
      this.Name = "";
      this.Age = 0;
      
}
    public Data (int DNI){
        this();
        this.DNI = DNI;
    }
    public Data (int DNI, String Name){
        this(DNI);
        this.Name = Name;
    }
    public Data (int DNI, String Name, String lastName){
        this(DNI, Name);
        this.lastName = lastName;
    }
        
    public Data (int DNI, int Age, String Name, String lastName){
            this(DNI, Name, lastName);
            this.Age = Age;
       
    }
    public void info(){
        system.out.println(DNI + lastName + Name + Age);
    }
    

    
}
