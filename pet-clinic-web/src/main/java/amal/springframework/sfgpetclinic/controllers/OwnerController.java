package amal.springframework.sfgpetclinic.controllers;

import amal.springframework.sfgpetclinic.model.Owner;
import amal.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;


@Controller
@RequestMapping("/owners")
public class OwnerController {



    private final OwnerService ownerService;


    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index","/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());

        Set<Owner> set = ownerService.findAll();
        set.forEach(System.out::println);
        return "owners/index";
    }
}
