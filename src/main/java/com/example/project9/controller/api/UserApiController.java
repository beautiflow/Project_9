package com.example.project9.controller.api;

import com.example.project9.dto.ResponseDto;
import com.example.project9.entity.RoleType;
import com.example.project9.entity.User;
import com.example.project9.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@ResponseBody
public class UserApiController {

    @Autowired
    private UserService userService;

    @PostMapping("/Project_9/api/user")
    public ResponseDto<Integer> save(@RequestBody User user){
        System.out.println("UserApiController : save 호출됨");
        user.setRole(RoleType.USER);
        userService.join(user);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }

    @PostMapping("/Project_9/api/user/login")
    public ResponseDto<Integer> login(@RequestBody User user, HttpSession session){
        System.out.println("UserApiController : login 호출됨");
        User principal = userService.login (user); // principal(접근주체)
        
        if(principal != null){
            session.setAttribute("principal", principal);
        }
        
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }
}
