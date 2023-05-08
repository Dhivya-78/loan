package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoginModel;

import com.example.demo.Service.LoginService;
@RestController
public class LoginController {
	@Autowired
	LoginService lser;
	@PostMapping("/checklogin")
	public  String validateUser(@RequestBody LoginModel lm)
	{
		System.out.println(lm.getEmail());
		return  lser.validateUser(lm.getEmail(),lm.getPassword());
	}
	@PostMapping("/addUser")
    public LoginModel saveLoginModel(@RequestBody LoginModel lk)
    {
		return lser.saveLogin(lk);
    }
}
