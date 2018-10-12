package com.dayi.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dayi.entity.Payment;
import com.dayi.service.PaymentService;

@Controller
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
//	
//	@RequestMapping("/payment")
//	public String Payment(HttpServletRequest request,Model model,HttpSession session){
//		return "payment";
//	}
	
	

	
	
	@RequestMapping("/payment")
	public String editPay(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");;
		response.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
     
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");
        String message = request.getParameter("message");
        
        Payment payment = new Payment();
       
        payment.setName(name);
        payment.setEmail(email);
        payment.setTel(tel);
        payment.setMessage(message);
        
        paymentService.savePay(payment);
        return "payment";
	}
}
