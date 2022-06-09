public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte cakes = 3;
        short pencils = 5;
        int digits = 15;
        long length = 1230l;
        float rub = 5.83f;
        double number = 3.141245;
        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = (boxer2 - boxer1);
        System.out.println("Общий вес боксеров " + weightOfAllBoxers+ " кг");
        System.out.println ("Разница в весе " + weightDifference + " кг");
        // Задание 3
        int bananas = 5;
        int bananasWeit = bananas * 80;
        int milk = 200;
        float milkWeit =(milk * 105) / 100f;
        int icecream = 2;
        int icecreamWeit = icecream * 100;
        int eggs = 4;
        int eggsWeit = eggs * 70;
        float allWeit = bananasWeit + milkWeit + icecreamWeit + eggsWeit;
        double allWeitKg = allWeit / 1000f;
        System.out.println ("Вес коктейля "  +  allWeit  +  " граммов");
        System.out.println ("Вес коктейля " +  allWeitKg  + " кг");
        // Задание 4
        byte weit = 7;
        int totalWeit = weit * 1000;
        int dayLost1 = 250;
        int dayLost2 = 500;
        int result1 = totalWeit / dayLost1;
        int result2 = totalWeit / dayLost2;
        int average = (result1 + result2 )/2;
        System.out.println ("Потеря веса 250 гр/день " + result1 + " дней");
        System.out.println ("Потеря веса 500 гр/день " + result2 + " дней");
        System.out.println ("Потеря веса в среднем " + average + " дней");
        // Задние 5
        double mashaMonthSalary = 67_760;
        double mashaNewMonthSalary = mashaMonthSalary * 1.1;
        double mashaYearSalary = mashaMonthSalary * 12;
        double mashaNewYearSalary = mashaYearSalary * 1.1;
        double mashaDifference = mashaNewYearSalary - mashaYearSalary;
        double denisMonthSalary = 83_690;
        double denisNewMonthSalary = denisMonthSalary *1.1;
        double denisYearSalary = denisMonthSalary * 12;
        double denisNewYearSalary = denisYearSalary *1.1;
        double denisDifference = denisNewYearSalary - denisYearSalary;
        double cristinaMonthSalary = 76_230;
        double cristinaNewMonthSalary = cristinaMonthSalary *1.1;
        double cristinaYearSalary = cristinaMonthSalary *12;
        double cristinaNewYearSalary = cristinaYearSalary *1.1;
        double cristinaDifference = cristinaNewYearSalary - cristinaYearSalary;
        System.out.println("Маша теперь получает в месяц " + mashaNewMonthSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей" );
        System.out.println("Денис теперь получает в месяц " + denisNewMonthSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println ("Кристина теперь получает в месяц " + cristinaNewMonthSalary + " рублей. Годовой доход вырос на " + cristinaDifference + " рублей");

        //


    }
}