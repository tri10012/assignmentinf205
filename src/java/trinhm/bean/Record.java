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
public class Record {
    private String Id;
    private String Type;
    private String Reason;
    private String Date;
    private String StaffId;
    
    public Record(){}

    public Record(String Id, String Type, String Reason, String Date, String StaffId) {
        this.Id = Id;
        this.Type = Type;
        this.Reason = Reason;
        this.Date = Date;
        this.StaffId = StaffId;
    }

    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getStaffId() {
        return StaffId;
    }

    public void setStaffId(String StaffId) {
        this.StaffId = StaffId;
    }
    
    
    
}
