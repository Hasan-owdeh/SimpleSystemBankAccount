package com.example.bankaccountprogram

class BankAccount(var accountHolder: String,var balance: Double) {
    //i'm define the tybe of the  list because i don't have any contant inside that list
    private val transactionHistory=mutableListOf<String>()


    fun deposit(amount:Double){
        balance+=amount
        transactionHistory.add("$accountHolder deposit $$amount")

    }
    fun withDraw(amount: Double){
        if(amount<=balance){
            //we can withdrwa many
            balance-=amount
            transactionHistory.add("$accountHolder withdraw $$amount")
        }
        else{
            //we can't withdrwa many
              println("you don't have the funds to withdraw $amount")
        }

    }
    fun displayTransactionHistory(){

        println("Transaction history from $accountHolder")
        for (transaction in transactionHistory)
            println(transaction)

    }
}