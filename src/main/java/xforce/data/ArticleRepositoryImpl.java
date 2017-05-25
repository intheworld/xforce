package xforce.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import xforce.model.Article;
import xforce.model.Page;

import java.util.List;

/**
 * Created by liushuwei on 2017/5/20.
 */

@Component
public class ArticleRepositoryImpl implements ArticleRepository{

    MongoTemplate mongoTemplate;

    @Autowired
    public ArticleRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
    @Override
    public List<Article> find(Query query) {
        return mongoTemplate.find(query, Article.class);
    }

    @Override
    public Article findOne(Query query) {
        return mongoTemplate.findOne(query, Article.class);
    }

    @Override
    public void update(Query query, Update update) {
        mongoTemplate.findAndModify(query, update, Article.class);
    }

    @Override
    public Article save(Article article) {
        mongoTemplate.insert(article);
        return article;
    }

    @Override
    public Article findById(String id) {
        return mongoTemplate.findById(id, Article.class);
    }

    @Override
    public Page<Article> findPage(Page<Article> page, Query query) {
        long count = count(query);
        int pageNumber = page.getPageNumber();
        int pageSize = page.getPageSize();
        query.skip((pageNumber - 1) * pageSize).limit(pageSize);
        List<Article> rows = find(query);
        page.setContent(rows);
        return page;
    }

    @Override
    public long count(Query query) {
        return mongoTemplate.count(query, Article.class);
    }
}
