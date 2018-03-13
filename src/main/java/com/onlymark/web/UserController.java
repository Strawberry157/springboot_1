package com.onlymark.web;

import com.onlymark.pojo.User;
import com.onlymark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取用户列表
     * @return
     */
    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<User> getUserList(){
        List<User> userList = userService.getUserList();
        return userList;
    }

    /**
     * 添加一个新User
     * @param user
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
        userService.addUser(user);
        return "success";
    }

    /**
     * 通过id查User
     * @param id
     * @return
     */
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        User user = userService.getById(id);
        return user;
    }

    /**
     * 根据id修改user
     * @param id
     * @param user
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute User user){
        userService.putUser(id, user);
        return "success";
    }

    /**
     * 根据id删除user
     * @param id
     * @return
     */
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        userService.remove(id);
        return "success";
    }
}
