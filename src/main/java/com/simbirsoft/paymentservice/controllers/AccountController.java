package com.simbirsoft.paymentservice.controllers;

import com.simbirsoft.paymentservice.models.dtos.AccountDto;
import com.simbirsoft.paymentservice.service.AccountService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/api/accounts")
public class AccountController {

    AccountService accountService;

    @PostMapping("/add")
    public ResponseEntity<?> addAccount(@Valid @RequestBody AccountDto accountDto) {
        accountService.saveAccount(accountDto);

        return ResponseEntity.ok().build();

    }
}
