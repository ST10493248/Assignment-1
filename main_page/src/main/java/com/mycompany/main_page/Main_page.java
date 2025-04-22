/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main_page;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Main_page {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLEAS ENTER FIRST NAME :");
        String firstName = scan.nextLine();
        System.out.println("PLEASE ENTER LAST NAME :");
        String lastName = scan.nextLine();
        System.out.println("PLEASE ENTER USERNAME :");
        String username = scan.nextLine();
        System.out.println("PLEASE ENTER CELLNUMBER :");
        String cellNumber = scan.nextLine();
        System.out.println("PLEASE ENTER PASSWORD :");
        String Password = scan.nextLine();
         
        Login login = new Login(firstName,lastName, username, cellNumber ,Password);
    }
       

}
