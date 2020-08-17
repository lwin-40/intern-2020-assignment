
class Advice {
  public void showAdvice() {
    System.out.println("Life Advice from the world most famous two people ..."+'\n');
  }
}

class Advice1 extends Advice {
  public void showAdvice() {
    System.out.println("Bill Gates - Succession is a lousy teacher. It seduces smart people into thnking they can't lose."+'\n');
  }
}

class Advice2 extends Advice {
  public void showAdvice() {
    System.out.println("Rihanna - God just has a way of working things out the way he wants to and you have no say in that.");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    Advice advice=new Advice();
    Advice1 advice1=new Advice1();
    Advice2 advice2=new Advice2();
    advice.showAdvice();
    advice1.showAdvice();
    advice2.showAdvice();
  }
}