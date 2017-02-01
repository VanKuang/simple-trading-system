package cn.van.kuang.trading.booking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DealBookingController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
