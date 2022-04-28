package com.sanjaal.wallet.monitor.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MonitorController {

    @RequestMapping("/healthcheck")
    public String healthCheck() {
        return "Up and Running";
    }
}
