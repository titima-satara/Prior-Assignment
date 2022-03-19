package prior_assignment;

import java.util.Scanner;

public class Prior_Assignment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] Date_of_Birth_Int = new int[3];

        int n1 = 1;

        CheckData Check = new CheckData();
        Conditions_for_vaccination Conditions_for_vaccination = new Conditions_for_vaccination();

        while (n1 == 1) {

            System.out.println("กรุณาระบุเพศ (M/F)");
            String Gender = scan.nextLine();

            if (Check.CheckGender(Gender) == true) {
                int n2 = 1;
                while (n2 == 1) {
                    System.out.println("การุณาระบุวันเดือนปีเกิด (ปี พ.ศ.) (yyyy-mm-dd)");
                    String Date_of_Birth = scan.nextLine();

                    String[] Date_of_Birth_String = Date_of_Birth.split("-");
                    

                    if (Check.CheckDate_of_Birth(Date_of_Birth) == true) {
                        for (int i = 0; i < Date_of_Birth_String.length; i++) {
                            Date_of_Birth_Int[i] = Integer.parseInt(Date_of_Birth_String[i]);
                            //System.out.println(Date_of_Birth_Int[i]);
                        }
                        System.out.println("ข้อมูลถูกต้อง");
                        Conditions_for_vaccination.CheckConditions(Date_of_Birth_Int);
                        n2++;
                    } else {
                        System.out.println("ข้อมูลไม่ถูกต้อง");
                    }
                }
            } else {
                System.out.println("การุณาระบุเพศระหว่าง M = เพศชาย  หรือ F = เพศหญิง  (M/F)");
            }
        }
    }
}
