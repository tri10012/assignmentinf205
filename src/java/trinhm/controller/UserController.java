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

import trinhm.bean.User;

import trinhm.model.UserModel;
/**
 *
 * @author tris
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("showall")
    public String showAll(ModelMap model){
        UserModel user=new UserModel();
        List<User> list = new ArrayList<User>();
        list = user.showProduct("");
        model.addAttribute("listUser",list);
        User tk = new User();
  
        model.addAttribute("user", tk);
        return "user";
    }
    
    
    
    @RequestMapping("delete")
    public String delete(HttpServletRequest request, ModelMap model, 
            @ModelAttribute("user") User user){
        String Username = request.getParameter("txtUsername");
        UserModel.delete(Username);
        List<User> list = new ArrayList<User>();
        list = UserModel.showProduct("");
        model.addAttribute("listUser", list);
        return "user";
    }
    
    
    
    @RequestMapping(params="btnInsert")
    public String insert(@ModelAttribute("user") User user, ModelMap model){
        UserModel.insert(user);
        List<User> list = new ArrayList<User>();
        list = UserModel.showProduct("");
        model.addAttribute("listUser", list);
        return "user";
    }
}
