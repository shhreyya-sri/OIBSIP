import java.util.*;
import java.lang.*;
public class task3

{

    String UserId;
    String Pin;
    String Name;
    float AccountBalance=0;
    int Transactions=0;
    String Transactionshistory="";
    public void Registration()

    {

        Scanner in= new Scanner(System.in);
        System.out.println("Enter your Name :");
        Name=in.nextLine();
        System.out.println("Enter your UserId :");
        UserId=in.nextLine();
        System.out.println("Enter Pin :");
        Pin=in.nextLine();
        System.out.println("\nYou have Registered Successfully");

    }

    public void Logintobankaccount()

    {

        int l=0;
        Scanner in= new Scanner(System.in);
        while(l==0)
        {
            System.out.println("\nEnter UserId: ");
            String userId=in.nextLine();
            if(userId.equals(UserId))
            {
                System.out.println("\nEnter Pin: ");
                String password= in.nextLine();
                if(password.equals(Pin))
                {
                    System.out.println("\nYou have Login Successfully");
                    l=1;
                }
                else
                {
                    System.out.println("\nIncorrect Pin");
                }
            }
            else
            {
                System.out.println("\nUserId not found");
            }
        }
    }
    public void Transactionhistory()
    {
        System.out.println("\n"+Transactionshistory);
    }
    public void withdraw()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("\nEnter Amount :");
        float Amount= in.nextFloat();
        if(AccountBalance>=Amount)
        {
            AccountBalance=AccountBalance-Amount;
            System.out.println("\nWithdrawal Successful");
            Transactions++;
            String transactions= Amount+"has been withdrawn from your account \n";
            Transactionshistory= Transactionshistory.concat(transactions);
        }
        else
        {
            System.out.println("\nInsufficient Account Balance");
        }
    }
    public void deposit()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("\nEnter Amount :");
        float Amount= in.nextFloat();
        if(Amount>0)
        {
            AccountBalance=AccountBalance+Amount;
            System.out.println("\nAmount Deposited Successfully");
            Transactions++;
            String transactions= Amount+"has been deposited into your Account\n";
            Transactionshistory= Transactionshistory.concat(transactions);
        }
        else
        {
            System.out.println("Enter valid Amount\n");
        }
    }
    public void transfer()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\nEnter Receiver's UserId: ");
        String receiver= sc.nextLine();
        System.out.println("\nEnter Amount :");
        float Amount= sc.nextFloat();
        if(Amount<=AccountBalance){
            AccountBalance=AccountBalance-Amount;
            System.out.println("\nSuccessfully transfered ");
            Transactions++;
            String transactions= Amount+" transfered to "+receiver+"\n";
            Transactionshistory=Transactionshistory.concat(transactions);
        }
        else
        {
            System.out.println("\nInsufficient Account Balance");
        }
    }
    public void checkbalance()
    {
        System.out.println("Your Account balance is"+AccountBalance+"\n");
    }
public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("                   WELCOME TO THE ATM SYSTEM                   \n");
    System.out.println("\nEnter :1-For Registration \n        2-To Exit");
    System.out.println("\nEnter your choice: ");
    int thein=sc.nextInt();
    if(thein==1)
    {
        task3 bankaccount = new task3();
        bankaccount.Registration();
        System.out.println("\nEnter your details to login :");
        bankaccount.Logintobankaccount();
        boolean Exit=false;
        while(!Exit)
        {
            System.out.println("\n1.Check your Transactions history \n2.Withdrawal \n3.Deposit \n4.Transfer \n5.Check Account Balance\n6.To Exit");
            System.out.println("\nEnter your choice :");
            int number=sc.nextInt();
            if(number==1)
            {
               bankaccount.Transactionhistory();
            }
            else if(number==2)
            {
                  bankaccount.withdraw();
            }
            else if(number==3)
            {
                bankaccount.deposit();
            }
            else if(number==4)
            {
                bankaccount.transfer();
            }
            else if(number==5)
            {
                bankaccount.checkbalance();
            }       
            else if(number==6)
            {
                Exit=true;
            }
            else
            {
                System.out.println("Enter a valid number .!");
            }
        }
    }
}
}
