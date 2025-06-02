/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Session;

import EntityClass.User;

/**
 *
 * @author USER
 */
public class Session {
    private static User loggedInUser;
    
    public static User getUser() {
        return loggedInUser;
    }
    
    public static void setUser(User user) {
        loggedInUser = user;
    }
    
    public static void clear() {
        loggedInUser = null;
    }
    
    public static boolean isLoggedIn() {
        return loggedInUser != null;
    }
}