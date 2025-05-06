package org.skypro.skyshop.skyshop.model.search;

import java.util.UUID;

public interface Searchable {

    String getSearchTerm();

    String getContentType();

    default String getStringRepresentation() {
        return getSearchTerm() + " " + getContentType();
    };

    UUID getId();
}
