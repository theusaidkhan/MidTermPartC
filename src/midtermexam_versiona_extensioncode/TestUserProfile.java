/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author usaidkhan
 */

//Create new class TestUserProfile midterm
public class TestUserProfile extends UserProfile {
    
    TestUserProfile(String givenName, String givenGenre)
    {
        String name = givenName;
        String genre= givenGenre;
    }
    
    
    //main
    public static void main(String[] args) {
        
        System.out.println("Enter your name and genre you like");
        
        // NOTE: JUST SOME FILLER CODE, DIDN'T VERIFY IF RUNNING OR NOT!!
        TestUserProfile t = new TestUserProfile("MK", "Sounds");
        
        System.out.println("Your profile was created!");

    
    }
    
}