package xforce.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import xforce.data.ArticleRepository;
import xforce.model.Article;
import xforce.model.Page;

/**
 * Created by liushuwei on 2017/5/19.
 */

@Controller
public class ArticleController {
    private static final String MAX_LONG_AS_STRING = "9223372036854775807";

    private ArticleRepository articleRepository;

    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @RequestMapping(value = "/articles", method=RequestMethod.GET)
    public String articles(@RequestParam(value="max", defaultValue=MAX_LONG_AS_STRING) long max,
            @RequestParam(value="count", defaultValue="20") int count, Model model) {
        Page<Article> page = new Page<>(0, 10);
        page =  articleRepository.findPage(page, new Query());
        model.addAttribute("articleList",page.getContent());
        return "articles";
    }

    @RequestMapping(value="/{articleId}", method=RequestMethod.GET)
    public String articles(@PathVariable("articleId") long spittleId, Model model) {
        model.addAttribute(articleRepository.findById(String.valueOf(spittleId)));
        return "article";
    }
}
