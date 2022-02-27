package calculate_bmi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BmiCalculate {
    public static void main(String[] args) {
        float underWeight = 18.5F;
        float normalWeight = 24.9F;
        float overWeight = 29.9F;
        float ibm = 0F;

        //----------Lam tron gia tri so float
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Xin mời sử dụng công cụ tính chỉ số IBM");

        //----------Nhap gia tri chieu cao, can nang
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t1. Hãy nhập chiều cao (m): ");
        float height = scanner.nextFloat();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("\t2. Hãy nhập cân nặng (kg): ");
        float weight = scanner1.nextFloat();

        //----------Tinh IBM
        if (weight>0 && height>0){
            ibm = weight / (height*2);
            System.out.println("");
            System.out.println("Chỉ số IBM của bạn là: " +decimalFormat.format(ibm));
        }else {
            System.out.println("Không thể tính được chỉ số IBM");
        }

        //----------So sanh cac chi so
        if (weight>0 && height>0){

        float weightDifference = (float) ((ibm-24.9) * 2 * height);
        if (ibm<=underWeight && ibm>0)
        {
            weightDifference = (float) ((18.5-ibm) * 2 * height);
            System.out.printf("Bạn hơi ốm, Bạn nên tăng thêm %fkg nếu muốn nâng chỉ số IBM của mình lên mức chuẩn 18.5-24.9 nhé !!! ",weightDifference);
            System.out.println();
        } else if (ibm<normalWeight && ibm>0)
        {
            System.out.println("Bạn có một cơ thể tuyệt vời,chỉ số IBM nằm trong mức chuẩn 18.5-24.9, hãy cố gắng duy trì nhé !!! ");
        } else if (ibm<=overWeight && ibm>0)
        {
            System.out.printf("Bạn hơi thừa cân, Bạn nên giảm bớt %fkg nếu muốn hạ chỉ số IBM của mình đến mức chuẩn 18.5-24.9 nhé !!! ",weightDifference);
            System.out.println();
        } else
        {
            System.out.printf("Bạn thừa cân khá nhiều, Bạn nên giảm bớt %fkg nếu muốn hạ chỉ số IBM của mình đến mức chuẩn 18.5-24.9 nhé !!! ",weightDifference);
            System.out.println();
        }

        }
        //------------Kết thúc
        if (height>0 && weight>0) {
            System.out.println();
            System.out.println("Kết quả này chi mang tính tương đối, chúc bạn nhiều sức khỏe và hẹn gặp lại !!!");
        }
    }
}
