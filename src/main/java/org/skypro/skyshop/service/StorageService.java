package org.skypro.skyshop.service;

import org.skypro.skyshop.model.article.Article;
import org.skypro.skyshop.model.product.DiscountedProduct;
import org.skypro.skyshop.model.product.FixPriceProduct;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.product.SimpleProduct;
import org.skypro.skyshop.model.search.Searchable;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StorageService {
    private final Map<UUID, Product> products;

    private final Map<UUID, Article> articles;

    public StorageService() {
        this.products = new HashMap<>();
        this.articles = new HashMap<>();
        createTestData();
    }

    public Collection<Product> getProducts() {
        return products.values();
    }

    public Collection<Article> getArticles() {
        return articles.values();
    }

    public Collection<Searchable> getSearchableItems(){
        Collection<Searchable> collection = new ArrayList<>();
        collection.addAll(products.values());
        collection.addAll(articles.values());

        return collection;
    }

    private void createTestData() {
        Product banana = new SimpleProduct(UUID.randomUUID(), "Banana", 1);
        Product pairOfShoes = new SimpleProduct(UUID.randomUUID(), "Converse Chuck 70", 50);
        Product packOfNails = new SimpleProduct(UUID.randomUUID(), "Pack of long nails", 3);
        Product stickers = new SimpleProduct(UUID.randomUUID(), "Java Stickers", 5);
        Product oranges = new SimpleProduct(UUID.randomUUID(), "Oranges", 2);
        Product grapes = new SimpleProduct(UUID.randomUUID(), "Grapes", 2);
        Product blackBanana = new DiscountedProduct(UUID.randomUUID(), "Black banana", 10, 50);
        Product oldShoes = new DiscountedProduct(UUID.randomUUID(), "Old shoes", 100, 25);
        Product ledLight = new FixPriceProduct(UUID.randomUUID(), "Led Light");
        Product databaseBook = new FixPriceProduct(UUID.randomUUID(), "The manga guide to databases");
        Article aboutBananas = new Article(UUID.randomUUID(), "About banana", "Something about banana");
        Article sneakerHead = new Article(UUID.randomUUID(), "SneakerHeads and items that they buy", "It can be either pair of Chuck 70 or some Old shoes");
        this.products.put(banana.getId(), banana);
        this.products.put(pairOfShoes.getId(), pairOfShoes);
        this.products.put(packOfNails.getId(), packOfNails);
        this.products.put(oranges.getId(), oranges);
        this.products.put(stickers.getId(), stickers);
        this.products.put(grapes.getId(), grapes);
        this.products.put(blackBanana.getId(), blackBanana);
        this.products.put(oldShoes.getId(), oldShoes);
        this.products.put(ledLight.getId(), ledLight);
        this.products.put(databaseBook.getId(), databaseBook);
        this.articles.put(aboutBananas.getId(), aboutBananas);
        this.articles.put(sneakerHead.getId(), sneakerHead);
    }
}
