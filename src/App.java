import java.util.Scanner;

public class App {
    public static double add(double x , double y){ 
        return x + y;
    }
    public static double minus(double x , double y){ 
        return x - y;
    }
    public static double times(double x , double y){ 
        return x * y;
    }
    public static double devide(double x , double y){ 
        if (y == 0){
            throw new IllegalArgumentException("Cannot Devide by zero");
        }
        return x / y;
    }
    public static double modulos(double x , double y){ 
        return x % y;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Select operation.");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulos");

        while(true){ 
            System.out.println("Enter your choice 1-5");
            String choice = scanner.next(); 

            if (choice.matches("[1-4]")){
                try { 
                    System.out.println("Enter first number");
                    double num1 = scanner.nextDouble();

                    System.out.println("Enter second number");
                    double num2 = scanner.nextDouble();

                    switch (choice) {
                        case "1":
                            System.out.println(num1 + "+" + num2 + "=" + add(num1,num2));
                            break;
                        case "2":
                            System.out.println(num1 + "+" + num2  + "=" + minus(num1,num2));
                            break;
                        case "3":
                            System.out.println(num1 + "+" + num2  + "=" + times(num1,num2));
                            break;
                        case "4":
                            System.out.println(num1 + "+" + num2  + "=" + devide(num1,num2));
                            break;
                        case "5":
                            System.out.println(num1 + "+" + num2  + "=" + modulos(num1,num2));
                            break;
                        default:
                            break;
                    }
                    System.out.println("Confirmation yes/no: \s"); 
                    String nextCalculation = scanner.next();
                    if (nextCalculation.equals("yes")) {
                        break;
                }
            }catch(Exception e){
                System.out.println("Invalid input, please input number");
                scanner.nextLine();
            }
        }else{
            System.out.println("Invalid input");
        }
    }
    scanner.close();
    }
}
