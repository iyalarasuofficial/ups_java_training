package Basic;


abstract class Bank {
    abstract void rule();
}

class SBI extends Bank {
    void rule() {
        System.out.println("sbi rules");
    }
}

class IndianBank extends Bank {
    void rule() {
        System.out.println("Indian bank rules");
    }
}

public class AbsBank {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new IndianBank();

        b1.rule();
        b2.rule();
    }
}