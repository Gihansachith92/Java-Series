package Constructor_Overloading;

public class Bank {
    int rupees;
    Bank(){
        rupees = 0;
    }
    Bank(int x){
        rupees =x;
    }

    public static void main(String[] args) {
        Bank kamal = new Bank();
        Bank nimal = new Bank(20);
        System.out.println(kamal.rupees);
        System.out.println(nimal.rupees);
    }
}
