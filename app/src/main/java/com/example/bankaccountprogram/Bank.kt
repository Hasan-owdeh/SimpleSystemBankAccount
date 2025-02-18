package com.example.bankaccountprogram

class Bank {
    var user = Account()
    private val accounts = mutableListOf<String>()
    private val passes = mutableListOf<Int>()
    private val balances = mutableListOf<Double>()

    fun createAccount(accountPass: Int, accountHolder: String, initialBalance: Double = 0.0){
        accounts.add(accountHolder)
        passes.add(accountPass)
        balances.add(initialBalance)
        println("A created account for $accountHolder, with $$initialBalance as an initial Balance")
    }

    fun getAccountDetails(): String {
        return " Account Holder: ${user.getAccountHolder()}, Balance: $${user.getBalance()}"
    }
}