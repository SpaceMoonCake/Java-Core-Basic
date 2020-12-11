package dz1;

public class dz1 {
    public static void main(String[] args){
        int a = 4;
        int b = 3;
        int c = 10;
        int d = 3;
        String name = "Кирилл";
        System.out.println(calculator (a,b,c,d));
        System.out.println(sum(a,b));
        sign(c);
        System.out.println(hello(name));
        int year = 2020;
        year(year);
        elseYear(year);

    }

    //1) Написать метод вычисляющий выражение a * (b + (c / d))
    public static double calculator (int a, int b, int c,int d) {
        return (a * (b + (c /(double) d)));
    }

    //2) Метод,проверяющий что сумма лежит в пределах от 10 до 20
    public static boolean sum (int a, int b) {
        boolean bool = true;
        if (a + b < 10 || a + b > 20){
            bool = false;
        }
        return bool;
    }

    //3) Метод, определяющий положительное или отрицательное число ему передали
    public static void sign (int a){
        if (a < 0) {
            System.out.println("Число " + a + " отрицательное");
        } else {
            System.out.println("Число " + a + " положительное");
        }
    }

    // 4) Метод - приветствие
    public static String hello (String name){
        return ("Привет, " + name + "!");
    }

    // 5) Метод, определяющий високосный или не високосный год
    public static void year (int year){
        if (year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else if (year % 100 == 0 || year % 4 != 0) {
            System.out.println(year + " год не високосный");
        } else {
            System.out.println(year + " год високосный");
        }
    }

    public static void elseYear (int year){
        boolean bool = true;
        if (year % 4 != 0 | year % 100 == 0 & year % 400 != 0){
            bool = false;
        }
        if (bool){
            System.out.println(year + " год високосный");
        }
        if (!bool) {
            System.out.println(year + " год не високосный");
        }
    }


}
