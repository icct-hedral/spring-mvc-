/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tarea.controler;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.tarea.model.Productor;

import pe.tarea.service.ProductorService;


/**
 *
 * @author ANGEL
 */
@Controller
public class HomeController {
    
    @Autowired
    @Qualifier("productorServiceImpl")
    private ProductorService productorService;
    
    @RequestMapping 
    (value="/welcome",method=RequestMethod.GET)
    public String welcome_GET(){
        return "welcome";
    }
    
    @RequestMapping
    (value="/listar",method=RequestMethod.GET)
    public String listar_GET(Map map)
    {    
        map.put("bProductores",productorService.findAll());
        
        return "listar";   
    }
    @RequestMapping
    (value="/registrar",method = RequestMethod.GET)
    public String registrar_GET(Model model)
    {
        Productor productoModel=new Productor();
        model.addAttribute("productor",productoModel);
        
        return "registrar";
    }
    @RequestMapping
    (value="/registrar",method = RequestMethod.POST)
    public String registrar_POST(Productor productor)
    {
        productorService.insert(productor);
        return "registrar_ok";
    }
    @RequestMapping
    (value="/editar/{codigo}",method = RequestMethod.GET)
    public String editar_GET(Model model,@PathVariable("codigo") Integer codigo)
    {
       Productor productorModel=productorService.findById(codigo);
       model.addAttribute("productor",productorModel);
       
       return "editar";
    }
    @RequestMapping
    (value="/editar/{codigo}",method = RequestMethod.POST)
    public String editar_POST(Productor productor)
    {
       productorService.update(productor);
       return "redirect:/listar";
    }
    @RequestMapping
    (value="/borrar/{codigo}",method=RequestMethod.GET)
    public String borrar_GET(Model model,@PathVariable("codigo") Integer codigo)
    {
       Productor productorModel=productorService.findById(codigo);
       model.addAttribute("productor",productorModel);
       
       return "borrar";
    }
    @RequestMapping
    (value="/borrar/{codigo}",method=RequestMethod.POST)
    public String borrar_POST(Productor productor)
    {
        productorService.delete(productor.getCodigo());//eliminar productor de la bd
       return "redirect:/listar";
    }

}
