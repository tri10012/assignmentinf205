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
import trinhm.bean.Depart;
import trinhm.model.DepartModel;




/**
 *
 * @author tris
 */
@Controller
@RequestMapping("/depart")
public class DepartController {
    @RequestMapping("showall")
    public String showAll(ModelMap model){
        DepartModel depart=new DepartModel();
        List<Depart> list = new ArrayList<Depart>();
        list = depart.showProduct("");
        model.addAttribute("listDepart",list);
        Depart pb = new Depart();
  
        model.addAttribute("depart", pb);
        return "depart";
    }
    @RequestMapping("edit")
    public String edit(HttpServletRequest request, ModelMap model){
        String Id = request.getParameter("txtMaPB");
        
        String Name = request.getParameter("txtName");
        
        Depart pb = new Depart(Id,Name);
        model.addAttribute("depart", pb);
        
        List<Depart> list = new ArrayList<Depart>();
        list = DepartModel.showProduct("");
        model.addAttribute("listDepart", list);
        return "depart";
    }    
    
    @RequestMapping("delete")
    public String delete(HttpServletRequest request, ModelMap model, 
            @ModelAttribute("depart") Depart depart){
        String Id = request.getParameter("txtMaPB");
        DepartModel.delete(Id);
        List<Depart> list = new ArrayList<Depart>();
        list = DepartModel.showProduct("");
        model.addAttribute("listDepart", list);
        return "depart";
    }
    
    @RequestMapping(params="btnUpdate")
    public String update(@ModelAttribute("depart") Depart depart, ModelMap model) {       
        DepartModel.update(depart);
        List<Depart> list = new ArrayList<Depart>();
        list = DepartModel.showProduct("");
        model.addAttribute("listDepart", list);
        return "depart";
    } 
    
    @RequestMapping(params="btnInsert")
    public String insert(@ModelAttribute("depart") Depart depart, ModelMap model){
        DepartModel.insert(depart);
        List<Depart> list = new ArrayList<Depart>();
        list = DepartModel.showProduct("");
        model.addAttribute("listDepart", list);
        return "depart";
    }
}
