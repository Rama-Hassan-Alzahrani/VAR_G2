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
public class Location {
    
    private double Longitude;
    private double Latitude;

    public Location(double Longitude, double Latitude) {
        this.Longitude = Longitude;
        this.Latitude = Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }
    
    
    
}
