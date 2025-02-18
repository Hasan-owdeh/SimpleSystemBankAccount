package com.example.bankaccountprogram

import java.time.temporal.TemporalAmount

class ATM {
    var user = Account()

    // Set account details (holder name, password, and balance)
    fun setAccountDetails(name: String, pass: Int, balance: Double) {
        user.setAccountHolder(name)
        user.setAccountPass(pass)
        user.setBalance(balance)
    }
    fun deposit(amount: Double){
        if(amount>0){

            user.setBalance(user.getBalance() + amount )
            println("Succeffuly deposited $$amount. New balance :$${user.getBalance()}")
        }else{
            println("Deposit amount must be greather than zero ")
        }
    //WithDreaw money
    fun withdraw(amount: Double,enterdpass: Int){
        //corrected pass check
        if(enterdpass==user.getAccountPass()){
            if(amount>0 && amount<=user.getBalance()){
                user.setBalance(user.getBalance()-amount)
                println("WithDraw of $amount success")

            }else{
                println("insufficient balance  ")
            }

        }else{
            println("incorrect password, try again ")
        }
    }

    // check balance
    fun CheckBalance(EnterdPass:Int){
        if(EnterdPass==user.getAccountPass()){
            println("Your current balance is =$${user.getBalance()}")
        }else{
            println("Incorrect password ")
        }

    }

    }
}
