package controllers;

import models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import service.ProductService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {


    @RequestMapping("/show")
    public String home(HttpServletRequest request) {
        request.setAttribute("list", ProductService.listProduct);
        return "/WEB-INF/show.jsp";
    }

    @GetMapping("/edit")
    public String showedit(HttpServletRequest request, @RequestParam int index) {
        request.setAttribute("product", ProductService.listProduct.get(index));
        return "/WEB-INF/edit.jsp";
    }

    @GetMapping("/create")
    public String showCreate() {
        return "/WEB-INF/create.jsp";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int index) {
        ProductService.delete(index);
        return "/show";
    }


    @PostMapping("/edit")
    public String edit(@RequestParam int index, @ModelAttribute Product product) {
        ProductService.edit(product, index);
        return "/show";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product) {
        ProductService.create(product);
        return "/show";
    }

    @PostMapping("/find")
    public String find(HttpServletRequest request,@RequestParam String nameFind) {

        request.setAttribute("list",  ProductService.findByName(nameFind));
        return "/WEB-INF/show.jsp";
    }
}