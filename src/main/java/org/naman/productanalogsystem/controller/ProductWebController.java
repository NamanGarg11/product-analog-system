package org.naman.productanalogsystem.controller;

import org.naman.productanalogsystem.model.Product;
import org.naman.productanalogsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web")
public class ProductWebController {

    @Autowired
    private ProductService productService;

    // Root path redirect
    @GetMapping("")
    public String webHome() {
        return "redirect:/web/products";
    }

    // Display all products
    @GetMapping("/products")
    public String getAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        model.addAttribute("newProduct", new Product());
        return "products"; // This should be your product listing HTML page
    }

    // Show form to add new product
    @GetMapping("/products/new")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("isEdit", false);
        return "product-form"; // This should be your product form HTML page
    }

    // Show form to edit existing product
    @GetMapping("/products/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Product product = productService.getProductById(id).orElse(null);
        model.addAttribute("product", product);
        model.addAttribute("isEdit", true);
        return "product-form";
    }

    // Handle form submission for both add and edit
    @PostMapping("/products/save")
    public String saveProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/web/products";
    }

    // Delete product
    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/web/products";
    }

    // Home page redirect
    @GetMapping("/")
    public String home() {
        return "redirect:/web/products";
    }
}



