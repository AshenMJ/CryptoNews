package com.example.cryptonews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CryptoNewsController {
    @GetMapping("/Start.html")
    public String Start()
    {
        return "Start";
    }

}
