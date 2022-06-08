package com.zercobase.WebSample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class SampleController {

    @GetMapping("/order/{orderId}")
    public String getOrder(@PathVariable String orderId ) {
        log.info("Get some order");
        return "orderId:1, orderAmount:1000";

    }

    @GetMapping("/order/")
    public String getOrderWithRequestParam(
            @RequestParam ("orderId") String id ) {
        log.info("Get some order");
        return "orderId:1"+ id + "orderAmount:1000";

    }

    @PostMapping("/order")
    public String createOrder() {
        log.info("Create order");
        return "order created - > orderId:1, orderAmount:1000";

    }


}
