package com.example.bankaccountprogram

class Account(){
    private var accountPass :Int=0
    private var accountHolder :String=""
    private var balance :Double=0.0

    fun getAccountHolder():String{
        return accountHolder;
    }
    //getAccountHolder

    fun getAccountPass():Int{
        return accountPass
    }
    //getAccountPass

    fun getBalance():Double{
        return balance
    }
    //getBalance
    fun setAccountHolder(name:String){
        accountHolder=name
    }
    //setAccountHolder

    fun setAccountPass(pass :Int){
        accountPass =pass
    }
    //setAccountPass

    fun setBalance(balance: Double){
        this.balance=balance
    }
    //setBalance
}
