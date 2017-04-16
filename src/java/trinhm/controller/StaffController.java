/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trinhm.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import trinhm.bean.Staff;

import trinhm.model.StaffModel;


/**
 *
 * @author tris
 */
@Controller
@RequestMapping("/staff")
public class StaffController {
    @RequestMapping("showall")
    public String showAll(ModelMap model){
        StaffModel staff=new StaffModel();
        List<Staff> list = new ArrayList<Staff>();
        list = staff.showProduct("");
        model.addAttribute("listStaff",list);
        Staff nv = new Staff();
  
        model.addAttribute("staff",nv);
        return "staff";
    }
    
    @RequestMapping("edit")
    public String edit(HttpServletRequest request, ModelMap model){
        String Id = request.getParameter("txtMaNV");
        
        String Name = request.getParameter("txtName");
        String Gender = request.getParameter("txtGender");
        String Birthday = request.getParameter("txtBirthday");
        String Photo = request.getParameter("txtPhoto");
        String Email = request.getParameter("txtEmail");
        String Phone = request.getParameter("txtPhone");
        double Salary = Double.parseDouble(request.getParameter("txtSalary"));
        String Notes = request.getParameter("txtNotes");
        String DepartId = request.getParameter("txtDepartId");
        Staff nv = new Staff(Id,Name,Gender,Birthday,Photo,Email,Phone,Salary,Notes,DepartId);
        model.addAttribute("staff", nv);
        
        List<Staff> list = new ArrayList<Staff>();
        list = StaffModel.showProduct("");
        model.addAttribute("listStaff", list);
        return "staff";
    }     
    
    @RequestMapping("delete")
    public String delete(HttpServletRequest request, ModelMap model, 
            @ModelAttribute("staff") Staff staff){
        String Id = request.getParameter("txtMaNV");
        StaffModel.delete(Id);
        List<Staff> list = new ArrayList<Staff>();
        list = StaffModel.showProduct("");
        model.addAttribute("listStaff", list);
        return "staff";
    }
    
    @RequestMapping(params="btnUpdate")
    public String update(@ModelAttribute("staff") Staff staff, ModelMap model) {       
        StaffModel.update(staff);
        List<Staff> list = new ArrayList<Staff>();
        list = StaffModel.showProduct("");
        model.addAttribute("listStaff", list);
        return "staff";
    }   
    
    @RequestMapping(params="btnInsert")
    public String insert(@ModelAttribute("staff") Staff staff, ModelMap model){
        StaffModel.insert(staff);
        List<Staff> list = new ArrayList<Staff>();
        list = StaffModel.showProduct("");
        model.addAttribute("listStaff", list);
        return "staff";
    }
    
}
