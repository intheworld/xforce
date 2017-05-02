package xforce.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import xforce.data.UserRepository;
import xforce.model.User;

import java.util.List;

@RestController
public class SimpleRestController {

    private UserRepository userRepository;
    @Autowired
    public SimpleRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<User> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return userRepository.findAll();
    }

}
