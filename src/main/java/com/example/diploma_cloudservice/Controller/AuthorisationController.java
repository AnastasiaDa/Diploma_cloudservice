package com.example.diploma_cloudservice.Controller;

import com.example.diploma_cloudservice.Service.AuthorisationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class AuthorisationController {

    private AuthorisationService AuthorisationService;

}
