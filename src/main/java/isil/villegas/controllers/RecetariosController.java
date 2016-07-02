/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isil.villegas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alumno-CT
 */
@Controller
public class RecetariosController {
    
    @RequestMapping("/recetarios")
    public ModelAndView index() {
        return new ModelAndView("recetarios");
    }
}
