
package com.mycompany.jsfloginejemplazo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class loginBean {
    private String username;
    private String password;
    
    public String login(){
        if (username.equals("admin") && password.equals("admin")) {
            return "home";
        }else{
            return "login";
        }
    }
    public String logout(){
        username = null;
        password = null;
        return "login";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
