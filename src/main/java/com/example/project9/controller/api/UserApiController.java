package com.example.project9.controller.api;

import com.example.project9.dto.ResponseDto;
import com.example.project9.entity.User;
import com.example.project9.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class UserApiController {

    @Autowired
    private UserService userService;

    @PostMapping("/auth/joinProc")
    public ResponseDto<Integer> save(@RequestBody User user){
        System.out.println("UserApiController : save 호출됨");
        userService.join(user);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }
}
