package com.example.demo.Controller;
import com.example.demo.Entity.employ;
import com.example.demo.Repo.IemployRepoInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class StudController2 {
    @Autowired
    IemployRepoInter iemployRepoInter;

    @RequestMapping("/api/{id}")
    @ResponseBody
    public Optional<employ> home(@PathVariable("id") int id){
        return iemployRepoInter.findById(id);

    }
 @RequestMapping(path="api",produces = {"application/xml"})
public  ModelAndView home( employ student){
    ModelAndView mv =new ModelAndView("students.jsp");
     iemployRepoInter.save(student);
    mv.addObject("model",student);
    return mv;
}
@RequestMapping(value ="/addEmploy")
public ModelAndView getEmploy( @RequestParam int id){
ModelAndView mv=new ModelAndView("showemploy.jsp");
employ employ=iemployRepoInter.findById(id).orElse(new employ());
mv.addObject("employ",employ);
System.out.println(iemployRepoInter.findByName("Aynur"));
System.out.println(iemployRepoInter.findByIdGreaterThan(id));
return mv;
}
}
