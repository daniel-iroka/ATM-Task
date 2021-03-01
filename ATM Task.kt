//Task:create an ATM program
//By martins Iroka

fun main() {
  var account = 5000.00;
    println("Welcome Customer!\n")
    println("Your Acount Balance is $account\$\n")
    println("payment or withdrawal?\n");

//input your action    
    var payment = "payment";
    var withdrawal = "withdrawal";
    
    var action :String = readLine()!!.toString();
    
    if (action == payment) {
      println("How much do you want to pay in?")
    }
    else if(action == withdrawal) {
      println("You have 5000$\n")
      println("How much do you want to withdraw?")
    } else {
      println("Input a valid choice")
    }
    
    var amountPOrW :Int = readLine()!!.toInt();
      if(action == payment){
        println("You payed in $amountPOrW\n");
        println("You now have ${amountPOrW+account}\$\n");
        println("Thank you for banking with us!\n")
      }
      else if(action == withdrawal) {
        println("you withdrew ${amountPOrW}");
        println("you now have ${amountPOrW-account}");
        println("Thank you for banking with us")
      } else {
        println("please input a valid amount")
      }
}