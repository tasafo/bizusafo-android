package org.tasafo.android.bizusafo.model;

import java.util.List;

/**
 * Created by ramonrabello on 11/04/15.
 */
public class Bizu {

    private String url;
    private String description;
    private String category;
    private List<String> tags;
    private String firstComment;

    public Bizu(String url, String description, String category, List<String> tags, String firstComment) {
        this.url = url;
        this.description = description;
        this.category = category;
        this.tags = tags;
        this.firstComment = firstComment;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getFirstComment() {
        return firstComment;
    }

    public void setFirstComment(String firstComment) {
        this.firstComment = firstComment;
    }
}
