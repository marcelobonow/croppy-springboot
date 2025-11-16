package com.marcelo.croppy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelo.croppy.models.Account;
import com.marcelo.croppy.repository.AccountRepository;

@RestController
public class CroppyController {
  @Autowired
  private AccountRepository repo;

  @GetMapping("/hello")
  public List<Account> requestMethodName() {
    var allAccounts = repo.findAll();
    return allAccounts;
  }

}
