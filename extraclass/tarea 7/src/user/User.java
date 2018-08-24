package user;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ulacit
 */
public class User <T>{
    private T name;
    private T Last;
    private T Age;


    public void setName(T name) {
        this.name = name;
    }

    public void setLast(T Last) {
        this.Last = Last;
    }

    public void setAge(T Age) {
        this.Age = Age;
    }

    public T getName() {
        return name;
    }

    public T getLast() {
        return Last;
    }

    public T getAge() {
        return Age;
    }
    
    public String getCadenaT() {
        
        String cadena = this.name + ";" + this.Last + ";" + this.Age;
        return cadena;
    }
    
    
    
    
}
