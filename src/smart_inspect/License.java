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
public class License {
    
    private int lifeInYears;
    private String name;
    private LocalDate issueDate;
    private LocalDate expirationDate;

    public License(int lifeInYears, String name, LocalDate issueDate, LocalDate expirationDate) {
        this.lifeInYears = lifeInYears;
        this.name = name;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
    }

    public int getLifeInYears() {
        return lifeInYears;
    }

    public void setLifeInYears(int lifeInYears) {
        this.lifeInYears = lifeInYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    
    
    
}
