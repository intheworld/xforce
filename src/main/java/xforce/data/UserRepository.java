package xforce.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import xforce.model.User;

/**
 * Created by liushuwei on 2017/5/1.
 */
public interface UserRepository extends MongoRepository<User, Long>{
    User findByUsername(String username);
}
