package employeeApp;

import employeeApp.enums.Plan;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan h1 = new Healthplan(1, "A Sigorta", Plan.BASIC);
        Healthplan h2 = new Healthplan(2, "B Sigorta", Plan.ADVANCE);

        System.out.println(h1);
        System.out.println(h2);

        //["A Sigorta", "B Sigorta", null]
        String[] healthPlans = new String[3];
        healthPlans[0] = h1.getName();
        healthPlans[1] = h2.getName();

        System.out.println("*****************************");

        //new String[]{"A Sigorta", "B Sigorta"}
        Employee employee = new Employee(1, "Ali Veli",
                "ali@veli.com", "1234", healthPlans);

        employee.addHealthPlan(0, "C Sigorta");
        employee.addHealthPlan(2, "A Sigorta");
        employee.addHealthPlan(2, "X Sigorta");
        employee.addHealthPlan(3, "Y Sigorta");


        System.out.println(Arrays.toString(employee.getHealthPlans()));
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
