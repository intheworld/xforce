package xforce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by liushuwei on 2017/5/19.
 */

@Document(collection = "articles")
public class Article {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String publishDateTime;

    private String imageUrl;

    public String getPublishDateTime() {
        return publishDateTime;
    }

    public void setPublishDateTime(String publishDateTime) {
        this.publishDateTime = publishDateTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getArticleSourceUrl() {
        return articleSourceUrl;
    }

    public void setArticleSourceUrl(String articleSourceUrl) {
        this.articleSourceUrl = articleSourceUrl;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getArticleSourceName() {
        return articleSourceName;
    }

    public void setArticleSourceName(String articleSourceName) {
        this.articleSourceName = articleSourceName;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    private String articleSourceUrl;

    private String articleTitle;

    private String articleUrl;

    private String articleSourceName;

    private String articleContent;

}
