package org.skypro.skyshop.controller;

import org.skypro.skyshop.model.article.Article;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.search.Searchable;
import org.skypro.skyshop.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ShopController {
    private final StorageService storageService;

    public ShopController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/products")
    public Collection<Product> getAllProducts(){
        return storageService.getProducts();
    }

    @GetMapping("/articles")
    public Collection<Article> getAllArticle(){
        return storageService.getArticles();
    }

    @GetMapping("/search")
    public Collection<Searchable> getAllItems(){
        return storageService.getSearchableItems();
    }
}
