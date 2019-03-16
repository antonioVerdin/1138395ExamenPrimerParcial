package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping (path="/cv")
public class Controlador {

    Cita nuevo = new Cita();
    ArrayList<Cita> arrayList = new ArrayList<Cita>();

    @GetMapping("/datos")
    public void obtenerDatos(Model model){
        model.addAttribute("nuevo", nuevo);
    }

    @PostMapping("/datos")
    public String mostrarDatos(@ModelAttribute("registro") Model model){
        arrayList.add(nuevo);
        model.addAttribute("registro", arrayList);
        return "cv";
    }


}


