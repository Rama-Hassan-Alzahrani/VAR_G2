/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart_inspect;

import java.time.LocalDate;

/**
 *
 * @author joud
 */
public class Establishment {
    private int ID;
    private String name;   
    private License license;
    private Location location;
    private String secotr;
    private String ownerName;
    private LocalDate establishmentCreationDate;
    private boolean isViolating;

    public Establishment(int ID, String name, License license, Location location, String secotr, String ownerName, LocalDate establishmentCreationDate, boolean violationStatus) {
        this.ID = ID;
        this.name = name;
        this.license = license;
        this.location = location;
        this.secotr = secotr;
        this.ownerName = ownerName;
        this.establishmentCreationDate = establishmentCreationDate;
        this.isViolating = false;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getSecotr() {
        return secotr;
    }

    public void setSecotr(String secotr) {
        this.secotr = secotr;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public LocalDate getEstablishmentCreationDate() {
        return establishmentCreationDate;
    }

    public void setEstablishmentCreationDate(LocalDate establishmentCreationDate) {
        this.establishmentCreationDate = establishmentCreationDate;
    }

    public boolean isViolationStatus() {
        return isViolating;
    }

    public void setViolationStatus(boolean violationStatus) {
        this.isViolating = violationStatus;
    }
    
    
    
    
}
