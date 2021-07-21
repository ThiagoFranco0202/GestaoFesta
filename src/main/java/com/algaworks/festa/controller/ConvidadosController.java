package com.algaworks.festa.controller;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repository.Convidados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

    @Autowired
    private Convidados convidados;

    @GetMapping
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidados.findAll());
        modelAndView.addObject(new Convidado());
        return modelAndView;
    }

    @GetMapping("/{id_convidado}")
    public String confirmar(@PathVariable Long id_convidado) {
        Optional<Convidado> aux = this.convidados.findById(id_convidado);

        aux.get().setConfirmado(true);

        this.convidados.saveAndFlush(aux.get());

        return "redirect:/convidados";
    }

    @PostMapping
    public String salvar(Convidado convidado) {
        this.convidados.save(convidado);
        return "redirect:/convidados";
    }

    @DeleteMapping("/{convidado}")
    public @ResponseBody void deletar(@PathVariable("convidado") long id){
        this.convidados.deleteById(id);
    }
}
