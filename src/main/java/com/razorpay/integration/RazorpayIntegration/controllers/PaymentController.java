package com.razorpay.integration.RazorpayIntegration.controllers;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.razorpay.integration.RazorpayIntegration.config.AppConfig;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Random;

//Creating API

@Controller
@RequestMapping("/user")
public class PaymentController extends AppConfig{

//    Random random=new Random(100000000);
    @PostMapping("/create_order")
    @ResponseBody
    public String createOrder(@RequestBody Map<String, Object> data) throws RazorpayException {
        System.out.println(data);
        System.out.println("Order intitated...");

        String name= data.get("name").toString();
        int roll= Integer.parseInt(data.get("roll").toString());
        String phone= data.get("phone").toString();
        int amt=Integer.parseInt(data.get("amount").toString()); //Getting the amount from the amount from the frontend or JS
        var razorpay=new RazorpayClient(MID, MKEY); //GETTING THE API ID & KEY FROM "AppCongif"

//        Generate order
        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount", amt*100); // amount in smallest unit i.e "PAISE" bcz Razorpay server by default convert it to "RUPEE"
        orderRequest.put("currency", "INR");
        orderRequest.put("receipt", "txn_235425");

//        Creating new payment/order
        Order order=razorpay.orders.create(orderRequest);
        System.out.println(order);

//        Save order details in the database


        return order.toString();

    }

//    public void startPayment(@RequestBody Map<String, Object> data) throws RazorpayException
////    Getting the data sent from the frontend i.e amount
//
//    {
//        System.out.println(data);
//        int orderId= random.nextInt(10000000);
//        RazorpayClient razorpay=new RazorpayClient(AppConfig.MID,AppConfig.MKEY); //GETTING THE API ID & KEY FROM "AppCongif"
//
//        JSONObject orderRequest = new JSONObject();
//        orderRequest.put("SID","S_001");
//        orderRequest.put("amount", data.get("amount")); // amount in the smallest currency unit
//        orderRequest.put("currency", "INR");
//        orderRequest.put("receipt", "order_rcptid_11");
//        orderRequest.put("orderId",orderId);
//        orderRequest.put("callbackUrl","http://localhost:8081/payment-success");
//
////        Placing order
//        Order order = razorpay.orders.create(orderRequest);
//        System.out.println(order);
//
//    }


}
