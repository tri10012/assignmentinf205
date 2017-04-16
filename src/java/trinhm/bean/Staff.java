/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trinhm.bean;

/**
 *
 * @author tris
 */
public class Staff {
    private String Id;
    
    private String Name;
    private String Gender;
    private String Birthday;
    private String Photo;
    private String Email;
    private String Phone;
    private String Notes;
     private Double Salary;
    private String DepartId;
    public Staff(){}
    
    
    public Staff(String Id,  String Name, String Gender, String Birthday,String Photo, String Email, String Phone, Double Salary,String Notes, String DepartId) {
        this.Id = Id;
        
        this.Name = Name;
        this.Gender = Gender;
        this.Birthday = Birthday;
        this.Photo = Photo;
        this.Email = Email;
        this.Phone = Phone;
        this.Salary = Salary;
        this.Notes = Notes;
        this.DepartId = DepartId;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }

    public String getDepartId() {
        return DepartId;
    }

    public void setDepartId(String DepartId) {
        this.DepartId = DepartId;
    }

    
    
   

    
   
}
