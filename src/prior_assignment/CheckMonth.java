package prior_assignment;

public class CheckMonth {

    public int[] Date_of_Birth_Int = new int[3];
    public int Month_of_Birth;

    public int[] getDate_of_Birth_Int() {
        return Date_of_Birth_Int;
    }

    public void setDate_of_Birth_Int(int[] Date_of_Birth_Int) {
        this.Date_of_Birth_Int = Date_of_Birth_Int;
    }

    public boolean Print_CheckMonth(int[] Date_of_Birth_Int) {
        
        //ลงท้ายด้วย "คม"
        if (Date_of_Birth_Int[1] == 1
                || Date_of_Birth_Int[1] == 3
                || Date_of_Birth_Int[1] == 5
                || Date_of_Birth_Int[1] == 7
                || Date_of_Birth_Int[1] == 8
                || Date_of_Birth_Int[1] == 10
                || Date_of_Birth_Int[1] == 12) {
            if (Date_of_Birth_Int[2] >= 1 && Date_of_Birth_Int[2] <= 31) {
                return true;

            } else {
                System.out.println("เดือนที่ " + Date_of_Birth_Int[1] + " ไม่มีวันที่ " + Date_of_Birth_Int[2]);
                return false;
            }
        } //ลงท้ายด้วย "ยน"
        else if (Date_of_Birth_Int[1] == 4
                || Date_of_Birth_Int[1] == 6
                || Date_of_Birth_Int[1] == 9
                || Date_of_Birth_Int[1] == 11) {
            if (Date_of_Birth_Int[2] >= 1 && Date_of_Birth_Int[2] <= 30) {
                return true;
            } else {
                System.out.println("เดือนที่ " + Date_of_Birth_Int[1] + " ไม่มีวันที่ " + Date_of_Birth_Int[2]);
                return false;
            }

        } //เดือน "กุมภาพันธ์"
        else if (Date_of_Birth_Int[1] == 2) {
            if (Date_of_Birth_Int[1] % 4 == 0) {
                if (Date_of_Birth_Int[2] >= 1 && Date_of_Birth_Int[2] <= 29) {
                    return true;
                } else {
                    System.out.println("เดือนที่ " + Date_of_Birth_Int[1] + " ไม่มีวันที่ " + Date_of_Birth_Int[2]);
                    return false;
                }
            } else {
                if (Date_of_Birth_Int[2] >= 1 && Date_of_Birth_Int[2] <= 28) {
                    return true;
                } else {
                    System.out.println("เดือนที่ " + Date_of_Birth_Int[1] + " ไม่มีวันที่ " + Date_of_Birth_Int[2]);
                    return false;
                }
            }
        }
        System.out.println("ไม่มีเดือนที่ " + Date_of_Birth_Int[1]);
        return false;
    }

    public String Print_Month(int Month_of_Birth) {
        
        //แก้เดือนเกิน
        if(Month_of_Birth >12){
            //System.out.println("Month_of_Birth : " + Month_of_Birth);
            int EditMonth = 0;
            for(int i = 13; i <=Month_of_Birth; i++){               
                EditMonth++;
                //System.out.println("EditMonth : " + EditMonth);
            }
            Month_of_Birth = EditMonth;
            //System.out.println("Month_of_Birth : " + Month_of_Birth);
        }
        
        if (Month_of_Birth == 1) {
            return "มกราคม";
        } else if (Month_of_Birth == 2) {
            return "กุมภาพันธ์";
        } else if (Month_of_Birth == 3) {
            return "มีนาคม";
        } else if (Month_of_Birth == 4) {
            return "เมษายน";
        } else if (Month_of_Birth == 5) {
            return "พฤษภาคม";
        } else if (Month_of_Birth == 6) {
            return "มิถุนายน";
        } else if (Month_of_Birth == 7) {
            return "กรกฎาคม";
        } else if (Month_of_Birth == 8) {
            return "สิงหาคม";
        } else if (Month_of_Birth == 9) {
            return "กันยายน";
        } else if (Month_of_Birth == 10) {
            return "ตุลาคม";
        } else if (Month_of_Birth == 11) {
            return "พฤศจิกายน";
        } else if (Month_of_Birth == 12) {
            return "ธันวาคม";
        } else {
            return "ไม่มีข้อมูล";
        }
    }

    public String Print_Eligible_Flag(String Eligible_Flag) {
        if (Eligible_Flag.equals("Y")) {
            return "เข้ารับบริการได้";
        } else {
            return "ไม่สามารถเข้ารับบริการได้";
        }
    }
}
