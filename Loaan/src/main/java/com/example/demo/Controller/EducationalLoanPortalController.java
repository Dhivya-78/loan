package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.AdminModel;
import com.example.demo.Model.LoanApplicationModel;

import com.example.demo.Model.UserModel;
import com.example.demo.Service.EducationalLoanPortalService;
@RestController
public class EducationalLoanPortalController {
	//UserModel
    @Autowired
	EducationalLoanPortalService elser;
	@PostMapping("/postusermodel")
	public UserModel saveDetail(@RequestBody UserModel um)
	{
		return elser.saveDetail(um);
	}
	@GetMapping("/getusermodel")
	public List<UserModel> getDetail()
	{
		return elser.getDetail();
	}
	@PutMapping("/putusermodel")
	public UserModel updateDetail(@RequestBody UserModel um)
	{
		return elser.updateInfo(um);
	}
	@DeleteMapping("/deleteusermodel/{id}")
	public String deleteDetails(@PathVariable int cid)
	{
	elser.deleteInfo(cid);
		return "Carid"+cid+"deleted";
	}

	//LoanApplicationModel
	@PostMapping("/postloanapplicationmodel")
	public LoanApplicationModel saveInfo(@RequestBody LoanApplicationModel lam)
	{
		return elser.saveInfo(lam);
	}
	@GetMapping("/getloanapplicationmodel")
	public List<LoanApplicationModel> getlogin()
	{
		return elser.getInfo();
	}
	//AdminModel
	@PostMapping("/postadminmodel")
	public AdminModel save(@RequestBody AdminModel am)
	{
		return elser.savedata(am);
	}
	@GetMapping("/getadminmodel")
	public List<AdminModel> get()
	{
		return elser.getdata();
	}
}
