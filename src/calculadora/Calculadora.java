package calculadora;

public class Calculadora {
    
    public double sumar(double num1, double num2){
        return num1 + num2;
    }
    
    public double restar(double num1, double num2){
        return num1 - num2;
    }
    
    public double dividir(double num1, double num2){
        return num1 / num2;
    }
    
    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    
    public double fibonacci(double num){
        if(num > 1){
            return fibonacci(num-1) + fibonacci(num-2);
        } else {
            return 1;
        }
    }
    
    public double factorial(double num){
        if(num > 1){
            return num * factorial(num-1);
        } else {
            return 1;
        }
    }
    
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.sumar(71,85));
        System.out.println(c.restar(85,31));
        System.out.println(c.dividir(150,25));
        System.out.println(c.multiplicar(16,11));
        System.out.println(c.fibonacci(1));
        System.out.println(c.factorial(6));
    }
    
}
