
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mattAcount = new Account("Matt's account", 1000.0);
        Account myAccount = new Account("My account", 0.0);
        
        mattAcount.withdrawal(100.0);
        myAccount.deposit(100.0);
        
        System.out.println(mattAcount);
        System.out.println(myAccount);
    }

}
