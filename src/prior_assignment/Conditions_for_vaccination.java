package prior_assignment;

public class Conditions_for_vaccination {

    public int Date_of_Birth_Int[] = new int[3];
    public String Eligible_Flag = "";
    public String Service_Start_Date = "";
    public String Service_End_Date = "";
    public String Check_Old = "";

    CheckMonth CheckMonth = new CheckMonth();

    public int[] getDate_of_Birth_Int() {
        return Date_of_Birth_Int;
    }

    public void setDate_of_Birth_Int(int[] Date_of_Birth_Int) {
        this.Date_of_Birth_Int = Date_of_Birth_Int;
    }

    public String getEligible_Flag() {
        return Eligible_Flag;
    }

    public void setEligible_Flag(String Eligible_Flag) {
        this.Eligible_Flag = Eligible_Flag;
    }

    public String getService_Start_Date() {
        return Service_Start_Date;
    }

    public void setService_Start_Date(String Service_Start_Date) {
        this.Service_Start_Date = Service_Start_Date;
    }

    public String getService_End_Date() {
        return Service_End_Date;
    }

    public void setService_End_Date(String Service_End_Date) {
        this.Service_End_Date = Service_End_Date;
    }

    public String getCheck_Old() {
        return Check_Old;
    }

    public void setCheck_Old(String Check_Old) {
        this.Check_Old = Check_Old;
    }

    public void CheckConditions(int Date_of_Birth_Int[]) {

        int YearOfBirth_MeetTheConditions;

        //อายุ 65 ในปี 2564
        if (2564 - Date_of_Birth_Int[0] >= 65) {

            //System.out.println("อายุ 65 ในปี 2564");
            //อายุ 65 ปีขึ้นไป
            if (Date_of_Birth_Int[1] < 6) {

                //System.out.println("   อายุ 65 ปีขึ้นไป");
                Eligible_Flag = "Y";
                Service_Start_Date = "1 มิถุนายน พ.ศ. 2564";
                Service_End_Date = "31 สิงหาคม พ.ศ. 2564";
                Check_Old = "meet the conditions";

                Print(Eligible_Flag, Service_Start_Date, Service_End_Date, Check_Old);

            }//อายุ 65 ปี ในเดือน 6 (มิถุนายน) - 8 (สิงหาคม)
            else if (Date_of_Birth_Int[1] >= 6 && Date_of_Birth_Int[1] <= 8) {

                //System.out.println("    อายุ 65 ปี ในเดือน 6 (มิถุนายน) - 8 (สิงหาคม)");
                Eligible_Flag = "Y";
                Service_Start_Date = Integer.toString(Date_of_Birth_Int[2]) + " " + CheckMonth.Print_Month(Date_of_Birth_Int[1]) + " พ.ศ. " + Integer.toString(Date_of_Birth_Int[0]);
                Service_End_Date = "31 สิงหาคม พ.ศ. 2564";
                Check_Old = "meet the conditions";

                Print(Eligible_Flag, Service_Start_Date, Service_End_Date, Check_Old);

            }//อายุ 65 ปี หลังระยะเวลาที่กำหนด
            else if (Date_of_Birth_Int[1] > 8) {

                //System.out.println("    อายุ 65 ปี หลังระยะเวลาที่กำหนด");
                YearOfBirth_MeetTheConditions = (65 - (2564 - Date_of_Birth_Int[0])) + 2564;

                Eligible_Flag = "N";
                Service_Start_Date = Integer.toString(Date_of_Birth_Int[2]) + " " + CheckMonth.Print_Month(Date_of_Birth_Int[1]) + " พ.ศ. " + Integer.toString(YearOfBirth_MeetTheConditions);
                Service_End_Date = "31 สิงหาคม พ.ศ. 2564";
                Check_Old = "under age 65";

                Print(Eligible_Flag, Service_Start_Date, Service_End_Date, Check_Old);

            }
        } //อายุน้อยกว่า หรือ = 2 ปี 
        else if (2564 - Date_of_Birth_Int[0] <= 2 && 2564 - Date_of_Birth_Int[0] >= 0) {

            //System.out.println("อายุน้อยกว่า หรือ = 2 ปี");
            //อายุ 2 ปี ภายในปี 2564
            if (Date_of_Birth_Int[0] == 2562) {

                //System.out.println("    อายุเกิน 2 ปี ภายในปี 2564");
                //อายุเกิน 2 ปี ก่อนเดือน 6 (มิถุนายน)               
                if (Date_of_Birth_Int[1] < 6) {

                    //System.out.println("        อายุเกิน 2 ปี ก่อนเดือน 6 (มิถุนายน)");
                    YearOfBirth_MeetTheConditions = (65 - (2564 - Date_of_Birth_Int[0])) + 2564;

                    Eligible_Flag = "N";
                    Service_Start_Date = Integer.toString(Date_of_Birth_Int[2]) + " " + CheckMonth.Print_Month(Date_of_Birth_Int[1]) + " พ.ศ. " + Integer.toString(YearOfBirth_MeetTheConditions);
                    Service_End_Date = "31 สิงหาคม พ.ศ. 2564";
                    Check_Old = "under age 65";

                    Print(Eligible_Flag, Service_Start_Date, Service_End_Date, Check_Old);

                }//อายุเกิน 2 ปี ภายในเดือน 6 (มิถุนายน) - 8 (สิงหาคม)
                else if (Date_of_Birth_Int[1] >= 6 && Date_of_Birth_Int[1] <= 8) {

                    //System.out.println("        อายุเกิน 2 ปี ภายในเดือน 6 (มิถุนายน) - 8 (สิงหาคม)");
                    Eligible_Flag = "Y";
                    Service_Start_Date = "1 มิถุนายน พ.ศ. 2564";
                    Service_End_Date = Integer.toString(Date_of_Birth_Int[2]) + " " + CheckMonth.Print_Month(Date_of_Birth_Int[1]) + " พ.ศ. 2564";
                    Check_Old = "meet the conditions";

                    Print(Eligible_Flag, Service_Start_Date, Service_End_Date, Check_Old);

                }//อายุเกิน 2 ปี หลังเดือน 8 (สิงหาคม)
                else if (Date_of_Birth_Int[1] > 8) {

                    //System.out.println("        อายุเกิน 2 ปี หลังเดือน 8 (สิงหาคม)");
                    Eligible_Flag = "Y";
                    Service_Start_Date = "1 มิถุนายน พ.ศ. 2564";
                    Service_End_Date = "31 สิงหาคม พ.ศ. 2564";
                    Check_Old = "meet the conditions";

                    Print(Eligible_Flag, Service_Start_Date, Service_End_Date, Check_Old);

                }

            }//อายุ 6 เดือน ภายในปี 2564
            else if (Date_of_Birth_Int[0] == 2564) {

                //System.out.println("    อายุ 6 เดือน ภายในปี 2564");
                //อายุ 6 เดือน ภายในเดือน 7 (กรกฎาคม) - 8 (สิงหาคม)
                if (Date_of_Birth_Int[1] >= 1 && Date_of_Birth_Int[1] < 3) {

                    //System.out.println("        อายุเกิน 2 ปี ภายในเดือน 6 (มิถุนายน) - 8 (สิงหาคม)");
                    Eligible_Flag = "Y";
                    Service_Start_Date = Integer.toString(Date_of_Birth_Int[2]) + " " + CheckMonth.Print_Month(Date_of_Birth_Int[1] + 6) + " พ.ศ. 2564";
                    Service_End_Date = "31 สิงหาคม พ.ศ. 2564";
                    Check_Old = "meet the conditions";

                    Print(Eligible_Flag, Service_Start_Date, Service_End_Date, Check_Old);

                }//อายุไม่ถึง 6 เดือนภายในระยะเวลาที่กำหนด
                else {

                    //System.out.println("        อายุเกิน 2 ปี หลังเดือน 8 (สิงหาคม)");
                    YearOfBirth_MeetTheConditions = (Date_of_Birth_Int[0] - 2564) + 2564;

                    Eligible_Flag = "N";
                    Service_Start_Date = Integer.toString(Date_of_Birth_Int[2]) + " " + CheckMonth.Print_Month(Date_of_Birth_Int[1] + 6) + " พ.ศ. " + Integer.toString(YearOfBirth_MeetTheConditions);
                    Service_End_Date = "31 สิงหาคม พ.ศ. 2564";
                    Check_Old = "less than 6 months old";

                    Print(Eligible_Flag, Service_Start_Date, Service_End_Date, Check_Old);

                }

            }
        }//เกิดปี 2565 ขึ้นไป
        else if (2564 - Date_of_Birth_Int[0] < 0) {

            //อายุ 6 เดือน ภายในเดือน 6 (มิถุนายน)
            if (Date_of_Birth_Int[0] == 2565 && Date_of_Birth_Int[1] == 12) {
                Eligible_Flag = "Y";
                Service_Start_Date = Integer.toString(Date_of_Birth_Int[2]) + " " + CheckMonth.Print_Month(Date_of_Birth_Int[1] + 6) + " พ.ศ. 2564";
                Service_End_Date = "31 สิงหาคม พ.ศ. 2564";
                Check_Old = "meet the conditions";

                Print(Eligible_Flag, Service_Start_Date, Service_End_Date, Check_Old);

            }//เกิดก่อน เดือน 6 (มิถุนายน)
            else {

                //System.out.println("เกิดปี 2565 ขึ้นไป");
                YearOfBirth_MeetTheConditions = (Date_of_Birth_Int[0] - 2564) + 2564;

                Eligible_Flag = "N";
                Service_Start_Date = Integer.toString(Date_of_Birth_Int[2]) + " " + CheckMonth.Print_Month(Date_of_Birth_Int[1] + 6) + " พ.ศ. " + Integer.toString(YearOfBirth_MeetTheConditions);
                Service_End_Date = "31 สิงหาคม พ.ศ. 2564";
                Check_Old = "less than 6 months old";

                Print(Eligible_Flag, Service_Start_Date, Service_End_Date, Check_Old);

            }
        }//อายุมากกว่า 2 ปี แต่ไม่ถึง 65 ปี
        else {
            //System.out.println("อายุมากกว่า 2 ปี แต่ไม่ถึง 65 ปี");

            YearOfBirth_MeetTheConditions = (65 - (2564 - Date_of_Birth_Int[0])) + 2564;

            Eligible_Flag = "N";
            Service_Start_Date = Integer.toString(Date_of_Birth_Int[2]) + " " + CheckMonth.Print_Month(Date_of_Birth_Int[1]) + " พ.ศ. " + Integer.toString(YearOfBirth_MeetTheConditions);
            Service_End_Date = "31 สิงหาคม พ.ศ. 2564";
            Check_Old = "under age 65";

            Print(Eligible_Flag, Service_Start_Date, Service_End_Date, Check_Old);

        }

    }

    public void Print(String Eligible_Flag, String Service_Start_Date, String Service_End_Date, String Check_Old) {
        if (Eligible_Flag.equals("Y")) {

            if (Check_Old.equals("meet the conditions")) {

                System.out.println("Service_Start_Date" + Service_Start_Date);

                System.out.println(CheckMonth.Print_Eligible_Flag(Eligible_Flag) + "ตั้งแต่วันที่ " + Service_Start_Date + " -  " + Service_End_Date);

            } else {
                System.out.println("ผิดพลาด");
            }

        } else {

            if (Check_Old.equals("less than 6 months old")) {

                System.out.println(CheckMonth.Print_Eligible_Flag(Eligible_Flag) + " เนื่องจากอายุจะครบ 6 เดือน วันที่ " + Service_Start_Date);

            } else if (Check_Old.equals("under age 65")) {

                System.out.println(CheckMonth.Print_Eligible_Flag(Eligible_Flag) + " เนื่องจากอายุจะครบ 65 ปี วันที่ " + Service_Start_Date);

            }
        }
    }

}
