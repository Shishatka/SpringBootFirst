package org.skypro.skyshop.skyshop.model.article;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;

public class Article implements Searchable {
    private String name;
    private String article;
    private final UUID id;

    public Article(UUID id, String name, String article) {
        this.id = id;
        this.name = name;
        this.article = article;
    }

    @Override
    public String toString(){
        return name + "\n" + article;

    }

    @JsonIgnore
    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public UUID getId() {
        return id;
    }

    @JsonIgnore
    @Override
    public String getSearchTerm() {
        return name + " " + article;
    }

    public String getArticle() {
        return article;
    }
}
