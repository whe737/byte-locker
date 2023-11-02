import java.util.ArrayList;

public class Main
{
    private static ArrayList<Account> accArr= new ArrayList();
    public static void main(String[] args)
    {
        Example examp=new Example("example", "password");
        accArr.add(examp);
        examp.resetExample();
        new LoginPage();
        Account yes=new Account();  //Calls a superclass’s no-argument constructor
        Account no=new Example("man", "person");    //Facilitates polymorphism, i.e. assigns an object of a subclass to a reference of a superclass.
        new Object();   //Calls the Object constructor.
        LoginPage.printAccountUser(examp);
        System.out.println(examp.generatePassword());
        Account[] a={new Example("thing", "password"),new Example("user", "name"),new Example("pass", "word")};
        ArrayList<Account> b=new ArrayList<>();
        b.add(new Example("thing", "password"));
        b.add(new Example("user", "name"));
        b.add(new Example("pass", "word"));
        examp.printBadPasswords(3);
        Account[][] accounts={{new Account()},{new Account()},{new Account()}};

    }
    public static void addAccount(Account p)
    {
        accArr.add(p);
    }
    public static ArrayList<Account> getAccounts()
    {
        return accArr;
    }
    public static Account getAccount(int i)
    {
        return accArr.get(i);
    }
    public static void traverseRowMajor(Account[][] acc)
    {
        for (Account[] i:acc)
        {
            for (Account j:i)
            {
                System.out.println(j);            
            }
        }
    }
    public static void traverseColumnMajor(Account[][] acc)
    {
        for (int i=0;i<acc[0].length;i++)
        {
            for (int j=0;j<acc.length;j++)
            {
                System.out.println(acc[j][i]);
            }
        }
    }
}