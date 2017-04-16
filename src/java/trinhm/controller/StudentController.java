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
import trinhm.bean.Student;
import trinhm.model.StudentModel;

/**
 *
 * @author tris
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    
    @RequestMapping("showall")
    public String showAll(ModelMap model){
        StudentModel st = new StudentModel();
        List<Student> list = new ArrayList<Student>();
        list = st.showProduct("");
        model.addAttribute("listStudent", list);
        
        Student sv = new Student();
        sv = list.get(0);
        model.addAttribute("student",sv);
        return"student";
    }
    
    @RequestMapping("edit")
    public String edit(HttpServletRequest request, ModelMap model){
        int masv = Integer.parseInt(request.getParameter("txtMasv"));
        String name = request.getParameter("txtName");
        double mark = Double.parseDouble(request.getParameter("txtMark"));
        String major = request.getParameter("txtMajor");
        Student sv = new Student(masv, name, mark, major);
        model.addAttribute("student", sv);
        
        List<Student> list = new ArrayList<Student>();
        list = StudentModel.showProduct("");
        model.addAttribute("listStudent", list);
        return "student";
    }     
    
    @RequestMapping("delete")
    public String delete(HttpServletRequest request, ModelMap model, 
            @ModelAttribute("student") Student student){
        int masv = Integer.parseInt(request.getParameter("txtMasv"));
        StudentModel.delete(masv);
        List<Student> list = new ArrayList<Student>();
        list = StudentModel.showProduct("");
        model.addAttribute("listStudent", list);
        return "student";
    }
    
     @RequestMapping(params="btnUpdate")
    public String update(@ModelAttribute("student") Student student, ModelMap model) {       
        StudentModel.update(student);
        List<Student> list = new ArrayList<Student>();
        list = StudentModel.showProduct("");
        model.addAttribute("listStudent", list);
        return "student";
    }   
    @RequestMapping(params="btnInsert")
    public String insert(@ModelAttribute("student") Student student, ModelMap model){
        StudentModel.insert(student);
        List<Student> list = new ArrayList<Student>();
        list = StudentModel.showProduct("");
        model.addAttribute("listStudent", list);
        return "student";
    }
    
}
