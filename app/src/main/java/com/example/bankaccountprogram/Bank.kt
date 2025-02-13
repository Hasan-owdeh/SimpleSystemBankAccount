package com.example.bankaccountprogram

fun main(){
    val hasanaccount= BankAccount("Hasan owdeh",300000.721)
    println(hasanaccount.accountHolder)
    hasanaccount.deposit(300.0)
    hasanaccount.displayTransactionHistory()
    //println(hasanaccount.balance)
   hasanaccount.withDraw(30000.721)
    println("${hasanaccount.accountHolder}'s balance is ${hasanaccount.balance}")

}