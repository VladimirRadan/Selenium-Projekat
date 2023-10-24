package selenium;

public class Main2 {

    public static void main(String[] args) {


        String amount = "100RSD";

        String amount2 = amount.replaceAll("\\D", "");
        System.out.println(amount2);

        int realAmount = Integer.parseInt(amount2);

        int sum = realAmount + 50;
        System.out.println(sum);




    }


}
