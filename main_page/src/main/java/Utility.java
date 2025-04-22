/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Utility {
    private String firstName;
    private String lastName;
    private String username; 
    
    public Utility(String firstName,String lastName, String username ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        
    }
    public String getfirstName(){return firstName;}
    public String getlastName(){return lastName;}
    public String getusername(){return username;}

    //Setters
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public void setusername(String username){
        this.username = username;
    }
    //String method : greet user
    public String greetfirstName(String firstName){
        if(firstName == null || firstName.isEmpty ()){
            return "Hello , Guest !";
        }
        return "Hello," + firstName + "!";
    }
    public String greetlastName(String lastName){
        if(lastName == null || lastName.isEmpty ()){
            return "Hello , Guest !";
        }
        return lastName +"!";
    }
    public String greetusername(String username){
        if(username == null || username.isEmpty ()){
            return "Hello , Guest !";
        }
        return username +"!";
    }
    
}
