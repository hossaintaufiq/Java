
package testaccount;
public class TestAccount {

    public static void main(String[] args) {
        
       Account a = new Account();
       
//       a.getAccountNumber(22334);
       a.setBalance(5000);
       a.credit(200);
       a.debit(100);
//       a(2253,200);
       
       
//        System.out.println(a(210553,500));

//        System.out.println("the details are " +a(400,600));
        System.out.println("account+ "+a.toString());
       
    }

   
}
