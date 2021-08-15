package controllers;

import models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ProductService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {


    @RequestMapping("/show")
    public ModelAndView home() {
        ModelAndView modelAndView=new ModelAndView("Show");
        modelAndView.addObject("list",ProductService.listProduct);
        return modelAndView;
    }

    @GetMapping("/edit")
    public String showedit(HttpServletRequest request, @RequestParam int index) {
        request.setAttribute("product", ProductService.listProduct.get(index));
        return "edit";
    }

    @GetMapping("/create")
    public String showCreate() {
        return "create";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int index) {
        ProductService.delete(index);
        return "redirect:/show";
    }


    @PostMapping("/edit")
    public String edit(@RequestParam int index, @ModelAttribute Product product) {
        ProductService.edit(product, index);
        return "redirect:/show";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product) {
        ProductService.create(product);
        return "redirect:/show";
    }

    @PostMapping("/find")
    public String find(HttpServletRequest request,@RequestParam String nameFind) {

        request.setAttribute("list",  ProductService.findByName(nameFind));
        return "Show";
    }
}