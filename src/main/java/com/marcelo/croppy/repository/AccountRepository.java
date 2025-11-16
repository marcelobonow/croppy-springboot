package com.marcelo.croppy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelo.croppy.models.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}