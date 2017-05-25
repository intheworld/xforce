package xforce.data;

import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.core.query.Query;
import xforce.model.Article;
import xforce.model.Page;

import java.util.List;

/**
 * Created by liushuwei on 2017/5/19.
 */
public interface ArticleRepository {

    /**
     * 通过条件查询实体(集合)
     *
     * @param query
     */
    public List<Article> find(Query query) ;

    /**
     * 通过一定的条件查询一个实体
     *
     * @param query
     * @return
     */
    public Article findOne(Query query) ;

    /**
     * 通过条件查询更新数据
     *
     * @param query
     * @param update
     * @return
     */
    public void update(Query query, Update update) ;

    /**
     * 保存一个对象到mongodb
     *
     * @param entity
     * @return
     */
    public Article save(Article entity) ;

    /**
     * 通过ID获取记录
     *
     * @param id
     * @return
     */
    public Article findById(String id) ;


    /**
     * 分页查询
     * @param page
     * @param query
     * @return
     */
    public Page<Article> findPage(Page<Article> page, Query query);

    /**
     * 求数据总和
     * @param query
     * @return
     */
    public long count(Query query);

}
