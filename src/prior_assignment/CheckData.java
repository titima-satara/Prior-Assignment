package prior_assignment;

/**
 *
 * @author kanomkung
 */
public class CheckData {

    public String Gender;
    public String Date_of_Birth;
    public int[] Date_of_Birth_Int = new int[3];

    Conditions_for_vaccination Conditions_for_vaccination = new Conditions_for_vaccination();
    CheckMonth CheckMonth = new CheckMonth();

    public int[] getDate_of_Birth_String_Int() {
        return Date_of_Birth_Int;
    }

    public void setDate_of_Birth_String_Int(int[] Date_of_Birth_String_Int) {
        this.Date_of_Birth_Int = Date_of_Birth_String_Int;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void setDate_of_Birth(String Date_of_Birth) {
        this.Date_of_Birth = Date_of_Birth;
    }

    public boolean CheckGender(String Gender) {
        if (Gender.equals("M") || Gender.equals("F")) {
            return true;
        }
        return false;
    }

    public boolean CheckDate_of_Birth(String Date_of_Birth) {

        if (Date_of_Birth.length() == 10) {


            if (Date_of_Birth.substring(4, 5).equals("-") && Date_of_Birth.substring(7, 8).equals("-")) {

                String[] Date_of_Birth_String = Date_of_Birth.split("-");

                for (int i = 0; i < Date_of_Birth_String.length; i++) {
                    //เช็ควันที่ในแต่ละช่องว่าเป็นตัวเลขทั้งหมดหรือไม่
                    if (Date_of_Birth_String[i].matches("\\d+")) {

                        int CheckDate_of_Birth_String_to_number = Integer.parseInt(Date_of_Birth_String[i]);

                    } else {

                        System.out.println("การุณาระบุวันเดือนปีเกิดตามตัวอย่าง ");
                        return false;

                    }
                }

                for (int i = 0; i < Date_of_Birth_String.length; i++) {
                    Date_of_Birth_Int[i] = Integer.parseInt(Date_of_Birth_String[i]);
                    //System.out.println(Date_of_Birth_Int[i]);
                }

                if (CheckMonth.Print_CheckMonth(Date_of_Birth_Int) == true) {

                    return true;

                } else {

                    return false;

                }

            } else {
                System.out.println("การุณาระบุวันเดือนปีเกิดตามตัวอย่าง ");
                return false;
            }

        } else {

            System.out.println("การุณาระบุวันเดือนปีเกิดตามตัวอย่าง ");
            return false;

        }
    }
}
