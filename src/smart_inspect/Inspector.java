/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart_inspect;

/**
 *
 * @author joud
 */
public class Inspector {
    private String usesrname;
    private String password;
    private int ID;

    public Inspector(String usesrname, String password, int ID) {
        this.usesrname = usesrname;
        this.password = password;
        this.ID = ID;
    }

    public String getUsesrname() {
        return usesrname;
    }

    public void setUsesrname(String usesrname) {
        this.usesrname = usesrname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
