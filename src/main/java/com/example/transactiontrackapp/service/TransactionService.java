package com.example.transactiontrackapp.service;


import com.example.transactiontrackapp.entity.Transaction;
//import com.example.transactiontrackapp.repository.TransactionRepository;
import com.example.transactiontrackapp.repository.TrasactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TrasactionRepository transactionRepository;

    public List<Transaction> getUserTransactions(Long userId) {
        return transactionRepository.findByUserId(userId);
    }

    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
