public class Calculator {
    private  double a;
    private  double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void sum(){
        System.out.println("The result of the sum is: "+ this.a + this.b);
    }

    public void subtract(){
        System.out.println("The result of the sum is: "+ (this.a - this.b));
    }

    public void multiplication(){
        System.out.println("The result of the multiplication is: "+ this.a * this.b);
    }

    public void divide(){
        System.out.println("The result of the division is: "+ this.a / this.b);
    }
}
