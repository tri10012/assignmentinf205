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
import trinhm.bean.Record;
import trinhm.model.RecordModel;


/**
 *
 * @author tris
 */
@Controller
@RequestMapping("/record")
public class RecordController {
    @RequestMapping("showall")
    public String showAll(ModelMap model){
        RecordModel record=new RecordModel();
        List<Record> list = new ArrayList<Record>();
        list = record.showProduct("");
        model.addAttribute("listRecord",list);
        Record dg = new Record();
        model.addAttribute("record",dg);
        return "record";
    }
    
    @RequestMapping("delete")
    public String delete(HttpServletRequest request, ModelMap model, 
            @ModelAttribute("record") Record record){
        String Id = request.getParameter("txtMaId");
        RecordModel.delete(Id);
        List<Record> list = new ArrayList<Record>();
        list = RecordModel.showProduct("");
        model.addAttribute("listRecord", list);
        return "record";
    }
    
     @RequestMapping(params="btnInsert")
    public String insert(@ModelAttribute("record") Record record, ModelMap model){
        RecordModel.insert(record);
        List<Record> list = new ArrayList<Record>();
        list = RecordModel.showProduct("");
        model.addAttribute("listRecord", list);
        return "record";
    }
}
