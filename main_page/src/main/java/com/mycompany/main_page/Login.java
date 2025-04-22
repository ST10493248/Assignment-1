/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_page;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    //Attributes 
    private String firstName;
    private String lastName;
    private String username;
    private String cellNumber;
    private String Password;
    
    //constructor
    public Login(String firstName, String lastName , String username , String cellNumber, String Password){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.cellNumber = cellNumber;
        this.Password =  Password;       
    }
      public boolean checkUserName(){
          return username.contains("_")&&username.length()<=5;
      } 
      public boolean CheckpasswordComplexity(String Password){
          return Password.matches(".*[A-Z].*")&&
                 Password.matches(".*[a-z].*")&&
                 Password.matches(".*[0-9].*")&&
                 Password.matches(".*[!@#$%^&*()].*");
                
      }
      public boolean CheckcellPhoneNumber(){
          return cellNumber.length() == 10 && cellNumber.startsWith("+27");
      }
      public String registerUser(boolean CheckUserName, boolean CheckpasswordComplexity){
          if (!CheckUserName &&CheckpasswordComplexity){
              return ("REGISTRATION COMPLETE");
          }
          else if (!CheckpasswordComplexity){
              return("Password is not completely formatted , please ensure that the password contains atleast eight characters , a captial letter , a number and a special character.");
          
      }
      else if (!CheckUserName){
             return("Username is not completely formatted , please ensure that the password contains atleast eight characters , a captial letter , a number and a special character.");
      }
          return null;
      }
          public boolean loginUser(String username,String Password){
              return this.username.equals(username)&&this.Password.equals(Password);
      }
          public String returnLoginStatus(boolean loginResults){
              if(loginUser(username,Password)){
                  return "SUCCESSFUL LOGIN :, WELCOME" + username + "";
              }
              else {
                  return "LOGIN FAILED Please check your username and password.";
              }
          }
    
}
